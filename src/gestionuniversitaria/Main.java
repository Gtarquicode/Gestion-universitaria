/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionuniversitaria;

/**
 *
 * @author juane
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎓 Bienvenido al sistema de gestión universitaria");

        System.out.print("Ingresa el nombre de la universidad: ");
        String nombreUni = sc.nextLine();
        Universidad uni = new Universidad(nombreUni);

        System.out.print("¿Cuántos departamentos quieres agregar?: ");
        int nDeptos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nDeptos; i++) {
            System.out.print("Nombre del departamento " + (i+1) + ": ");
            String nombreDepto = sc.nextLine();
            uni.agregarDepartamento(nombreDepto);
        }

        Departamento depto = uni.getDepartamentos().get(0); // Usamos el primero

        System.out.print("\nNombre del profesor a contratar: ");
        String nombreProf = sc.nextLine();
        System.out.print("Especialidad del profesor: ");
        String espProf = sc.nextLine();
        Profesor profesor = new Profesor(nombreProf, espProf);
        depto.contratarProfesor(profesor);

        System.out.print("\nNombre del curso a ofrecer: ");
        String nombreCurso = sc.nextLine();
        System.out.print("Código del curso: ");
        String codCurso = sc.nextLine();
        Curso curso = new Curso(codCurso, nombreCurso);
        curso.asignarProfesor(profesor);
        depto.ofrecerCurso(curso);

        System.out.print("\n¿Cuántos estudiantes se inscribirán?: ");
        int nEst = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < nEst; i++) {
            System.out.print("Nombre del estudiante " + (i+1) + ": ");
            String nomEst = sc.nextLine();
            System.out.print("Código del estudiante: ");
            String codEst = sc.nextLine();
            Estudiante est = new Estudiante(codEst, nomEst);
            curso.inscribirEstudiante(est);
        }

        // Generar reporte
        GeneradorReporte gr = new GeneradorReporte();
        curso.generarReporte(gr);
        sc.close();
    }
}
