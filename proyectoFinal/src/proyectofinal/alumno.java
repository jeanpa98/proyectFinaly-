/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author JEanpa
 */
public class alumno {
    // nombre - curso - materias-grado
     private String nombre;
     private char curso;
     private char materia;
     private int grado;
     
     public alumno(){
     nombre = "";
     curso = ' ';
     materia = ' ';
     grado = 0;
     
     }
     public void setnombre(String n){
     nombre = n;
     }
     
     public String getnombre(){
     return nombre;
     } 
     
     public void setNombre(String nombre){
     this.nombre= nombre;
     
     }

    public char getCurso() {
        return curso;
    }

    public void setCurso(char curso) {
        this.curso = curso;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    void setCurso(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}

