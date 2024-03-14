package ejercicios.mockito;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

public class Aplicacion {
    private static Controlador controlador;

    Aplicacion(){
        this.setControlador(new Controlador());
    }
    public void setControlador(Controlador controlador){
        this.controlador = controlador;
    }
    public Controlador getControlador(){
        return this.controlador;
    }

    public static void main(String[] args) {
        Aplicacion aplicacion = new Aplicacion();
        aplicacion.list();
    }
    public void list(){
        this.controlador.list();
    }
}
