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

public class Estudiante {
    private String codigo;
    private String nombre;
    private List<Curso> cursosInscritos;

    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cursosInscritos = new ArrayList<>();
    }

    // Agrega un curso a la lista del estudiante
    public void inscribirCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    // Elimina un curso por su código
    public void desinscribirCurso(String codigoCurso) {
        cursosInscritos.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigoCurso));
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursosInscritos() { return cursosInscritos; }
}