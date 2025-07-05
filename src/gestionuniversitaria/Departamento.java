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

public class Departamento {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Asocia un profesor al departamento (agregación)
    public void contratarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // Elimina un profesor por su nombre
    public void despedirProfesor(String nombre) {
        profesores.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    // Agrega un curso al departamento
    public void ofrecerCurso(Curso curso) {
        cursos.add(curso);
    }

    public String getNombre() { return nombre; }
    public List<Profesor> getProfesores() { return profesores; }
    public List<Curso> getCursos() { return cursos; }
}
