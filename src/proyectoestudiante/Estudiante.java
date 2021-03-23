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
public class Estudiante {
    private String nombre;
    private char sexo;
    private int cal1,cal2,cal3;

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, char sexo, int cal1, int cal2, int cal3) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getCal1() {
        return cal1;
    }

    public void setCal1(int cal1) {
        this.cal1 = cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public void setCal2(int cal2) {
        this.cal2 = cal2;
    }

    public int getCal3() {
        return cal3;
    }

    public void setCal3(int cal3) {
        this.cal3 = cal3;
    }

    public String stringSexo(){
    if (sexo=='M'||sexo=='m') {
            return "Masculino";
        } else {
            if (sexo=='F'||sexo=='f') {
                return "Femenino";
            }else{
                return "No registrado";

            }  
        
        }
        
    }
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", sexo=" + stringSexo() + ", cal1=" + cal1 + ", cal2=" + cal2 + ", cal3=" + cal3 + '}';
    }
 
    public int calculaPromedio(){
        return (cal1+cal2+cal3)/3;
    }
    
    public boolean determinarEstatus(){
        if (this.calculaPromedio()<=70) {
            return false;
        } else {
            return true;
        } 
    }
    
    public static Estudiante mayorPromedio(Estudiante e1, Estudiante e2){
        if (e1.calculaPromedio()>e2.calculaPromedio()) {
            return e1;
        } else {
            if (e2.calculaPromedio()>e1.calculaPromedio()) {
                return e2;
            } else {
                  return null;
            }
            
        }
    }
    
    
    
    
    
}
