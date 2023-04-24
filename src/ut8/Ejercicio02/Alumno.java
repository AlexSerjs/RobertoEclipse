package ut8.Ejercicio02;

public class Alumno {

    private String nif;
    private String nombre;
    private String apellidos;
    private String cicloFormativo;
    private int curso;
    private String fechaNacimiento;

    public Alumno(String nif, String nombre, String apellidos, String cicloFormativo, int curso, String fechaNacimiento) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cicloFormativo = cicloFormativo;
        this.curso = curso;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCicloFormativo() {
        return cicloFormativo;
    }

    public void setCicloFormativo(String cicloFormativo) {
        this.cicloFormativo = cicloFormativo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "NIF/NIE: " + nif + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Ciclo Formativo: " + cicloFormativo + ", Curso: " + curso + ", Fecha de Nacimiento: " + fechaNacimiento;
    }
}
