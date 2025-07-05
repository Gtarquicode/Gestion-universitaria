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

public class Profesor {
    private String nombre;
    private String especialidad;
    private List<Curso> cursosImpartidos;

    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursosImpartidos = new ArrayList<>();
    }

    // Asigna un curso al profesor
    public void asignarCurso(Curso curso) {
        cursosImpartidos.add(curso);
    }

    // Elimina un curso que imparte el profesor
    public void desasignarCurso(String codigo) {
        cursosImpartidos.removeIf(c -> c.getCodigo().equalsIgnoreCase(codigo));
    }

    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursosImpartidos() { return cursosImpartidos; }
}
