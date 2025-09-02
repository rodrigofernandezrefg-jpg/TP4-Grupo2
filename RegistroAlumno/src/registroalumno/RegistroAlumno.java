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
        Alumno a = new Alumno (10, "Barros", "Edgardo");
        Materia m1 = new Materia(1, "Matematica 1", 1);
        Materia m2 = new Materia (2, "Programacion", 1);
        Materia m3= new Materia (3, "web", 1);
        a.agregarMaterias(m1);
        a.agregarMaterias(m2);
        a.agregarMaterias(m3);
        a.mostrar();
        System.out.println("La cantidad de materias que cursa es: " +a.catidadMateria());
    }
    
}
