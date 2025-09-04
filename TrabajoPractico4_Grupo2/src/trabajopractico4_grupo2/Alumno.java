
package trabajopractico4_grupo2;

import java.util.HashSet;

public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre){
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
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
    public void agregarMateria(Materia nuevaMateria){
        boolean materiaInscripta = false;
        for(Materia m: this.materias){
            if(m.getIdMateria() == nuevaMateria.getIdMateria()){
                materiaInscripta = true;
                System.out.println("El alumno " +this.apellido+" "+this.nombre+ " ya esta inscripto en " +nuevaMateria.getNombre()+ " de " +nuevaMateria.getAño()+ "er año.");
                break;
            }
        }
    if(!materiaInscripta){
        this.materias.add(nuevaMateria);
        System.out.println("Materia " +nuevaMateria.getNombre()+", ID: "+nuevaMateria.getIdMateria()+ ", año: " +nuevaMateria.getAño()+ ", agregada exitosamente para " +this.apellido+" "+this.nombre+ ", legajo: " +this.getLegajo());
    }
    }
    public int cantidadMaterias(){
        return this.materias.size();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.legajo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Alumno)) {
            return false;
        }

        Alumno other = (Alumno) obj;
        return this.legajo == other.legajo;
    }
    
}
