#!/bin/sh
echo "## Starting building java project"
./mvnw clean install
echo "## finished building java project"
#docker login 192.180.3.116:5000
registry="192.180.3.116:5000";
#registry="192.180.3.116:5001";
appName="docs-integration-ug-app-qa";

#UP the version

majorVersionFile=major-version.txt;
minorVersionFile=minor-version.txt;

#check if files exists, if file not found create a file and set the value to 0
if [ -f "$majorVersionFile" ]; then
    echo "Major Versions file found"
else
  touch "$majorVersionFile"
  printf "1" > $majorVersionFile
fi


if [ -f "$minorVersionFile" ]; then
    echo "Minor Versions file found"
else
  touch "$minorVersionFile"
  printf "-1" > $minorVersionFile
fi

read -p "Do you wish to Build and Push docker image with tag $dockerImage?(Yes/No)" yn;
if [ "$yn" = "Yes" ]; then
majorVersion=`cat $majorVersionFile`
minorVersion=`cat $minorVersionFile`
#echo $majorVersion;
#echo $minorVersion;
prevImage="$registry/$appName:$majorVersion.$minorVersion";
echo $prevImage;

minorVersion=$((minorVersion + 1));
if (($minorVersion > 9)); then
    majorVersion=$((majorVersion + 1));
    minorVersion=0;
    tag="$majorVersion.$minorVersion"
    echo $tag;
fi;

tag="$majorVersion.$minorVersion"
printf "$majorVersion" > $majorVersionFile
printf "$minorVersion" > $minorVersionFile
tag="$majorVersion.$minorVersion"
echo $tag;
dockerImage="$registry/$appName:$tag";
#dockerImageLatest="$registry/$appName:latest";
echo "$dockerImage";

echo "## - finished preparing  the image version"


echo "Start building docker image"
docker build -t $dockerImage .
#docker build -t $dockerImageLatest .
echo "finished building docker image"

echo "Start pushing docker image"
docker login $registry;
docker push $dockerImage
#docker push $dockerImageLatest
docker logout
echo "finished pushing docker image"
echo "Removing previous Image"
docker rmi $prevImage
else
  echo "Docker build skipped"
fi