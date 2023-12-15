/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import models.Student;

/**
 *
 * @author MAYCOL
 */
public class StudentController {
    
    
    public StudentController(){
        
    }
    
    public ArrayList getStudents() {
        ArrayList<Student> list = new ArrayList<>();
        
        for (int i = 1; i <= 20; i++) {
            Student student = new Student();
            student.setStudent_code(i); // Código de estudiante único para cada uno
            student.setNames("Estudiante " + i); // Nombre genérico
            student.setCareer("Carrera " + (i % 5 + 1)); // Carrera asignada de forma rotativa
            student.setCycle(i % 10 + 1); // Ciclo rotativo del 1 al 10
            student.setDate(LocalDate.now()); // Fecha actual (puede cambiar según necesites)
            student.setAsistencia(false); // Asistencia alternada

            list.add(student); // Agregar el estudiante a la lista
        }
        
        return list;
        
    }
}
