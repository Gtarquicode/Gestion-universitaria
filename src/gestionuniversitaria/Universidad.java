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

public class Universidad {
    private String nombre;
    private List<Departamento> departamentos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }
// Agrega un nuevo departamento a la universidad 
    public void agregarDepartamento(String nombre) {
        departamentos.add(new Departamento(nombre));
    }
// Elimina un departamento por nombre
    public void eliminarDepartamento(String nombre) {
        departamentos.removeIf(d -> d.getNombre().equalsIgnoreCase(nombre));
    }
// Retorna todos los profesores de todos los departamentos
    public List<Profesor> obtenerTodosProfesores() {
        List<Profesor> todos = new ArrayList<>();
        for (Departamento d : departamentos) {
            todos.addAll(d.getProfesores());
        }
        return todos;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public List<Departamento> getDepartamentos() { return departamentos; }
}
