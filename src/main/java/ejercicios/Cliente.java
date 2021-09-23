package ejercicios;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Cliente implements Serializable {
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private Date fechaNacimiento;

    public Cliente(){
        this.nombre = "";
        this.apellido = "";
        this.dni = "";
        this.email = "";
        this.fechaNacimiento = null;
    }
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
}
