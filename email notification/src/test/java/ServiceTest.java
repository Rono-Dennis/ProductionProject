// @ActiveProfiles("test")
// @RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(classes = MocksApplication.class)
// public class UserServiceTest {
 
//     @Autowired
//     private UserService userService;
 
//     @Autowired
//     private NameService nameService;
 
//     // @Test
//     // public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
//     //     Mockito.when(nameService.getUserName("SomeId")).thenReturn("Mock user name");
//     //     String testName = userService.getUserName("SomeId");
//     //     Assert.assertEquals("Mock user name", testName);
//     // }

//     @Test
//     public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
//         Mockito.when(nameService.getUserName("SomeId")).thenReturn("Mock user name");
//         String testName = userService.getUserName("SomeId");
//         Assert.assertEquals("Mock user name", testName);
//         }

// }