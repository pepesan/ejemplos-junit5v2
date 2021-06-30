package example.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class EjemploMockitoTest {
    @Mock
    private UserService service;

    @Test
    public void testAutowiredValueField() {
        service.saveUser("1000");
        Mockito.verify(service, Mockito.times(1)).saveUser("1000");
    }
}
