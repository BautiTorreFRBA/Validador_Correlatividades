package Inscripciones_2024;
import java.util.List;
public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
