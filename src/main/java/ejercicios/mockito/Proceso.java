package ejercicios.mockito;

import java.util.Objects;

public class Proceso {
    private String nombre;

    public Proceso() {
        this.nombre = "";
    }

    public Proceso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proceso proceso = (Proceso) o;
        return Objects.equals(nombre, proceso.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
