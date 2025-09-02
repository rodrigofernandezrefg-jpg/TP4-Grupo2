/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumno;

import java.util.Objects;

/**
 *
 * @author Valentin Barros
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int año;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void mostrarMaterias(){
        System.out.println("el id de la materia es: " +this.idMateria);
        System.out.println("El nombre de la materia es: " +this.nombre);
        System.out.println("El año de la materia es " +this.año);
        
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Materia))return false;
        Materia m = (Materia) o;
        return idMateria == m.idMateria;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(idMateria);
    }
}
