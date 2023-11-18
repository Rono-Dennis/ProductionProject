// /**
//  * https://javapointers.com/tutorial/difference-between-spy-and-mock-in-mockito/
//  * When shoud you use mock or spy? If you want to be safe and avoid calling external services 
//  * and just want to test the logic inside of the unit, then use mock. If you want to call external service 
//  * and perform calling of real dependency, or simply say, you want to run the program as it is and just stub specific methods, 
//  * then use spy. So that’s the difference between spy and mock in mockito.
//  */
// import java.util.List;

// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
// import org.springframework.test.context.junit.jupiter.SpringExtension;

// import org.springframework.test.context.ActiveProfiles;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.assertNotNull;

// import org.junit.jupiter.api.DisplayName;

// import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.BeforeEach;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.TestInfo;

// import org.junit.jupiter.api.extension.ExtendWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.boot.test.web.client.TestRestTemplate;
// import org.springframework.http.ResponseEntity;

// import static org.mockito.Mockito.when;
// import static org.mockito.Mockito.any;
// import static org.mockito.Mockito.times;

// //import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.Spy;
// import static org.mockito.Mockito.*;
// import org.mockito.MockitoAnnotations;

// import org.hamcrest.core.IsInstanceOf;

// import static org.hamcrest.MatcherAssert.assertThat;
// //import static org.hamcrest.core.IsInstanceOf;
// import static org.hamcrest.CoreMatchers.instanceOf;
// import static org.hamcrest.MatcherAssert.assertThat;
// //import static org.hamcrest.Matchers.*;

// import static org.hamcrest.MatcherAssert.assertThat;
// import static org.hamcrest.Matchers.contains;
// import static org.hamcrest.Matchers.containsInAnyOrder;
// import static org.hamcrest.Matchers.greaterThan;
// import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
// import static org.hamcrest.core.Every.everyItem;
// import org.springframework.boot.web.server.LocalServerPort;

// import org.springframework.http.ResponseEntity;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.HttpHeaders;
// import org.springframework.http.HttpEntity;
// import org.springframework.http.HttpMethod;

// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.junit.jupiter.MockitoExtension;
// import org.springframework.web.client.RestTemplate;
// import org.springframework.test.context.web.WebAppConfiguration;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

// import java.sql.Connection;
// import java.sql.Statement;

// import c.s.integ.edi.controller.DefaultController;
// import c.s.integ.edi.entity.MapMembers;
// import c.s.integ.edi.repository.MapMembersRepository;
// import c.s.integ.edi.service.EDIService;
// import c.s.integ.edi.util.SmartUtil;


// @DisplayName("Testing Controllers")
// @ActiveProfiles("test")
// @ExtendWith(MockitoExtension.class)
// //@ExtendWith(SpringExtension.class)    //junit 5
// //@RunWith(SpringRunner.class)    //junit 4
// //@SpringBootTest
// //@RunWith(JUnitPlatform.class)
// //@RunWith(MockitoJUnitRunner.class)
// @SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
// //@SpringBootTest(classes = {EDIService.class, MapMembersRepository.class})

// //@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
// @ContextConfiguration(classes = TestConfiguration.class)
// //@EnableAutoConfiguration
// public class DefaultControllerTest {

//     //https://stackoverflow.com/questions/16467685/difference-between-mock-and-injectmocks
//     //@Mock creates a mock. @InjectMocks creates an instance of the class and injects the mocks that are created with the @Mock (or @Spy) annotations into this instance.
//     //Note that you must use @RunWith(MockitoJUnitRunner.class) or Mockito.initMocks(this) to initialize these mocks and inject them.

//     //@Autowired
//     //RestTemplate restTemplate;

//     @Spy
//     private TestRestTemplate testRestTemplate = new TestRestTemplate();
         
//     @LocalServerPort
//     int randomServerPort;

//     //@InitMocks TestRestTemplate testRestTemplate;

//     // Create an instance of what you are going to test.
//     // When using the @InjectMocks annotation, you must create the instance in
//     // the constructor or in the field declaration.
//     //@InjectMocks
//     //private DefaultController defaultController = new DefaultController();

//      // The @Mock annotation creates the mock instance of the class and
//     // automatically injects into the object annotated with @InjectMocks (if
//     // possible).
//     @Mock
//     private EDIService ediService;


//     @Spy 
//     MapMembersRepository mapMembersRepository;
//     //@Mock DefaultController defaultController = new DefaultController(testRestTemplate.getRestTemplate());

