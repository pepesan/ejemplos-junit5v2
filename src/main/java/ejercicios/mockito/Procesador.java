package ejercicios.mockito;

import java.util.Objects;

public class Procesador {
    private String comando;

    private Proceso proceso;


    public Procesador() {
        this.comando = "";
        this.proceso = new Proceso();
    }


    public Procesador(String comando, Proceso proceso) {
        this.comando = comando;
        this.proceso = proceso;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public void llamaProceso(){
        this.comando = this.proceso.getNombre()+" -i";
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "comando='" + comando + '\'' +
                ", proceso=" + proceso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procesador that = (Procesador) o;
        return Objects.equals(comando, that.comando) && Objects.equals(proceso, that.proceso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comando, proceso);
    }
}
