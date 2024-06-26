package example.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class EjemploMockitoTest {
    @Mock
    public UserService service;

    private UserService service2;

    @BeforeEach
    public void setupEach(){
        this.service2 = mock(UserService.class);
    }

    @Test
    @Tag("integracion")
    public void testAutowiredValueField() {
        service.saveUser("1000");
        // Comprobando si ha sido llamado el método saveUser con el parámetro "1000"
        verify(service, times(1)).saveUser("1000");
        // cuando se llame al método getUser sin parámetro devuelve "Mi usuario"
        when(service.getUser()).thenReturn("Mi Usuario");
        String ret = service.getUser();
        assertEquals("Mi Usuario", ret);
    }
    @Test
    @Tag("integracion")
    public void testAutowiredValueField2() {
        service2.saveUser("1000");
        verify(service2, times(1)).saveUser("1000");
        when(service2.getUser()).thenReturn("Mi Usuario");
        String ret = service2.getUser();
        assertEquals("Mi Usuario", ret);
    }
    @Test
    @Tag("integracion")
    public void testAutowiredValueField3() {
        UserService userService = new UserService();
        UserService spiedService = spy(userService);
        when(spiedService.getUser()).thenReturn("Mi Usuario");
        String ret = spiedService.getUser();
        spiedService.saveUser("User");
        assertEquals("Mi Usuario", ret);
    }
}
