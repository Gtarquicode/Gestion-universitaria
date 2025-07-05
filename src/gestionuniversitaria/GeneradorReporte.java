/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversitaria;

/**
 * Clase que genera un reporte temporal de un curso
 * @author juane
 */
public class GeneradorReporte {
    public void generar(Curso curso) {
        System.out.println("Reporte del curso: " + curso.getNombre());
        System.out.println("Profesor: " + (curso.getProfesor() != null ? curso.getProfesor().getNombre() : "Sin asignar"));
        System.out.println("Estudiantes inscritos:");
        for (Estudiante e : curso.getEstudiantes()) {
            System.out.println(" - " + e.getNombre());
        }
    }
}

