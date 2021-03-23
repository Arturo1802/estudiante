/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestudiante;

/**
 *
 * @author Boni
 */
public class ProyectoEstudiante {
 
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante("Paola E.");
        Estudiante e3 = new Estudiante("Andrés S.",'M',90,60,60);
        e1.setNombre("Cristina R.");
        e1.setSexo('f');
        e1.setCal1(79);
        e1.setCal2(75);
        e1.setCal3(69);
        e2.setSexo('F');
        e2.setCal1(85);
        e2.setCal2(91);
        e2.setCal3(75);
        System.out.println("Estado de acreditación del estudiante "+e2.getNombre()+": "+e2.determinarEstatus());
        System.out.println("El estudiante con mayor promedio es: "+Estudiante.mayorPromedio(e1, e2).getNombre());
        
        
    }
    
}
