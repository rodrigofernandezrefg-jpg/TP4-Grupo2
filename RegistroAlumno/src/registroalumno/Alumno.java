/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumno;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author Valentin Barros
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private LinkedHashSet <Materia> materias;

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new LinkedHashSet();
    }

   

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(LinkedHashSet<Materia> materias) {
        this.materias = materias;
    }
    
    
    
    public void agregarMaterias(Materia m){
        this.materias.add(m);
    }
    
    public int catidadMateria(){
        return this.materias.size();
    }
    
    public void mostrar(){
        System.out.println("EL numero de legajo es: " +this.legajo);
        System.out.println("El nombre del alumno es: " +this.nombre);
        System.out.println("El apellido del alumno es: " +this.apellido);
        System.out.println("Las materias que cursa son: ");
        for(Materia m : materias){
            System.out.println(m.getNombre());
        }
    }
    
}
