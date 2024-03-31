package Inscripciones_2024;
import java.util.List;
public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;


    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public boolean aprobada() {
        for (Materia materia : materias) {
            if (!this.cumpleCorrelatividades(materia)) {
                return false; // Si al menos una materia no cumple las correlatividades, se rechaza la inscripción
            }
        }
        return true; // Si todas las materias cumplen las correlatividades, se aprueba la inscripción
    }

    private boolean cumpleCorrelatividades(Materia materia) {
        List<Materia> correlativas = materia.getCorrelativas();
        if (correlativas.isEmpty()) {
            return true; // Si no tiene correlativas, se considera que cumple las correlatividades
        }
        List<Materia> aprobadas = alumno.getMateriasAprobadas();
        for(Materia correlativa : correlativas){
            if(!aprobadas.contains(correlativa)){
                return false;
            }
        }
        return true;
    }
}
