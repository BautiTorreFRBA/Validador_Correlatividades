package Inscripciones_2024;
import java.util.List;
public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
