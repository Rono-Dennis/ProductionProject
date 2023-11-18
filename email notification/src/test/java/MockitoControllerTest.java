// // import org.junit.jupiter.api.BeforeEach;
// // import org.junit.jupiter.api.DisplayName;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

// import static org.hamcrest.MatcherAssert.assertThat;  
// import static org.hamcrest.Matchers.*;

// // import org.junit.Assert;
// // import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.mockito.runners.MockitoJUnitRunner;

// import c.s.integ.edi.entity.MapMembers;
// import c.s.integ.edi.entity.MapBenefits;
// import c.s.integ.edi.repository.MapBenefitsRepository;
// import c.s.integ.edi.repository.MapMembersRepository;

// //https://stackabuse.com/how-to-test-a-spring-boot-application/
// public class MockitoControllerTest {

//     // @InjectMocks
//     // private UserController userController;

//     // @Mock
//     // private UserRepository userRepository;

//     @Mock
//     private MapBenefitsRepository mapBenefitsRepository;

//     @Mock
//     private MapMembersRepository mapMembersRepository;

//     @Before
//     public void init() {
//         MockitoAnnotations.initMocks(this);
//     }

//     // @Test
//     // public void testGetMapBenefitsById() {
//     //     MapMembers m = new MapMembers();
//     //     m.setId(11L);

//     //     when(mapMembersRepository.findById(11L)).thenReturn(m);
//     //     //MapMembers user = userController.get(1L);

//     //     verify(mapMembersRepository).findById(11L);

//     //     //assertEquals(1l, user.getId().longValue());       //JUnit style
//     //     assertThat(m.getId(), is(11L));       //Hamcrest matchers style
//     //     }



//     // @Test
//     // public void testGetUserById() {
//     //     User u = new User();
//     //     u.setId(1l);
//     //     when(userRepository.findOne(1l)).thenReturn(u);
//     //     User user = userController.get(1L);
//     //     verify(userRepository).findOne(1l);

//     //     //assertEquals(1l, user.getId().longValue());       //JUnit style
//     //     assertThat(user.getId(), is(1l));       //Hamcrest matchers style
//     //     }
    
// }