//     @Spy
//     DefaultController defaultController;



//     @BeforeAll
// 	static void initAll() {
//         System.out.println("---Inside initAll---");
// 	    }

// 	@BeforeEach
// 	void init(TestInfo testInfo) {
// 		System.out.println("Start..." + testInfo.getDisplayName());
//         }
    
//     @Test
//     @DisplayName("Test repository")
//     public void testMapMemberRepository() {
        
//         //boolean exists = mapMembersRepository.existsById(1L);
//         // long c = mapMembersRepository.count();
//         // assertTrue(c > 0);

//         // Create Mock
//         // Stack<String> mockStack = Mockito.mock(Stack.class);
//         // Assert.assertEquals(mockStack.capacity(), 0);
//         // // Stub
//         // Mockito.when(mockStack.capacity()).thenReturn(10);
//         // Assert.assertEquals(mockStack.capacity(), 10);
//         // Mockito.verify(mockStack);

//         //public String fetchEDIClaimsBasic(Integer clientid, String smartProviderCode, Integer offset){
//         //String result = ediService.fetchEDIClaimsBasic(61000954, "SKSP_503", 0);

//         //verify(defaultController).fetchEdi("61000954","2226");

//         //assertNotNull(result, "Result is null !!!");
//         //assertThat(SmartUtil.toJsonObjectFull(result).getClass(), instanceOf(List.class));

//         //check for size
//         //assertThat(list, hasSize(3));

//         // ensure the order is correct
//         //assertThat(list, contains(5, 2, 4));

//         //check order
//         //assertThat(list, containsInAnyOrder(2, 4, 5));

//         //relational operator
//         //assertThat(list, everyItem(greaterThan(1)));
//         }

    
        
//     //another test via restTemplate is necessary
//     @Test
//     @DisplayName("Testing access to an external url")
//     public void testExternalLink(){
//         String message = testRestTemplate.getForObject("http://example.com/", String.class);
//         assertNotNull(message,"Message is null ");
//         }


//     @Test
//     @DisplayName("Testing stubbing")
//     public void testMockWithStub(){
//         //by default, calling the methods of mock object will do nothing
//         //spy object will call the real method when not stub

//         //stubbing the fetchEDIClaimsBasic
//         String expected = "[{name:\"mabura\"},{name:\"zeguru\"}]";        //empty list
//         when(ediService.fetchEDIClaimsBasic(1, "", 0)).thenReturn(expected);

//         assertEquals(expected, ediService.fetchEDIClaimsBasic(1,"",0));
//         }


//     // @Test
//     // @DisplayName("Testing stubbing a spy")
//     // public void testSpyWithStub() {
//     //     //stubbing a spy method will result the same as the mock object
//     //     String expected = "Spy 100";
//     //     //take note of using doReturn instead of when
//     //     doReturn(expected).when(spyList).get(100);
    
//     //     assertEquals(expected, spyList.get(100));
//     // }

//         // @Mock private Connection mockConnection;
//         // @Mock private Statement mockStatement;

//         // @Mock
//         // DBConnection dbConnection = new DBConnection();


//         // @Test
//         // public void testMockDBConnection() throws Exception {
//         //         when(mockConnection.createStatement()).thenReturn(mockStatement);
//         //         when(mockConnection.createStatement().executeUpdate(any())).thenReturn(1);
//         //         int value = dbConnection.executeQuery("");
//         //         assertEquals(value, 1);
//         //         verify(mockConnection.createStatement(), times(1));
//         //     }


//       /**
//      * Here is a simple example to simulate an exception being thrown by one of
//      * the collaborators.
//      * 
//      * @throws Exception
//      */
//     // @Test(expected = NumberFormatException.class)
//     // public void testCreateWithNumberFormatException() throws Exception {
//     //     doThrow(new NumberFormatException()).when(registrationService)
//     //             .processFile(any(File.class), anyList());
//     //     BindingResult result = new BindingResult();
//     //     // Perform the action
//     //     controllerUT.create(bulkRegistration, result, model);
//     // }

//     @AfterEach
// 	void tearDown(TestInfo testInfo) {
//         System.out.println("Finished..." + testInfo.getDisplayName());        
// 	    }

// 	@AfterAll
// 	static void tearDownAll() {
// 		System.out.println("---Inside tearDownAll---");
//         }
    

// }