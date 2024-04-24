package ejercicios.mockito;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> list(){
        List<User> listado = new ArrayList<>();
        listado.add(new User(1,"Pepe"));
        listado.add(new User(2,"Sandra"));
        return listado;
    }
}
