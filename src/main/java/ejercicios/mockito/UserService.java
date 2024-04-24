package ejercicios.mockito;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private UserRepository userRepository;
    private List<User> listado= new ArrayList();
    private List<User> datosProcesados= new ArrayList();
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void list(){
        this.listado = this.userRepository.list();
    }
    public void processData(){
        this.listado = this.userRepository.list();
        this.datosProcesados = this.listado.stream()
                .filter(u -> u.getNombre().equals("Pepe"))
                .toList();
    }

    public List<User> getListado() {
        return listado;
    }

    public List<User> getDatosProcesados() {
        return datosProcesados;
    }
}
