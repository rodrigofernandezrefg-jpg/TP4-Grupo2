/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroalumno;

/**
 *
 * @author Valentin Barros Fernandez Rodrigo
 */
public class RegistroAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a = new Alumno (10, "Castro", "Maximiliano");
        Alumno a1 = new Alumno (11, "Kjellfrid", "Valentina");
        Alumno a2 = new Alumno (12, "Fernandez", "Rodrigo");
        Alumno a3 = new Alumno (13, "Barros", "Edgardo");
        Alumno a4 = new Alumno (14, "Carrizo", "Anna");
        Alumno a5 = new Alumno (15, "Domene", "Cora");
        Alumno a6 = new Alumno (16, "Gimenez", "Pablo");
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
        a1.mostrar();
        a2.agregarMaterias(m1);
        a2.agregarMaterias(m2);
        a2.agregarMaterias(m3);
        a2.mostrar();
        a3.agregarMaterias(m1);
        a3.agregarMaterias(m2);
        a3.agregarMaterias(m3);
        a3.mostrar();
        a4.agregarMaterias(m1);
        a4.agregarMaterias(m2);
        a4.agregarMaterias(m3);
        a4.mostrar();
        a5.agregarMaterias(m1);
        a5.agregarMaterias(m2);
        a5.agregarMaterias(m3);
        a5.mostrar();
        a6.agregarMaterias(m1);
        a6.agregarMaterias(m2);
        a6.agregarMaterias(m3);
        a6.mostrar();
        
        a1.mostrar();
        System.out.println("La cantidad de materias que cursa el alumno "+a.getApellido()+" es: " +a.catidadMateria());
        System.out.println("La cantidad de materias que cursa el alumno "+a1.getApellido()+" es: " +a1.catidadMateria());
        System.out.println("La cantidad de materias que cursa el alumno "+a2.getApellido()+" es: " +a2.catidadMateria());
        System.out.println("La cantidad de materias que cursa el alumno "+a3.getApellido()+" es: " +a3.catidadMateria());
        System.out.println("La cantidad de materias que cursa el alumno "+a4.getApellido()+" es: " +a4.catidadMateria());
        System.out.println("La cantidad de materias que cursa el alumno "+a5.getApellido()+" es: " +a5.catidadMateria());
        System.out.println("La cantidad de materias que cursa el alumno "+a6.getApellido()+" es: " +a6.catidadMateria());
    }
}
