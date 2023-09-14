package ejercicios.mockito;

public class Aplicacion {
    private static Controlador controlador;
    public Aplicacion(){
        controlador = new Controlador();
    }

    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    public Controlador getControlador(){
        return this.controlador;
    }

    public static void main() {
        Aplicacion aplicacion = new Aplicacion();
        aplicacion.getControlador().list();
    }
}
