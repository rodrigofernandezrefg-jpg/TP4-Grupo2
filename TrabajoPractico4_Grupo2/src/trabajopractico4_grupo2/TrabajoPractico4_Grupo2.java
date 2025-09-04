
package trabajopractico4_grupo2;

public class TrabajoPractico4_Grupo2 {

    public static void main(String[] args) {
        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");
        Materia web2 = new Materia(11, "Web 2", 2);
        Materia mate = new Materia(12, "Matematicas", 1);
        Materia lab1 = new Materia(13, "Laboratorio 1", 1);
        
        lopez.agregarMateria(web2);
        lopez.agregarMateria(mate);
        lopez.agregarMateria(lab1);
        martinez.agregarMateria(web2);
        martinez.agregarMateria(mate);
        martinez.agregarMateria(lab1);
        
        System.out.println("El alumno " +lopez.getApellido()+" "+lopez.getApellido()+ " tiene " +lopez.cantidadMaterias()+ " cantidad de materias inscriptas.");
        System.out.println("La alumna " +martinez.getApellido()+" "+martinez.getNombre()+ " tiene " +martinez.cantidadMaterias()+ " cantidad de materias inscriptas.");
        
        
    }
    
}
