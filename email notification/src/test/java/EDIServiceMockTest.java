// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.springframework.boot.test.context.SpringBootTest;

// import c.s.integ.edi.entity.MapBenefits;
// import c.s.integ.edi.repository.MapBenefitsRepository;
// import c.s.integ.edi.service.EDIService;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.when;


// @SpringBootTest
// public class EDIServiceMockTest {

//     // @Mock
//     // private HelloRepository helloRepository;

//     @Mock
//     private MapBenefitsRepository mapBenefitsRepository;

//     //@InjectMocks // auto inject helloRepository
//     //private HelloService helloService = new HelloServiceImpl();

//     @InjectMocks // auto inject helloRepository
//     private EDIService ediService;

//     @BeforeEach
//     void setMockOutput() {
//         when(1).thenReturn("Hello Mockito From Repository");
//         }

//     @DisplayName("Test Mock helloService + helloRepository")
//     @Test
//     public void testGet() {
//         assertEquals("Hello Mockito From Repository", ediService.hashCode());
//         }

// }
