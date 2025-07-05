/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversitaria;

/**
 *
 * @author juanes
 */
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    private List<Estudiante> estudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    // Asigna un profesor al curso
    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
        profesor.asignarCurso(this);
    }

    // Inscribe un estudiante y actualiza su lista de cursos
    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        estudiante.inscribirCurso(this);
    }

    // Desinscribe un estudiante por su código
    public void desinscribirEstudiante(String codigoEstudiante) {
        estudiantes.removeIf(e -> e.getCodigo().equalsIgnoreCase(codigoEstudiante));
    }

    // Dependencia temporal con GeneradorReporte
    public void generarReporte(GeneradorReporte generador) {
        generador.generar(this);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    public List<Estudiante> getEstudiantes() { return estudiantes; }
}