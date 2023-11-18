///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.smart.integ.util;
//  
//
///**
// *
// * @author John.Simiyu
//// */
////public class JsonHandler {
////
////    public void SearchInJsonData(String jsondata) {
////        JSONObject json = new JSONObject(jsondata);
////
////        JSONArray[] projectsArray = json.getJSONArray("projects");
////
////        for (int i = 0; i < projectsArray.length; ++i) {
////            String projectName = projectsArray[i].getString("projectName"); 
////        }
////    }
////
////}
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ObjectNode;
//public class JsonHandler {
//   public static void main(String args[]) throws Exception {
//       
//           String paymentMethof =  "[\n" +
//"  {\n" +
//"    \"ENTITYID\": 1339,\n" +
//"    \"ENTITYNAME\": \"Mary Immaculate Dispensary\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1340,\n" +
//"    \"ENTITYNAME\": \"Medipath Laboratories Kenya Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1342,\n" +
//"    \"ENTITYNAME\": \"Rol Medical Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1343,\n" +
//"    \"ENTITYNAME\": \"Umoja I Medicare Centre and Laboratory Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1344,\n" +
//"    \"ENTITYNAME\": \"K.K. Shah Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1346,\n" +
//"    \"ENTITYNAME\": \"Kisumu Medical Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1347,\n" +
//"    \"ENTITYNAME\": \"Patru Medical Clinic Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1349,\n" +
//"    \"ENTITYNAME\": \"Kiboswa Clinical Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1350,\n" +
//"    \"ENTITYNAME\": \"Coast Medical Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1353,\n" +
//"    \"ENTITYNAME\": \"Collins Clinical Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1355,\n" +
//"    \"ENTITYNAME\": \"Ngumba Medical Centre &Laboratory Serives\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1356,\n" +
//"    \"ENTITYNAME\": \"Kim Clinical Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1359,\n" +
//"    \"ENTITYNAME\": \"Ngara Medical /Dental & Laboratory Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1360,\n" +
//"    \"ENTITYNAME\": \"Theluji House Medical Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1362,\n" +
//"    \"ENTITYNAME\": \"Nairobi Diagnostic Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1364,\n" +
//"    \"ENTITYNAME\": \"Tara Laboratory Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1366,\n" +
//"    \"ENTITYNAME\": \"Medi Diagnostic Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368,\n" +
//"    \"ENTITYNAME\": \"Damascus Medical Clinic & Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1369,\n" +
//"    \"ENTITYNAME\": \"Search Medical Laboratories Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1370,\n" +
//"    \"ENTITYNAME\": \"SouthLands Medical Clinic and Diagnostic Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1372,\n" +
//"    \"ENTITYNAME\": \"Heri Medical Clinic & Lab\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1374,\n" +
//"    \"ENTITYNAME\": \"Estate View Medical and Laboratory Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1376,\n" +
//"    \"ENTITYNAME\": \"Sigma Chemists (1990) Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1378,\n" +
//"    \"ENTITYNAME\": \"Path Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1382,\n" +
//"    \"ENTITYNAME\": \"Mediscan Medical Labs\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1383,\n" +
//"    \"ENTITYNAME\": \"Pathcare Kenya Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1385,\n" +
//"    \"ENTITYNAME\": \"Dolphin Medical Centre and Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1388,\n" +
//"    \"ENTITYNAME\": \"Latema Road Medical Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1389,\n" +
//"    \"ENTITYNAME\": \"Phils Medical Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1390,\n" +
//"    \"ENTITYNAME\": \"Island Vision Medical Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1394,\n" +
//"    \"ENTITYNAME\": \"Tawfiq Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1395,\n" +
//"    \"ENTITYNAME\": \"Family Dental Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1398,\n" +
//"    \"ENTITYNAME\": \"Immuno Molecular Diagnostic Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1438,\n" +
//"    \"ENTITYNAME\": \"Orchid Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1443,\n" +
//"    \"ENTITYNAME\": \"Primelabs Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1445,\n" +
//"    \"ENTITYNAME\": \"Healthcare Pharmaceutical Products (K) Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1448,\n" +
//"    \"ENTITYNAME\": \"Aria`s pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1451,\n" +
//"    \"ENTITYNAME\": \"Humana Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1458,\n" +
//"    \"ENTITYNAME\": \"Metropolis Star Lab Kenya Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1460,\n" +
//"    \"ENTITYNAME\": \"Orion Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1463,\n" +
//"    \"ENTITYNAME\": \"Pharmart Dispensing Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1468,\n" +
//"    \"ENTITYNAME\": \"Kam Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1474,\n" +
//"    \"ENTITYNAME\": \"New Landmarc Medical Laboratories Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1476,\n" +
//"    \"ENTITYNAME\": \"Rusalab Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1485,\n" +
//"    \"ENTITYNAME\": \"Lords Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1487,\n" +
//"    \"ENTITYNAME\": \"Surgik Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1488,\n" +
//"    \"ENTITYNAME\": \"Tumaini Medical Labs & Ultrasound Services\",\n" +
//"    \"Payment'\": \"Citibank Int Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1492,\n" +
//"    \"ENTITYNAME\": \"Pona Health Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1493,\n" +
//"    \"ENTITYNAME\": \"Dent Pharm Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1497,\n" +
//"    \"ENTITYNAME\": \"Choice Medical Laboratories Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1500,\n" +
//"    \"ENTITYNAME\": \"Daima Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1503,\n" +
//"    \"ENTITYNAME\": \"Corner House Medical Laboratory\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1506,\n" +
//"    \"ENTITYNAME\": \"Bevic Medipharm Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1521,\n" +
//"    \"ENTITYNAME\": \"Bandari Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1528,\n" +
//"    \"ENTITYNAME\": \"Nilson Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1532,\n" +
//"    \"ENTITYNAME\": \"Moka Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1536,\n" +
//"    \"ENTITYNAME\": \"Pamstech Pharmaceauticals Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1540,\n" +
//"    \"ENTITYNAME\": \"Betamax Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1541,\n" +
//"    \"ENTITYNAME\": \"Kisiwani Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1542,\n" +
//"    \"ENTITYNAME\": \"Town Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1544,\n" +
//"    \"ENTITYNAME\": \"Pekan Pharmacy Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1545,\n" +
//"    \"ENTITYNAME\": \"Haven Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1546,\n" +
//"    \"ENTITYNAME\": \"Roysambu Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1547,\n" +
//"    \"ENTITYNAME\": \"Dawaline Pharmaceuticals(K) LTD\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1548,\n" +
//"    \"ENTITYNAME\": \"Slopes Dispensing Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1549,\n" +
//"    \"ENTITYNAME\": \"Kilimani Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1550,\n" +
//"    \"ENTITYNAME\": \"Brick Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1551,\n" +
//"    \"ENTITYNAME\": \"Salama Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1552,\n" +
//"    \"ENTITYNAME\": \"Githiga Medipharm\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1553,\n" +
//"    \"ENTITYNAME\": \"Rugi Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1554,\n" +
//"    \"ENTITYNAME\": \"Marketview Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1555,\n" +
//"    \"ENTITYNAME\": \"Excelsior Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1556,\n" +
//"    \"ENTITYNAME\": \"Fedha Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1557,\n" +
//"    \"ENTITYNAME\": \"WillyPharma Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1558,\n" +
//"    \"ENTITYNAME\": \"Suncity Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1560,\n" +
//"    \"ENTITYNAME\": \"Mtwapa Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1563,\n" +
//"    \"ENTITYNAME\": \"Metropolitan Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1565,\n" +
//"    \"ENTITYNAME\": \"Island Medical Plaza Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1567,\n" +
//"    \"ENTITYNAME\": \"Archem Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1569,\n" +
//"    \"ENTITYNAME\": \"Rup Pharm Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1572,\n" +
//"    \"ENTITYNAME\": \"Huruma Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1576,\n" +
//"    \"ENTITYNAME\": \"Prime City Clinics & Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1577,\n" +
//"    \"ENTITYNAME\": \"Kiambu Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1579,\n" +
//"    \"ENTITYNAME\": \"Medical Diagnostic Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1580,\n" +
//"    \"ENTITYNAME\": \"Madaraka Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1581,\n" +
//"    \"ENTITYNAME\": \"Tower Chemist Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1583,\n" +
//"    \"ENTITYNAME\": \"Pathologists Lancet (K) Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1585,\n" +
//"    \"ENTITYNAME\": \"Green House Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1586,\n" +
//"    \"ENTITYNAME\": \"Mansion Chemist Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1587,\n" +
//"    \"ENTITYNAME\": \"Nila Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1588,\n" +
//"    \"ENTITYNAME\": \"Tumaini House Medical Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1590,\n" +
//"    \"ENTITYNAME\": \"Githurai Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1591,\n" +
//"    \"ENTITYNAME\": \"Rika Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1594,\n" +
//"    \"ENTITYNAME\": \"Furaha Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1595,\n" +
//"    \"ENTITYNAME\": \"Kenmart Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1596,\n" +
//"    \"ENTITYNAME\": \"Clinitech Diagnostic Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1597,\n" +
//"    \"ENTITYNAME\": \"Messo Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1600,\n" +
//"    \"ENTITYNAME\": \"Badar Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1603,\n" +
//"    \"ENTITYNAME\": \"Nairobi Clinical Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1605,\n" +
//"    \"ENTITYNAME\": \"Maga Medical Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1607,\n" +
//"    \"ENTITYNAME\": \"Yaya Centre Diagnostic Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1609,\n" +
//"    \"ENTITYNAME\": \"St. James Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1610,\n" +
//"    \"ENTITYNAME\": \"Sunrise Medical Laboratories\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1611,\n" +
//"    \"ENTITYNAME\": \"Victory Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1614,\n" +
//"    \"ENTITYNAME\": \"Good Health Clinic and Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1616,\n" +
//"    \"ENTITYNAME\": \"Patru Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1618,\n" +
//"    \"ENTITYNAME\": \"Jamii Medical Laboratory Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1620,\n" +
//"    \"ENTITYNAME\": \"Temple Stores Pharmaceticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1622,\n" +
//"    \"ENTITYNAME\": \"Healthspan Laboratory Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1626,\n" +
//"    \"ENTITYNAME\": \"Kings Chemists Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1627,\n" +
//"    \"ENTITYNAME\": \"Green Cross Voluntary Blood Bank\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1630,\n" +
//"    \"ENTITYNAME\": \"Priya Diagnostic Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1632,\n" +
//"    \"ENTITYNAME\": \"National Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1634,\n" +
//"    \"ENTITYNAME\": \"Diploma Diagnostic Lab\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1635,\n" +
//"    \"ENTITYNAME\": \"Masaku Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1639,\n" +
//"    \"ENTITYNAME\": \"Shield Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1640,\n" +
//"    \"ENTITYNAME\": \"Cedar Pharmacare Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1644,\n" +
//"    \"ENTITYNAME\": \"Jeisama Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1645,\n" +
//"    \"ENTITYNAME\": \"El Amin Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1650,\n" +
//"    \"ENTITYNAME\": \"Kingorani Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1652,\n" +
//"    \"ENTITYNAME\": \"Royolk Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1655,\n" +
//"    \"ENTITYNAME\": \"Floran Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1656,\n" +
//"    \"ENTITYNAME\": \"Zenith Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1657,\n" +
//"    \"ENTITYNAME\": \"Porters Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1659,\n" +
//"    \"ENTITYNAME\": \"Lugpharm Medicals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1662,\n" +
//"    \"ENTITYNAME\": \"Karen Chemist Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1664,\n" +
//"    \"ENTITYNAME\": \"Central Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1667,\n" +
//"    \"ENTITYNAME\": \"City Square Pharmacy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1673,\n" +
//"    \"ENTITYNAME\": \"Nairobi South Pharmacy ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1681,\n" +
//"    \"ENTITYNAME\": \"Diamond Chemist Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1689,\n" +
//"    \"ENTITYNAME\": \"Kisauni Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1693,\n" +
//"    \"ENTITYNAME\": \"Mikindani Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1699,\n" +
//"    \"ENTITYNAME\": \"Tricity Pharmaceticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1701,\n" +
//"    \"ENTITYNAME\": \"Nakuru Medical Stores\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1703,\n" +
//"    \"ENTITYNAME\": \"Kips Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1706,\n" +
//"    \"ENTITYNAME\": \"Suhurta Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1707,\n" +
//"    \"ENTITYNAME\": \"Carousel Guardian Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1708,\n" +
//"    \"ENTITYNAME\": \"Dan pharmacie\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1710,\n" +
//"    \"ENTITYNAME\": \"Coast Medical Stores\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1714,\n" +
//"    \"ENTITYNAME\": \"Greenmark Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1715,\n" +
//"    \"ENTITYNAME\": \"Care Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1716,\n" +
//"    \"ENTITYNAME\": \"TF Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1717,\n" +
//"    \"ENTITYNAME\": \"Nabongo Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1719,\n" +
//"    \"ENTITYNAME\": \"MediTrust Healthcare Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1721,\n" +
//"    \"ENTITYNAME\": \"Mutindwa Chemists Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1722,\n" +
//"    \"ENTITYNAME\": \"Apec Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1724,\n" +
//"    \"ENTITYNAME\": \"Medico Pharmacia-Brazil\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1725,\n" +
//"    \"ENTITYNAME\": \"Mosar Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1728,\n" +
//"    \"ENTITYNAME\": \"Eltons (City Centre) Pharmacy Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1729,\n" +
//"    \"ENTITYNAME\": \"Denmah Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1730,\n" +
//"    \"ENTITYNAME\": \"Kapsasur Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1731,\n" +
//"    \"ENTITYNAME\": \"Prestige Pharmacy Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1732,\n" +
//"    \"ENTITYNAME\": \"Annunciation Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1733,\n" +
//"    \"ENTITYNAME\": \"Bakpharm Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1734,\n" +
//"    \"ENTITYNAME\": \"New Medicals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1738,\n" +
//"    \"ENTITYNAME\": \"Mediplan Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1740,\n" +
//"    \"ENTITYNAME\": \"Embu Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1741,\n" +
//"    \"ENTITYNAME\": \"Maca Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1742,\n" +
//"    \"ENTITYNAME\": \"Ruuri Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1743,\n" +
//"    \"ENTITYNAME\": \"Inpha Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1745,\n" +
//"    \"ENTITYNAME\": \"Step Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1746,\n" +
//"    \"ENTITYNAME\": \"Cart Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1747,\n" +
//"    \"ENTITYNAME\": \"Wanna Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1749,\n" +
//"    \"ENTITYNAME\": \"Damco Pharmacie Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1750,\n" +
//"    \"ENTITYNAME\": \"North Coast Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1753,\n" +
//"    \"ENTITYNAME\": \"Dien Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1755,\n" +
//"    \"ENTITYNAME\": \"Supreme Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1757,\n" +
//"    \"ENTITYNAME\": \"Mountchem Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1758,\n" +
//"    \"ENTITYNAME\": \"Yogi Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1759,\n" +
//"    \"ENTITYNAME\": \"Blue Pyramid Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1760,\n" +
//"    \"ENTITYNAME\": \"Achiral Pharmaceuticals\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1763,\n" +
//"    \"ENTITYNAME\": \"Medchum Pharmaceuticals Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1766,\n" +
//"    \"ENTITYNAME\": \"Maliba Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1767,\n" +
//"    \"ENTITYNAME\": \"Red Hill Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1768,\n" +
//"    \"ENTITYNAME\": \"Kavirondo Chemists Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1769,\n" +
//"    \"ENTITYNAME\": \"Pentapharm Account Number 1\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1771,\n" +
//"    \"ENTITYNAME\": \"Kaiti Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1776,\n" +
//"    \"ENTITYNAME\": \"Medina Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1777,\n" +
//"    \"ENTITYNAME\": \"East End Chemists Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1778,\n" +
//"    \"ENTITYNAME\": \"Savannah Healthcare Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1779,\n" +
//"    \"ENTITYNAME\": \"Dove Chemist Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1780,\n" +
//"    \"ENTITYNAME\": \"Urim Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1781,\n" +
//"    \"ENTITYNAME\": \"Ushirika-Martian Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1782,\n" +
//"    \"ENTITYNAME\": \"Nairobi Drug House (K) Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1783,\n" +
//"    \"ENTITYNAME\": \"Global RX Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1784,\n" +
//"    \"ENTITYNAME\": \"M S Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1786,\n" +
//"    \"ENTITYNAME\": \"Tanzil Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1787,\n" +
//"    \"ENTITYNAME\": \"Thorn Tree Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1789,\n" +
//"    \"ENTITYNAME\": \"St. Michael`s Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1790,\n" +
//"    \"ENTITYNAME\": \"Theluji Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1793,\n" +
//"    \"ENTITYNAME\": \"Nairobi Medical Stores\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1794,\n" +
//"    \"ENTITYNAME\": \"Metropolitan Chemists Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1800,\n" +
//"    \"ENTITYNAME\": \"Edica Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1801,\n" +
//"    \"ENTITYNAME\": \"Chemmatt Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1809,\n" +
//"    \"ENTITYNAME\": \"Millennium Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1811,\n" +
//"    \"ENTITYNAME\": \"Life Care Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1815,\n" +
//"    \"ENTITYNAME\": \"Sanjay Medical & General Stores\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1819,\n" +
//"    \"ENTITYNAME\": \"Esamako Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1821,\n" +
//"    \"ENTITYNAME\": \"Makongeni Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1823,\n" +
//"    \"ENTITYNAME\": \"Parade Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1824,\n" +
//"    \"ENTITYNAME\": \"Eden Family Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1826,\n" +
//"    \"ENTITYNAME\": \"Njimia Pharmacy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1828,\n" +
//"    \"ENTITYNAME\": \"Benka Health Care Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1832,\n" +
//"    \"ENTITYNAME\": \"Neema Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1834,\n" +
//"    \"ENTITYNAME\": \"Iris Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1836,\n" +
//"    \"ENTITYNAME\": \"Nairobi Gynae Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1838,\n" +
//"    \"ENTITYNAME\": \"Raj Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1841,\n" +
//"    \"ENTITYNAME\": \"Rosky Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1844,\n" +
//"    \"ENTITYNAME\": \"Jadi Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1846,\n" +
//"    \"ENTITYNAME\": \"Akshar Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1847,\n" +
//"    \"ENTITYNAME\": \"Krishna Medical Stores\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1850,\n" +
//"    \"ENTITYNAME\": \"Transchem Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1851,\n" +
//"    \"ENTITYNAME\": \"Jolly Medical Stores\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1852,\n" +
//"    \"ENTITYNAME\": \"Sonachem Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1855,\n" +
//"    \"ENTITYNAME\": \"Mewa Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1856,\n" +
//"    \"ENTITYNAME\": \"Narok Medical Stores\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1858,\n" +
//"    \"ENTITYNAME\": \"Pioneer Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1867,\n" +
//"    \"ENTITYNAME\": \"United Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1868,\n" +
//"    \"ENTITYNAME\": \"Magreb Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1872,\n" +
//"    \"ENTITYNAME\": \"Yaya Chemists Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1877,\n" +
//"    \"ENTITYNAME\": \"Health Care Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1879,\n" +
//"    \"ENTITYNAME\": \"Mombasa Medical Stores\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1880,\n" +
//"    \"ENTITYNAME\": \"Apollo Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1881,\n" +
//"    \"ENTITYNAME\": \"Inkamed Pharmaceuticals\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1882,\n" +
//"    \"ENTITYNAME\": \"Sant Parmanand Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1884,\n" +
//"    \"ENTITYNAME\": \"Anand Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1885,\n" +
//"    \"ENTITYNAME\": \"Zeks Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1887,\n" +
//"    \"ENTITYNAME\": \"Woods Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1888,\n" +
//"    \"ENTITYNAME\": \"Ajay Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1892,\n" +
//"    \"ENTITYNAME\": \"Kaweru Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1895,\n" +
//"    \"ENTITYNAME\": \"Philmar Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1897,\n" +
//"    \"ENTITYNAME\": \"Galana Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1899,\n" +
//"    \"ENTITYNAME\": \"C. Mehta & Co Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1900,\n" +
//"    \"ENTITYNAME\": \"Gathimaini Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1904,\n" +
//"    \"ENTITYNAME\": \"Rachie Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1905,\n" +
//"    \"ENTITYNAME\": \"Serian Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1907,\n" +
//"    \"ENTITYNAME\": \"Belladonna Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1908,\n" +
//"    \"ENTITYNAME\": \"Rence Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1910,\n" +
//"    \"ENTITYNAME\": \"Puriza Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1914,\n" +
//"    \"ENTITYNAME\": \"Jamar Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1915,\n" +
//"    \"ENTITYNAME\": \"Tulasi Medicals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1923,\n" +
//"    \"ENTITYNAME\": \"Pharma Share Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1925,\n" +
//"    \"ENTITYNAME\": \"Spectramedic Pharmaceuticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1929,\n" +
//"    \"ENTITYNAME\": \"Simrose Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1931,\n" +
//"    \"ENTITYNAME\": \"Bulk Medicals Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1939,\n" +
//"    \"ENTITYNAME\": \"RivaChem Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1940,\n" +
//"    \"ENTITYNAME\": \"Eros Chemist Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1942,\n" +
//"    \"ENTITYNAME\": \"Mungoma Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1953,\n" +
//"    \"ENTITYNAME\": \"Martian Pharmacy Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1954,\n" +
//"    \"ENTITYNAME\": \"Prof A.E.O WASUNNA\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1956,\n" +
//"    \"ENTITYNAME\": \"Hillchem Chemists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1958,\n" +
//"    \"ENTITYNAME\": \"Gathimaini Pharmacy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1961,\n" +
//"    \"ENTITYNAME\": \"Dr A. K. Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1964,\n" +
//"    \"ENTITYNAME\": \"Dr A. L. Gondi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1968,\n" +
//"    \"ENTITYNAME\": \"Dr A. T. Mariano\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1971,\n" +
//"    \"ENTITYNAME\": \"Dr Ahmed Twahir\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1973,\n" +
//"    \"ENTITYNAME\": \"Prof A.M Adam\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1976,\n" +
//"    \"ENTITYNAME\": \"Prof J. A. Adwok\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1977,\n" +
//"    \"ENTITYNAME\": \"Dr M.A. Bhatti\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1980,\n" +
//"    \"ENTITYNAME\": \"Dr J.J.\\t Msyoki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1983,\n" +
//"    \"ENTITYNAME\": \"Dr Dan Omondi Raburu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1984,\n" +
//"    \"ENTITYNAME\": \"Dr Ali Nanji\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1993,\n" +
//"    \"ENTITYNAME\": \"Dr Ashok Desai\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1994,\n" +
//"    \"ENTITYNAME\": \"Prof S.B.O\\t Ojwang\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1995,\n" +
//"    \"ENTITYNAME\": \"Dr Sarla Maroo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1996,\n" +
//"    \"ENTITYNAME\": \"Dr Atul Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1998,\n" +
//"    \"ENTITYNAME\": \"Dr Aziz Hassanali Mohamed\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11000,\n" +
//"    \"ENTITYNAME\": \"Dr George R. Owino & Ass.\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11006,\n" +
//"    \"ENTITYNAME\": \"Prof N\\t Bhatt\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11009,\n" +
//"    \"ENTITYNAME\": \"Dr Madhvi Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11011,\n" +
//"    \"ENTITYNAME\": \"Dr Onyango Ogony\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11012,\n" +
//"    \"ENTITYNAME\": \"Dr C. K.\\t Musau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11014,\n" +
//"    \"ENTITYNAME\": \"Dr Omondi Oyoo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11015,\n" +
//"    \"ENTITYNAME\": \"Dr Christopher\\t Maina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11016,\n" +
//"    \"ENTITYNAME\": \"Dr Osman M.\\t Miyanji\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11017,\n" +
//"    \"ENTITYNAME\": \"Dr Charles J. R. Opondo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11020,\n" +
//"    \"ENTITYNAME\": \"Dr Walter Ogony\\t Owen\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11022,\n" +
//"    \"ENTITYNAME\": \"Dr Chimmy\\t Okoth  Olende\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11026,\n" +
//"    \"ENTITYNAME\": \"Dr Chitranjan R.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11029,\n" +
//"    \"ENTITYNAME\": \"Dr D. K.\\t  Gikonyo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11030,\n" +
//"    \"ENTITYNAME\": \"Dr James Ndungu Muturi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11032,\n" +
//"    \"ENTITYNAME\": \"Dr Dundu Malaki Owili\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11034,\n" +
//"    \"ENTITYNAME\": \"Dr P.  Parikh Parikh\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11035,\n" +
//"    \"ENTITYNAME\": \"Dr Doris M.Wanjiru Kinuthia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11037,\n" +
//"    \"ENTITYNAME\": \"Dr  Archelaus Achola Okudo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11038,\n" +
//"    \"ENTITYNAME\": \"Dr J.S. Bhangra\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11039,\n" +
//"    \"ENTITYNAME\": \"Dr D. R. Mukiri\\t Githegi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11040,\n" +
//"    \"ENTITYNAME\": \"Dr Pankaj\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11044,\n" +
//"    \"ENTITYNAME\": \"Dr Paul Ngugi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11047,\n" +
//"    \"ENTITYNAME\": \"Dr David E. Bukusi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11048,\n" +
//"    \"ENTITYNAME\": \"Dr Rajendrasinh Gohil\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11049,\n" +
//"    \"ENTITYNAME\": \"Dr Paul\\t Wangai Jnr.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11050,\n" +
//"    \"ENTITYNAME\": \"Dr David\\t Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11053,\n" +
//"    \"ENTITYNAME\": \"Dr Deepak\\t Chudasama\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11055,\n" +
//"    \"ENTITYNAME\": \"Dr F.L.\\t Ndungu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11057,\n" +
//"    \"ENTITYNAME\": \"Dr Peter\\t Mugwe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11060,\n" +
//"    \"ENTITYNAME\": \"Prof Peter Mungai\\t Ngugi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11063,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen\\t Muhudhia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11064,\n" +
//"    \"ENTITYNAME\": \"Dr Peter W.\\t Masinde\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11065,\n" +
//"    \"ENTITYNAME\": \"Dr Kanti R. Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11067,\n" +
//"    \"ENTITYNAME\": \"Dr Prabha V.\\t Choksey\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11070,\n" +
//"    \"ENTITYNAME\": \"Dr Prafull S. Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11071,\n" +
//"    \"ENTITYNAME\": \"Dr William\\t Macharia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11072,\n" +
//"    \"ENTITYNAME\": \"Dr Eliud Njuguna\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11074,\n" +
//"    \"ENTITYNAME\": \"Dr Prakash M.\\t Heda\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11075,\n" +
//"    \"ENTITYNAME\": \"Dr Gerald C. Moniz\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11076,\n" +
//"    \"ENTITYNAME\": \"Dr Richard\\t Baraza\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11079,\n" +
//"    \"ENTITYNAME\": \"Dr E. C. Kungu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11082,\n" +
//"    \"ENTITYNAME\": \"Dr Rajendra Ramjibhai\\t Chauhan\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11083,\n" +
//"    \"ENTITYNAME\": \"Dr J.K.  Mbuthia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11084,\n" +
//"    \"ENTITYNAME\": \"Dr R. P.\\t Lubanga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11085,\n" +
//"    \"ENTITYNAME\": \"Dr Thomas. O.Kwasa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11086,\n" +
//"    \"ENTITYNAME\": \"Dr Ernest M.\\t Kioko\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11090,\n" +
//"    \"ENTITYNAME\": \"Dr Eva W.\\t Njenga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11092,\n" +
//"    \"ENTITYNAME\": \"Dr Robin Michira Mogere\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11094,\n" +
//"    \"ENTITYNAME\": \"Dr Evan Sequeira\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11096,\n" +
//"    \"ENTITYNAME\": \"Dr Rohit G. Radia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11097,\n" +
//"    \"ENTITYNAME\": \"Dr Erastus  O. Amayo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11099,\n" +
//"    \"ENTITYNAME\": \"Prof Ezekiel M. Wafula\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11103,\n" +
//"    \"ENTITYNAME\": \"Dr Fredrick Antonne Okoth\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11104,\n" +
//"    \"ENTITYNAME\": \"Dr John Kamano Kariuki\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11105,\n" +
//"    \"ENTITYNAME\": \"Dr S.M  Mbugua\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11106,\n" +
//"    \"ENTITYNAME\": \"Dr S. O. Owinga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11109,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen\\t Ochiel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11111,\n" +
//"    \"ENTITYNAME\": \"Dr F. W.\\t Manguyu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11112,\n" +
//"    \"ENTITYNAME\": \"Dr S. R.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11117,\n" +
//"    \"ENTITYNAME\": \"Dr Frank G.\\t Njenga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11118,\n" +
//"    \"ENTITYNAME\": \"Dr S. Warugongo\\t Kioni\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11120,\n" +
//"    \"ENTITYNAME\": \"Dr A.M.\\t Manguyu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11122,\n" +
//"    \"ENTITYNAME\": \"Dr Saeed R.\\t Samnakay\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11123,\n" +
//"    \"ENTITYNAME\": \"Dr Fred M. T. Otsyeno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11124,\n" +
//"    \"ENTITYNAME\": \"Dr Fuwad\\t Abdalla\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11129,\n" +
//"    \"ENTITYNAME\": \"Dr Sanjay \\tVerma\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11134,\n" +
//"    \"ENTITYNAME\": \"Dr M.A.\\t Sheikh\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11135,\n" +
//"    \"ENTITYNAME\": \"Dr M.R.B.\\t Otieno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11137,\n" +
//"    \"ENTITYNAME\": \"Dr Smita\\t Devani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11138,\n" +
//"    \"ENTITYNAME\": \"Dr M.A Oloo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11139,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen Wali\\t Musila\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11144,\n" +
//"    \"ENTITYNAME\": \"Dr G. Tesfaldet\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11147,\n" +
//"    \"ENTITYNAME\": \"Dr John Mutua Chamia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11148,\n" +
//"    \"ENTITYNAME\": \"Dr Elly O. Ogutu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11149,\n" +
//"    \"ENTITYNAME\": \"Dr Benjamin\\t Ombito\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11150,\n" +
//"    \"ENTITYNAME\": \"Dr Jean  Kagia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11151,\n" +
//"    \"ENTITYNAME\": \"Dr N.L.\\t Acharya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11153,\n" +
//"    \"ENTITYNAME\": \"Dr B. Ndirangu Waitara\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11154,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Amolo Aluoch\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11157,\n" +
//"    \"ENTITYNAME\": \"Dr Pius  A. Kigamwa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11158,\n" +
//"    \"ENTITYNAME\": \"Dr Nizar\\t Hussein\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11160,\n" +
//"    \"ENTITYNAME\": \"Dr Rachel Kangethe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11164,\n" +
//"    \"ENTITYNAME\": \"Dr Ronald Franco Kaale\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11167,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Muriuki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11171,\n" +
//"    \"ENTITYNAME\": \"Dr Mukesh Lalji Shah\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11173,\n" +
//"    \"ENTITYNAME\": \"Dr Wilfred  Rottich Lesan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11174,\n" +
//"    \"ENTITYNAME\": \"Dr Sarojna Ramesh Shah\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11176,\n" +
//"    \"ENTITYNAME\": \"Prof Omondi Ogutu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11177,\n" +
//"    \"ENTITYNAME\": \"Dr Shashi Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11182,\n" +
//"    \"ENTITYNAME\": \"Dr Nathan Gatheru Thagana\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11183,\n" +
//"    \"ENTITYNAME\": \"Dr L. Gathua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11184,\n" +
//"    \"ENTITYNAME\": \"Dr Z. W. Gatheru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11187,\n" +
//"    \"ENTITYNAME\": \"Dr Simon K. Mbuthia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11188,\n" +
//"    \"ENTITYNAME\": \"Dr Rachel  Furaha Kariuki\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11190,\n" +
//"    \"ENTITYNAME\": \"Dr Christine Awuor  Yuko Jowi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11191,\n" +
//"    \"ENTITYNAME\": \"Dr John Fredrick  Onyango\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11192,\n" +
//"    \"ENTITYNAME\": \"Dr Subhash M. Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11196,\n" +
//"    \"ENTITYNAME\": \"Dr Wanjiru\\t Abuto\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11197,\n" +
//"    \"ENTITYNAME\": \"Dr V. N. Choksey\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11198,\n" +
//"    \"ENTITYNAME\": \"Dr Elijah Nyainda Ogola\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11199,\n" +
//"    \"ENTITYNAME\": \"Dr M.M.\\t Warshow\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11202,\n" +
//"    \"ENTITYNAME\": \"Dr David\\t Silverstein\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11203,\n" +
//"    \"ENTITYNAME\": \"Dr Irungu Ndirangu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11204,\n" +
//"    \"ENTITYNAME\": \"Dr N. A.\\t Waswa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11206,\n" +
//"    \"ENTITYNAME\": \"Dr Muia\\t Ndavi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11207,\n" +
//"    \"ENTITYNAME\": \"Dr Yashvant B. Sonigra\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11213,\n" +
//"    \"ENTITYNAME\": \"Dr Juliana A. Otieno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11215,\n" +
//"    \"ENTITYNAME\": \"Dr Zephania\\t Gaya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11219,\n" +
//"    \"ENTITYNAME\": \"Dr Allaudin Shariff\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11220,\n" +
//"    \"ENTITYNAME\": \"Dr Waithaka Mwaura\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11221,\n" +
//"    \"ENTITYNAME\": \"Dr P.A.\\t Owino Otieno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11222,\n" +
//"    \"ENTITYNAME\": \"Dr YUSUF ALI ABDULRASUL PALKHI\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11225,\n" +
//"    \"ENTITYNAME\": \"Dr Salim K.\\t Noorani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11226,\n" +
//"    \"ENTITYNAME\": \"Dr Kiran Shah\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11230,\n" +
//"    \"ENTITYNAME\": \"Dr S.K. Sabharwal\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11234,\n" +
//"    \"ENTITYNAME\": \"Dr Henry M. Kioko\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11235,\n" +
//"    \"ENTITYNAME\": \"Dr S.P.\\t Amin\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11236,\n" +
//"    \"ENTITYNAME\": \"Dr N.C. Gupta\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11240,\n" +
//"    \"ENTITYNAME\": \"Dr Ashwin Madhiwala\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11241,\n" +
//"    \"ENTITYNAME\": \"Dr L.D. Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11242,\n" +
//"    \"ENTITYNAME\": \"Dr Cliff M.\\t Rajula\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11245,\n" +
//"    \"ENTITYNAME\": \"Dr Godfrey Nsereko Lule\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11248,\n" +
//"    \"ENTITYNAME\": \"Dr Rufas Kanyogo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11249,\n" +
//"    \"ENTITYNAME\": \"Dr Vibhavari\\t Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11250,\n" +
//"    \"ENTITYNAME\": \"Dr J.P.\\t Gatabaki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11252,\n" +
//"    \"ENTITYNAME\": \"Dr Mark Joshi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11253,\n" +
//"    \"ENTITYNAME\": \"Dr Nyambura\\t Kigamwa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11254,\n" +
//"    \"ENTITYNAME\": \"Dr Hardial Singh\\t Ghataura\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11258,\n" +
//"    \"ENTITYNAME\": \"Dr Varinder  Singh Sur\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11259,\n" +
//"    \"ENTITYNAME\": \"Dr Saroop Singh Bansil\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11260,\n" +
//"    \"ENTITYNAME\": \"Dr Vijay R. Dave\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11261,\n" +
//"    \"ENTITYNAME\": \"Dr Martin Otieno\\t Oloo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11263,\n" +
//"    \"ENTITYNAME\": \"Dr B.H.\\t Mohamed\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11264,\n" +
//"    \"ENTITYNAME\": \"Dr George\\t Josiah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11265,\n" +
//"    \"ENTITYNAME\": \"Dr Jane Wairimu Gatumbu Kabutu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11267,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick\\t Akuku-Okoth\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11268,\n" +
//"    \"ENTITYNAME\": \"Dr H. S. Vishwanath\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11270,\n" +
//"    \"ENTITYNAME\": \"Dr Jagdish Bachobha Sonigra\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11271,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Wanyoike\\t Gichuhi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11274,\n" +
//"    \"ENTITYNAME\": \"Dr Ramesh C.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11275,\n" +
//"    \"ENTITYNAME\": \"Dr S. Faya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11278,\n" +
//"    \"ENTITYNAME\": \"Dr James Ogwang\\t Jowi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11283,\n" +
//"    \"ENTITYNAME\": \"Dr R. K.\\t Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11284,\n" +
//"    \"ENTITYNAME\": \"Dr Charles Migwe\\t Wanyoike\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11285,\n" +
//"    \"ENTITYNAME\": \"Dr Geoffrey \\t Ochieng  Owiti\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11288,\n" +
//"    \"ENTITYNAME\": \"Dr Arvind K. Dave\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11290,\n" +
//"    \"ENTITYNAME\": \"Dr Eustace Karo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11291,\n" +
//"    \"ENTITYNAME\": \"Dr Ameet  S. Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11294,\n" +
//"    \"ENTITYNAME\": \"Dr Kibowen Toroitich\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11295,\n" +
//"    \"ENTITYNAME\": \"Dr C.\\t Kibe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11296,\n" +
//"    \"ENTITYNAME\": \"Dr J.W.\\t Mwaniki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11297,\n" +
//"    \"ENTITYNAME\": \"Dr Harish Dhirajlal Rupani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11300,\n" +
//"    \"ENTITYNAME\": \"Dr M.F.\\t Chaudhry\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11301,\n" +
//"    \"ENTITYNAME\": \"Dr Gita Shah\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11302,\n" +
//"    \"ENTITYNAME\": \"Dr Zachary \\tRango\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11303,\n" +
//"    \"ENTITYNAME\": \"Dr E. Nyanjui\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11305,\n" +
//"    \"ENTITYNAME\": \"Dr Madhu Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11306,\n" +
//"    \"ENTITYNAME\": \"Dr Mahesh\\t Chudasama\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11308,\n" +
//"    \"ENTITYNAME\": \"Dr G.O.\\t Yonga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11309,\n" +
//"    \"ENTITYNAME\": \"Dr S.G.\\t Jani\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11311,\n" +
//"    \"ENTITYNAME\": \"Dr Philip M.\\t Mwangemi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11313,\n" +
//"    \"ENTITYNAME\": \"Dr Peter  L. Ukiru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11316,\n" +
//"    \"ENTITYNAME\": \"Dr J.B.  Okanga & Associates\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11317,\n" +
//"    \"ENTITYNAME\": \"Dr Mujahid F.\\t Din\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11322,\n" +
//"    \"ENTITYNAME\": \"Dr Bimal\\t Yajnik\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11324,\n" +
//"    \"ENTITYNAME\": \"Dr Udayan \\t Sheth\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11325,\n" +
//"    \"ENTITYNAME\": \"Dr Paul Muli Ngumbi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11329,\n" +
//"    \"ENTITYNAME\": \"Dr Mogeke Nyorora\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11334,\n" +
//"    \"ENTITYNAME\": \"Dr Rohit  A. Devani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11335,\n" +
//"    \"ENTITYNAME\": \"Dr Urmila S.\\t Ramrakha\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11340,\n" +
//"    \"ENTITYNAME\": \"Dr Maina\\t Ruga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11341,\n" +
//"    \"ENTITYNAME\": \"Dr Paresh Kumar J. Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11343,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Warurua\\t Mugo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11346,\n" +
//"    \"ENTITYNAME\": \"Dr Ian Coro Kaburu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11348,\n" +
//"    \"ENTITYNAME\": \"Dr Michael O.\\t Amolo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11351,\n" +
//"    \"ENTITYNAME\": \"Dr Mohan\\t Lumba\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11352,\n" +
//"    \"ENTITYNAME\": \"Dr Jared\\t Nyachiro\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11353,\n" +
//"    \"ENTITYNAME\": \"Dr W.J. Kimani\\t Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11356,\n" +
//"    \"ENTITYNAME\": \"Dr Nyambura \\t Gichuhi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11359,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph N Mugo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11361,\n" +
//"    \"ENTITYNAME\": \"Dr F.O. Otieno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11363,\n" +
//"    \"ENTITYNAME\": \"Dr Cyprian Echessa Muyodi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11365,\n" +
//"    \"ENTITYNAME\": \"Dr A. Mahmud\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11366,\n" +
//"    \"ENTITYNAME\": \"Dr J.R. Gachiri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11367,\n" +
//"    \"ENTITYNAME\": \"Dr Shah Atul Kantilal\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11369,\n" +
//"    \"ENTITYNAME\": \"Dr T. Kimonge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11372,\n" +
//"    \"ENTITYNAME\": \"Dr Mahesh\\t Kumar\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11374,\n" +
//"    \"ENTITYNAME\": \"Dr James\\t Serumaga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11378,\n" +
//"    \"ENTITYNAME\": \"Dr David Githanga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11379,\n" +
//"    \"ENTITYNAME\": \"Dr Riaz M. Khan\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11381,\n" +
//"    \"ENTITYNAME\": \"Dr Abda F.\\t Khan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11382,\n" +
//"    \"ENTITYNAME\": \"Dr F. Mugo Ng`ang`a\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11385,\n" +
//"    \"ENTITYNAME\": \"Dr J.B. \\t Wasunna\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11387,\n" +
//"    \"ENTITYNAME\": \"Dr V. Chitchoukin\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11388,\n" +
//"    \"ENTITYNAME\": \"Dr Safwat Saleh Andrawes\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11389,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Wainaina Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11394,\n" +
//"    \"ENTITYNAME\": \"Dr S.W.  Kabetu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11395,\n" +
//"    \"ENTITYNAME\": \"Dr Henry\\t Wellington Alube\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11401,\n" +
//"    \"ENTITYNAME\": \"Prof Sajabi M. Masinde\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11403,\n" +
//"    \"ENTITYNAME\": \"Dr R.M.\\t Rajani\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11404,\n" +
//"    \"ENTITYNAME\": \"Dr Lorna\\t Sangale\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11405,\n" +
//"    \"ENTITYNAME\": \"Dr V. Bharat Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11407,\n" +
//"    \"ENTITYNAME\": \"Dr Suresh\\t Jari\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11408,\n" +
//"    \"ENTITYNAME\": \"Dr P Parkar\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11413,\n" +
//"    \"ENTITYNAME\": \"Dr Tula\\t Bowry\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11414,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph J. Masiga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11416,\n" +
//"    \"ENTITYNAME\": \"Dr Paul K.\\t Mitei\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11418,\n" +
//"    \"ENTITYNAME\": \"Dr Mary A Masiga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11419,\n" +
//"    \"ENTITYNAME\": \"Dr Timothy Murithi\\t\\t Mwiti\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11425,\n" +
//"    \"ENTITYNAME\": \"Dr Fredrick Gikandi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11431,\n" +
//"    \"ENTITYNAME\": \"Dr Nizar\\t Ver\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11437,\n" +
//"    \"ENTITYNAME\": \"Dr Susan W. \\t Hinga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11440,\n" +
//"    \"ENTITYNAME\": \"Dr D.M.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11443,\n" +
//"    \"ENTITYNAME\": \"Dr Francis M.\\t Kinyumu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11444,\n" +
//"    \"ENTITYNAME\": \"Dr Wadegu \\t Gwada\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11446,\n" +
//"    \"ENTITYNAME\": \"Dr Gacani\\t Mberia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11449,\n" +
//"    \"ENTITYNAME\": \"Dr Lawrence\\t Ndegwa Gakuu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11452,\n" +
//"    \"ENTITYNAME\": \"Dr Jayendra K.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11455,\n" +
//"    \"ENTITYNAME\": \"Dr H. P.\\t Dhutia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11458,\n" +
//"    \"ENTITYNAME\": \"Dr A.S. Burani\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11460,\n" +
//"    \"ENTITYNAME\": \"Dr Heltan Mnjama Maganga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11464,\n" +
//"    \"ENTITYNAME\": \"Dr J.S.\\t Arora\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11465,\n" +
//"    \"ENTITYNAME\": \"Dr R. M.  Karega\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11467,\n" +
//"    \"ENTITYNAME\": \"Dr Hezra Odondi\\t Opere\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11469,\n" +
//"    \"ENTITYNAME\": \"Dr Nira\\t Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11472,\n" +
//"    \"ENTITYNAME\": \"Dr A.P\\t LANDRA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11478,\n" +
//"    \"ENTITYNAME\": \"Dr Y.S.\\t Karim\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11479,\n" +
//"    \"ENTITYNAME\": \"Dr N.N.\\t Wachira\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11481,\n" +
//"    \"ENTITYNAME\": \"Dr Wairimu Imalingat\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11482,\n" +
//"    \"ENTITYNAME\": \"Prof John E.O.\\t Atinga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11490,\n" +
//"    \"ENTITYNAME\": \"Dr Ashok S.\\t Matharu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11492,\n" +
//"    \"ENTITYNAME\": \"Dr Eric J.  Maina\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11498,\n" +
//"    \"ENTITYNAME\": \"Dr Gabriel Ezekiel Njoroge\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11499,\n" +
//"    \"ENTITYNAME\": \"Dr Fredrick Richard\\t Owiti\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11500,\n" +
//"    \"ENTITYNAME\": \"Dr H.J.\\t Ahluwalia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11501,\n" +
//"    \"ENTITYNAME\": \"Dr Symon W. Guthua\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11502,\n" +
//"    \"ENTITYNAME\": \"Dr A.J. Meyerhold\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11504,\n" +
//"    \"ENTITYNAME\": \"Dr Martin\\t Awori\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11505,\n" +
//"    \"ENTITYNAME\": \"Dr C.S. Petersen\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11510,\n" +
//"    \"ENTITYNAME\": \"Dr J.R. Wambwa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11512,\n" +
//"    \"ENTITYNAME\": \"Dr Taher\\t Hassanali\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11514,\n" +
//"    \"ENTITYNAME\": \"Dr S.M. Barrack\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11516,\n" +
//"    \"ENTITYNAME\": \"Dr Essajee & \\t Vinayak Ass.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11522,\n" +
//"    \"ENTITYNAME\": \"Dr Muhindi Wanjugu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11523,\n" +
//"    \"ENTITYNAME\": \"Dr Joy P. Mpaata\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11524,\n" +
//"    \"ENTITYNAME\": \"Dr James Bill Onjua Oyieke\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11525,\n" +
//"    \"ENTITYNAME\": \"Dr Joyce  Mmbone\\t Aswani\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11526,\n" +
//"    \"ENTITYNAME\": \"Dr P. Devani\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11529,\n" +
//"    \"ENTITYNAME\": \"Dr Jane Okongo Oloo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11530,\n" +
//"    \"ENTITYNAME\": \"Dr Charles E. Kabetu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11531,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen\\t Mbugua Kairu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11532,\n" +
//"    \"ENTITYNAME\": \"Dr N. C. Rajdev\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11533,\n" +
//"    \"ENTITYNAME\": \"Prof Koigi\\t Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11536,\n" +
//"    \"ENTITYNAME\": \"Dr Charles N.\\t Chunge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11537,\n" +
//"    \"ENTITYNAME\": \"Dr M.L. \\t Chindia\",\n" +
//"    \"Payment'\": \"Citibank Int Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11538,\n" +
//"    \"ENTITYNAME\": \"Dr Samson Mwatuano\\t Bebora\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11542,\n" +
//"    \"ENTITYNAME\": \"Dr Pushpa\\t Sachdeva\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11544,\n" +
//"    \"ENTITYNAME\": \"Prof Herbert Ouma\\t Oburra\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11545,\n" +
//"    \"ENTITYNAME\": \"Dr Calisto Odongo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11547,\n" +
//"    \"ENTITYNAME\": \"Dr Benjamin Stephen\\t Mbindyo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11549,\n" +
//"    \"ENTITYNAME\": \"Dr Athanasio Onyango Kotonya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11550,\n" +
//"    \"ENTITYNAME\": \"Dr K.K.\\t Duggal\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11554,\n" +
//"    \"ENTITYNAME\": \"Dr G.\\t Gitahi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11555,\n" +
//"    \"ENTITYNAME\": \"Dr Kalpana\\t Sheth\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11556,\n" +
//"    \"ENTITYNAME\": \"Dr Paul\\t Guchu Kioy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11557,\n" +
//"    \"ENTITYNAME\": \"Dr Robinson\\t Mumenya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11562,\n" +
//"    \"ENTITYNAME\": \"Dr P.H.\\t Parmar\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11564,\n" +
//"    \"ENTITYNAME\": \"Dr Frederick C.F.\\t Otieno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11565,\n" +
//"    \"ENTITYNAME\": \"Dr Fred\\t Were\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11570,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel A.\\t Ochola\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11571,\n" +
//"    \"ENTITYNAME\": \"Dr S.E.N.\\t Waweru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11573,\n" +
//"    \"ENTITYNAME\": \"Dr Satish M. \\tVaghela\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11574,\n" +
//"    \"ENTITYNAME\": \"Dr F.K. Mwongera\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11575,\n" +
//"    \"ENTITYNAME\": \"Dr Rati S.\\t Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11576,\n" +
//"    \"ENTITYNAME\": \"Dr J.\\t Kirima\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11579,\n" +
//"    \"ENTITYNAME\": \"Dr H.\\t Chandaria\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11582,\n" +
//"    \"ENTITYNAME\": \"Dr N.M.\\t Ngugi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11583,\n" +
//"    \"ENTITYNAME\": \"Dr Hilda Wanjiru Njuki\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11586,\n" +
//"    \"ENTITYNAME\": \"Dr P.M.\\t Wambugu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11589,\n" +
//"    \"ENTITYNAME\": \"Dr O.\\t Walia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11590,\n" +
//"    \"ENTITYNAME\": \"Dr Mathu J.M.\\t Waweru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11592,\n" +
//"    \"ENTITYNAME\": \"Dr Alice Nafula.\\t Use Entity Id 182088\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11593,\n" +
//"    \"ENTITYNAME\": \"Dr Michael Njino\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11594,\n" +
//"    \"ENTITYNAME\": \"Dr Jayant G. \\tKarania\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11595,\n" +
//"    \"ENTITYNAME\": \"Dr George Omondi\\t Oyoo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11596,\n" +
//"    \"ENTITYNAME\": \"Dr Macharia\\t Muchiri\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11597,\n" +
//"    \"ENTITYNAME\": \"Dr Esther N.\\t Wanjohi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11598,\n" +
//"    \"ENTITYNAME\": \"Dr Amos E.O. Otedo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11599,\n" +
//"    \"ENTITYNAME\": \"Dr Andrew\\t Mmene\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11600,\n" +
//"    \"ENTITYNAME\": \"Dr Augustine Peter Kavoo  Linge\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11601,\n" +
//"    \"ENTITYNAME\": \"Dr J.K.\\t Mwangi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11602,\n" +
//"    \"ENTITYNAME\": \"Dr S. M. Maingi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11605,\n" +
//"    \"ENTITYNAME\": \"Dr Rafique B Parker\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11608,\n" +
//"    \"ENTITYNAME\": \"Dr Kirit J.\\t Shah\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11609,\n" +
//"    \"ENTITYNAME\": \"Dr Robert N.\\t Mathenge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11611,\n" +
//"    \"ENTITYNAME\": \"Dr Shaileshkumar Z.\\t Shah\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11613,\n" +
//"    \"ENTITYNAME\": \"Dr Peter\\t Griffiths\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11614,\n" +
//"    \"ENTITYNAME\": \"Dr Z.A.\\t Jaffery\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11615,\n" +
//"    \"ENTITYNAME\": \"Dr Praful\\t Sanghavi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11616,\n" +
//"    \"ENTITYNAME\": \"Dr H. W. Odongo Odongo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11618,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel Maina Kanyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11619,\n" +
//"    \"ENTITYNAME\": \"Dr C.G. Githinji\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11621,\n" +
//"    \"ENTITYNAME\": \"Dr John Ngugi\\t Karanja\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11622,\n" +
//"    \"ENTITYNAME\": \"Dr J. Kabeu Kamau\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11623,\n" +
//"    \"ENTITYNAME\": \"Dr I.C.\\t Ogonji\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11624,\n" +
//"    \"ENTITYNAME\": \"Dr Shashikant Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11625,\n" +
//"    \"ENTITYNAME\": \"Dr Mira   Joshi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11630,\n" +
//"    \"ENTITYNAME\": \"Dr Theresa G. A. O.\\t K`Oduol\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11631,\n" +
//"    \"ENTITYNAME\": \"Dr Amrit R.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11632,\n" +
//"    \"ENTITYNAME\": \"Dr Peter K.\\t Karongo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11635,\n" +
//"    \"ENTITYNAME\": \"Dr Noor  Ali\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11639,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Wainaina Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11641,\n" +
//"    \"ENTITYNAME\": \"Dr Samwel O. Adongo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11642,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Wasungu\\t Ochieng\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11643,\n" +
//"    \"ENTITYNAME\": \"Dr Edith Onyango\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11648,\n" +
//"    \"ENTITYNAME\": \"Dr James Obondi\\t Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11649,\n" +
//"    \"ENTITYNAME\": \"Dr David Oyugi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11652,\n" +
//"    \"ENTITYNAME\": \"Dr H.S.\\t Keer\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11653,\n" +
//"    \"ENTITYNAME\": \"Dr Shah L.\\t Mansukul\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11654,\n" +
//"    \"ENTITYNAME\": \"Dr George Martin Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11655,\n" +
//"    \"ENTITYNAME\": \"Dr Henry Sexton Adala\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11656,\n" +
//"    \"ENTITYNAME\": \"Dr Charles W.\\t Wanyonyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11658,\n" +
//"    \"ENTITYNAME\": \"Dr Walter Jaoko\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11659,\n" +
//"    \"ENTITYNAME\": \"Dr Sajabi M.\\t Masinde\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11660,\n" +
//"    \"ENTITYNAME\": \"Dr Edward\\t Mwaringa\",\n" +
//"    \"Payment'\": \"CITI Bank Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11662,\n" +
//"    \"ENTITYNAME\": \"Dr Eliud S.\\t Masinde\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11663,\n" +
//"    \"ENTITYNAME\": \"Dr Maurine\\t\\t Mutua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11664,\n" +
//"    \"ENTITYNAME\": \"Dr Ranjana Sonigra\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11665,\n" +
//"    \"ENTITYNAME\": \"Dr Mustafa\\t Kamani\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11666,\n" +
//"    \"ENTITYNAME\": \"Dr Suresh\\t Jari\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11667,\n" +
//"    \"ENTITYNAME\": \"Dr Mukesh B\\t Joshi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11668,\n" +
//"    \"ENTITYNAME\": \"Mrs TERESIA \\t KIGERA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11669,\n" +
//"    \"ENTITYNAME\": \"Dr Sofia\\t Lyko\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11671,\n" +
//"    \"ENTITYNAME\": \"Dr S. RAMA CHARY\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11675,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen J.  Ndombi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11676,\n" +
//"    \"ENTITYNAME\": \"Dr Devi B\\t Mongare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11677,\n" +
//"    \"ENTITYNAME\": \"Dr Ephantus Wachira\\t Murage\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11678,\n" +
//"    \"ENTITYNAME\": \"Dr Manuel J D`CRUZ\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11679,\n" +
//"    \"ENTITYNAME\": \"Dr Walter Anyango Odhiambo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11680,\n" +
//"    \"ENTITYNAME\": \"Dr Karanja\\t Kinyanjui\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11681,\n" +
//"    \"ENTITYNAME\": \"Dr P.C.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11682,\n" +
//"    \"ENTITYNAME\": \"Dr Philip K. Kisyoka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11683,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph M. Kiragu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11685,\n" +
//"    \"ENTITYNAME\": \"Dr M\\t Asif\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11686,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel N. Gathua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11688,\n" +
//"    \"ENTITYNAME\": \"Dr J.K.\\t Thuo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11690,\n" +
//"    \"ENTITYNAME\": \"Dr Fred Kambuni\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11691,\n" +
//"    \"ENTITYNAME\": \"Mr Amos\\t\\t Omwono\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11693,\n" +
//"    \"ENTITYNAME\": \"Dr Marx Manasseh Okonji\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11694,\n" +
//"    \"ENTITYNAME\": \"Hon C.M\\t Boit\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11696,\n" +
//"    \"ENTITYNAME\": \"Dr M. D.  Mnjalla\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11697,\n" +
//"    \"ENTITYNAME\": \"Dr Neeraj Krishnan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11698,\n" +
//"    \"ENTITYNAME\": \"Dr Nizar J. Verjee\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11700,\n" +
//"    \"ENTITYNAME\": \"Dr Frederick Odour Remulo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11702,\n" +
//"    \"ENTITYNAME\": \"Dr G. A  Maranya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11703,\n" +
//"    \"ENTITYNAME\": \"Dr C\\t Kodhe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11704,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel\\t Juma\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11705,\n" +
//"    \"ENTITYNAME\": \"Dr M.D\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11713,\n" +
//"    \"ENTITYNAME\": \"Dr Yunus  \\tB.G\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11715,\n" +
//"    \"ENTITYNAME\": \"Dr D.M.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11716,\n" +
//"    \"ENTITYNAME\": \"Dr Amour A.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11717,\n" +
//"    \"ENTITYNAME\": \"Dr J.G. Gachanja\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11719,\n" +
//"    \"ENTITYNAME\": \"Dr Elizabeth \\tA. Awimbo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11720,\n" +
//"    \"ENTITYNAME\": \"Dr Zahiri  Alavi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11721,\n" +
//"    \"ENTITYNAME\": \"Dr Rakesh\\t Rajpal\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11723,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick Ragot Olang\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11725,\n" +
//"    \"ENTITYNAME\": \"Dr Moses\\t Kinuthia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11726,\n" +
//"    \"ENTITYNAME\": \"Dr Jane\\t Wakahe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11728,\n" +
//"    \"ENTITYNAME\": \"Dr Fred W.\\t Nabbugodi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11729,\n" +
//"    \"ENTITYNAME\": \"Dr George Fanuel Jumba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11731,\n" +
//"    \"ENTITYNAME\": \"Dr Naomi W Gachara\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11732,\n" +
//"    \"ENTITYNAME\": \"Dr K.M.\\t Bhagat\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11733,\n" +
//"    \"ENTITYNAME\": \"Dr P.J. Onyango\\t Ogony\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11734,\n" +
//"    \"ENTITYNAME\": \"Dr Anisa  Bashir\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11735,\n" +
//"    \"ENTITYNAME\": \"Dr Bates Achieng\\t\\t Nyamolo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11737,\n" +
//"    \"ENTITYNAME\": \"Dr Omondi L.B.   Kumba\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11738,\n" +
//"    \"ENTITYNAME\": \"Dr Juzar \\t Hooker\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11743,\n" +
//"    \"ENTITYNAME\": \"Dr Ireri   Munene\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11744,\n" +
//"    \"ENTITYNAME\": \"Dr Harshad \\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11746,\n" +
//"    \"ENTITYNAME\": \"Dr Wairimu\\t Imalingat\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11747,\n" +
//"    \"ENTITYNAME\": \"Dr J. Mulatya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11748,\n" +
//"    \"ENTITYNAME\": \"Dr B.M.  Wahome\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11749,\n" +
//"    \"ENTITYNAME\": \"Dr Dhirane A. Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11750,\n" +
//"    \"ENTITYNAME\": \"Dr E.O.  Omonge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11751,\n" +
//"    \"ENTITYNAME\": \"Dr Emmanuel N.  Ayim\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11752,\n" +
//"    \"ENTITYNAME\": \"Dr Kahenya P.N.P\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11754,\n" +
//"    \"ENTITYNAME\": \"Dr Peter L.W. \\t Ndaguatha\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11755,\n" +
//"    \"ENTITYNAME\": \"Dr D.J.  Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11756,\n" +
//"    \"ENTITYNAME\": \"Dr E.C\\t Kungu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11757,\n" +
//"    \"ENTITYNAME\": \"Dr D. C.  Paul\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11758,\n" +
//"    \"ENTITYNAME\": \"Dr C\\t Rajula\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11760,\n" +
//"    \"ENTITYNAME\": \"Dr George K. Onyango\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11761,\n" +
//"    \"ENTITYNAME\": \"Dr L.N Gachare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11763,\n" +
//"    \"ENTITYNAME\": \"Dr Samson\\t Wanjala\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11764,\n" +
//"    \"ENTITYNAME\": \"Dr Daisy N. \\t Ndwiga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11765,\n" +
//"    \"ENTITYNAME\": \"Dr Mary M.\\t Omutsani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11766,\n" +
//"    \"ENTITYNAME\": \"Dr W.  Mathenge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11769,\n" +
//"    \"ENTITYNAME\": \"Dr Paul  Ngumbi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11770,\n" +
//"    \"ENTITYNAME\": \"Dr M. Wangari\\t Kuria\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11771,\n" +
//"    \"ENTITYNAME\": \"Dr Nashir Bhanji\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11774,\n" +
//"    \"ENTITYNAME\": \"Dr J. M.  Salim\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11775,\n" +
//"    \"ENTITYNAME\": \"Dr Godfrey Wahome Ngayu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11776,\n" +
//"    \"ENTITYNAME\": \"Dr Mohamed Z.\\t Alavi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11779,\n" +
//"    \"ENTITYNAME\": \"Dr Geoffrey C Kibuga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11784,\n" +
//"    \"ENTITYNAME\": \"Dr George K.  Museve\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11785,\n" +
//"    \"ENTITYNAME\": \"Dr Sunil\\t Vinayak\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11787,\n" +
//"    \"ENTITYNAME\": \"Dr J. M  Mwihia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11788,\n" +
//"    \"ENTITYNAME\": \"Dr Gacheri Nyamu\\t Mutua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11791,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel N. K. \\t Waweru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11792,\n" +
//"    \"ENTITYNAME\": \"Dr Herman Owuor\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11794,\n" +
//"    \"ENTITYNAME\": \"Dr Abdallah A. \\t Kibwana\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11795,\n" +
//"    \"ENTITYNAME\": \"Dr Francis  Waweru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11796,\n" +
//"    \"ENTITYNAME\": \"Dr David\\t Odeny\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11799,\n" +
//"    \"ENTITYNAME\": \"Dr Anthony J.O.  Were\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11800,\n" +
//"    \"ENTITYNAME\": \"Dr J.M\\t Chakaya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11801,\n" +
//"    \"ENTITYNAME\": \"Dr Hosea Wilfred Waweru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11803,\n" +
//"    \"ENTITYNAME\": \"Dr Rodgers Muruu \\t Kombo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11804,\n" +
//"    \"ENTITYNAME\": \"Dr E.H.O. \\t Mahero\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11806,\n" +
//"    \"ENTITYNAME\": \"Dr Charles V. \\t Okumu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11808,\n" +
//"    \"ENTITYNAME\": \"Dr Harmeet S. Dhadialla\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11809,\n" +
//"    \"ENTITYNAME\": \"Dr Walter O. Kudoyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11810,\n" +
//"    \"ENTITYNAME\": \"Dr B. M. Musau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11811,\n" +
//"    \"ENTITYNAME\": \"Dr Sidney\\t Nesbitt\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11812,\n" +
//"    \"ENTITYNAME\": \"Dr Hemant Saha\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11813,\n" +
//"    \"ENTITYNAME\": \"Dr Onesmus W. \\t Gachuno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11814,\n" +
//"    \"ENTITYNAME\": \"Dr Vincent Muoki  Mutiso\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11815,\n" +
//"    \"ENTITYNAME\": \"Dr Waweru \\t MathuJ.M\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11818,\n" +
//"    \"ENTITYNAME\": \"Dr E. E.  Ambeva\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11819,\n" +
//"    \"ENTITYNAME\": \"Dr Irene\\t Ochieng\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11822,\n" +
//"    \"ENTITYNAME\": \"Prof Josephat Mulimba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11824,\n" +
//"    \"ENTITYNAME\": \"Dr Lawrence Kimathi\\t Mwiti\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11825,\n" +
//"    \"ENTITYNAME\": \"Dr Geoffrey\\t Muiruri King`ang`a\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11827,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Maingi Karienye\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11828,\n" +
//"    \"ENTITYNAME\": \"Dr Mala  Nyun\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11829,\n" +
//"    \"ENTITYNAME\": \"Dr Atanas .O.\\t Kotonya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11830,\n" +
//"    \"ENTITYNAME\": \"Prof Julius\\t Muasya Kyambi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11831,\n" +
//"    \"ENTITYNAME\": \"Dr Merry Jennifer\\t Othigo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11832,\n" +
//"    \"ENTITYNAME\": \"Dr B.N\\t Gakinya\",\n" +
//"    \"Payment'\": \"Citibank Int Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11833,\n" +
//"    \"ENTITYNAME\": \"Dr S. Maina Wanjihia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11834,\n" +
//"    \"ENTITYNAME\": \"Dr Salim\\t S.Noormohamed\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11835,\n" +
//"    \"ENTITYNAME\": \"Dr Kinuthia F. J.  Muriu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11836,\n" +
//"    \"ENTITYNAME\": \"Dr Kamenwa\\t Njenga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11837,\n" +
//"    \"ENTITYNAME\": \"Dr Muthure\\t Macharia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11839,\n" +
//"    \"ENTITYNAME\": \"Dr James H.\\t Swao\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11842,\n" +
//"    \"ENTITYNAME\": \"Dr Peninah Nduleve Kitili\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11843,\n" +
//"    \"ENTITYNAME\": \"Dr Joab\\t Bodo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11844,\n" +
//"    \"ENTITYNAME\": \"Dr Mwanisa M.  Omutsani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11845,\n" +
//"    \"ENTITYNAME\": \"Dr Mary S.\\t Limbe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11846,\n" +
//"    \"ENTITYNAME\": \"Dr N. H.  Bhanji\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11847,\n" +
//"    \"ENTITYNAME\": \"Dr Joshua K Kayima\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11848,\n" +
//"    \"ENTITYNAME\": \"Dr Nicholas Macharia Wambugu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11851,\n" +
//"    \"ENTITYNAME\": \"Dr Gichuru\\t Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11852,\n" +
//"    \"ENTITYNAME\": \"Dr K. B.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11853,\n" +
//"    \"ENTITYNAME\": \"Dr Nancy N. Ngugi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11854,\n" +
//"    \"ENTITYNAME\": \"Dr V.Mark\\t Gacii\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11855,\n" +
//"    \"ENTITYNAME\": \"Dr K. C. Wafula\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11856,\n" +
//"    \"ENTITYNAME\": \"Dr V.Mark\\t Gacii\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11857,\n" +
//"    \"ENTITYNAME\": \"Dr Njoroge\\t Gichuhi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11858,\n" +
//"    \"ENTITYNAME\": \"Dr Timothy Kagoda Byakika\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11860,\n" +
//"    \"ENTITYNAME\": \"Dr K. K.\\t Bal\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11861,\n" +
//"    \"ENTITYNAME\": \"Dr Lois Wairimu\\t Magua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11862,\n" +
//"    \"ENTITYNAME\": \"Dr N  Nyaga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11863,\n" +
//"    \"ENTITYNAME\": \"Dr N. A.\\t Karanja\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11865,\n" +
//"    \"ENTITYNAME\": \"Dr Noah W.\\t Ng`ang`a\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11866,\n" +
//"    \"ENTITYNAME\": \"Dr Kimani Gicheru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11867,\n" +
//"    \"ENTITYNAME\": \"Dr Millicent Muthoni Kariuki\\t Wanyoike\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11868,\n" +
//"    \"ENTITYNAME\": \"Dr Kimani\\t Wanjama\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11870,\n" +
//"    \"ENTITYNAME\": \"Dr S. N. Kirugo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11871,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Maina Macharia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11873,\n" +
//"    \"ENTITYNAME\": \"Dr J. K. Mutiso\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11876,\n" +
//"    \"ENTITYNAME\": \"Dr M. A.\\t Fazal\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11877,\n" +
//"    \"ENTITYNAME\": \"Dr Ephantus M. Mate\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11878,\n" +
//"    \"ENTITYNAME\": \"Dr Francis A.\\t Owillah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11879,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph\\t Maina Macharia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11880,\n" +
//"    \"ENTITYNAME\": \"Dr Louis A. Litswa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11881,\n" +
//"    \"ENTITYNAME\": \"Dr Martin  Wanyoike\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11883,\n" +
//"    \"ENTITYNAME\": \"Dr H.O\\t Abwao\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11886,\n" +
//"    \"ENTITYNAME\": \"Dr Mohamed Bhaiji\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11887,\n" +
//"    \"ENTITYNAME\": \"Dr Melanie J.  Miyanji\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11889,\n" +
//"    \"ENTITYNAME\": \"Dr Mubashir Mahmood\\t Qureshi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11890,\n" +
//"    \"ENTITYNAME\": \"Dr M. S.\\t Abdullah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11891,\n" +
//"    \"ENTITYNAME\": \"Dr Mukundkumar Y.  Modi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11892,\n" +
//"    \"ENTITYNAME\": \"Dr M. W.\\t Warambo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11893,\n" +
//"    \"ENTITYNAME\": \"Dr Esther Cege \\t\\t Munyoro\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11896,\n" +
//"    \"ENTITYNAME\": \"Dr Mahesh V.  Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11897,\n" +
//"    \"ENTITYNAME\": \"Dr Margaret A Mak`Anyengo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11898,\n" +
//"    \"ENTITYNAME\": \"Dr Nelly Aliviza Kitazi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11899,\n" +
//"    \"ENTITYNAME\": \"Dr Ravi\\t Sharma\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11901,\n" +
//"    \"ENTITYNAME\": \"Dr Naji A.N.\\t Said\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11902,\n" +
//"    \"ENTITYNAME\": \"Dr John Anzetse\\t Aswani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11903,\n" +
//"    \"ENTITYNAME\": \"Dr George S.  Adari\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11905,\n" +
//"    \"ENTITYNAME\": \"Dr Wakuloba\\t G.G\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11906,\n" +
//"    \"ENTITYNAME\": \"Dr M.S. Saroya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11907,\n" +
//"    \"ENTITYNAME\": \"Dr Charles S.G  Wasike\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11908,\n" +
//"    \"ENTITYNAME\": \"Dr Rufus M Kamundia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11909,\n" +
//"    \"ENTITYNAME\": \"Dr Tanga\\t Audi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11910,\n" +
//"    \"ENTITYNAME\": \"Dr Aruna M.\\t Chudasama\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11911,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Kamau\\t Karanja\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11912,\n" +
//"    \"ENTITYNAME\": \"Dr Luke\\t Musau\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11913,\n" +
//"    \"ENTITYNAME\": \"Dr Saleem. A  Noorani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11915,\n" +
//"    \"ENTITYNAME\": \"Dr Hezron Wasonga Odongo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11917,\n" +
//"    \"ENTITYNAME\": \"Dr Erick Choge Bartuiyot\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11918,\n" +
//"    \"ENTITYNAME\": \"Dr William\\t Sigilai\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11920,\n" +
//"    \"ENTITYNAME\": \"Dr Kiboi J\\t Githinji\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11924,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Chege\\t Wabore\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11925,\n" +
//"    \"ENTITYNAME\": \"Dr Saidi  \\t Hassan\",\n" +
//"    \"Payment'\": \"Citibank Int Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11926,\n" +
//"    \"ENTITYNAME\": \"Dr Vincent  Ssali Jumba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11927,\n" +
//"    \"ENTITYNAME\": \"Dr Maria B. Carvalho\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11929,\n" +
//"    \"ENTITYNAME\": \"Dr Stella Kubasu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11930,\n" +
//"    \"ENTITYNAME\": \"Dr James Murungi Mwiti\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11932,\n" +
//"    \"ENTITYNAME\": \"Dr B.S\\t Varia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11933,\n" +
//"    \"ENTITYNAME\": \"Dr Jackson Omayio Atina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11934,\n" +
//"    \"ENTITYNAME\": \"Dr Archana D.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11935,\n" +
//"    \"ENTITYNAME\": \"Dr B.H \\t Pandit\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11936,\n" +
//"    \"ENTITYNAME\": \"Dr Ben I Omondi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11937,\n" +
//"    \"ENTITYNAME\": \"Dr Othieno N.A\\t Abinya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11938,\n" +
//"    \"ENTITYNAME\": \"Dr J. O  Odondi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11939,\n" +
//"    \"ENTITYNAME\": \"Dr Joel J.\\t Muthuuri\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11940,\n" +
//"    \"ENTITYNAME\": \"Dr Mark V\\t Gacii\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11941,\n" +
//"    \"ENTITYNAME\": \"Dr Asaria O.\\t Onyango\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11942,\n" +
//"    \"ENTITYNAME\": \"Dr Rishad Ali Shosi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11943,\n" +
//"    \"ENTITYNAME\": \"Dr Alice Muthoni Musibi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11944,\n" +
//"    \"ENTITYNAME\": \"Dr B.J. Nathwani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11945,\n" +
//"    \"ENTITYNAME\": \"Dr S.K\\t Chavda\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11946,\n" +
//"    \"ENTITYNAME\": \"Dr Gathari\\t Ndirangu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11947,\n" +
//"    \"ENTITYNAME\": \"Dr Andati\\t Monda\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11948,\n" +
//"    \"ENTITYNAME\": \"Dr R.L .  Dippenaar\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11949,\n" +
//"    \"ENTITYNAME\": \"Dr Kirtida S. Acharya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11953,\n" +
//"    \"ENTITYNAME\": \"Dr Francis Xavier Otieno Odawa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11954,\n" +
//"    \"ENTITYNAME\": \"Dr Muriithi M.R.  Waruingi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11956,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick Thuku\\t Nyaga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11957,\n" +
//"    \"ENTITYNAME\": \"Mr SHASHIKANT CHHOTABHAI PATEL\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11959,\n" +
//"    \"ENTITYNAME\": \"Dr S.\\t Vinayak\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11960,\n" +
//"    \"ENTITYNAME\": \"Dr Irungu\\t Mwangi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11961,\n" +
//"    \"ENTITYNAME\": \"Dr Satish M. \\t Vaghela\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11962,\n" +
//"    \"ENTITYNAME\": \"Dr Loice. C.J.  Mutai\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11964,\n" +
//"    \"ENTITYNAME\": \"Dr Meshac Nyamiaka  Onguti\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11965,\n" +
//"    \"ENTITYNAME\": \"Dr Elly Nyaim Opot\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11966,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick. O Amoth\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11967,\n" +
//"    \"ENTITYNAME\": \"Dr Josphat K Mukui\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11970,\n" +
//"    \"ENTITYNAME\": \"Dr Kioni\\t Warugongo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11971,\n" +
//"    \"ENTITYNAME\": \"Dr Ahmed M.R  Laving\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11972,\n" +
//"    \"ENTITYNAME\": \"Dr Edwin S.\\t Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11974,\n" +
//"    \"ENTITYNAME\": \"Dr Ramadhan S.  Marjan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11975,\n" +
//"    \"ENTITYNAME\": \"Dr Paul   Nyongesa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11976,\n" +
//"    \"ENTITYNAME\": \"Dr Bartilo  Kigen\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11977,\n" +
//"    \"ENTITYNAME\": \"Hon Adelaide Nasambu Kituyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11978,\n" +
//"    \"ENTITYNAME\": \"Dr Kigen  Bartilol\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11979,\n" +
//"    \"ENTITYNAME\": \"Dr Thomas \\t Chokwe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11981,\n" +
//"    \"ENTITYNAME\": \"Dr H.M\\t Khisa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11983,\n" +
//"    \"ENTITYNAME\": \"Dr Charles Muthii Muriithi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11984,\n" +
//"    \"ENTITYNAME\": \"Dr Doreen  Akinyi   Asimba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11986,\n" +
//"    \"ENTITYNAME\": \"Dr M.V\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11988,\n" +
//"    \"ENTITYNAME\": \"Dr Amos\\t Kibata Githeko\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11989,\n" +
//"    \"ENTITYNAME\": \"Dr F.A.  Govedi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11992,\n" +
//"    \"ENTITYNAME\": \"Dr Sangeeta R. Chauhan\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11993,\n" +
//"    \"ENTITYNAME\": \"Dr Y.P\\t Bansal\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11995,\n" +
//"    \"ENTITYNAME\": \"Dr Jocelyne\\t Njeri Gachigo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11996,\n" +
//"    \"ENTITYNAME\": \"Dr Francis Kagema\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11998,\n" +
//"    \"ENTITYNAME\": \"Dr Eugene \\t Erulu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11999,\n" +
//"    \"ENTITYNAME\": \"Dr Morris N.\\t Muhinga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12001,\n" +
//"    \"ENTITYNAME\": \"Dr Pramod\\t Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12005,\n" +
//"    \"ENTITYNAME\": \"Dr Wahome Ngare\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12007,\n" +
//"    \"ENTITYNAME\": \"Dr Hellen\\t Opondo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12008,\n" +
//"    \"ENTITYNAME\": \"Dr P.V\\t Muchiri\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12010,\n" +
//"    \"ENTITYNAME\": \"Dr Eric Choge Bartuiyot\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12011,\n" +
//"    \"ENTITYNAME\": \"Dr Dalton C. Wamalwa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12012,\n" +
//"    \"ENTITYNAME\": \"Dr M.S. G. Abakalwa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12013,\n" +
//"    \"ENTITYNAME\": \"Dr Meshach O  Asimba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12014,\n" +
//"    \"ENTITYNAME\": \"Dr Frederick Welch\\t Muleshe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12015,\n" +
//"    \"ENTITYNAME\": \"Dr R.N\\t Gitu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12016,\n" +
//"    \"ENTITYNAME\": \"Dr Paul   Odula\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12017,\n" +
//"    \"ENTITYNAME\": \"Dr Richard Kipkemoi Arap Kalya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12018,\n" +
//"    \"ENTITYNAME\": \"Dr Opiyo \\t Anselmy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12020,\n" +
//"    \"ENTITYNAME\": \"Dr Michael M. Gichangi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12021,\n" +
//"    \"ENTITYNAME\": \"Dr Maurice \\t Podho\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12024,\n" +
//"    \"ENTITYNAME\": \"Dr J.C.  Munene\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12025,\n" +
//"    \"ENTITYNAME\": \"Dr Theophilus \\t Wangata\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12028,\n" +
//"    \"ENTITYNAME\": \"Ms Wanjiku Wairia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12030,\n" +
//"    \"ENTITYNAME\": \"Dr James Kabora\\t Mogire\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12031,\n" +
//"    \"ENTITYNAME\": \"Dr Fredrick Ngugi Kagondu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12032,\n" +
//"    \"ENTITYNAME\": \"Dr Sadik\\t Mithwani\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12034,\n" +
//"    \"ENTITYNAME\": \"Dr Tsimbiri P Fedha\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12035,\n" +
//"    \"ENTITYNAME\": \"Dr F. Babu\\t Bora\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12036,\n" +
//"    \"ENTITYNAME\": \"Dr Wataka Wakube\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12037,\n" +
//"    \"ENTITYNAME\": \"Dr Mauro\\t Saio\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12039,\n" +
//"    \"ENTITYNAME\": \"Dr Naftaly\\t Ondieki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12040,\n" +
//"    \"ENTITYNAME\": \"Dr T.K\\t Kaguta\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12041,\n" +
//"    \"ENTITYNAME\": \"Dr Julius Githinji Kiboi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12042,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel Wanjohi\\t Ndanya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12043,\n" +
//"    \"ENTITYNAME\": \"Dr Kiongi \\t Mwaura\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12044,\n" +
//"    \"ENTITYNAME\": \"Dr Venceslas M.  Chilumo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12045,\n" +
//"    \"ENTITYNAME\": \"Dr Josephine\\t Omondi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12046,\n" +
//"    \"ENTITYNAME\": \"Dr M.N\\t Mugo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12049,\n" +
//"    \"ENTITYNAME\": \"Dr Zipporah\\t Gathuya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12050,\n" +
//"    \"ENTITYNAME\": \"Dr Billy\\t Muigai\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12051,\n" +
//"    \"ENTITYNAME\": \"Dr Grace Adira Achiya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12054,\n" +
//"    \"ENTITYNAME\": \"Prof Stanely Ominde\\t Khainga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12055,\n" +
//"    \"ENTITYNAME\": \"Dr Wakaba\\t Wangaka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12056,\n" +
//"    \"ENTITYNAME\": \"Dr Anne Wanjiru Maina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12057,\n" +
//"    \"ENTITYNAME\": \"Dr Samira D.\\t Soni\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12059,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen K\\t Karanja\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12060,\n" +
//"    \"ENTITYNAME\": \"Dr Christine Kanini Muasya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12061,\n" +
//"    \"ENTITYNAME\": \"Dr Agnes Wanjiku\\t Gachoki\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12062,\n" +
//"    \"ENTITYNAME\": \"Dr Ssali Jumba  Vincent\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12063,\n" +
//"    \"ENTITYNAME\": \"Dr E.M\\t Getambu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12065,\n" +
//"    \"ENTITYNAME\": \"Dr Caesar\\t Mungatana\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12066,\n" +
//"    \"ENTITYNAME\": \"Dr Kasi Majani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12067,\n" +
//"    \"ENTITYNAME\": \"Dr J.K\\t Keriyo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12068,\n" +
//"    \"ENTITYNAME\": \"Dr A.T Feksi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12070,\n" +
//"    \"ENTITYNAME\": \"Dr Charles Wanderi Maragwa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12071,\n" +
//"    \"ENTITYNAME\": \"Dr Benedict T\\t Osore\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12072,\n" +
//"    \"ENTITYNAME\": \"Dr G.K  Mulunga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12073,\n" +
//"    \"ENTITYNAME\": \"Dr George\\t Omondi Afulo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12075,\n" +
//"    \"ENTITYNAME\": \"Dr Mosley \\t Owino\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12076,\n" +
//"    \"ENTITYNAME\": \"Dr Carol Odula   Obonyo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12077,\n" +
//"    \"ENTITYNAME\": \"Dr Ignatius L.M. \\t Muturi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12078,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel\\t Gathere\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12080,\n" +
//"    \"ENTITYNAME\": \"Dr ABDULALIM MOHAMED ALI HAJI OSMAN\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12081,\n" +
//"    \"ENTITYNAME\": \"Dr John Kipkorir\\t Limo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12083,\n" +
//"    \"ENTITYNAME\": \"Dr Charles O\\t Anangwe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12084,\n" +
//"    \"ENTITYNAME\": \"Dr Anthony N\\t Monyo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12086,\n" +
//"    \"ENTITYNAME\": \"Dr Gathukia \\t Kinyua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12090,\n" +
//"    \"ENTITYNAME\": \"Dr Asmeeta I.\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12092,\n" +
//"    \"ENTITYNAME\": \"Dr Yamal Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12093,\n" +
//"    \"ENTITYNAME\": \"Dr Atul Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12094,\n" +
//"    \"ENTITYNAME\": \"Dr C.M \\t Mwangome\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12095,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Kamau  Wanyoike\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12097,\n" +
//"    \"ENTITYNAME\": \"Dr Josphat O.N\\t Njiru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12098,\n" +
//"    \"ENTITYNAME\": \"Dr Nevil David Mnjalla\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12099,\n" +
//"    \"ENTITYNAME\": \"Dr Samina M\\t Mir\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12101,\n" +
//"    \"ENTITYNAME\": \"Dr Andrew \\t Kibet Cheruiyot\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12105,\n" +
//"    \"ENTITYNAME\": \"Dr Johnson Masika\\t Wafula\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12106,\n" +
//"    \"ENTITYNAME\": \"Dr Moses O\\t Okech\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12107,\n" +
//"    \"ENTITYNAME\": \"Dr Rhoda Mutundu Munene\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12109,\n" +
//"    \"ENTITYNAME\": \"Dr Kinuthia\\t Gichuhi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12110,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick S. K.  Kariuki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12111,\n" +
//"    \"ENTITYNAME\": \"Dr Nyamu\\t Mureithi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12114,\n" +
//"    \"ENTITYNAME\": \"Dr Umesh N Chudasama\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12115,\n" +
//"    \"ENTITYNAME\": \"Dr Hassan M Adan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12118,\n" +
//"    \"ENTITYNAME\": \"Dr Oscar Muwale\\t Onyango\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12119,\n" +
//"    \"ENTITYNAME\": \"Dr Elizabeth Olaly\\t Nyakundi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12121,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen Maina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12122,\n" +
//"    \"ENTITYNAME\": \"Dr J.\\t Kabiru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12123,\n" +
//"    \"ENTITYNAME\": \"Dr Francis\\t Ogaro\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12125,\n" +
//"    \"ENTITYNAME\": \"Dr Edwin K Rono\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12127,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel Chege Njenga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12128,\n" +
//"    \"ENTITYNAME\": \"Dr Sally Kariuki\\t Harman\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12129,\n" +
//"    \"ENTITYNAME\": \"Dr Isaac Kiplimo Ngetich\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12130,\n" +
//"    \"ENTITYNAME\": \"Dr Jimmie G. Kabugi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12134,\n" +
//"    \"ENTITYNAME\": \"Dr Charanjeet Kaur Jandu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12137,\n" +
//"    \"ENTITYNAME\": \"Dr John Odero Ongech\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12138,\n" +
//"    \"ENTITYNAME\": \"Dr Elkanah Maranga\\t Kerandi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12139,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen Kamore Wanjohi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12143,\n" +
//"    \"ENTITYNAME\": \"Dr Kennedy O.\\t Momanyi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12144,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen  Macharia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12145,\n" +
//"    \"ENTITYNAME\": \"Dr Josphat Wangwe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12146,\n" +
//"    \"ENTITYNAME\": \"Dr P. Olakhi  Odongo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12147,\n" +
//"    \"ENTITYNAME\": \"Dr EDWARD A\\t OWINO\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12148,\n" +
//"    \"ENTITYNAME\": \"Dr Susan Wacharia\\t Wariua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12149,\n" +
//"    \"ENTITYNAME\": \"Dr Alphonce N. Mwendwa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12150,\n" +
//"    \"ENTITYNAME\": \"Dr JOSEPH KIMANI  WANJERI\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12151,\n" +
//"    \"ENTITYNAME\": \"Dr A.P\\t Gupta\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12152,\n" +
//"    \"ENTITYNAME\": \"Dr HUMPHREY  M. \\t MURIITHI\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12154,\n" +
//"    \"ENTITYNAME\": \"Dr GIDEON MUSILA\\t GIBSON\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12155,\n" +
//"    \"ENTITYNAME\": \"Dr EDMOND BARASA WAMWANA\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12156,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick \\t Kapombe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12157,\n" +
//"    \"ENTITYNAME\": \"Dr Jocylene Njeri Gachigo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12158,\n" +
//"    \"ENTITYNAME\": \"Dr Sammy Kyalo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12159,\n" +
//"    \"ENTITYNAME\": \"Dr Mathew  Kiriago Akama\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12161,\n" +
//"    \"ENTITYNAME\": \"Dr Salahdeen  A. O.\\t Jezzan\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12163,\n" +
//"    \"ENTITYNAME\": \"Dr Christopher J.M\\t Mureithi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12164,\n" +
//"    \"ENTITYNAME\": \"Dr Kamau.P\\t Njoroge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12165,\n" +
//"    \"ENTITYNAME\": \"Dr Bashir\\t Admani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12167,\n" +
//"    \"ENTITYNAME\": \"Dr John Githua Njoroge\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12168,\n" +
//"    \"ENTITYNAME\": \"Dr W.O\\t Oyieko\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12169,\n" +
//"    \"ENTITYNAME\": \"Dr Gladwell\\t Kiarie\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12170,\n" +
//"    \"ENTITYNAME\": \"Dr Thomas  Muithya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12171,\n" +
//"    \"ENTITYNAME\": \"Dr Arthur Mmbulika\\t Usagi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12173,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph H Oluoch\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12174,\n" +
//"    \"ENTITYNAME\": \"Dr M.  KISIA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12175,\n" +
//"    \"ENTITYNAME\": \"Dr Josephine N\\t Mirie\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12176,\n" +
//"    \"ENTITYNAME\": \"Dr GORDON O.\\t OGWENO\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12177,\n" +
//"    \"ENTITYNAME\": \"Dr Geoffrey Ondeyo \\tOtomu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12180,\n" +
//"    \"ENTITYNAME\": \"Dr H.W\\t Wanyika\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12181,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen Wahome \\tWanjohi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12182,\n" +
//"    \"ENTITYNAME\": \"Dr B.R.\\t OMBITO\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12183,\n" +
//"    \"ENTITYNAME\": \"Dr Patricia M Otieno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12185,\n" +
//"    \"ENTITYNAME\": \"Dr P.B\\t Muthiga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12188,\n" +
//"    \"ENTITYNAME\": \"Dr Lucy \\t Kabare\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12190,\n" +
//"    \"ENTITYNAME\": \"Dr Muriungi Solomon\\t Thuranira\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12192,\n" +
//"    \"ENTITYNAME\": \"Dr Bernard M Ndungu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12193,\n" +
//"    \"ENTITYNAME\": \"Dr Joshua M\\t Matu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12196,\n" +
//"    \"ENTITYNAME\": \"Dr R.S\\t Marjan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12197,\n" +
//"    \"ENTITYNAME\": \"Dr Vinesh P Vaghela\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12198,\n" +
//"    \"ENTITYNAME\": \"Dr Mark Solomon Mlamba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12199,\n" +
//"    \"ENTITYNAME\": \"Dr Abdalla Kassim\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12200,\n" +
//"    \"ENTITYNAME\": \"Dr Bwana Ombachi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12201,\n" +
//"    \"ENTITYNAME\": \"Dr Simon Njuguna \\t Kahonge\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12202,\n" +
//"    \"ENTITYNAME\": \"Dr C.O\\t Achapa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12203,\n" +
//"    \"ENTITYNAME\": \"Dr Firoz\\t Alimohamed\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12204,\n" +
//"    \"ENTITYNAME\": \"Dr KENNEDY O. GOGO\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12205,\n" +
//"    \"ENTITYNAME\": \"Dr Andrew\\t Toro\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12206,\n" +
//"    \"ENTITYNAME\": \"Dr Wilson Miriti \\t Kiraitu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12207,\n" +
//"    \"ENTITYNAME\": \"Dr Okwara F.N\\t Oringe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12208,\n" +
//"    \"ENTITYNAME\": \"Dr Eric Choge Bartuiyot\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12209,\n" +
//"    \"ENTITYNAME\": \"Dr Harrison Tamooh\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12210,\n" +
//"    \"ENTITYNAME\": \"Dr Mathias Odera\\t Aketch\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12211,\n" +
//"    \"ENTITYNAME\": \"Dr Justus W\\t Ngatia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12215,\n" +
//"    \"ENTITYNAME\": \"Dr Mwangi M\\t Jonah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12216,\n" +
//"    \"ENTITYNAME\": \"Dr A WASUNNA\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12217,\n" +
//"    \"ENTITYNAME\": \"Dr Aggrey Otieno  Akula\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12218,\n" +
//"    \"ENTITYNAME\": \"Dr Ashokkumar I.\\t Desai\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12219,\n" +
//"    \"ENTITYNAME\": \"Dr Jane Kemunto Gwaro\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12220,\n" +
//"    \"ENTITYNAME\": \"Dr Mucheru Wangombe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12221,\n" +
//"    \"ENTITYNAME\": \"Dr S.H  George\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12224,\n" +
//"    \"ENTITYNAME\": \"Dr Henry \\t Nyawanda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12225,\n" +
//"    \"ENTITYNAME\": \"Dr G.P \\t Yossa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12226,\n" +
//"    \"ENTITYNAME\": \"Dr David G. Kinyanjui\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12227,\n" +
//"    \"ENTITYNAME\": \"Dr James K\\t Murgor\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12229,\n" +
//"    \"ENTITYNAME\": \"Dr Hussein  A.\\t Alkama\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12230,\n" +
//"    \"ENTITYNAME\": \"Dr Joshua Waruiru\\t Mwangi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12231,\n" +
//"    \"ENTITYNAME\": \"Dr B.L Karanja\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12233,\n" +
//"    \"ENTITYNAME\": \"Dr S.H\\t George\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12234,\n" +
//"    \"ENTITYNAME\": \"Dr A.M.\\tI MARAM\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12236,\n" +
//"    \"ENTITYNAME\": \"Dr Nelson Kagema Matu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12237,\n" +
//"    \"ENTITYNAME\": \"Dr Ikol J\\t Adungo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12238,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Werunga\\t Masinde\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12240,\n" +
//"    \"ENTITYNAME\": \"Dr D.K\\t Karanja\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12241,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Aseyo  Sore\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12244,\n" +
//"    \"ENTITYNAME\": \"Dr J.W Njau\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12245,\n" +
//"    \"ENTITYNAME\": \"Dr WAMBUA PETER  PAUL\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12246,\n" +
//"    \"ENTITYNAME\": \"Dr John N\\t Mutsumi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12251,\n" +
//"    \"ENTITYNAME\": \"Dr Jackson Mutuku Mutinda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12252,\n" +
//"    \"ENTITYNAME\": \"Dr Godfrey Njoroge Nyaga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12253,\n" +
//"    \"ENTITYNAME\": \"Dr Peter M Mativo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12257,\n" +
//"    \"ENTITYNAME\": \"Dr Musa K.\\t Kipingor\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12258,\n" +
//"    \"ENTITYNAME\": \"Dr D.\\t Ndegwa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12259,\n" +
//"    \"ENTITYNAME\": \"Dr Johnson Lisamula\\t Murila( use the Nairobi Bone and Joint to pay)\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12260,\n" +
//"    \"ENTITYNAME\": \"Dr Edward O\\t Osewe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12261,\n" +
//"    \"ENTITYNAME\": \"Dr Joe\\t Ruturi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12263,\n" +
//"    \"ENTITYNAME\": \"Dr Weston\\t Khisa Wakasiaka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12264,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick K\\t Mbugua\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12266,\n" +
//"    \"ENTITYNAME\": \"Dr Ruby\\t Kalaiya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12269,\n" +
//"    \"ENTITYNAME\": \"Dr Anne B\\t Kihara\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12272,\n" +
//"    \"ENTITYNAME\": \"Dr Kamaljeet S.\\t Gidde\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12274,\n" +
//"    \"ENTITYNAME\": \"Dr Kennedy \\t Ndege\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12275,\n" +
//"    \"ENTITYNAME\": \"Dr Heena J Hooker\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12276,\n" +
//"    \"ENTITYNAME\": \"Dr Bernard O.\\t Oloo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12278,\n" +
//"    \"ENTITYNAME\": \"Dr Samwel Muniu Nganga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12280,\n" +
//"    \"ENTITYNAME\": \"Dr Joel \\t Lessan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12281,\n" +
//"    \"ENTITYNAME\": \"Dr Willy H\\t Otele\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12282,\n" +
//"    \"ENTITYNAME\": \"Dr Bernard Wamiti  Gatinu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12283,\n" +
//"    \"ENTITYNAME\": \"Dr Somaya S. \\t Mina\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12284,\n" +
//"    \"ENTITYNAME\": \"Dr Nangole F. Wanjala\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12285,\n" +
//"    \"ENTITYNAME\": \"Dr Josiah N\\t Gakuru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12286,\n" +
//"    \"ENTITYNAME\": \"Dr Gaman\\t Mohamed\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12288,\n" +
//"    \"ENTITYNAME\": \"Dr M. O Karume\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12289,\n" +
//"    \"ENTITYNAME\": \"Dr D. M.\\t MAKEWA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12291,\n" +
//"    \"ENTITYNAME\": \"Dr PETER\\t NGWATU\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12292,\n" +
//"    \"ENTITYNAME\": \"Dr M.O\\t Hatimy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12294,\n" +
//"    \"ENTITYNAME\": \"Dr GICHURU MWANGI\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12295,\n" +
//"    \"ENTITYNAME\": \"Dr Paul Etau\\t Ekwom\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12296,\n" +
//"    \"ENTITYNAME\": \"Dr S.M\\t NYAGAH\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12297,\n" +
//"    \"ENTITYNAME\": \"Dr MARGARET\\t NJUGUNA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12298,\n" +
//"    \"ENTITYNAME\": \"Dr Loise Njeri\\t Kahoro\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12299,\n" +
//"    \"ENTITYNAME\": \"Dr Opondo Anindo Everisto\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12300,\n" +
//"    \"ENTITYNAME\": \"Dr Guyo W. Jaldesa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12301,\n" +
//"    \"ENTITYNAME\": \"Dr KENNEDY\\t KOECH\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12302,\n" +
//"    \"ENTITYNAME\": \"Dr JAMES K.\\t NGURE\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12303,\n" +
//"    \"ENTITYNAME\": \"Dr J.M Muthuuri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12304,\n" +
//"    \"ENTITYNAME\": \"Dr G.M.\\t OGWENO\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12305,\n" +
//"    \"ENTITYNAME\": \"Dr Omondi  A  Joshua\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12306,\n" +
//"    \"ENTITYNAME\": \"Dr WILLIAM\\tJ. OKUMU\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12307,\n" +
//"    \"ENTITYNAME\": \"Dr Hudson A Lodenyo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12308,\n" +
//"    \"ENTITYNAME\": \"Dr Vitalis K Bwire\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12309,\n" +
//"    \"ENTITYNAME\": \"Dr P.C.A \\t NYAKINDA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12310,\n" +
//"    \"ENTITYNAME\": \"Dr Paresh A Dave\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12311,\n" +
//"    \"ENTITYNAME\": \"Dr Catherine Nyongesa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12312,\n" +
//"    \"ENTITYNAME\": \"Dr Mumtaz Shaffiquei Hiran\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12313,\n" +
//"    \"ENTITYNAME\": \"Dr D.G\\t Mundia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12314,\n" +
//"    \"ENTITYNAME\": \"Dr Susan Were Majiwa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12315,\n" +
//"    \"ENTITYNAME\": \"Dr George\\t Njogu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12316,\n" +
//"    \"ENTITYNAME\": \"Dr J.M\\t Mburu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12318,\n" +
//"    \"ENTITYNAME\": \"Dr Fawziat But\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12320,\n" +
//"    \"ENTITYNAME\": \"Dr Kimani\\t Wanjeri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12322,\n" +
//"    \"ENTITYNAME\": \"Dr Susan M Magada\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12324,\n" +
//"    \"ENTITYNAME\": \"Dr Mwellla P. Namasaka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12325,\n" +
//"    \"ENTITYNAME\": \"Dr James Watts  Aperetum\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12326,\n" +
//"    \"ENTITYNAME\": \"Dr Njuguna\\t Gachoiro\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12327,\n" +
//"    \"ENTITYNAME\": \"Dr Wycliffe\\t Musalia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12328,\n" +
//"    \"ENTITYNAME\": \"Dr Julius Maina Kiiru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12330,\n" +
//"    \"ENTITYNAME\": \"Dr J.C\\t Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12331,\n" +
//"    \"ENTITYNAME\": \"Dr B.K Kariuki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12332,\n" +
//"    \"ENTITYNAME\": \"Dr Zahida\\ti Quresh\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12334,\n" +
//"    \"ENTITYNAME\": \"Dr Hemed\\tr Twahir\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12336,\n" +
//"    \"ENTITYNAME\": \"Dr Ramadhan \\t Mawenzi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12339,\n" +
//"    \"ENTITYNAME\": \"Dr Geoffrey Ala  Magada\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12341,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick Gitobu\\t Mburugu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12342,\n" +
//"    \"ENTITYNAME\": \"Dr S.M\\t Kilonzo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12344,\n" +
//"    \"ENTITYNAME\": \"Dr Victor Lewa Bandika\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12345,\n" +
//"    \"ENTITYNAME\": \"Dr Walter\\t Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12346,\n" +
//"    \"ENTITYNAME\": \"Dr Waihenya C Githiaka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12347,\n" +
//"    \"ENTITYNAME\": \"Dr Minesh Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12349,\n" +
//"    \"ENTITYNAME\": \"Dr Angela Muliro  Chekoko\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12353,\n" +
//"    \"ENTITYNAME\": \"Dr Valentino\\t Manase Lema\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12354,\n" +
//"    \"ENTITYNAME\": \"Dr Dedan\\t Ongonga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12355,\n" +
//"    \"ENTITYNAME\": \"Dr Jonah M\\t Mwangi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12357,\n" +
//"    \"ENTITYNAME\": \"Dr Nichodemus\\t Mwea\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12358,\n" +
//"    \"ENTITYNAME\": \"Dr M.B.L\\t Lutomia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12359,\n" +
//"    \"ENTITYNAME\": \"Dr Seko\\t Maighacho\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12360,\n" +
//"    \"ENTITYNAME\": \"Dr James Maina Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12361,\n" +
//"    \"ENTITYNAME\": \"Dr Lubna\\t Khawaja\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12362,\n" +
//"    \"ENTITYNAME\": \"Dr Francis Otieno\\t Ayugi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12363,\n" +
//"    \"ENTITYNAME\": \"Dr D.W\\t Njoroge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12364,\n" +
//"    \"ENTITYNAME\": \"Dr Salome \\t Waweru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12365,\n" +
//"    \"ENTITYNAME\": \"Dr Abdullahi\\t Adan\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12367,\n" +
//"    \"ENTITYNAME\": \"Dr Philip \\t Ochieng\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12368,\n" +
//"    \"ENTITYNAME\": \"Dr Peninah Wanjiku\\t Gikore\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12370,\n" +
//"    \"ENTITYNAME\": \"Dr Lewis K. Kakundi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12373,\n" +
//"    \"ENTITYNAME\": \"Dr Sylvia W. Kariuki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12374,\n" +
//"    \"ENTITYNAME\": \"Dr Barack\\t Ongulo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12376,\n" +
//"    \"ENTITYNAME\": \"Dr James\\t Gakuo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12377,\n" +
//"    \"ENTITYNAME\": \"Dr Bernard Gwer\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12380,\n" +
//"    \"ENTITYNAME\": \"Dr Dan\\t Kiptoon\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12381,\n" +
//"    \"ENTITYNAME\": \"Dr Biasha\\t Athman\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12382,\n" +
//"    \"ENTITYNAME\": \"Dr Kevin Otieno Arunga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12383,\n" +
//"    \"ENTITYNAME\": \"Dr Musyoki\\t Muthami\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12384,\n" +
//"    \"ENTITYNAME\": \"Mr Jackson Mbalu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12386,\n" +
//"    \"ENTITYNAME\": \"Dr Dominic K\\t Koskei\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12388,\n" +
//"    \"ENTITYNAME\": \"Dr Livingstone K. Wanyama\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12390,\n" +
//"    \"ENTITYNAME\": \"Dr Rosemary\\t Mwangi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12391,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel K.\\t Kariuki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12393,\n" +
//"    \"ENTITYNAME\": \"Dr Duncan C\\t Njuguna\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12397,\n" +
//"    \"ENTITYNAME\": \"Dr D. D Galgallo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12398,\n" +
//"    \"ENTITYNAME\": \"Mr Evans\\t Kichwen\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12399,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Kamau\\t Njoroge\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12400,\n" +
//"    \"ENTITYNAME\": \"Dr N.O. Omollo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12401,\n" +
//"    \"ENTITYNAME\": \"Dr  Joseph\\t Ochieng\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12404,\n" +
//"    \"ENTITYNAME\": \"Dr Vijay Kumar Narayanan\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12406,\n" +
//"    \"ENTITYNAME\": \"Dr Philomena Akoth Owende\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12407,\n" +
//"    \"ENTITYNAME\": \"Dr Kennedy Odoyo Onyango\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12408,\n" +
//"    \"ENTITYNAME\": \"Dr Mongare Onsomu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12409,\n" +
//"    \"ENTITYNAME\": \"Dr Akwabi Wameyo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12412,\n" +
//"    \"ENTITYNAME\": \"Dr C.H.M\\t Mwakirungu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12413,\n" +
//"    \"ENTITYNAME\": \"Dr Solomon Wachira\\t Ndondoma\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12414,\n" +
//"    \"ENTITYNAME\": \"Dr Brigid\\t Monda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12417,\n" +
//"    \"ENTITYNAME\": \"Dr Sylvester Odero\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12421,\n" +
//"    \"ENTITYNAME\": \"Dr Idris Nzao Chikophe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12422,\n" +
//"    \"ENTITYNAME\": \"Dr Abdulaziz Sananga\\tSamperu Abdulaziz Sananga\\tSamperu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12423,\n" +
//"    \"ENTITYNAME\": \"Dr George M.\\t Nyale\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12426,\n" +
//"    \"ENTITYNAME\": \"Dr Ruku Oyaku Bhileni\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12427,\n" +
//"    \"ENTITYNAME\": \"Dr Nduta Kaguongo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12428,\n" +
//"    \"ENTITYNAME\": \"Dr Guled\\t Ismail Yusuf\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12429,\n" +
//"    \"ENTITYNAME\": \"Dr John Odero Ongech\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12430,\n" +
//"    \"ENTITYNAME\": \"Dr Jane\\t Gichuhi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12431,\n" +
//"    \"ENTITYNAME\": \"Dr Tom Risa \\t Kurrarru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12434,\n" +
//"    \"ENTITYNAME\": \"Dr Josephine   Wanjiku\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12435,\n" +
//"    \"ENTITYNAME\": \"Dr Beth Wambui\\t Maina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12436,\n" +
//"    \"ENTITYNAME\": \"Dr Horace\\t Githinji\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12439,\n" +
//"    \"ENTITYNAME\": \"Dr Philip\\t Mwashe\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12440,\n" +
//"    \"ENTITYNAME\": \"Dr Andrew Kiarie\\t Ndonga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12442,\n" +
//"    \"ENTITYNAME\": \"Dr Bernard M.\\t Gitura\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12444,\n" +
//"    \"ENTITYNAME\": \"Dr Kirindi\\t Odindo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12445,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Kyatha\\t Mutie\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12446,\n" +
//"    \"ENTITYNAME\": \"Dr John N.\\t Mwara\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12448,\n" +
//"    \"ENTITYNAME\": \"Dr Stanley Kamwati Mutiga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12449,\n" +
//"    \"ENTITYNAME\": \"Dr P. C Omondi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12451,\n" +
//"    \"ENTITYNAME\": \"Dr Hypheginia M.\\t Mbithe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12452,\n" +
//"    \"ENTITYNAME\": \"Dr Mathangani Winnie Wakiuru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12455,\n" +
//"    \"ENTITYNAME\": \"Mr Robert Ngare\\t Maina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12456,\n" +
//"    \"ENTITYNAME\": \"Dr Amer Y. S. \\t AbdulKarim\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12458,\n" +
//"    \"ENTITYNAME\": \"Dr Robert Mongare  Orina\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12461,\n" +
//"    \"ENTITYNAME\": \"Dr Felister Nyaboke\\t Machuki\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12462,\n" +
//"    \"ENTITYNAME\": \"Mr John \\t Wangai\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12463,\n" +
//"    \"ENTITYNAME\": \"Dr Edna J.  Bowen\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12465,\n" +
//"    \"ENTITYNAME\": \"Dr Dammas Musau\\t Kathuku\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12467,\n" +
//"    \"ENTITYNAME\": \"Dr Ibrahim A. \\t Mohamed\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12468,\n" +
//"    \"ENTITYNAME\": \"Dr Edith \\t Owili\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12470,\n" +
//"    \"ENTITYNAME\": \"Dr Claire Mueni\\t Ngeta\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12471,\n" +
//"    \"ENTITYNAME\": \"Dr Johnstone Odiwuor Achola\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12472,\n" +
//"    \"ENTITYNAME\": \"Dr Fredrick  Bukachi\",\n" +
//"    \"Payment'\": \"Citibank Int Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12473,\n" +
//"    \"ENTITYNAME\": \"Dr George Moturi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12474,\n" +
//"    \"ENTITYNAME\": \"Dr N. G.\\t Moledina\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12476,\n" +
//"    \"ENTITYNAME\": \"Dr Shafiq Jafferji\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12477,\n" +
//"    \"ENTITYNAME\": \"Dr Mary Wanjiru  Muiruri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15662,\n" +
//"    \"ENTITYNAME\": \"Gertrudes Garden Children Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15663,\n" +
//"    \"ENTITYNAME\": \"St. Marys Mission Hospital Langata\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15664,\n" +
//"    \"ENTITYNAME\": \"Imperial Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15665,\n" +
//"    \"ENTITYNAME\": \"Kakamega Provincial Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15666,\n" +
//"    \"ENTITYNAME\": \"Woodlands Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15667,\n" +
//"    \"ENTITYNAME\": \"Outspan Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15668,\n" +
//"    \"ENTITYNAME\": \"Dr Guest House ICIPE\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15669,\n" +
//"    \"ENTITYNAME\": \"Amethyst Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15670,\n" +
//"    \"ENTITYNAME\": \"Joykim Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15671,\n" +
//"    \"ENTITYNAME\": \"Davry Medical & Dental Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15673,\n" +
//"    \"ENTITYNAME\": \"Central Memorial Hospital Ltd.\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15674,\n" +
//"    \"ENTITYNAME\": \"Kakamega Highway Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15675,\n" +
//"    \"ENTITYNAME\": \"Hema Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15677,\n" +
//"    \"ENTITYNAME\": \"Jamii Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15679,\n" +
//"    \"ENTITYNAME\": \"YAYA MEDICAL SERVICES\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15680,\n" +
//"    \"ENTITYNAME\": \"North Kinangop Catholic Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15681,\n" +
//"    \"ENTITYNAME\": \"GLUK MEDICAL CLINIC\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15682,\n" +
//"    \"ENTITYNAME\": \"ACK Diocese of Kajiado Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15683,\n" +
//"    \"ENTITYNAME\": \"Mt. Elgon Samaritan Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15684,\n" +
//"    \"ENTITYNAME\": \"Montezuma Monalisa Funeral Home Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15685,\n" +
//"    \"ENTITYNAME\": \"Sololo Mission Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15686,\n" +
//"    \"ENTITYNAME\": \"Lenana Hill Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15687,\n" +
//"    \"ENTITYNAME\": \"Tabibu Cures Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15688,\n" +
//"    \"ENTITYNAME\": \"Nyali Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15690,\n" +
//"    \"ENTITYNAME\": \"Dawida Maternity and Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15691,\n" +
//"    \"ENTITYNAME\": \"American Hospital- Dubai\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15693,\n" +
//"    \"ENTITYNAME\": \"Equator Medical Services Luanda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15694,\n" +
//"    \"ENTITYNAME\": \"St Paul Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15695,\n" +
//"    \"ENTITYNAME\": \"Wellness Associates\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15696,\n" +
//"    \"ENTITYNAME\": \"Njeru Kathangu Medical Services.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15697,\n" +
//"    \"ENTITYNAME\": \"Imani Dental Centre Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15698,\n" +
//"    \"ENTITYNAME\": \"Salamed Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15700,\n" +
//"    \"ENTITYNAME\": \"Laser Skin Centre Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15701,\n" +
//"    \"ENTITYNAME\": \"Procare Dental Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15702,\n" +
//"    \"ENTITYNAME\": \"Moka Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15703,\n" +
//"    \"ENTITYNAME\": \"Saifee Foundation Poly Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15704,\n" +
//"    \"ENTITYNAME\": \"Ivory Eye Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15705,\n" +
//"    \"ENTITYNAME\": \"The Cross Medicare Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15706,\n" +
//"    \"ENTITYNAME\": \"Hurlingham Childrens Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15707,\n" +
//"    \"ENTITYNAME\": \"Jaff`s Optical House(Nairobi) Ltd.\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15708,\n" +
//"    \"ENTITYNAME\": \"Eye Modes Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15709,\n" +
//"    \"ENTITYNAME\": \"Gatehouse Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15710,\n" +
//"    \"ENTITYNAME\": \"Gaza Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15711,\n" +
//"    \"ENTITYNAME\": \"Eye Deal Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15713,\n" +
//"    \"ENTITYNAME\": \"Universal Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15715,\n" +
//"    \"ENTITYNAME\": \"Saint Theresa Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15716,\n" +
//"    \"ENTITYNAME\": \"Village Dispensary\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15718,\n" +
//"    \"ENTITYNAME\": \"Karen Surgery\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15719,\n" +
//"    \"ENTITYNAME\": \"Mzabibu Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15720,\n" +
//"    \"ENTITYNAME\": \"Mawamu Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15721,\n" +
//"    \"ENTITYNAME\": \"Kamucii Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15722,\n" +
//"    \"ENTITYNAME\": \"New LandMarc Medical Laboratories Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15723,\n" +
//"    \"ENTITYNAME\": \"Landmawe Medical Services and side laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15724,\n" +
//"    \"ENTITYNAME\": \"Juhudi Health Care Dispensary\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15725,\n" +
//"    \"ENTITYNAME\": \"Best Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15726,\n" +
//"    \"ENTITYNAME\": \"Diagnostic Centre Kenya Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15727,\n" +
//"    \"ENTITYNAME\": \"Sports Medicine Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15728,\n" +
//"    \"ENTITYNAME\": \"The  sports medicine centre limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15729,\n" +
//"    \"ENTITYNAME\": \"Edna Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15731,\n" +
//"    \"ENTITYNAME\": \"Optical Solutions\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15732,\n" +
//"    \"ENTITYNAME\": \"Eastern Optical\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15733,\n" +
//"    \"ENTITYNAME\": \"Makindu S-district Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15734,\n" +
//"    \"ENTITYNAME\": \"Kitui Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15735,\n" +
//"    \"ENTITYNAME\": \"Mzima Springs Counseling Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15736,\n" +
//"    \"ENTITYNAME\": \"Bethesda Health Care Services Company Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15737,\n" +
//"    \"ENTITYNAME\": \"Shalom Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15738,\n" +
//"    \"ENTITYNAME\": \"PolyClinic Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15739,\n" +
//"    \"ENTITYNAME\": \"Evans Sunrise Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15740,\n" +
//"    \"ENTITYNAME\": \"Cleanhope Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15741,\n" +
//"    \"ENTITYNAME\": \"Shamas Medical & Skin Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15742,\n" +
//"    \"ENTITYNAME\": \"Hurlingham eye Care Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15743,\n" +
//"    \"ENTITYNAME\": \"The Neurology Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15745,\n" +
//"    \"ENTITYNAME\": \"Cape Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15746,\n" +
//"    \"ENTITYNAME\": \"Maua Methodist Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15748,\n" +
//"    \"ENTITYNAME\": \"Mathew Nyabena & Company Advocates\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15750,\n" +
//"    \"ENTITYNAME\": \"Embu Children Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15752,\n" +
//"    \"ENTITYNAME\": \"Mullighan Rehab Services Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15753,\n" +
//"    \"ENTITYNAME\": \"Mwingi Baraka Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15755,\n" +
//"    \"ENTITYNAME\": \"Eagle Wings Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15756,\n" +
//"    \"ENTITYNAME\": \"Acef Ena Health Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15757,\n" +
//"    \"ENTITYNAME\": \"HURLINGHAM COMPREHENSIVE HEALTHCARE CLINICS\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15758,\n" +
//"    \"ENTITYNAME\": \"Platinum Care Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15759,\n" +
//"    \"ENTITYNAME\": \"Mombasa Physiotherapy Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15760,\n" +
//"    \"ENTITYNAME\": \"Uasin Gishu Memorial Hospital Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15761,\n" +
//"    \"ENTITYNAME\": \"Flying Doctors Society of Africa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15762,\n" +
//"    \"ENTITYNAME\": \"Woodley Dental Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15763,\n" +
//"    \"ENTITYNAME\": \"Alliance Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15764,\n" +
//"    \"ENTITYNAME\": \"Roysambu Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15766,\n" +
//"    \"ENTITYNAME\": \"Laser Eye Centre Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15769,\n" +
//"    \"ENTITYNAME\": \"Ngara Medical Complex\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15770,\n" +
//"    \"ENTITYNAME\": \"Ravi Medical\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15771,\n" +
//"    \"ENTITYNAME\": \"PRIMECARE FERTILITY CENTRE LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15772,\n" +
//"    \"ENTITYNAME\": \"Gynae Paed Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15773,\n" +
//"    \"ENTITYNAME\": \"Nairobi Family Health Care Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15775,\n" +
//"    \"ENTITYNAME\": \"Janta Xray & Scan Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15777,\n" +
//"    \"ENTITYNAME\": \"Omega Opticians Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15778,\n" +
//"    \"ENTITYNAME\": \"Rainbow Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15780,\n" +
//"    \"ENTITYNAME\": \"MediTrust HealthCare Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15781,\n" +
//"    \"ENTITYNAME\": \"Gilead Womens Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15782,\n" +
//"    \"ENTITYNAME\": \"East Gate Optometrists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15783,\n" +
//"    \"ENTITYNAME\": \"Tudor Healthcare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15785,\n" +
//"    \"ENTITYNAME\": \"Jesus Is The Answer Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15786,\n" +
//"    \"ENTITYNAME\": \"Matata Nursing & Maternity Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15787,\n" +
//"    \"ENTITYNAME\": \"Swan Health & Counselling Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15788,\n" +
//"    \"ENTITYNAME\": \"The Nairobi Womens Hospital Hurlingham\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15789,\n" +
//"    \"ENTITYNAME\": \"Merit Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15790,\n" +
//"    \"ENTITYNAME\": \"Rehema Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15793,\n" +
//"    \"ENTITYNAME\": \"Maasai Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15794,\n" +
//"    \"ENTITYNAME\": \"Crater Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15795,\n" +
//"    \"ENTITYNAME\": \"Moi Teaching & Referral Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15797,\n" +
//"    \"ENTITYNAME\": \"P.C.E.A Kikuyu Orth. Rehab. Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15798,\n" +
//"    \"ENTITYNAME\": \"St. Joseph Mission Hospital- Migori\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15799,\n" +
//"    \"ENTITYNAME\": \"Naidu Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15800,\n" +
//"    \"ENTITYNAME\": \"Good Hope Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15801,\n" +
//"    \"ENTITYNAME\": \"Nyangena Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15803,\n" +
//"    \"ENTITYNAME\": \"Avenue Healthcare Kisumu\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15804,\n" +
//"    \"ENTITYNAME\": \"Mediheal Hospital and Fertility Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15805,\n" +
//"    \"ENTITYNAME\": \"Frontier Lifeline Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15806,\n" +
//"    \"ENTITYNAME\": \"Milimani Mat and Nursing Home Meru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15807,\n" +
//"    \"ENTITYNAME\": \"ANKH WOMENS CLINIC\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15808,\n" +
//"    \"ENTITYNAME\": \"Kilimani Dental Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15810,\n" +
//"    \"ENTITYNAME\": \"Rotes Kreuz Krankenhus Hospital- Germany\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15811,\n" +
//"    \"ENTITYNAME\": \"Dental and Maxillofacial Imaging Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15812,\n" +
//"    \"ENTITYNAME\": \"Langata Comprehensive Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15813,\n" +
//"    \"ENTITYNAME\": \"Kalimoni Mission Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15814,\n" +
//"    \"ENTITYNAME\": \"Kenya Red Cross Society EMS\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15817,\n" +
//"    \"ENTITYNAME\": \"Mercy Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15818,\n" +
//"    \"ENTITYNAME\": \"The Lifeline Group of Hospitals\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15821,\n" +
//"    \"ENTITYNAME\": \"International Hospital- Juba\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15822,\n" +
//"    \"ENTITYNAME\": \"St. Luke International Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15823,\n" +
//"    \"ENTITYNAME\": \"Victorious Medical Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15824,\n" +
//"    \"ENTITYNAME\": \"Da-Genesis Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15826,\n" +
//"    \"ENTITYNAME\": \"Optique Le Catier\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15827,\n" +
//"    \"ENTITYNAME\": \"Emmaus Innercore Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15828,\n" +
//"    \"ENTITYNAME\": \"Forest Court Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15829,\n" +
//"    \"ENTITYNAME\": \"Uganda Road Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15831,\n" +
//"    \"ENTITYNAME\": \"AIC Kijabe Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15832,\n" +
//"    \"ENTITYNAME\": \"Nairobi M.R.I Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15833,\n" +
//"    \"ENTITYNAME\": \"Mother & Child Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15834,\n" +
//"    \"ENTITYNAME\": \"Lorvic Dermacare Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15835,\n" +
//"    \"ENTITYNAME\": \"Bahari X-Ray Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15836,\n" +
//"    \"ENTITYNAME\": \"Clinitech Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15837,\n" +
//"    \"ENTITYNAME\": \"Light House Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15838,\n" +
//"    \"ENTITYNAME\": \"St Odilia`s Dispensary\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15839,\n" +
//"    \"ENTITYNAME\": \"Westlands Dental Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15840,\n" +
//"    \"ENTITYNAME\": \"St. Joseph The Worker Dispensary\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15842,\n" +
//"    \"ENTITYNAME\": \"Church House Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15843,\n" +
//"    \"ENTITYNAME\": \"Optical Illusions\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15844,\n" +
//"    \"ENTITYNAME\": \"V. S. Eye Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15846,\n" +
//"    \"ENTITYNAME\": \"Walmi Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15848,\n" +
//"    \"ENTITYNAME\": \"Classic Opticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15849,\n" +
//"    \"ENTITYNAME\": \"St. Leo`s Medical Care Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15850,\n" +
//"    \"ENTITYNAME\": \"St. Mary Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15851,\n" +
//"    \"ENTITYNAME\": \"Olive Tree Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15852,\n" +
//"    \"ENTITYNAME\": \"Mt. Longonot Medical Services Ltd.\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15853,\n" +
//"    \"ENTITYNAME\": \"Faith Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15854,\n" +
//"    \"ENTITYNAME\": \"Universal Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15855,\n" +
//"    \"ENTITYNAME\": \"Zam Zam Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15856,\n" +
//"    \"ENTITYNAME\": \"Kiriani Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15860,\n" +
//"    \"ENTITYNAME\": \"Elgon View Medical Cottage\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15861,\n" +
//"    \"ENTITYNAME\": \"Map Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15862,\n" +
//"    \"ENTITYNAME\": \"Greenview Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15863,\n" +
//"    \"ENTITYNAME\": \"Star Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15864,\n" +
//"    \"ENTITYNAME\": \"Makwa Medical Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15865,\n" +
//"    \"ENTITYNAME\": \"Africa nazarene University Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15866,\n" +
//"    \"ENTITYNAME\": \"Mt. Elgon Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15867,\n" +
//"    \"ENTITYNAME\": \"Eye Stop Kenya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15868,\n" +
//"    \"ENTITYNAME\": \"Coptic Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15869,\n" +
//"    \"ENTITYNAME\": \"The Catholic University Of Eastern Africa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15870,\n" +
//"    \"ENTITYNAME\": \"Star Optics Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15871,\n" +
//"    \"ENTITYNAME\": \"Optica Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15872,\n" +
//"    \"ENTITYNAME\": \"Kabarnet Faith Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15873,\n" +
//"    \"ENTITYNAME\": \"Nakuru Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15877,\n" +
//"    \"ENTITYNAME\": \"Nyeri Surgical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15879,\n" +
//"    \"ENTITYNAME\": \"Arrow Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15880,\n" +
//"    \"ENTITYNAME\": \"Bomani Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15881,\n" +
//"    \"ENTITYNAME\": \"Neotech Healthcare Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15882,\n" +
//"    \"ENTITYNAME\": \"Park Road Dental Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15883,\n" +
//"    \"ENTITYNAME\": \"South Coast Medical Practice\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15884,\n" +
//"    \"ENTITYNAME\": \"Spectacle Land Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15887,\n" +
//"    \"ENTITYNAME\": \"Rural Eye Screening(Diocese of Embu)\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15888,\n" +
//"    \"ENTITYNAME\": \"Kiembeni Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15890,\n" +
//"    \"ENTITYNAME\": \"City Optics & Contact Lens Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15892,\n" +
//"    \"ENTITYNAME\": \"Marie Stopes- Eastleigh N ursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15894,\n" +
//"    \"ENTITYNAME\": \"Eye Style Opticians Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15895,\n" +
//"    \"ENTITYNAME\": \"Jomo Kenyatta University Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15896,\n" +
//"    \"ENTITYNAME\": \"Health Care Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15897,\n" +
//"    \"ENTITYNAME\": \"Lita Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15898,\n" +
//"    \"ENTITYNAME\": \"Prince Aly Khan Hosp\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15900,\n" +
//"    \"ENTITYNAME\": \"NexGen Physiotherapy Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15901,\n" +
//"    \"ENTITYNAME\": \"Islamic Republic of Iran Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15902,\n" +
//"    \"ENTITYNAME\": \"Physical Therapy Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15903,\n" +
//"    \"ENTITYNAME\": \"Rapha Mission Clinic and Optics\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15904,\n" +
//"    \"ENTITYNAME\": \"Noor Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15905,\n" +
//"    \"ENTITYNAME\": \"Marura Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15906,\n" +
//"    \"ENTITYNAME\": \"New Nyanza Provincial Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15908,\n" +
//"    \"ENTITYNAME\": \"The family Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15909,\n" +
//"    \"ENTITYNAME\": \"St. John`s Health Clinic and Maternity\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15910,\n" +
//"    \"ENTITYNAME\": \"Imara Medical Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15911,\n" +
//"    \"ENTITYNAME\": \"Provide International Health Service\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15912,\n" +
//"    \"ENTITYNAME\": \"Buru Buru Dental Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15913,\n" +
//"    \"ENTITYNAME\": \"Lumino Nursing and Maternity Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15914,\n" +
//"    \"ENTITYNAME\": \"Uhuru Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15916,\n" +
//"    \"ENTITYNAME\": \"Grand Optics\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15918,\n" +
//"    \"ENTITYNAME\": \"Tengecha Physiotherapy Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15920,\n" +
//"    \"ENTITYNAME\": \"Lena Dental Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15921,\n" +
//"    \"ENTITYNAME\": \"Tropical Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15925,\n" +
//"    \"ENTITYNAME\": \"Voi Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15926,\n" +
//"    \"ENTITYNAME\": \"Bombay Hospital & Medical ResearchCenter\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15927,\n" +
//"    \"ENTITYNAME\": \"St. Marys Mission Hospital Mumias\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15928,\n" +
//"    \"ENTITYNAME\": \"Danjos Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15929,\n" +
//"    \"ENTITYNAME\": \"Dentplan\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15930,\n" +
//"    \"ENTITYNAME\": \"Hedden Opticals\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15931,\n" +
//"    \"ENTITYNAME\": \"Al-Shifa Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15933,\n" +
//"    \"ENTITYNAME\": \"The Polyclinic Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15934,\n" +
//"    \"ENTITYNAME\": \"Garissa Nursing Home Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15935,\n" +
//"    \"ENTITYNAME\": \"Kaplong Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15936,\n" +
//"    \"ENTITYNAME\": \"Mary Help Of The Sick Mission Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15937,\n" +
//"    \"ENTITYNAME\": \"Danica Hearing Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15938,\n" +
//"    \"ENTITYNAME\": \"Coast Physiotherapy Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15941,\n" +
//"    \"ENTITYNAME\": \"Giants Hearing Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15942,\n" +
//"    \"ENTITYNAME\": \"Laikipia Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15943,\n" +
//"    \"ENTITYNAME\": \"Plaza X-Ray Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15944,\n" +
//"    \"ENTITYNAME\": \"Ukunda Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15946,\n" +
//"    \"ENTITYNAME\": \"Special Eyes Ltd(Opticians)\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15947,\n" +
//"    \"ENTITYNAME\": \"Kisumu Helath Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15948,\n" +
//"    \"ENTITYNAME\": \"Bosongo Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15949,\n" +
//"    \"ENTITYNAME\": \"Sinai  Hospital Rongai Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15951,\n" +
//"    \"ENTITYNAME\": \"First Sight Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15952,\n" +
//"    \"ENTITYNAME\": \"Sims Women Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15953,\n" +
//"    \"ENTITYNAME\": \"Mountain View Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15955,\n" +
//"    \"ENTITYNAME\": \"Nairobi Pathology Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15957,\n" +
//"    \"ENTITYNAME\": \"City Dental Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15959,\n" +
//"    \"ENTITYNAME\": \"St Georges Health Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15960,\n" +
//"    \"ENTITYNAME\": \"Mobile Physiotherapy Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15961,\n" +
//"    \"ENTITYNAME\": \"Avenue Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15962,\n" +
//"    \"ENTITYNAME\": \"Thika Nursing Home Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15964,\n" +
//"    \"ENTITYNAME\": \"Muranga District Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15965,\n" +
//"    \"ENTITYNAME\": \"Nazareth Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15966,\n" +
//"    \"ENTITYNAME\": \"Vibakar`s Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15967,\n" +
//"    \"ENTITYNAME\": \"Singawa Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15968,\n" +
//"    \"ENTITYNAME\": \"Optoline Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15971,\n" +
//"    \"ENTITYNAME\": \"Garlands Medical Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15972,\n" +
//"    \"ENTITYNAME\": \"Cherangany Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15973,\n" +
//"    \"ENTITYNAME\": \"Eye Tech Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15974,\n" +
//"    \"ENTITYNAME\": \"Komarock Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15975,\n" +
//"    \"ENTITYNAME\": \"St Francis Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15977,\n" +
//"    \"ENTITYNAME\": \"Madina Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15978,\n" +
//"    \"ENTITYNAME\": \"Acacia Medical Centre Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15981,\n" +
//"    \"ENTITYNAME\": \"Baus Optical\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15984,\n" +
//"    \"ENTITYNAME\": \"Consolata Hospital (Mathari)- Nyeri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15985,\n" +
//"    \"ENTITYNAME\": \"Kericho Nursing Home Ltd.\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15987,\n" +
//"    \"ENTITYNAME\": \"Nkubu Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15988,\n" +
//"    \"ENTITYNAME\": \"Bama Hospital LLP\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15989,\n" +
//"    \"ENTITYNAME\": \"Transmara Medicare\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15990,\n" +
//"    \"ENTITYNAME\": \"St. Michael Medical Centre- Tala\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15991,\n" +
//"    \"ENTITYNAME\": \"Plaza Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15992,\n" +
//"    \"ENTITYNAME\": \"Ephanna Physical Therapy Services Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15995,\n" +
//"    \"ENTITYNAME\": \"St Matia Mulumba Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15996,\n" +
//"    \"ENTITYNAME\": \"St. Jude Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15997,\n" +
//"    \"ENTITYNAME\": \"Kiambu District Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15998,\n" +
//"    \"ENTITYNAME\": \"Robana Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 15999,\n" +
//"    \"ENTITYNAME\": \"Mansille Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16000,\n" +
//"    \"ENTITYNAME\": \"Bomu Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16001,\n" +
//"    \"ENTITYNAME\": \"The Neema Hospital Kitui\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16002,\n" +
//"    \"ENTITYNAME\": \"Nakuru War Memorial Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16004,\n" +
//"    \"ENTITYNAME\": \"Matata Nursing & Maternity Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16005,\n" +
//"    \"ENTITYNAME\": \"Upper Hill Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16006,\n" +
//"    \"ENTITYNAME\": \"Asia Heart Institute\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16007,\n" +
//"    \"ENTITYNAME\": \"Celestial Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16008,\n" +
//"    \"ENTITYNAME\": \"The Magadi Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16011,\n" +
//"    \"ENTITYNAME\": \"Siloam Hospital Kericho Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16013,\n" +
//"    \"ENTITYNAME\": \"Ram Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16014,\n" +
//"    \"ENTITYNAME\": \"Jumuia Friends Hospital Kaimosi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16016,\n" +
//"    \"ENTITYNAME\": \"Narok Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16017,\n" +
//"    \"ENTITYNAME\": \"Lodwar Tumaini Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16020,\n" +
//"    \"ENTITYNAME\": \"Sau Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16022,\n" +
//"    \"ENTITYNAME\": \"Bwena Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16023,\n" +
//"    \"ENTITYNAME\": \"Matuu Cottage Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16024,\n" +
//"    \"ENTITYNAME\": \"Barnet Memorial Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16025,\n" +
//"    \"ENTITYNAME\": \"Finlays Medical Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16026,\n" +
//"    \"ENTITYNAME\": \"Kagio Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16027,\n" +
//"    \"ENTITYNAME\": \"Kima Mission Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16028,\n" +
//"    \"ENTITYNAME\": \"Elgonview Hospital Eldoret\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16029,\n" +
//"    \"ENTITYNAME\": \"The Neurology Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16031,\n" +
//"    \"ENTITYNAME\": \"Charity Medical Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16032,\n" +
//"    \"ENTITYNAME\": \"Ibnusina Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16033,\n" +
//"    \"ENTITYNAME\": \"Mwea Medical Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16034,\n" +
//"    \"ENTITYNAME\": \"Mt. View Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16038,\n" +
//"    \"ENTITYNAME\": \"Menelik Chest Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16040,\n" +
//"    \"ENTITYNAME\": \"Mainland Health Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16041,\n" +
//"    \"ENTITYNAME\": \"Mombasa Heart Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16044,\n" +
//"    \"ENTITYNAME\": \"Mt. Sinai Hospital(Terminated)\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16045,\n" +
//"    \"ENTITYNAME\": \"Beam Hearing Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16046,\n" +
//"    \"ENTITYNAME\": \"PRIME PHYSIOTHERAPY SERVICES\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16048,\n" +
//"    \"ENTITYNAME\": \"Kiaguthu Medical Centre-OTHAYA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16049,\n" +
//"    \"ENTITYNAME\": \"Al Bir Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16050,\n" +
//"    \"ENTITYNAME\": \"Family Health Options Kenya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16051,\n" +
//"    \"ENTITYNAME\": \"University of NRB Enterprises & services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16052,\n" +
//"    \"ENTITYNAME\": \"Kasarani claycity Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16055,\n" +
//"    \"ENTITYNAME\": \"Muthale Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16056,\n" +
//"    \"ENTITYNAME\": \"Windsor Eye Consultants\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16057,\n" +
//"    \"ENTITYNAME\": \"The Karen Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16058,\n" +
//"    \"ENTITYNAME\": \"Kitale Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16059,\n" +
//"    \"ENTITYNAME\": \"St. Peters Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16060,\n" +
//"    \"ENTITYNAME\": \"Family Planning Association Of Kenya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16061,\n" +
//"    \"ENTITYNAME\": \"St. Lucies  Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16063,\n" +
//"    \"ENTITYNAME\": \"F.G.Njenga & Nguithi Associates\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16064,\n" +
//"    \"ENTITYNAME\": \"Vision Express Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16065,\n" +
//"    \"ENTITYNAME\": \"Corrective Skin Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16066,\n" +
//"    \"ENTITYNAME\": \"Cardiac Implant Systems\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16067,\n" +
//"    \"ENTITYNAME\": \"Bomet Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16069,\n" +
//"    \"ENTITYNAME\": \"Hurlingham Physiotherapy Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16071,\n" +
//"    \"ENTITYNAME\": \"Plaza MRI Limited (CT)\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16072,\n" +
//"    \"ENTITYNAME\": \"Nakuru ENT Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16074,\n" +
//"    \"ENTITYNAME\": \"JUBILEE CLINIC- SDV TRANSAMI\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16075,\n" +
//"    \"ENTITYNAME\": \"Eastern Medical Consultants\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16076,\n" +
//"    \"ENTITYNAME\": \"Sotik Healthcare Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16077,\n" +
//"    \"ENTITYNAME\": \"Limuru Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16078,\n" +
//"    \"ENTITYNAME\": \"Kakamega Central Maternity and Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16079,\n" +
//"    \"ENTITYNAME\": \"St. J C For Kenya- Terminated\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16080,\n" +
//"    \"ENTITYNAME\": \"Westlands Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16081,\n" +
//"    \"ENTITYNAME\": \"St. Theresas Mission Hospital-Kiirua\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16082,\n" +
//"    \"ENTITYNAME\": \"Scarborough Town Optometric Clinic- Canada\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16083,\n" +
//"    \"ENTITYNAME\": \"St. John Council for Kenya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16084,\n" +
//"    \"ENTITYNAME\": \"MaryHill Medical & ENT Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16085,\n" +
//"    \"ENTITYNAME\": \"Bishop Kioko Catholic Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16086,\n" +
//"    \"ENTITYNAME\": \"Complete Dental Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16087,\n" +
//"    \"ENTITYNAME\": \"The Nyali Paediatric Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16089,\n" +
//"    \"ENTITYNAME\": \"Bethany Dental Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16090,\n" +
//"    \"ENTITYNAME\": \"Prestige Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16092,\n" +
//"    \"ENTITYNAME\": \"Alpha Dental Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16093,\n" +
//"    \"ENTITYNAME\": \"Care n Cure Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16094,\n" +
//"    \"ENTITYNAME\": \"Primecare Heart Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16095,\n" +
//"    \"ENTITYNAME\": \"Apollo Speciality Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16096,\n" +
//"    \"ENTITYNAME\": \"Kilome Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16098,\n" +
//"    \"ENTITYNAME\": \"Nakasero Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16100,\n" +
//"    \"ENTITYNAME\": \"Therapies For Kids Kenya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16101,\n" +
//"    \"ENTITYNAME\": \"Ruby Medical Practice\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16103,\n" +
//"    \"ENTITYNAME\": \"Sapta Trust\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16104,\n" +
//"    \"ENTITYNAME\": \"Everest Dental Group Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16105,\n" +
//"    \"ENTITYNAME\": \"Swedish Dental Clinic & laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16108,\n" +
//"    \"ENTITYNAME\": \"T M J Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16110,\n" +
//"    \"ENTITYNAME\": \"R.R. Scans\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16112,\n" +
//"    \"ENTITYNAME\": \"Nairobi Radiotherapy Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16114,\n" +
//"    \"ENTITYNAME\": \"Fatima Maternity Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16116,\n" +
//"    \"ENTITYNAME\": \"Equatorial Heart and Blood Vessel Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16117,\n" +
//"    \"ENTITYNAME\": \"Nairobi Imaging Solutions\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16120,\n" +
//"    \"ENTITYNAME\": \"Yanga Dental Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16121,\n" +
//"    \"ENTITYNAME\": \"St. Paul Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16122,\n" +
//"    \"ENTITYNAME\": \"Corner Childrens Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16123,\n" +
//"    \"ENTITYNAME\": \"Children`s Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16124,\n" +
//"    \"ENTITYNAME\": \"Machakos Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16126,\n" +
//"    \"ENTITYNAME\": \"Integrated Health Services Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16128,\n" +
//"    \"ENTITYNAME\": \"Premium X-Ray Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16130,\n" +
//"    \"ENTITYNAME\": \"Nakuru Nursing & Maternity Home Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16131,\n" +
//"    \"ENTITYNAME\": \"Plains View Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16133,\n" +
//"    \"ENTITYNAME\": \"JG Medical Clinic Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16134,\n" +
//"    \"ENTITYNAME\": \"Kakuma Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16135,\n" +
//"    \"ENTITYNAME\": \"Optimum Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16136,\n" +
//"    \"ENTITYNAME\": \"Sight By Wings\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16138,\n" +
//"    \"ENTITYNAME\": \"I-Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16140,\n" +
//"    \"ENTITYNAME\": \"Centre For Tropical & Traval Medicine\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16141,\n" +
//"    \"ENTITYNAME\": \"Jacaranda Health\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16143,\n" +
//"    \"ENTITYNAME\": \"Tawfiq  Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16148,\n" +
//"    \"ENTITYNAME\": \"Intergrated Medical Consultancy Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16149,\n" +
//"    \"ENTITYNAME\": \"Blessed Louis Pallazollo Health Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16150,\n" +
//"    \"ENTITYNAME\": \"Jamu Imaging Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16153,\n" +
//"    \"ENTITYNAME\": \"AIC Kapsowar Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16155,\n" +
//"    \"ENTITYNAME\": \"AMREF AVIATION\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16156,\n" +
//"    \"ENTITYNAME\": \"Shalby limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16157,\n" +
//"    \"ENTITYNAME\": \"Guru Nanak Ramgarhia Sikh Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16158,\n" +
//"    \"ENTITYNAME\": \"Aga Khan Hospital Kisumu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16159,\n" +
//"    \"ENTITYNAME\": \"Kenyatta National Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16160,\n" +
//"    \"ENTITYNAME\": \"The Mater Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16161,\n" +
//"    \"ENTITYNAME\": \"Mathare Mental Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16162,\n" +
//"    \"ENTITYNAME\": \"Metro don`t use\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16163,\n" +
//"    \"ENTITYNAME\": \"Nairobi West Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16165,\n" +
//"    \"ENTITYNAME\": \"M P Shah Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16167,\n" +
//"    \"ENTITYNAME\": \"Hurlingham Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16168,\n" +
//"    \"ENTITYNAME\": \"Orthopaedic Aids Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16169,\n" +
//"    \"ENTITYNAME\": \"Optivision Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16171,\n" +
//"    \"ENTITYNAME\": \"A.I.C Litein Cottage Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16173,\n" +
//"    \"ENTITYNAME\": \"St. Luke Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16175,\n" +
//"    \"ENTITYNAME\": \"AKH Dar es Salaam\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16177,\n" +
//"    \"ENTITYNAME\": \"Avenue Rescue Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16178,\n" +
//"    \"ENTITYNAME\": \"Aditya Jyot Eye Hospital PVT Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16179,\n" +
//"    \"ENTITYNAME\": \"Dental Health Providers Ltd.\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16180,\n" +
//"    \"ENTITYNAME\": \"St. Leonards Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16182,\n" +
//"    \"ENTITYNAME\": \"Kakuma Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16185,\n" +
//"    \"ENTITYNAME\": \"Mombasa Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16186,\n" +
//"    \"ENTITYNAME\": \"Diagnostic Imaging Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16188,\n" +
//"    \"ENTITYNAME\": \"Dr Muiru`s Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16189,\n" +
//"    \"ENTITYNAME\": \"Edelvale Trust Jamaa Home and Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16190,\n" +
//"    \"ENTITYNAME\": \"Imenti Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16191,\n" +
//"    \"ENTITYNAME\": \"EyeCare Consultants Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16192,\n" +
//"    \"ENTITYNAME\": \"Medical Imaging & Therapeutic Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16194,\n" +
//"    \"ENTITYNAME\": \"Kenya Society for the Blind\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16195,\n" +
//"    \"ENTITYNAME\": \"Avenue House Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16196,\n" +
//"    \"ENTITYNAME\": \"Our Lady Of Lourdes Mwea Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16197,\n" +
//"    \"ENTITYNAME\": \"Neema Medicare (E.A) LTD\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16198,\n" +
//"    \"ENTITYNAME\": \"Nairobi M.R.I. Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16199,\n" +
//"    \"ENTITYNAME\": \"Umoja Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16200,\n" +
//"    \"ENTITYNAME\": \"Optica Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16201,\n" +
//"    \"ENTITYNAME\": \"Avenue Homecare Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16203,\n" +
//"    \"ENTITYNAME\": \"Mercy Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16204,\n" +
//"    \"ENTITYNAME\": \"Kendu Adventist Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16205,\n" +
//"    \"ENTITYNAME\": \"Apex Health Services Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16206,\n" +
//"    \"ENTITYNAME\": \"Thika Road Health Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16210,\n" +
//"    \"ENTITYNAME\": \"Acacia Surgical and Breast Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16213,\n" +
//"    \"ENTITYNAME\": \"ISMC SERVICES\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16214,\n" +
//"    \"ENTITYNAME\": \"Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16215,\n" +
//"    \"ENTITYNAME\": \"Friends Lugulu Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16216,\n" +
//"    \"ENTITYNAME\": \"Jalaram Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16217,\n" +
//"    \"ENTITYNAME\": \"Seventh Day Adventist Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16218,\n" +
//"    \"ENTITYNAME\": \"Cambridge & Company Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16220,\n" +
//"    \"ENTITYNAME\": \"Edianna Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16221,\n" +
//"    \"ENTITYNAME\": \"Canaan Health Providers Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16222,\n" +
//"    \"ENTITYNAME\": \"Crescent Medical Aid Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16223,\n" +
//"    \"ENTITYNAME\": \"Marie Stopes Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16224,\n" +
//"    \"ENTITYNAME\": \"Comprehensive Diabetes Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16225,\n" +
//"    \"ENTITYNAME\": \"Nakuru Provincial Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16226,\n" +
//"    \"ENTITYNAME\": \"Naivasha Road Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16227,\n" +
//"    \"ENTITYNAME\": \"Afya Centre Xray Services Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16228,\n" +
//"    \"ENTITYNAME\": \"Neuro Cardio Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16231,\n" +
//"    \"ENTITYNAME\": \"Jocham Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16233,\n" +
//"    \"ENTITYNAME\": \"Physique Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16234,\n" +
//"    \"ENTITYNAME\": \"Bondo Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16235,\n" +
//"    \"ENTITYNAME\": \"Anchor Medical Consultants\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16236,\n" +
//"    \"ENTITYNAME\": \"Nyambene Clincal Services & Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16240,\n" +
//"    \"ENTITYNAME\": \"Prime Eye Care Opticians\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16241,\n" +
//"    \"ENTITYNAME\": \"Matangwe Community Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16242,\n" +
//"    \"ENTITYNAME\": \"Bapat Hospital- India\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16244,\n" +
//"    \"ENTITYNAME\": \"Kasarani Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16245,\n" +
//"    \"ENTITYNAME\": \"Liban Pharmacy & Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16246,\n" +
//"    \"ENTITYNAME\": \"Intensive Care Air Ambulance\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16248,\n" +
//"    \"ENTITYNAME\": \"Wote Health Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16249,\n" +
//"    \"ENTITYNAME\": \"Nyahururu Private Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16250,\n" +
//"    \"ENTITYNAME\": \"South C Health Service\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16251,\n" +
//"    \"ENTITYNAME\": \"Mosque Medical Care Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16254,\n" +
//"    \"ENTITYNAME\": \"Park Road Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16255,\n" +
//"    \"ENTITYNAME\": \"Meridian Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16257,\n" +
//"    \"ENTITYNAME\": \"Nairobi Maxillofacial Surgery Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16258,\n" +
//"    \"ENTITYNAME\": \"Coast Imaging Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16260,\n" +
//"    \"ENTITYNAME\": \"Dorevans Health Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16261,\n" +
//"    \"ENTITYNAME\": \"Laser Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16262,\n" +
//"    \"ENTITYNAME\": \"Kam Health Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16264,\n" +
//"    \"ENTITYNAME\": \"AAR Health Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16267,\n" +
//"    \"ENTITYNAME\": \"Pwani Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16268,\n" +
//"    \"ENTITYNAME\": \"Pims Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16269,\n" +
//"    \"ENTITYNAME\": \"Hurlingham EN &T Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16271,\n" +
//"    \"ENTITYNAME\": \"Clinix Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16273,\n" +
//"    \"ENTITYNAME\": \"P.C.E.A CHOGORIA HOSPITAL\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16275,\n" +
//"    \"ENTITYNAME\": \"St. Francis Community Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16276,\n" +
//"    \"ENTITYNAME\": \"Consolata Hospital Kyeni\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16278,\n" +
//"    \"ENTITYNAME\": \"Looks Eye Centers Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16279,\n" +
//"    \"ENTITYNAME\": \"The Dental Place Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16280,\n" +
//"    \"ENTITYNAME\": \"Tabasamu Dental Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16282,\n" +
//"    \"ENTITYNAME\": \"Nairobi Audiology Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16283,\n" +
//"    \"ENTITYNAME\": \"Ponya Surgicals & Lab\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16285,\n" +
//"    \"ENTITYNAME\": \"P.C.E.A Kikuyu Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16288,\n" +
//"    \"ENTITYNAME\": \"St. Teresa Hospital-Kikuyu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16289,\n" +
//"    \"ENTITYNAME\": \"The Maxillofacial Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16292,\n" +
//"    \"ENTITYNAME\": \"Vijay Optica\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16295,\n" +
//"    \"ENTITYNAME\": \"Mewa Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16296,\n" +
//"    \"ENTITYNAME\": \"Lighthouse For Christ Eye Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16297,\n" +
//"    \"ENTITYNAME\": \"Kayole Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16299,\n" +
//"    \"ENTITYNAME\": \"Lens Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16300,\n" +
//"    \"ENTITYNAME\": \"Menelik Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16301,\n" +
//"    \"ENTITYNAME\": \"Nairobi Outpatient Center Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16302,\n" +
//"    \"ENTITYNAME\": \"Smile Dental Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16303,\n" +
//"    \"ENTITYNAME\": \"Galana Hospital Ltd.\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16308,\n" +
//"    \"ENTITYNAME\": \"Integrity Health Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16309,\n" +
//"    \"ENTITYNAME\": \"EUREKA LOKI MEDICAL CLINIC\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16313,\n" +
//"    \"ENTITYNAME\": \"Kwale District Eye Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16314,\n" +
//"    \"ENTITYNAME\": \"Afya Royal Clinics\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16315,\n" +
//"    \"ENTITYNAME\": \"Meru Consultants Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16317,\n" +
//"    \"ENTITYNAME\": \"Narok District Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16318,\n" +
//"    \"ENTITYNAME\": \"Community Medical & Laboratory Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16319,\n" +
//"    \"ENTITYNAME\": \"Kirimara Opticals Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16320,\n" +
//"    \"ENTITYNAME\": \"Beta Care Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16321,\n" +
//"    \"ENTITYNAME\": \"City Eye Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16322,\n" +
//"    \"ENTITYNAME\": \"Nairobi Dental Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16324,\n" +
//"    \"ENTITYNAME\": \"The Nyali Children Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16325,\n" +
//"    \"ENTITYNAME\": \"Bakarani Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16326,\n" +
//"    \"ENTITYNAME\": \"Coast General Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16327,\n" +
//"    \"ENTITYNAME\": \"Mary Immaculate Dispensary\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16328,\n" +
//"    \"ENTITYNAME\": \"Central Park Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16329,\n" +
//"    \"ENTITYNAME\": \"Jamko Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16330,\n" +
//"    \"ENTITYNAME\": \"St. Grace Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16333,\n" +
//"    \"ENTITYNAME\": \"St. Elizabeth Hospital Mukumu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16334,\n" +
//"    \"ENTITYNAME\": \"Super Vision Optical\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16335,\n" +
//"    \"ENTITYNAME\": \"Worksafe Afya Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16336,\n" +
//"    \"ENTITYNAME\": \"Dr P.P. Shah\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16339,\n" +
//"    \"ENTITYNAME\": \"Physiotherapy & Sports Activities\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16340,\n" +
//"    \"ENTITYNAME\": \"Dr  J.P NATHWANI\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16341,\n" +
//"    \"ENTITYNAME\": \"Ranalo Medical Imaging Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16342,\n" +
//"    \"ENTITYNAME\": \"Mariakani Cottage Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16343,\n" +
//"    \"ENTITYNAME\": \"Kiambu Cottage Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16344,\n" +
//"    \"ENTITYNAME\": \"City X ray Services Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16345,\n" +
//"    \"ENTITYNAME\": \"South B Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16346,\n" +
//"    \"ENTITYNAME\": \"Bright Eyes Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16348,\n" +
//"    \"ENTITYNAME\": \"Yaya Centre Medical and Chest Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16350,\n" +
//"    \"ENTITYNAME\": \"The Social Service League\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16352,\n" +
//"    \"ENTITYNAME\": \"Kinoo Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16353,\n" +
//"    \"ENTITYNAME\": \"Nairobi Equator Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16355,\n" +
//"    \"ENTITYNAME\": \"Huruma Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16356,\n" +
//"    \"ENTITYNAME\": \"St. Marks Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16357,\n" +
//"    \"ENTITYNAME\": \"St. Jude`s Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16361,\n" +
//"    \"ENTITYNAME\": \"Busy Bee Medical Agencies- Physiotherapists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16362,\n" +
//"    \"ENTITYNAME\": \"Vipawa Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16364,\n" +
//"    \"ENTITYNAME\": \"Port Florence Community Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16365,\n" +
//"    \"ENTITYNAME\": \"ACK Mt. Kenya Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16366,\n" +
//"    \"ENTITYNAME\": \"The Jubilee Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16367,\n" +
//"    \"ENTITYNAME\": \"Parklands Medical Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16368,\n" +
//"    \"ENTITYNAME\": \"Sunset Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16369,\n" +
//"    \"ENTITYNAME\": \"Rift Valley provincial General Hospital-Annex\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16370,\n" +
//"    \"ENTITYNAME\": \"Wangige Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16375,\n" +
//"    \"ENTITYNAME\": \"Blessing Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16376,\n" +
//"    \"ENTITYNAME\": \"Bristol Park Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16377,\n" +
//"    \"ENTITYNAME\": \"St. Elizabeth Lwak Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16378,\n" +
//"    \"ENTITYNAME\": \"Vimak\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16379,\n" +
//"    \"ENTITYNAME\": \"Molars Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16380,\n" +
//"    \"ENTITYNAME\": \"Vimak Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16382,\n" +
//"    \"ENTITYNAME\": \"Divine Mercy Aluor Health Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16385,\n" +
//"    \"ENTITYNAME\": \"Mediheal Minimal Access Surgery(MMAS)\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16386,\n" +
//"    \"ENTITYNAME\": \"Ruaraka Uhai Neema Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16388,\n" +
//"    \"ENTITYNAME\": \"Eagle Eye Laser Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16389,\n" +
//"    \"ENTITYNAME\": \"Al- Jaber Optical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16390,\n" +
//"    \"ENTITYNAME\": \"Crystal Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16391,\n" +
//"    \"ENTITYNAME\": \"Kiambu Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16392,\n" +
//"    \"ENTITYNAME\": \"Care Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16393,\n" +
//"    \"ENTITYNAME\": \"Millenium Dental Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16394,\n" +
//"    \"ENTITYNAME\": \"Zonal Annex Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16395,\n" +
//"    \"ENTITYNAME\": \"Mumbuni Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16396,\n" +
//"    \"ENTITYNAME\": \"Avenue Healthcare Mombasa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16397,\n" +
//"    \"ENTITYNAME\": \"Nala Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16398,\n" +
//"    \"ENTITYNAME\": \"St. Lukes  Afya Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16400,\n" +
//"    \"ENTITYNAME\": \"Sun-shine Family Health Medicare Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16401,\n" +
//"    \"ENTITYNAME\": \"P.C.E.A Tumutumu Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16403,\n" +
//"    \"ENTITYNAME\": \"Mothersmile Dental Care\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16404,\n" +
//"    \"ENTITYNAME\": \"West Ambulance K. Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16405,\n" +
//"    \"ENTITYNAME\": \"Lunettes Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16409,\n" +
//"    \"ENTITYNAME\": \"Radiant Group of Hospitals\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16410,\n" +
//"    \"ENTITYNAME\": \"Upper Hill Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16411,\n" +
//"    \"ENTITYNAME\": \"Moyale Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16412,\n" +
//"    \"ENTITYNAME\": \"Sonar Imaging Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16413,\n" +
//"    \"ENTITYNAME\": \"Medina Diagnostics Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16414,\n" +
//"    \"ENTITYNAME\": \"Riflot Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16418,\n" +
//"    \"ENTITYNAME\": \"New World Drug Store\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16421,\n" +
//"    \"ENTITYNAME\": \"Karen Physiotherapy Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16422,\n" +
//"    \"ENTITYNAME\": \"Baraka Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16424,\n" +
//"    \"ENTITYNAME\": \"Prime Care Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16426,\n" +
//"    \"ENTITYNAME\": \"St. Judes\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16427,\n" +
//"    \"ENTITYNAME\": \"Bismillahi Medical Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16428,\n" +
//"    \"ENTITYNAME\": \"Amani Family Health Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16430,\n" +
//"    \"ENTITYNAME\": \"Plaza Imaging Solutions\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16431,\n" +
//"    \"ENTITYNAME\": \"Tracey Grey & Partners Inc\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16432,\n" +
//"    \"ENTITYNAME\": \"The Jubilee Medical Clinic ILRI\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16434,\n" +
//"    \"ENTITYNAME\": \"Nairobiwest Childrens Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16436,\n" +
//"    \"ENTITYNAME\": \"Medicare Wellness Centres Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16437,\n" +
//"    \"ENTITYNAME\": \"Royal Gardens Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16439,\n" +
//"    \"ENTITYNAME\": \"Womens Hospital International\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16441,\n" +
//"    \"ENTITYNAME\": \"Sunset General Medicare\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16442,\n" +
//"    \"ENTITYNAME\": \"Pinnacle Healthcare Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16443,\n" +
//"    \"ENTITYNAME\": \"Laces Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16444,\n" +
//"    \"ENTITYNAME\": \"World Ministries International\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16446,\n" +
//"    \"ENTITYNAME\": \"Mwingi Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16448,\n" +
//"    \"ENTITYNAME\": \"Family Health Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16449,\n" +
//"    \"ENTITYNAME\": \"Shekinah Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16450,\n" +
//"    \"ENTITYNAME\": \"MAMA LUCY KIBAKI HOSPITAL -EMBAKASI\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16453,\n" +
//"    \"ENTITYNAME\": \"The Good Samaritan Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16454,\n" +
//"    \"ENTITYNAME\": \"Medina medical Clinic & Laboratory\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16455,\n" +
//"    \"ENTITYNAME\": \"Rafiki Healthcare  Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16456,\n" +
//"    \"ENTITYNAME\": \"St. Josephs Nursing & Maternity Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16458,\n" +
//"    \"ENTITYNAME\": \"Parklands Kidney Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16459,\n" +
//"    \"ENTITYNAME\": \"Mountain Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16460,\n" +
//"    \"ENTITYNAME\": \"ISLAMIC AFRICAN RELIEF AGENCY -IARA NURSING HOME\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16461,\n" +
//"    \"ENTITYNAME\": \"Upendo ENT Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16462,\n" +
//"    \"ENTITYNAME\": \"Amity Healthcare Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16463,\n" +
//"    \"ENTITYNAME\": \"Fig Tree Health Services Ltd(TERMINATED)\",\n" +
//"    \"Payment'\": \"Bank Draft\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16468,\n" +
//"    \"ENTITYNAME\": \"Nairobi Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16469,\n" +
//"    \"ENTITYNAME\": \"Highview Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16471,\n" +
//"    \"ENTITYNAME\": \"Leo Surgery\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16472,\n" +
//"    \"ENTITYNAME\": \"Shalby Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16473,\n" +
//"    \"ENTITYNAME\": \"Aga Khan University Hospital Nairobi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16474,\n" +
//"    \"ENTITYNAME\": \"Pandya Memorial Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16475,\n" +
//"    \"ENTITYNAME\": \"Lions SightFirst Eye Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16478,\n" +
//"    \"ENTITYNAME\": \"Nairobi ENT Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16481,\n" +
//"    \"ENTITYNAME\": \"Makupa Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16485,\n" +
//"    \"ENTITYNAME\": \"FAMILY DENTAL CENTRE\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16487,\n" +
//"    \"ENTITYNAME\": \"Nairobi Eye Associates\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16489,\n" +
//"    \"ENTITYNAME\": \"Neuro Rehabilitation Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16491,\n" +
//"    \"ENTITYNAME\": \"Meridian Equator Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16492,\n" +
//"    \"ENTITYNAME\": \"Vision & Sight Solutions\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16493,\n" +
//"    \"ENTITYNAME\": \"Gleneagles Kuala Lumpur\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16496,\n" +
//"    \"ENTITYNAME\": \"AIC Cure International  Childrens Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16497,\n" +
//"    \"ENTITYNAME\": \"International Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16499,\n" +
//"    \"ENTITYNAME\": \"Nairobi Kidney Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16500,\n" +
//"    \"ENTITYNAME\": \"Eldoret Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16502,\n" +
//"    \"ENTITYNAME\": \"Chiromo Lane Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16503,\n" +
//"    \"ENTITYNAME\": \"AKU-Karachi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16504,\n" +
//"    \"ENTITYNAME\": \"Optimumcare Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16506,\n" +
//"    \"ENTITYNAME\": \"Kenya Litho Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16509,\n" +
//"    \"ENTITYNAME\": \"Nairobi X Ray Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16510,\n" +
//"    \"ENTITYNAME\": \"Haria & Shah Associates (Dental Care Centre)\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16511,\n" +
//"    \"ENTITYNAME\": \"Bamburi Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16515,\n" +
//"    \"ENTITYNAME\": \"Coast Xray Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16516,\n" +
//"    \"ENTITYNAME\": \"Maxicare Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16518,\n" +
//"    \"ENTITYNAME\": \"Nakuru Heart Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16519,\n" +
//"    \"ENTITYNAME\": \"Nandi Hills Medicare\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16521,\n" +
//"    \"ENTITYNAME\": \"Physio - Plus Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16522,\n" +
//"    \"ENTITYNAME\": \"Medanta Africare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16523,\n" +
//"    \"ENTITYNAME\": \"Proffesional Eye Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16525,\n" +
//"    \"ENTITYNAME\": \"Elegant Optics\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16526,\n" +
//"    \"ENTITYNAME\": \"Cedar Clinical Associates\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16527,\n" +
//"    \"ENTITYNAME\": \"S P A Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16529,\n" +
//"    \"ENTITYNAME\": \"Pwani Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16531,\n" +
//"    \"ENTITYNAME\": \"Migori District Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16534,\n" +
//"    \"ENTITYNAME\": \"Royal Health Care\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16535,\n" +
//"    \"ENTITYNAME\": \"Nanyuki Cottage Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16536,\n" +
//"    \"ENTITYNAME\": \"Amani Counselling Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16537,\n" +
//"    \"ENTITYNAME\": \"Tanaka Nursing Home Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16538,\n" +
//"    \"ENTITYNAME\": \"Jordan Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16539,\n" +
//"    \"ENTITYNAME\": \"Ben Ammi Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16540,\n" +
//"    \"ENTITYNAME\": \"Milimani Maternity Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16541,\n" +
//"    \"ENTITYNAME\": \"Tenwek Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16542,\n" +
//"    \"ENTITYNAME\": \"St. Michael Nursing Home-Runyenjes\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16543,\n" +
//"    \"ENTITYNAME\": \"Nyeri Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16545,\n" +
//"    \"ENTITYNAME\": \"Jetma Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16547,\n" +
//"    \"ENTITYNAME\": \"Kangema Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16548,\n" +
//"    \"ENTITYNAME\": \"Crystal Cottage Hospital & Medical Clinic Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16549,\n" +
//"    \"ENTITYNAME\": \"Family Health Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16550,\n" +
//"    \"ENTITYNAME\": \"St. Johns Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16551,\n" +
//"    \"ENTITYNAME\": \"Langata Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16555,\n" +
//"    \"ENTITYNAME\": \"Lions Service Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16556,\n" +
//"    \"ENTITYNAME\": \"Athi River Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16557,\n" +
//"    \"ENTITYNAME\": \"Kemrif Medicare\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16558,\n" +
//"    \"ENTITYNAME\": \"Thika Dental Care Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16559,\n" +
//"    \"ENTITYNAME\": \"Mbale Everest Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16560,\n" +
//"    \"ENTITYNAME\": \"Medical Imaging Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16561,\n" +
//"    \"ENTITYNAME\": \"HEALTHFIRST INTERNATIONAL (K) LTD\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16563,\n" +
//"    \"ENTITYNAME\": \"Savanna Medical Clinic Turkana\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16564,\n" +
//"    \"ENTITYNAME\": \"Koppikar Eye Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16565,\n" +
//"    \"ENTITYNAME\": \"Jubilee Clinic - Mombasa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16566,\n" +
//"    \"ENTITYNAME\": \"Eye Link Optics\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16569,\n" +
//"    \"ENTITYNAME\": \"Waso Medical Services & Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16570,\n" +
//"    \"ENTITYNAME\": \"VASCULAR & INTERVENTIONAL RADIOLOGY CLINIC\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16572,\n" +
//"    \"ENTITYNAME\": \"Sister Fredas Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16573,\n" +
//"    \"ENTITYNAME\": \"BLUE LIGHT NURSING HOME & DIAGNOSTIC IMAGING CLINIC\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16574,\n" +
//"    \"ENTITYNAME\": \"OASIS AFRICA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16576,\n" +
//"    \"ENTITYNAME\": \"Palm Beach Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16579,\n" +
//"    \"ENTITYNAME\": \"Valley Ear Nose and Throat Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16580,\n" +
//"    \"ENTITYNAME\": \"Dr Ramadhan L. Mawenzi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16581,\n" +
//"    \"ENTITYNAME\": \"Cancer Care Kenya Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16582,\n" +
//"    \"ENTITYNAME\": \"Family Health Centre-Kakamega\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16584,\n" +
//"    \"ENTITYNAME\": \"Kitengela Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16585,\n" +
//"    \"ENTITYNAME\": \"Sagam Community Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16589,\n" +
//"    \"ENTITYNAME\": \"Langoni Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16590,\n" +
//"    \"ENTITYNAME\": \"Fig Tree Health Options Kericho Ltd(TERMINATED)\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16591,\n" +
//"    \"ENTITYNAME\": \"Umoja Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16593,\n" +
//"    \"ENTITYNAME\": \"Better Dental Care Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16594,\n" +
//"    \"ENTITYNAME\": \"Zimmermann Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16595,\n" +
//"    \"ENTITYNAME\": \"Batian Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16597,\n" +
//"    \"ENTITYNAME\": \"Mulemi Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16598,\n" +
//"    \"ENTITYNAME\": \"Uzima Surgical & Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16599,\n" +
//"    \"ENTITYNAME\": \"Kapsabet Health Care Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16600,\n" +
//"    \"ENTITYNAME\": \"Ongata Cottage Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16601,\n" +
//"    \"ENTITYNAME\": \"I. R. IRAN MEDICAL CLINIC\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16602,\n" +
//"    \"ENTITYNAME\": \"Psychological Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16606,\n" +
//"    \"ENTITYNAME\": \"Innovative Dental Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16607,\n" +
//"    \"ENTITYNAME\": \"St. Damiano Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16608,\n" +
//"    \"ENTITYNAME\": \"Kasiri Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16609,\n" +
//"    \"ENTITYNAME\": \"Nairobi South Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16611,\n" +
//"    \"ENTITYNAME\": \"Athi - River Shalom Community Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16612,\n" +
//"    \"ENTITYNAME\": \"Upperhill Radiology Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16613,\n" +
//"    \"ENTITYNAME\": \"Allied Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16614,\n" +
//"    \"ENTITYNAME\": \"Dr George R. Owino & Associates\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16616,\n" +
//"    \"ENTITYNAME\": \"Eldoret Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16619,\n" +
//"    \"ENTITYNAME\": \"Kerugoya Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16623,\n" +
//"    \"ENTITYNAME\": \"Valley Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16624,\n" +
//"    \"ENTITYNAME\": \"Mwaka Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16628,\n" +
//"    \"ENTITYNAME\": \"TRUST OPTICIANS\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16629,\n" +
//"    \"ENTITYNAME\": \"Shree Jalaram Laboratory and Diagnostic Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16630,\n" +
//"    \"ENTITYNAME\": \"Meru Dental Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16631,\n" +
//"    \"ENTITYNAME\": \"Jaffs Optical House-Mombasa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16632,\n" +
//"    \"ENTITYNAME\": \"Societe Rwandese D` Assurances (SORAS)\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16633,\n" +
//"    \"ENTITYNAME\": \"USIU HEALTH SERVICES\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16635,\n" +
//"    \"ENTITYNAME\": \"Astra Dental\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16636,\n" +
//"    \"ENTITYNAME\": \"Avenue Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16638,\n" +
//"    \"ENTITYNAME\": \"Aga Khan Hospital Mombasa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16640,\n" +
//"    \"ENTITYNAME\": \"Sunrise Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16642,\n" +
//"    \"ENTITYNAME\": \"Melchizedek Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16645,\n" +
//"    \"ENTITYNAME\": \"Prime Care Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16646,\n" +
//"    \"ENTITYNAME\": \"Warwick  Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16647,\n" +
//"    \"ENTITYNAME\": \"Diani Beach Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16648,\n" +
//"    \"ENTITYNAME\": \"Nairobi Heart Clinic Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16651,\n" +
//"    \"ENTITYNAME\": \"Jamii Clinic Kangemi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 16653,\n" +
//"    \"ENTITYNAME\": \"Hurlingham Dental Imaging\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 17351,\n" +
//"    \"ENTITYNAME\": \"Dr Donald P Oyatsi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 17466,\n" +
//"    \"ENTITYNAME\": \"Malibu Pharmacy Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 17467,\n" +
//"    \"ENTITYNAME\": \"Thika Chemist\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 17469,\n" +
//"    \"ENTITYNAME\": \"Westons Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 17839,\n" +
//"    \"ENTITYNAME\": \"Dr David Kiragu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 18302,\n" +
//"    \"ENTITYNAME\": \"Dr Jyoti Saha\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 18474,\n" +
//"    \"ENTITYNAME\": \"Dr Charles M Kariuki\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 18646,\n" +
//"    \"ENTITYNAME\": \"Dr Eric Kahugu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 19716,\n" +
//"    \"ENTITYNAME\": \"Precise Healthcare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 110503,\n" +
//"    \"ENTITYNAME\": \"Dr Peter Muriithi Nyamu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 110587,\n" +
//"    \"ENTITYNAME\": \"Lyntons Pharmacy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 110588,\n" +
//"    \"ENTITYNAME\": \"Dr Celestine A.  Okello(TERMINATED)\",\n" +
//"    \"Payment'\": \"Bank Draft\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 111255,\n" +
//"    \"ENTITYNAME\": \"Dr Florence V. Murila\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 111256,\n" +
//"    \"ENTITYNAME\": \"Dr Samson Miyoro\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 111678,\n" +
//"    \"ENTITYNAME\": \"Dr Thomas Mbwele Mutie\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 111679,\n" +
//"    \"ENTITYNAME\": \"Prof (Mrs)Eunice Cheserem\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 111680,\n" +
//"    \"ENTITYNAME\": \"Enclaire Counselling Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 111774,\n" +
//"    \"ENTITYNAME\": \"Dr Roshni A. Ajmera\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 112419,\n" +
//"    \"ENTITYNAME\": \"Dr Cecilia N. Wamanda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 112421,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen Thua Munyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 112808,\n" +
//"    \"ENTITYNAME\": \"Dr Moses Lango (Use Kilimani Children`s Clinic Ltd)\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 113435,\n" +
//"    \"ENTITYNAME\": \"Alliance Medical Centre Ltd Garissa\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 113436,\n" +
//"    \"ENTITYNAME\": \"Dr Andrew P. Malavu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 113968,\n" +
//"    \"ENTITYNAME\": \"Dr Sanjeev Parmar\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114024,\n" +
//"    \"ENTITYNAME\": \"Dr Peter O. Chore\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114047,\n" +
//"    \"ENTITYNAME\": \"Dr Lulu N. Waitara\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114225,\n" +
//"    \"ENTITYNAME\": \"Miliki Afya Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114237,\n" +
//"    \"ENTITYNAME\": \"Kimkan Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114392,\n" +
//"    \"ENTITYNAME\": \"Komarock Modern HealthCare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114718,\n" +
//"    \"ENTITYNAME\": \"Dr (Mrs.) Barbara O. Magoha\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114773,\n" +
//"    \"ENTITYNAME\": \"Trafalger Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114814,\n" +
//"    \"ENTITYNAME\": \"St. Lukes Orthopaedic and Trauma Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114852,\n" +
//"    \"ENTITYNAME\": \"Dr Philip Kirwa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114889,\n" +
//"    \"ENTITYNAME\": \"Oasis Doctors Plaza Kisumu Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 114890,\n" +
//"    \"ENTITYNAME\": \"Samaad Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115136,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel Wachira Ndungu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115138,\n" +
//"    \"ENTITYNAME\": \"The Woman`s Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115140,\n" +
//"    \"ENTITYNAME\": \"Dr Shem Musoke Sinagabula\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115229,\n" +
//"    \"ENTITYNAME\": \"St Luke`s\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115561,\n" +
//"    \"ENTITYNAME\": \"Dr Godfrey Allan Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115704,\n" +
//"    \"ENTITYNAME\": \"Dr Adil Waris\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115735,\n" +
//"    \"ENTITYNAME\": \"Easton Pharmaceuticals Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115853,\n" +
//"    \"ENTITYNAME\": \"Dr Vladimir Shchukin\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115854,\n" +
//"    \"ENTITYNAME\": \"Habib Nursing Home Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 115855,\n" +
//"    \"ENTITYNAME\": \"Dr Benjamin Mbira Gikonyo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116031,\n" +
//"    \"ENTITYNAME\": \"Dr Rachel Rukaria Kaumbutho\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116353,\n" +
//"    \"ENTITYNAME\": \"Dr Catherine Munanie Syengo Mutisya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116387,\n" +
//"    \"ENTITYNAME\": \"Dr Henderson Munene Irimu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116710,\n" +
//"    \"ENTITYNAME\": \"Dr David Oluoch-Olunya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116713,\n" +
//"    \"ENTITYNAME\": \"Dr Koome Mwiraria\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116715,\n" +
//"    \"ENTITYNAME\": \"Dr Margaret Makanyengo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116717,\n" +
//"    \"ENTITYNAME\": \"Dr AMOS MAGEMBE OTARA\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116718,\n" +
//"    \"ENTITYNAME\": \"Dr Nancy A. Kidula\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116719,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Gatheru Karanja\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116721,\n" +
//"    \"ENTITYNAME\": \"Dr A. I. Aref\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 116725,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Wangombe Githaiga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 120086,\n" +
//"    \"ENTITYNAME\": \"Skye Dental\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 120586,\n" +
//"    \"ENTITYNAME\": \"Maendeleo Chemist Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 120623,\n" +
//"    \"ENTITYNAME\": \"Dr L. P. Were\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 121722,\n" +
//"    \"ENTITYNAME\": \"Dr Nyambura Kariuki\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 121974,\n" +
//"    \"ENTITYNAME\": \"Plaza One Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 122737,\n" +
//"    \"ENTITYNAME\": \"Life Care Hospitals Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 130494,\n" +
//"    \"ENTITYNAME\": \"Dr Fabiano H. Etiang\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 144123,\n" +
//"    \"ENTITYNAME\": \"K K Optics Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 145566,\n" +
//"    \"ENTITYNAME\": \"Ben Ammi Pharmacies Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 145577,\n" +
//"    \"ENTITYNAME\": \"Dr Florence Mukii\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 146267,\n" +
//"    \"ENTITYNAME\": \"Dr Pranav Pancholi  Pancholi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 146480,\n" +
//"    \"ENTITYNAME\": \"Dr Njoki Fernandes\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 146926,\n" +
//"    \"ENTITYNAME\": \"Dr Wanjiku Waria\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 148355,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph C. Mwangi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 148442,\n" +
//"    \"ENTITYNAME\": \"Livewell Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 150317,\n" +
//"    \"ENTITYNAME\": \"Dr Swati Das\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 151876,\n" +
//"    \"ENTITYNAME\": \"Reale Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 152602,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen Okelo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 152954,\n" +
//"    \"ENTITYNAME\": \"Alpine Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153181,\n" +
//"    \"ENTITYNAME\": \"Ms Charity Wairimu Ndung`u\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153183,\n" +
//"    \"ENTITYNAME\": \"Mr Francis Osiemo Maende\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153191,\n" +
//"    \"ENTITYNAME\": \"Mr Samwel Okumbo Nyatunga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153212,\n" +
//"    \"ENTITYNAME\": \"Mr Enock Onyango Nyambane\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153213,\n" +
//"    \"ENTITYNAME\": \"Mr James Mbaabu Mugambi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153214,\n" +
//"    \"ENTITYNAME\": \"Ms Jane Christine Njuguna\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153215,\n" +
//"    \"ENTITYNAME\": \"Mr Jackson K. Mutisya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153216,\n" +
//"    \"ENTITYNAME\": \"Ms Caroline Cherotich\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153217,\n" +
//"    \"ENTITYNAME\": \"Ms Faith Chesang` Ngorett\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153218,\n" +
//"    \"ENTITYNAME\": \"Mr Christopher K. Maundu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153228,\n" +
//"    \"ENTITYNAME\": \"Mr Kevin Oyugi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153319,\n" +
//"    \"ENTITYNAME\": \"Dr N. O. Omolo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153328,\n" +
//"    \"ENTITYNAME\": \"Humming Healthcare Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153566,\n" +
//"    \"ENTITYNAME\": \"Priority Chemists Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153582,\n" +
//"    \"ENTITYNAME\": \"Dental Capital Group  Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153583,\n" +
//"    \"ENTITYNAME\": \"Royal Dental Clinic Kisumu LImited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153628,\n" +
//"    \"ENTITYNAME\": \"Astradental Services Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153880,\n" +
//"    \"ENTITYNAME\": \"Mr Paul Mutunga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153881,\n" +
//"    \"ENTITYNAME\": \"Ms Pauline Njambi Muthoni\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153882,\n" +
//"    \"ENTITYNAME\": \"Ms Theresa Akinyi Muga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153884,\n" +
//"    \"ENTITYNAME\": \"Ms Grace W.  Onkoba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 153885,\n" +
//"    \"ENTITYNAME\": \"Mr Vincent Opiyo Alushula\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 154337,\n" +
//"    \"ENTITYNAME\": \"Nairobi Premier Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 155767,\n" +
//"    \"ENTITYNAME\": \"Dentmind Dental Center Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 155899,\n" +
//"    \"ENTITYNAME\": \"Dr C.B Patel\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 161260,\n" +
//"    \"ENTITYNAME\": \"Dr Martha Kuruga Mwithiga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 161456,\n" +
//"    \"ENTITYNAME\": \"ISLAMIC HOSPITAL GARISSA\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 161458,\n" +
//"    \"ENTITYNAME\": \"Dr Sandeep Acharya\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 162058,\n" +
//"    \"ENTITYNAME\": \"Summit Health Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 162612,\n" +
//"    \"ENTITYNAME\": \"The Periodontist Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 163658,\n" +
//"    \"ENTITYNAME\": \"Dr K. Khushal Singh\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 163697,\n" +
//"    \"ENTITYNAME\": \"Dr Francis Mburu Mwangi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 163698,\n" +
//"    \"ENTITYNAME\": \"Dr Benard Brian Onyango Awuonda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 164251,\n" +
//"    \"ENTITYNAME\": \"Mr Evanson Njoroge Kamuri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 165210,\n" +
//"    \"ENTITYNAME\": \"Dr John Ngigi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 165211,\n" +
//"    \"ENTITYNAME\": \"Dr Polly Okello\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 168360,\n" +
//"    \"ENTITYNAME\": \"Dr Praxy Okutoyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 168446,\n" +
//"    \"ENTITYNAME\": \"Dr Mary Waiyego Kariuki\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 168447,\n" +
//"    \"ENTITYNAME\": \"Ms Winnie Muthoni Kobia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 168450,\n" +
//"    \"ENTITYNAME\": \"Ms Lucy Wairimu Kihara\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 169108,\n" +
//"    \"ENTITYNAME\": \"Dr Joseph Wambugu Wachira\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 169223,\n" +
//"    \"ENTITYNAME\": \"DentalDoc Services Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 170474,\n" +
//"    \"ENTITYNAME\": \"Dr Alfred G. M. L Shiroya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 175874,\n" +
//"    \"ENTITYNAME\": \"Medina Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 175970,\n" +
//"    \"ENTITYNAME\": \"Dr Harun Argwings Otieno\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 176116,\n" +
//"    \"ENTITYNAME\": \"Mr Joseph Ochieng\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 177684,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen M. Mutiso\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 178133,\n" +
//"    \"ENTITYNAME\": \"Dr Martha Kuruga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 180662,\n" +
//"    \"ENTITYNAME\": \"Dr Mushfiqur Rahman Khan\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 181575,\n" +
//"    \"ENTITYNAME\": \"Dr Noah Nganga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 181581,\n" +
//"    \"ENTITYNAME\": \"Mulatya Memorial Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 182072,\n" +
//"    \"ENTITYNAME\": \"Dr Edwin Oduor\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 182088,\n" +
//"    \"ENTITYNAME\": \"Dr Alice Nafula Gumbe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 183162,\n" +
//"    \"ENTITYNAME\": \"Provider Not on Panel\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 183244,\n" +
//"    \"ENTITYNAME\": \"Dr Harbaksh Singh Jandu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 185114,\n" +
//"    \"ENTITYNAME\": \"Dr Fred Chuma Sitati\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 185722,\n" +
//"    \"ENTITYNAME\": \"Dr George Kiguta Nganga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 185945,\n" +
//"    \"ENTITYNAME\": \"Dr David Nguru Ndungu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 185946,\n" +
//"    \"ENTITYNAME\": \"Scion Healthcare Limited-TERMINATED\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 186449,\n" +
//"    \"ENTITYNAME\": \"Dr Betty Susan Owure\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 186594,\n" +
//"    \"ENTITYNAME\": \"Kabarak University\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 189397,\n" +
//"    \"ENTITYNAME\": \"Dr Simon Mucara Kigondu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 189531,\n" +
//"    \"ENTITYNAME\": \"Mr Charles Maina Njuguna\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190109,\n" +
//"    \"ENTITYNAME\": \"Jeddah Nursing Home & Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190115,\n" +
//"    \"ENTITYNAME\": \"Premier Medical Centre- Kikuyu (TERMINATED)\",\n" +
//"    \"Payment'\": \"Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190396,\n" +
//"    \"ENTITYNAME\": \"Prof Gideon Barak Agembo Okelo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190397,\n" +
//"    \"ENTITYNAME\": \"Dr Kikwai Kibet Willey\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190398,\n" +
//"    \"ENTITYNAME\": \"Dr Charles Maina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190399,\n" +
//"    \"ENTITYNAME\": \"Dr Stephen Otieno Gwer\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190440,\n" +
//"    \"ENTITYNAME\": \"Dr Edna K. Gisore\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 190682,\n" +
//"    \"ENTITYNAME\": \"Kileleshwa Medical Plaza\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 191191,\n" +
//"    \"ENTITYNAME\": \"Dr Francis Odira Ouko\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 191193,\n" +
//"    \"ENTITYNAME\": \"Dr Fathiya Abdalla El-Maawy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 192945,\n" +
//"    \"ENTITYNAME\": \"Dr John Ndungu Muiru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 194580,\n" +
//"    \"ENTITYNAME\": \"Dr E. M. Nyenze\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 194604,\n" +
//"    \"ENTITYNAME\": \"Dr Aggrey Mwadulo Marami\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 194633,\n" +
//"    \"ENTITYNAME\": \"WESTLANDS PHYSIOTHERAPY CLINIC LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 194647,\n" +
//"    \"ENTITYNAME\": \"Narok Cottage Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 194901,\n" +
//"    \"ENTITYNAME\": \"Dr Innocent Simeon Orora  Maranga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 195216,\n" +
//"    \"ENTITYNAME\": \"Dr Beatrice Njeri Mbira\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 195221,\n" +
//"    \"ENTITYNAME\": \"Dr Boore John\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 195275,\n" +
//"    \"ENTITYNAME\": \"Hurlingham Family Health Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 195286,\n" +
//"    \"ENTITYNAME\": \"Dr Charles Kipkirui Lelei\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 195637,\n" +
//"    \"ENTITYNAME\": \"Kisumu Smiles Gentle Care\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 195766,\n" +
//"    \"ENTITYNAME\": \"Delight Optics Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 196709,\n" +
//"    \"ENTITYNAME\": \"De Mundo Medical & Chest Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 197183,\n" +
//"    \"ENTITYNAME\": \"Ms Asha Amber Ibrahim\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 197184,\n" +
//"    \"ENTITYNAME\": \"Kenya Airways Base Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 197236,\n" +
//"    \"ENTITYNAME\": \"Ms Grace Wacheke Ndung`u\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 197238,\n" +
//"    \"ENTITYNAME\": \"Mr Samuel Gicheha\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 197311,\n" +
//"    \"ENTITYNAME\": \"Osborne B. Mabalu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 197742,\n" +
//"    \"ENTITYNAME\": \"Excel Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 197744,\n" +
//"    \"ENTITYNAME\": \"Dr Wahome Karanja\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1100669,\n" +
//"    \"ENTITYNAME\": \"Dr Farida Kaittany\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1100670,\n" +
//"    \"ENTITYNAME\": \"Dr Ngugi Gatere\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1101853,\n" +
//"    \"ENTITYNAME\": \"Dr Soren Oliver Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1103420,\n" +
//"    \"ENTITYNAME\": \"Progressive Dental Care Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1105375,\n" +
//"    \"ENTITYNAME\": \"Al-Amin Nursing Home(TERMINATED)\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1121205,\n" +
//"    \"ENTITYNAME\": \"Digestive Health and Endoscopy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1121647,\n" +
//"    \"ENTITYNAME\": \"Dr John Wachira Mwangi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1121700,\n" +
//"    \"ENTITYNAME\": \"Dr James Mumba\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1137311,\n" +
//"    \"ENTITYNAME\": \"Dr Jonathan Wala\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1140504,\n" +
//"    \"ENTITYNAME\": \"Ms Keziah Gichanga\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1141755,\n" +
//"    \"ENTITYNAME\": \"Dr John Otieno Okuto\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1142065,\n" +
//"    \"ENTITYNAME\": \"Dr Jana Macleod\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1144823,\n" +
//"    \"ENTITYNAME\": \"Dr Alan Kisia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1145081,\n" +
//"    \"ENTITYNAME\": \"Africa International University\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1145428,\n" +
//"    \"ENTITYNAME\": \"Prodigy Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1150764,\n" +
//"    \"ENTITYNAME\": \"Africa Inuka Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1151037,\n" +
//"    \"ENTITYNAME\": \"Dr Rose N. Waweru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1151038,\n" +
//"    \"ENTITYNAME\": \"Shiloh Excellent Ophthalmic Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1151039,\n" +
//"    \"ENTITYNAME\": \"Shah Chemists Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1151043,\n" +
//"    \"ENTITYNAME\": \"Ananda Marga Universal Relief Team\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1151492,\n" +
//"    \"ENTITYNAME\": \"Dr Philip Simani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1152011,\n" +
//"    \"ENTITYNAME\": \"Le Grande Pharmacy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1154156,\n" +
//"    \"ENTITYNAME\": \"Kenol Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1154211,\n" +
//"    \"ENTITYNAME\": \"Dr Ali Kolela Montet\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1154578,\n" +
//"    \"ENTITYNAME\": \"Dr Wyckliffe Kaisha Otsianyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1154596,\n" +
//"    \"ENTITYNAME\": \"Africa Heart Associates\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1154598,\n" +
//"    \"ENTITYNAME\": \"Jacaranda Chemist\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1155593,\n" +
//"    \"ENTITYNAME\": \"Maria Immaculata Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1157269,\n" +
//"    \"ENTITYNAME\": \"Isiolo Central Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1157411,\n" +
//"    \"ENTITYNAME\": \"Lexa Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1161032,\n" +
//"    \"ENTITYNAME\": \"Health Source Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1161038,\n" +
//"    \"ENTITYNAME\": \"Royal Medical Clinic & Maternity Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1161938,\n" +
//"    \"ENTITYNAME\": \"Dr Nisha  Sapra\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1161943,\n" +
//"    \"ENTITYNAME\": \"Rhema Physiotherapy & Rehabilitation Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1161944,\n" +
//"    \"ENTITYNAME\": \"Al-Furqan Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1161948,\n" +
//"    \"ENTITYNAME\": \"Dr Francis Ochieng Were\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1162984,\n" +
//"    \"ENTITYNAME\": \"Dr Mumtaz S. Hirani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1162985,\n" +
//"    \"ENTITYNAME\": \"Dr Dorothy M. Mutie\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1162986,\n" +
//"    \"ENTITYNAME\": \"Dr P. W. King`ori\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1163016,\n" +
//"    \"ENTITYNAME\": \"Al-Maqdis Medical & ENT Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1163149,\n" +
//"    \"ENTITYNAME\": \"The Westside Dental Practice\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1163197,\n" +
//"    \"ENTITYNAME\": \"Prof Walter Otieno Mwanda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1163333,\n" +
//"    \"ENTITYNAME\": \"Loima Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1163340,\n" +
//"    \"ENTITYNAME\": \"Oasis Healthcare Group Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1163344,\n" +
//"    \"ENTITYNAME\": \"M-Care Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1163362,\n" +
//"    \"ENTITYNAME\": \"Sports Orthopaedic And Trauma Consultancy Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164006,\n" +
//"    \"ENTITYNAME\": \"Dr William Odidi Kendo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164008,\n" +
//"    \"ENTITYNAME\": \"Mr SAMUEL NYATUGA  OKUMBO\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164101,\n" +
//"    \"ENTITYNAME\": \"Dr E.O Odoyo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164262,\n" +
//"    \"ENTITYNAME\": \"Total Wellness E.A. Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164380,\n" +
//"    \"ENTITYNAME\": \"Prestige Dental Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164806,\n" +
//"    \"ENTITYNAME\": \"Liberty Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164807,\n" +
//"    \"ENTITYNAME\": \"Dr Alfred Mogaka Mokomba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1164808,\n" +
//"    \"ENTITYNAME\": \"Dr Naresh Sarna\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1165511,\n" +
//"    \"ENTITYNAME\": \"Kilimani Physiotherapy Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1165851,\n" +
//"    \"ENTITYNAME\": \"Applegene Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1167513,\n" +
//"    \"ENTITYNAME\": \"Ndonyo Healthcare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1171669,\n" +
//"    \"ENTITYNAME\": \"Dr Maurice Wambani\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1177633,\n" +
//"    \"ENTITYNAME\": \"Dr David Ndonye Musyoka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1184690,\n" +
//"    \"ENTITYNAME\": \"Palmland Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1184783,\n" +
//"    \"ENTITYNAME\": \"Premium Health Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1185021,\n" +
//"    \"ENTITYNAME\": \"Pesi Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1185022,\n" +
//"    \"ENTITYNAME\": \"Taqwa Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1189277,\n" +
//"    \"ENTITYNAME\": \"Ruai Family Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1189438,\n" +
//"    \"ENTITYNAME\": \"Amabo Medical Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190262,\n" +
//"    \"ENTITYNAME\": \"Ms Rukiya Noordin  Imam\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190264,\n" +
//"    \"ENTITYNAME\": \"Dr Mwea  Macharia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190266,\n" +
//"    \"ENTITYNAME\": \"Dr Jane  Machira\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190280,\n" +
//"    \"ENTITYNAME\": \"Dr Oliver Wala\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190318,\n" +
//"    \"ENTITYNAME\": \"Kimathi Street Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190322,\n" +
//"    \"ENTITYNAME\": \"Maasai Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190332,\n" +
//"    \"ENTITYNAME\": \"Dr Lyanda Musima\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190353,\n" +
//"    \"ENTITYNAME\": \"Dr Michael Maru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190411,\n" +
//"    \"ENTITYNAME\": \"Dr R. M.  Wainaina\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190841,\n" +
//"    \"ENTITYNAME\": \"Dr Musa  Kayasi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1190945,\n" +
//"    \"ENTITYNAME\": \"Dr Benson Ndegwa  Waweru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191154,\n" +
//"    \"ENTITYNAME\": \"Tazama Eye Care\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191216,\n" +
//"    \"ENTITYNAME\": \"Maimoon Medical Center\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191539,\n" +
//"    \"ENTITYNAME\": \"Dr Edwin Muinga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191542,\n" +
//"    \"ENTITYNAME\": \"Vitalray medical imaging\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191587,\n" +
//"    \"ENTITYNAME\": \"Dr Hardeep S.  Gill\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191846,\n" +
//"    \"ENTITYNAME\": \"Dr Ben Muthiora\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191878,\n" +
//"    \"ENTITYNAME\": \"Kisumu Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1191998,\n" +
//"    \"ENTITYNAME\": \"BLUECROSS HEALTH CARE CLINIC\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1192073,\n" +
//"    \"ENTITYNAME\": \"Velvet Women And Children Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1192082,\n" +
//"    \"ENTITYNAME\": \"Dr Samson  Misango\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1192093,\n" +
//"    \"ENTITYNAME\": \"Dr Stanley  Murigi Kimuhu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1192737,\n" +
//"    \"ENTITYNAME\": \"Dr Job Masakhue Lukuru Obwaka\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1192785,\n" +
//"    \"ENTITYNAME\": \"Abdallah and Associates Dental & Implant Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1193215,\n" +
//"    \"ENTITYNAME\": \"Family Nursing Home and Maternity\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1193448,\n" +
//"    \"ENTITYNAME\": \"New Kilifi Wananchi Maternity & Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1193939,\n" +
//"    \"ENTITYNAME\": \"Mayfair Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194045,\n" +
//"    \"ENTITYNAME\": \"Mr Peter Ndungu Nderitu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194047,\n" +
//"    \"ENTITYNAME\": \"Ms Sarah Muchiti\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194049,\n" +
//"    \"ENTITYNAME\": \"Ms Julie Nyamao  Nyanchama\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194050,\n" +
//"    \"ENTITYNAME\": \"Mr Edgar Baraza\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194423,\n" +
//"    \"ENTITYNAME\": \"Lupe Medical & Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194467,\n" +
//"    \"ENTITYNAME\": \"Garsen Nursing Home & Pharmacy\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194582,\n" +
//"    \"ENTITYNAME\": \"Huruma Medical Clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194676,\n" +
//"    \"ENTITYNAME\": \"Gentle Dental Care Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194747,\n" +
//"    \"ENTITYNAME\": \"Dr. Musima & Associates\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194791,\n" +
//"    \"ENTITYNAME\": \"Dr Anne  Irungu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194909,\n" +
//"    \"ENTITYNAME\": \"Dr Ezekiel  Oburu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194910,\n" +
//"    \"ENTITYNAME\": \"Dr Anjumanara  Omar\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194912,\n" +
//"    \"ENTITYNAME\": \"Dr Nabil  Chaudhry\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1194913,\n" +
//"    \"ENTITYNAME\": \"Dr Ahmed R.  Parkar\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1195051,\n" +
//"    \"ENTITYNAME\": \"Dr Grace Akech Ochieng\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1197099,\n" +
//"    \"ENTITYNAME\": \"St.Raphael Archangel Health Centre Emmaus\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1199139,\n" +
//"    \"ENTITYNAME\": \"Dr Assad Mughal\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1199140,\n" +
//"    \"ENTITYNAME\": \"Dr Nicholas  Gichu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1199141,\n" +
//"    \"ENTITYNAME\": \"Dr Newton Wangwe Khaemba\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1199499,\n" +
//"    \"ENTITYNAME\": \"Savani Medical Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1199640,\n" +
//"    \"ENTITYNAME\": \"Lodwar Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1199819,\n" +
//"    \"ENTITYNAME\": \"Celestial Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1199945,\n" +
//"    \"ENTITYNAME\": \"Bomer Nutrition\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1200154,\n" +
//"    \"ENTITYNAME\": \"St. Patrick HealthCare Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1200971,\n" +
//"    \"ENTITYNAME\": \"Dr Mohamed  Hussein Jin\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1200997,\n" +
//"    \"ENTITYNAME\": \"Dr N. D. Mwasaru\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1201010,\n" +
//"    \"ENTITYNAME\": \"Dr Tobias Otieno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1201135,\n" +
//"    \"ENTITYNAME\": \"Dr M.O.G Owiti\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1201137,\n" +
//"    \"ENTITYNAME\": \"Texas Cancer Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1201138,\n" +
//"    \"ENTITYNAME\": \"Dr M.G. Ngugi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1201140,\n" +
//"    \"ENTITYNAME\": \"Dr David Misango\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1206394,\n" +
//"    \"ENTITYNAME\": \"Kericho Outpatient Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1206530,\n" +
//"    \"ENTITYNAME\": \"Dr Swaleh Breik Misfir Al Amry\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1206971,\n" +
//"    \"ENTITYNAME\": \"Tahidi Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207035,\n" +
//"    \"ENTITYNAME\": \"Dr Patrick Ng`ang`a  Mburu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207036,\n" +
//"    \"ENTITYNAME\": \"Dr Julius Githinji  Mungai\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207217,\n" +
//"    \"ENTITYNAME\": \"Mikindani Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207221,\n" +
//"    \"ENTITYNAME\": \"The Nairobi Womens Hospital Ongata Rongai\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207343,\n" +
//"    \"ENTITYNAME\": \"Shepherds Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207347,\n" +
//"    \"ENTITYNAME\": \"Dr Rashmi Kumar\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207356,\n" +
//"    \"ENTITYNAME\": \"Dr JOHNBOSCO HAMAD ILKUL\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207358,\n" +
//"    \"ENTITYNAME\": \"Ms FAITH ACHIENG  JAKOGOLA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207499,\n" +
//"    \"ENTITYNAME\": \"Nomad Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1207500,\n" +
//"    \"ENTITYNAME\": \"Elephant Dental Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1208980,\n" +
//"    \"ENTITYNAME\": \"Doveypharma Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1208982,\n" +
//"    \"ENTITYNAME\": \"Precious Life Healthcare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1208990,\n" +
//"    \"ENTITYNAME\": \"Dr Risa Ole Kurrarrru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1209023,\n" +
//"    \"ENTITYNAME\": \"MALINDI WOMENS CLINIC\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1209069,\n" +
//"    \"ENTITYNAME\": \"Dr Joyce Mbogo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1211077,\n" +
//"    \"ENTITYNAME\": \"African Wellness International Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1212207,\n" +
//"    \"ENTITYNAME\": \"Dr Susan Wanjiku Maina\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1212264,\n" +
//"    \"ENTITYNAME\": \"Dr Swaley Breik Misfar Al-Amry\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1212541,\n" +
//"    \"ENTITYNAME\": \"Histocyte Consultant Pathologists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1215062,\n" +
//"    \"ENTITYNAME\": \"Ladnan Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1215196,\n" +
//"    \"ENTITYNAME\": \"The Capitol Physiotherapy And Wellness Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1215931,\n" +
//"    \"ENTITYNAME\": \"St. Leonards Hospital Ltd Kericho Nyagacho\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1220933,\n" +
//"    \"ENTITYNAME\": \"Dr Priscilla Monyangi Nyakundi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1224137,\n" +
//"    \"ENTITYNAME\": \"Hillview Medical & Diagnostic Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1224139,\n" +
//"    \"ENTITYNAME\": \"Dr Elizabeth Kimotho\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1224332,\n" +
//"    \"ENTITYNAME\": \"Naivasha Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1224449,\n" +
//"    \"ENTITYNAME\": \"Dr B. Wachira Maina\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1225528,\n" +
//"    \"ENTITYNAME\": \"Coast Neurology Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1225529,\n" +
//"    \"ENTITYNAME\": \"Dr Gakuo Karuga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1225564,\n" +
//"    \"ENTITYNAME\": \"Lamfa Dental Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1225777,\n" +
//"    \"ENTITYNAME\": \"Dr Loice Achieng Ombajo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1245071,\n" +
//"    \"ENTITYNAME\": \"Mr Evans Sanya Wagabi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1245656,\n" +
//"    \"ENTITYNAME\": \"Dr James Boniface Mwika\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1245697,\n" +
//"    \"ENTITYNAME\": \"Ubora Clinics Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1245763,\n" +
//"    \"ENTITYNAME\": \"Interhealth East Africa Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1245868,\n" +
//"    \"ENTITYNAME\": \"Lavington Dental Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1246301,\n" +
//"    \"ENTITYNAME\": \"Dr Rajpreet Bal\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1246332,\n" +
//"    \"ENTITYNAME\": \"Dr Francis Omondi Wango\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1248410,\n" +
//"    \"ENTITYNAME\": \"Ms Catherine Matoke  Nyandieka\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1249272,\n" +
//"    \"ENTITYNAME\": \"Dr Kenedy Ondede\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1256093,\n" +
//"    \"ENTITYNAME\": \"Dr Dharminder Singh  Walia\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1258136,\n" +
//"    \"ENTITYNAME\": \"The Mediance Hospital Ltd\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1268049,\n" +
//"    \"ENTITYNAME\": \"Matungulu Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1276090,\n" +
//"    \"ENTITYNAME\": \"Pyramid International Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1276396,\n" +
//"    \"ENTITYNAME\": \"Kenya Airways Chq. Not To be Printed\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1281840,\n" +
//"    \"ENTITYNAME\": \"Dental Smile for Kids Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1294151,\n" +
//"    \"ENTITYNAME\": \"Grams Healthcare Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1294156,\n" +
//"    \"ENTITYNAME\": \"Rachar Sugarbelt Nursing Home\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1294169,\n" +
//"    \"ENTITYNAME\": \"Rangala Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295092,\n" +
//"    \"ENTITYNAME\": \"The Nairobi Womens Hospital Adams\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295094,\n" +
//"    \"ENTITYNAME\": \"The Nairobi Womens Hospital Kitengela\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295118,\n" +
//"    \"ENTITYNAME\": \"The Nairobi Womens Hospital Nakuru\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295503,\n" +
//"    \"ENTITYNAME\": \"Dr Maureen  Owiti\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295584,\n" +
//"    \"ENTITYNAME\": \"Ms Christine Munyao\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295609,\n" +
//"    \"ENTITYNAME\": \"Neema Optician Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295615,\n" +
//"    \"ENTITYNAME\": \"Karatina Maternity and Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295616,\n" +
//"    \"ENTITYNAME\": \"Consolata Hospital Nkubu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295622,\n" +
//"    \"ENTITYNAME\": \"Eye and U Ophthalmic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295623,\n" +
//"    \"ENTITYNAME\": \"Pope John Paul II Huruma Health Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295629,\n" +
//"    \"ENTITYNAME\": \"Dr Ezekiel Patrick Maina Machira\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295632,\n" +
//"    \"ENTITYNAME\": \"Dr Everisto Anindo Opondo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295725,\n" +
//"    \"ENTITYNAME\": \"Dr Jacqueline Wasonga Kitulu\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295839,\n" +
//"    \"ENTITYNAME\": \"Dr Peter M. Michoma\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295862,\n" +
//"    \"ENTITYNAME\": \"Catholic Mission North Horr\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1295875,\n" +
//"    \"ENTITYNAME\": \"Innovation Eye Centre Kisii\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296333,\n" +
//"    \"ENTITYNAME\": \"AL BILAL NURSING HOME-MOYALE\",\n" +
//"    \"Payment'\": \"Bank Draft\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296494,\n" +
//"    \"ENTITYNAME\": \"AL ABRAR NURSING HOME\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296504,\n" +
//"    \"ENTITYNAME\": \"GoodHope Nyahururu Nursing Home Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296507,\n" +
//"    \"ENTITYNAME\": \"Dr Edna Wairimu Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296516,\n" +
//"    \"ENTITYNAME\": \"Bungoma West Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296819,\n" +
//"    \"ENTITYNAME\": \"Sabtia Eye Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296828,\n" +
//"    \"ENTITYNAME\": \"West Kenya Diagnostic & Imaging Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296830,\n" +
//"    \"ENTITYNAME\": \"Queens and Kings Health Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1296833,\n" +
//"    \"ENTITYNAME\": \"Tionybei Chemist Diagnostic Lab And Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1297831,\n" +
//"    \"ENTITYNAME\": \"Dr Ajay V. Patel\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1298445,\n" +
//"    \"ENTITYNAME\": \"Mercy Mission Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1299565,\n" +
//"    \"ENTITYNAME\": \"Ray of Hope\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1299636,\n" +
//"    \"ENTITYNAME\": \"Visiting Angels Nursing Agency Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1299882,\n" +
//"    \"ENTITYNAME\": \"Reimbursement 80% OP\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1301234,\n" +
//"    \"ENTITYNAME\": \"Mr BONIFACE KANYUGO KAGUMBA\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1301614,\n" +
//"    \"ENTITYNAME\": \"Elwak Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1301616,\n" +
//"    \"ENTITYNAME\": \"Southgate Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1301618,\n" +
//"    \"ENTITYNAME\": \"Camel Medical Center\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1301629,\n" +
//"    \"ENTITYNAME\": \"Smartsmile Dental Care Clinics (K)\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1301644,\n" +
//"    \"ENTITYNAME\": \"Medi-Hub Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1301762,\n" +
//"    \"ENTITYNAME\": \"Deep White Dental Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1302043,\n" +
//"    \"ENTITYNAME\": \"FutureAge Medical Services\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1302044,\n" +
//"    \"ENTITYNAME\": \"Penda Health Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1302045,\n" +
//"    \"ENTITYNAME\": \"Reinha Rosary Mission Health Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1302694,\n" +
//"    \"ENTITYNAME\": \"Focus Clinical and Diagnostic Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1303020,\n" +
//"    \"ENTITYNAME\": \"Total Wellness International Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1303026,\n" +
//"    \"ENTITYNAME\": \"Talana Specialist Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1303027,\n" +
//"    \"ENTITYNAME\": \"Oltau Heart Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1304898,\n" +
//"    \"ENTITYNAME\": \"International Optica\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1304931,\n" +
//"    \"ENTITYNAME\": \"Focus Clinical and Diagnostic Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1305405,\n" +
//"    \"ENTITYNAME\": \"Mrs Angeline Ayieko\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1305420,\n" +
//"    \"ENTITYNAME\": \"Mr Dennis Mbisi Ndolo\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1305425,\n" +
//"    \"ENTITYNAME\": \"Mr Tom  Michira Nyakaba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1306166,\n" +
//"    \"ENTITYNAME\": \"Ladopharma Medical Centre Ltd.\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1306363,\n" +
//"    \"ENTITYNAME\": \"Gentle Care Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1306364,\n" +
//"    \"ENTITYNAME\": \"Supreme Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1307270,\n" +
//"    \"ENTITYNAME\": \"TreatGlobal International Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1307672,\n" +
//"    \"ENTITYNAME\": \"The Karen Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1307691,\n" +
//"    \"ENTITYNAME\": \"Ivory Health Solutions Limited ( Do not use)\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1309659,\n" +
//"    \"ENTITYNAME\": \"Dr Bakari Suleiman\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1312284,\n" +
//"    \"ENTITYNAME\": \"Samia Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1312406,\n" +
//"    \"ENTITYNAME\": \"Precise Diagnostic Imaging Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1312592,\n" +
//"    \"ENTITYNAME\": \"Kakamega Central Maternity and Nursing Home Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1312595,\n" +
//"    \"ENTITYNAME\": \"Mathingira Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1312596,\n" +
//"    \"ENTITYNAME\": \"Tana Point Chemist\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1313388,\n" +
//"    \"ENTITYNAME\": \"Isiolo County Medical Services Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1313946,\n" +
//"    \"ENTITYNAME\": \"Dr Thomas Maingi\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1313947,\n" +
//"    \"ENTITYNAME\": \"Orthopedic and Trauma Institute Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1315813,\n" +
//"    \"ENTITYNAME\": \"SVG Healthcare Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1316607,\n" +
//"    \"ENTITYNAME\": \"Kericho Medical Clinic Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1318755,\n" +
//"    \"ENTITYNAME\": \"Dr L.N Wagana\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1319856,\n" +
//"    \"ENTITYNAME\": \"Fig-Tree Dental Options\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1320875,\n" +
//"    \"ENTITYNAME\": \"Racecourse Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1321215,\n" +
//"    \"ENTITYNAME\": \"Royal Smiles Dental Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1321222,\n" +
//"    \"ENTITYNAME\": \"Haltons Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1321731,\n" +
//"    \"ENTITYNAME\": \"The Nairobi Bone and Joint Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1321732,\n" +
//"    \"ENTITYNAME\": \"Galaxy Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1321760,\n" +
//"    \"ENTITYNAME\": \"Health Pact Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1321767,\n" +
//"    \"ENTITYNAME\": \"Dr Julius Nakitari\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1323268,\n" +
//"    \"ENTITYNAME\": \"Eldo Eye Center\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1327562,\n" +
//"    \"ENTITYNAME\": \"Kenya Airways Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1327567,\n" +
//"    \"ENTITYNAME\": \"Upendo Dermatology Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1327766,\n" +
//"    \"ENTITYNAME\": \"Dr Isaac Mwangi Macharia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1328026,\n" +
//"    \"ENTITYNAME\": \"Legacy Dental Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1330815,\n" +
//"    \"ENTITYNAME\": \"Avane Limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1331637,\n" +
//"    \"ENTITYNAME\": \"South C Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1331639,\n" +
//"    \"ENTITYNAME\": \"Sayyida Fatimah Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1332363,\n" +
//"    \"ENTITYNAME\": \"Isiolo Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1332492,\n" +
//"    \"ENTITYNAME\": \"Josma Health Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1333004,\n" +
//"    \"ENTITYNAME\": \"Kory Family Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1333441,\n" +
//"    \"ENTITYNAME\": \"Health Care Global Enterprises Ltd (HCG)\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1333603,\n" +
//"    \"ENTITYNAME\": \"Dr J.M. Maimba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1333909,\n" +
//"    \"ENTITYNAME\": \"Sabatia Eye Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1336815,\n" +
//"    \"ENTITYNAME\": \"Densmile Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1341435,\n" +
//"    \"ENTITYNAME\": \"Mashaallah Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1341445,\n" +
//"    \"ENTITYNAME\": \"Migori Health Station\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1341452,\n" +
//"    \"ENTITYNAME\": \"Dental Art Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1342411,\n" +
//"    \"ENTITYNAME\": \"Meridian Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1342413,\n" +
//"    \"ENTITYNAME\": \"Laserstone & Endoscopy Centre\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1342561,\n" +
//"    \"ENTITYNAME\": \"Scanlab Kitengela Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1342988,\n" +
//"    \"ENTITYNAME\": \"Kilifi Dental Center\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1343739,\n" +
//"    \"ENTITYNAME\": \"Suva Health Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1343891,\n" +
//"    \"ENTITYNAME\": \"Pathos Pathologists\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1344075,\n" +
//"    \"ENTITYNAME\": \"Coptic Hospital Maseno\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1344120,\n" +
//"    \"ENTITYNAME\": \"Slopes Opticals Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1345775,\n" +
//"    \"ENTITYNAME\": \"Taveta Meditech Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1345776,\n" +
//"    \"ENTITYNAME\": \"Imara Mediplus Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1345777,\n" +
//"    \"ENTITYNAME\": \"Kapsabet Healthcare Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1345785,\n" +
//"    \"ENTITYNAME\": \"Burhani Pharmacy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1345788,\n" +
//"    \"ENTITYNAME\": \"B & L Healthcare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1346011,\n" +
//"    \"ENTITYNAME\": \"Meswo Medical Service\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1346012,\n" +
//"    \"ENTITYNAME\": \"Medipoint Pharmaceuticals limited\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1346946,\n" +
//"    \"ENTITYNAME\": \"Mrs Lucy Mueni Muli\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1347693,\n" +
//"    \"ENTITYNAME\": \"Mephibosheth Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1355412,\n" +
//"    \"ENTITYNAME\": \"Nairobi Spine & Orthopaedic Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1358552,\n" +
//"    \"ENTITYNAME\": \"Eastend Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1359617,\n" +
//"    \"ENTITYNAME\": \"Sky Health Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1359626,\n" +
//"    \"ENTITYNAME\": \"Dr Nalinkumar Vakil\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1359628,\n" +
//"    \"ENTITYNAME\": \"Lemacate Global Dental Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1361392,\n" +
//"    \"ENTITYNAME\": \"Consolidated Diagnostic Imaging Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1361692,\n" +
//"    \"ENTITYNAME\": \"M DOC Healthcare Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1361698,\n" +
//"    \"ENTITYNAME\": \"Mrs Gloria Nelima Toywa\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1361702,\n" +
//"    \"ENTITYNAME\": \"Mr Edwin Munene Mbae\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1361727,\n" +
//"    \"ENTITYNAME\": \"St Joseph`s Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1362991,\n" +
//"    \"ENTITYNAME\": \"Kenya Bureau Of Standards-Staff clinic\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1364743,\n" +
//"    \"ENTITYNAME\": \"The Guardian Pharmaceutical Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1367524,\n" +
//"    \"ENTITYNAME\": \"Appex Hospital - Malaba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1367561,\n" +
//"    \"ENTITYNAME\": \"Afya International Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368251,\n" +
//"    \"ENTITYNAME\": \"Rafiki Optician\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368802,\n" +
//"    \"ENTITYNAME\": \"Mutomo Mission Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368822,\n" +
//"    \"ENTITYNAME\": \"Advanced Care Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368918,\n" +
//"    \"ENTITYNAME\": \"Dr Paul Laigong\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368919,\n" +
//"    \"ENTITYNAME\": \"Mrs Josephine Akinyi  Oduor\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368920,\n" +
//"    \"ENTITYNAME\": \"Mr Willy Kibet Korir\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368952,\n" +
//"    \"ENTITYNAME\": \"Optimum Current Health Care Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1368956,\n" +
//"    \"ENTITYNAME\": \"Echo Care Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1370368,\n" +
//"    \"ENTITYNAME\": \"EMESC Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1370405,\n" +
//"    \"ENTITYNAME\": \"GRACE MEMORIAL HOSPITAL LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1370408,\n" +
//"    \"ENTITYNAME\": \"Kilimani Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1370419,\n" +
//"    \"ENTITYNAME\": \"St. James Opticals\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1370700,\n" +
//"    \"ENTITYNAME\": \"Mica Pharmaceuticals Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1371389,\n" +
//"    \"ENTITYNAME\": \"Dr Henry Nyawanda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1371928,\n" +
//"    \"ENTITYNAME\": \"Metropolitan Chemists Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1373004,\n" +
//"    \"ENTITYNAME\": \"CLAIMS PAID\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1374039,\n" +
//"    \"ENTITYNAME\": \"Mrs Scolasticah Wairimu Muita\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1374141,\n" +
//"    \"ENTITYNAME\": \"Ramogi Chemists Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1374144,\n" +
//"    \"ENTITYNAME\": \"Eldoret Dental Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1374718,\n" +
//"    \"ENTITYNAME\": \"Ultimate Medical Care Services Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1374721,\n" +
//"    \"ENTITYNAME\": \"Garden Specialist Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1374897,\n" +
//"    \"ENTITYNAME\": \"Lodwar Afya Bora Medical Clinic & Laboratory Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1378115,\n" +
//"    \"ENTITYNAME\": \"The River Jordan Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1378118,\n" +
//"    \"ENTITYNAME\": \"Dr Maureen Janet Owiti\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1378124,\n" +
//"    \"ENTITYNAME\": \"Dr Kennedy Jerry  Koech\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1378131,\n" +
//"    \"ENTITYNAME\": \"Sinus Medical Center\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1378211,\n" +
//"    \"ENTITYNAME\": \"Meditour India\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1378255,\n" +
//"    \"ENTITYNAME\": \"Dr Medhat Mohamed Amin\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1380320,\n" +
//"    \"ENTITYNAME\": \"Galaxy Medicare Consultants Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1381489,\n" +
//"    \"ENTITYNAME\": \"The Mandera Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1382089,\n" +
//"    \"ENTITYNAME\": \"Crystalens Optics Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1382097,\n" +
//"    \"ENTITYNAME\": \"Sr Zipporah Onkoba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1382522,\n" +
//"    \"ENTITYNAME\": \"Meditour India\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1382789,\n" +
//"    \"ENTITYNAME\": \"Busia County Referral Hospital\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1383640,\n" +
//"    \"ENTITYNAME\": \"St Pauls Hospital Kitengela\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1385406,\n" +
//"    \"ENTITYNAME\": \"Eldoret Paediatric Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1386185,\n" +
//"    \"ENTITYNAME\": \"Outsourced Medicare\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1386200,\n" +
//"    \"ENTITYNAME\": \"Eye Friends Care\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1386235,\n" +
//"    \"ENTITYNAME\": \"Ms Zettyline  Naliaka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1386237,\n" +
//"    \"ENTITYNAME\": \"Mr Cedric Isalikho Lusimba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1386252,\n" +
//"    \"ENTITYNAME\": \"Swift Care Medics\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1388352,\n" +
//"    \"ENTITYNAME\": \"Welcare Diagnostic Centre Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1388354,\n" +
//"    \"ENTITYNAME\": \"Dr Samuel Sanduku Otido\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1388468,\n" +
//"    \"ENTITYNAME\": \"Complete Care Dental Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1389707,\n" +
//"    \"ENTITYNAME\": \"Hope Ear Nose and Throat Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1389943,\n" +
//"    \"ENTITYNAME\": \"Kids Arthritis Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1390364,\n" +
//"    \"ENTITYNAME\": \"Sunshine Medical Diagnostic Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1391968,\n" +
//"    \"ENTITYNAME\": \"Dr Martin Namuya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1392024,\n" +
//"    \"ENTITYNAME\": \"Dr Boniface Macira Warutere\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1392033,\n" +
//"    \"ENTITYNAME\": \"Isiolo Medical Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1392036,\n" +
//"    \"ENTITYNAME\": \"Lenmek Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1392046,\n" +
//"    \"ENTITYNAME\": \"Avi Matercare Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1392170,\n" +
//"    \"ENTITYNAME\": \"Dr Irene Ndoti Makite\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1394407,\n" +
//"    \"ENTITYNAME\": \"Mr JAMES KIGURU NJUGUNA\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1395330,\n" +
//"    \"ENTITYNAME\": \"Dr Michael Stephen Ojuma\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 1409321,\n" +
//"    \"ENTITYNAME\": \"The Virgin Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11428791,\n" +
//"    \"ENTITYNAME\": \"Mediwell Healthcare Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11430101,\n" +
//"    \"ENTITYNAME\": \"Dr Dennis Manguti Nyantabiga\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11432046,\n" +
//"    \"ENTITYNAME\": \"Ms Barbara Syombua Mutuku\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11432101,\n" +
//"    \"ENTITYNAME\": \"AIC Lokichogio Health Centre\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11434617,\n" +
//"    \"ENTITYNAME\": \"Ms Doreen  Mwenda\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11434754,\n" +
//"    \"ENTITYNAME\": \"Footsteps To Fertility Centre Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11441766,\n" +
//"    \"ENTITYNAME\": \"Highridge Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11441771,\n" +
//"    \"ENTITYNAME\": \"Eldochem Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11444778,\n" +
//"    \"ENTITYNAME\": \"Dr Juliana Muiva Gitobu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11448415,\n" +
//"    \"ENTITYNAME\": \"Mr Daniel Wafula Osikenya\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11448427,\n" +
//"    \"ENTITYNAME\": \"Miss Diana Wambui  Githitho\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11448658,\n" +
//"    \"ENTITYNAME\": \"Miss Lucy Wambui\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11448663,\n" +
//"    \"ENTITYNAME\": \"Miss Victoria Wanjiru Gikaara\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11451303,\n" +
//"    \"ENTITYNAME\": \"Ms Racheal Wanjiru Marigi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11451310,\n" +
//"    \"ENTITYNAME\": \"Mr Peter Mwangi Kamau\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11455229,\n" +
//"    \"ENTITYNAME\": \"Dr Caroline Clara Wambui Ndarathi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11459218,\n" +
//"    \"ENTITYNAME\": \"Miss Mary Wanjiru Muiruri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11459221,\n" +
//"    \"ENTITYNAME\": \"Miss Gladys Wangare  Njiriri\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11459222,\n" +
//"    \"ENTITYNAME\": \"Mr Dennis Ngao Mbithi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11459684,\n" +
//"    \"ENTITYNAME\": \"Reimbursement 100%\",\n" +
//"    \"Payment'\": \"CITI Bank Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11466876,\n" +
//"    \"ENTITYNAME\": \"Meru Jordan Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11466900,\n" +
//"    \"ENTITYNAME\": \"Mr Timothy Mutuma\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11485269,\n" +
//"    \"ENTITYNAME\": \"Dr Joyce Agola Owino\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11485273,\n" +
//"    \"ENTITYNAME\": \"Ms Charity Wangechi Gaitho\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11485285,\n" +
//"    \"ENTITYNAME\": \"Mr Martin Bundi Miriti\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11485317,\n" +
//"    \"ENTITYNAME\": \"Wajir Maternity and Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11494451,\n" +
//"    \"ENTITYNAME\": \"Mr Stephen Wambua John\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11542210,\n" +
//"    \"ENTITYNAME\": \"Reimbursement 90%\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11544956,\n" +
//"    \"ENTITYNAME\": \"Pinnacle Home  Health Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11558685,\n" +
//"    \"ENTITYNAME\": \"Mr Richard Kimenye Muthoka\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11558698,\n" +
//"    \"ENTITYNAME\": \"Ms Ann Mumbua Maweu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11558701,\n" +
//"    \"ENTITYNAME\": \"Mr Stephen Wambua John\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11560299,\n" +
//"    \"ENTITYNAME\": \"Dr John Kisiangani Welime\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11568618,\n" +
//"    \"ENTITYNAME\": \"Liaison Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11572791,\n" +
//"    \"ENTITYNAME\": \"Dr Kinoti Ndege\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11572818,\n" +
//"    \"ENTITYNAME\": \"Dr James Cheruiyot Bett\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11580317,\n" +
//"    \"ENTITYNAME\": \"Alexandria Cancer Centre & Palliative Care Hospital Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11580407,\n" +
//"    \"ENTITYNAME\": \"Dr Fred Oyombe Akonde\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11580639,\n" +
//"    \"ENTITYNAME\": \"Cretum International Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11582981,\n" +
//"    \"ENTITYNAME\": \"Dr Claire Amume Majisu\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11582982,\n" +
//"    \"ENTITYNAME\": \"The AbilityTherapy Place Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11596192,\n" +
//"    \"ENTITYNAME\": \"Equra Health Kenya Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11612901,\n" +
//"    \"ENTITYNAME\": \"Ms Alice Nyaboke Momanyi\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11631036,\n" +
//"    \"ENTITYNAME\": \"Mac Dental Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11633332,\n" +
//"    \"ENTITYNAME\": \"The Galilee Medical Center Milimani Kitale Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11633543,\n" +
//"    \"ENTITYNAME\": \"Premier Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11635237,\n" +
//"    \"ENTITYNAME\": \"Medi-Gate Diagnostic Centre Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11636335,\n" +
//"    \"ENTITYNAME\": \"Talent Medical Services Marsabit Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11637388,\n" +
//"    \"ENTITYNAME\": \"Kenya Association Of Professional Counsellors\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11640409,\n" +
//"    \"ENTITYNAME\": \"FINE TOUCH DENTAL CARE\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11645062,\n" +
//"    \"ENTITYNAME\": \"METROPOLIS STAR LAB KENYA LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11650236,\n" +
//"    \"ENTITYNAME\": \"Dr David Kamau Chewe\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11651519,\n" +
//"    \"ENTITYNAME\": \"Aga Khan – Jamati Scheme\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11651538,\n" +
//"    \"ENTITYNAME\": \"Neotech Kenya Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11652373,\n" +
//"    \"ENTITYNAME\": \"EQUITY AFIA LTD\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11653218,\n" +
//"    \"ENTITYNAME\": \"Jubilee Regional Claims\",\n" +
//"    \"Payment'\": \"Cheque\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11653324,\n" +
//"    \"ENTITYNAME\": \"Orthopaedic and Back Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11663895,\n" +
//"    \"ENTITYNAME\": \"Columbia Africa Healthcare Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11666482,\n" +
//"    \"ENTITYNAME\": \"Bliss GVS Healthcare Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11700530,\n" +
//"    \"ENTITYNAME\": \"Dr Esther Mutakha Kanini\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11700749,\n" +
//"    \"ENTITYNAME\": \"Dr Kelvin Mbugua Kinuthia\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11701556,\n" +
//"    \"ENTITYNAME\": \"Dr Andrew Oluoch Odhiambo\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11712830,\n" +
//"    \"ENTITYNAME\": \"Miss Catherine Wangui Mwarari\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11713432,\n" +
//"    \"ENTITYNAME\": \"Galaxy Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11714326,\n" +
//"    \"ENTITYNAME\": \"MXRX One Stop Pharmacy Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11714520,\n" +
//"    \"ENTITYNAME\": \"Quest Laboratories Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11714538,\n" +
//"    \"ENTITYNAME\": \"Dr Elizabeth  Khaemba\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11714542,\n" +
//"    \"ENTITYNAME\": \"Dr Charles Woiye\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11714833,\n" +
//"    \"ENTITYNAME\": \"Caremax Health Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11714834,\n" +
//"    \"ENTITYNAME\": \"One Health Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11721740,\n" +
//"    \"ENTITYNAME\": \"AFRICANA MALL HEALTH CARE LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11721967,\n" +
//"    \"ENTITYNAME\": \"Kilimani Children`s Clinic Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11771263,\n" +
//"    \"ENTITYNAME\": \"Siha Medical Home Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11771320,\n" +
//"    \"ENTITYNAME\": \"Marsabit Jamia Medical Services\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11774750,\n" +
//"    \"ENTITYNAME\": \"Ivory Health Solutions Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11802775,\n" +
//"    \"ENTITYNAME\": \"Medicatia Hospital Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11811094,\n" +
//"    \"ENTITYNAME\": \"Checkups Medical Centre Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11816150,\n" +
//"    \"ENTITYNAME\": \"Strathmore University Medical Clinic\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11819475,\n" +
//"    \"ENTITYNAME\": \"Blossom Out Consultants Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": \"\",\n" +
//"    \"ENTITYNAME\": \"\",\n" +
//"    \"Payment'\": \"\",\n" +
//"    \"WHT Registered Country'\": \"\"\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11839568,\n" +
//"    \"ENTITYNAME\": \"Surgipharm Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11864141,\n" +
//"    \"ENTITYNAME\": \"Glaxosmithkline\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11864758,\n" +
//"    \"ENTITYNAME\": \"FAMILY MEDICAL CENTRE\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11888236,\n" +
//"    \"ENTITYNAME\": \"Premiercare Diagnostics Narok Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11890219,\n" +
//"    \"ENTITYNAME\": \"Grace Park Medical Centre Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11893969,\n" +
//"    \"ENTITYNAME\": \"Crystal Health Consultants\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11923727,\n" +
//"    \"ENTITYNAME\": \"Lewa wildlife conservancy\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11932170,\n" +
//"    \"ENTITYNAME\": \"Muntasir Nursing Home\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11934623,\n" +
//"    \"ENTITYNAME\": \"Mephi Health Services Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11937102,\n" +
//"    \"ENTITYNAME\": \"Sasahealth Limited\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11941553,\n" +
//"    \"ENTITYNAME\": \"Healthmark Care Ltd\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11941566,\n" +
//"    \"ENTITYNAME\": \"Lodwar Hills Hospital\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11959201,\n" +
//"    \"ENTITYNAME\": \"ASAD MEDICAL CENTRE\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11959203,\n" +
//"    \"ENTITYNAME\": \"SHAMAAL HOSPITAL LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11959300,\n" +
//"    \"ENTITYNAME\": \"ELWAK COTTAGE NURSING HOME\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11959301,\n" +
//"    \"ENTITYNAME\": \"BULLA MPYA NURSING HOME\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11970888,\n" +
//"    \"ENTITYNAME\": \"OASIS MEDICAL CENTRE\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11971708,\n" +
//"    \"ENTITYNAME\": \"THE PINE HOSPITAL LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11974031,\n" +
//"    \"ENTITYNAME\": \"POPE BENEDICT XVI HOSPITAL\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11975662,\n" +
//"    \"ENTITYNAME\": \"THE NAKURU SPECIALIST HOSPITAL LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11976045,\n" +
//"    \"ENTITYNAME\": \"SOUTH LAKE MEDICAL CENTRE LIMITED\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 11977787,\n" +
//"    \"ENTITYNAME\": \"Dr Peter David Griffiths\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12009929,\n" +
//"    \"ENTITYNAME\": \"HALISI FAMILY HOSPITAL\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  },\n" +
//"  {\n" +
//"    \"ENTITYID\": 12015942,\n" +
//"    \"ENTITYNAME\": \"MEDISCOPES HEALTH CO LTD\",\n" +
//"    \"Payment'\": \"CITI Bank Transfer\",\n" +
//"    \"WHT Registered Country'\": 16\n" +
//"  }\n" +
//"]";
//      String jsonString = paymentMethof ;//"{\"Id\":101, \"name\":\"Raja Ramesh\", \"address\":\"Madhapur\"}";
//      ObjectMapper mapper = new ObjectMapper();
//      ObjectNode node = mapper.readValue(jsonString, ObjectNode.class);
//      if(node.has("ENTITYID")) {
//         System.out.println("NAME: " + node.get("name"));
//      }
//   }
//}
//
//
//
//
//
//
//
//
