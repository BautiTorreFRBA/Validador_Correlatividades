package domain;
import Inscripciones_2024.Alumno;
import Inscripciones_2024.Inscripcion;
import Inscripciones_2024.Materia;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class inscripcionTest {
    @Test
    public void seEvaluaInscripcion(){
        Materia matematica1 = new Materia();
        Materia matematica2 = new Materia();
        Materia economia = new Materia();
        Materia discreta = new Materia();
        Materia ingles1 = new Materia();
        Materia ingles2 = new Materia();
        Materia disenio = new Materia();
        Materia matematicaSuperior = new Materia();



        List<Materia> correlativasMatematica2 = new ArrayList<>();
        correlativasMatematica2.add(matematica1);
        correlativasMatematica2.add(economia);
        matematica2.setCorrelativas(correlativasMatematica2);

        List<Materia> correlativasIngles2 = new ArrayList<>();
        correlativasIngles2.add(ingles1);
        ingles2.setCorrelativas(correlativasIngles2);

        List<Materia> correlativasMatematicaSup = new ArrayList<>();
        correlativasMatematicaSup.add(matematica2);
        correlativasMatematicaSup.add(discreta);
        matematicaSuperior.setCorrelativas(correlativasMatematicaSup);


        List<Materia> listaVacia = new ArrayList<>();

        disenio.setCorrelativas(listaVacia);
        discreta.setCorrelativas(listaVacia);


        Alumno pepe = new Alumno();
        List<Materia> materiasAprobadas = new ArrayList<>();
        materiasAprobadas.add(matematica1);
        materiasAprobadas.add(discreta);
        materiasAprobadas.add(ingles1);
        materiasAprobadas.add(economia);

        pepe.setMateriasAprobadas(materiasAprobadas);

        Inscripcion inscripcion1 = new Inscripcion();
        inscripcion1.setAlumno(pepe);
        List<Materia> listaInscripcion1 = new ArrayList<>();
        listaInscripcion1.add(matematica2);
        listaInscripcion1.add(ingles2);
        listaInscripcion1.add(disenio);
        inscripcion1.setMaterias(listaInscripcion1);

        Inscripcion inscripcion2 = new Inscripcion();
        inscripcion2.setAlumno(pepe);
        List<Materia> listaInscripcion2 = new ArrayList<>();
        listaInscripcion2.add(matematicaSuperior);
        listaInscripcion2.add(ingles2);
        listaInscripcion2.add(disenio);
        inscripcion2.setMaterias(listaInscripcion2);

        Assert.assertTrue(inscripcion1.aprobada());
        Assert.assertFalse(inscripcion2.aprobada());
    }


}
