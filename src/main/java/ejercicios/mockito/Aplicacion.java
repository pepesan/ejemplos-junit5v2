package ejercicios.mockito;

public class Aplicacion {
    private Controlador controlador;
    public Aplicacion(){
        controlador = new Controlador();
    }

    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    public Controlador getControlador(){
        return this.controlador;
    }
    public void main() {
        controlador.list();
    }
}
