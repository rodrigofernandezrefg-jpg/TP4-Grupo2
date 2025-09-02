/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumno;

/**
 *
 * @author Valentin Barros
 */
public class RegistroAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a = new Alumno (10, "Lopez", "Martin");
        Alumno a1 = new Alumno (10, "Martinez", "Brenda");
        Materia m1 = new Materia(1, "Matematica 1", 1);
        Materia m2 = new Materia (2, "Laboratorio 1", 1);
        Materia m3= new Materia (3, "Web 2", 1);
        a.agregarMaterias(m1);
        a.agregarMaterias(m2);
        a.agregarMaterias(m3);
        a.mostrar();
        a1.agregarMaterias(m1);
        a1.agregarMaterias(m2);
        a1.agregarMaterias(m3);
        a1.agregarMaterias(m3);
        
        a1.mostrar();
        System.out.println("La cantidad de materias que cursa el alumno "+a.getApellido()+" es: " +a.catidadMateria());
        System.out.println("La cantidad de materias que cursa el alumno "+a1.getApellido()+" es: " +a1.catidadMateria());
    }
}
