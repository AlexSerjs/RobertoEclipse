package ut8.Ejercicio02;

import java.util.ArrayList;

import java.util.Scanner;

public class GestionAlumnos {

	public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Listar alumnos");
            System.out.println("2. Añadir alumno");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar alumno");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine(); // consume la línea en blanco después de la entrada del usuario
            switch (opcion) {
                case 1:
                    listarAlumnos(listaAlumnos);
                    break;
                case 2:
                    anadirAlumno(listaAlumnos, sc);
                    break;
                case 3:
                    eliminarAlumno(listaAlumnos, sc);
                    break;
                case 4:
                    mostrarAlumno(listaAlumnos, sc);
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Introduce un número del 1 al 5.");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
    
    public static void listarAlumnos(ArrayList<Alumno> listaAlumnos) {
        System.out.println("Lista de alumnos:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.toString());
        }
    }
    
    public static void anadirAlumno(ArrayList<Alumno> listaAlumnos, Scanner sc) {
        System.out.println("Introduce el NIF/NIE del alumno:");
        String nif = sc.nextLine();
        if (existeAlumno(listaAlumnos, nif)) {
            System.out.println("Ya existe un alumno con ese NIF/NIE.");
        } else {
            System.out.println("Introduce el nombre del alumno:");
            String nombre = sc.nextLine();
            System.out.println("Introduce los apellidos del alumno:");
            String apellidos = sc.nextLine();
            System.out.println("Introduce el ciclo formativo del alumno:");
            String cicloFormativo = sc.nextLine();
            System.out.println("Introduce el curso del alumno:");
            int curso = sc.nextInt();
            sc.nextLine(); // consume la línea en blanco después de la entrada del usuario
            System.out.println("Introduce la fecha de nacimiento del alumno (formato dd/mm/aaaa):");
            String fechaNacimiento = sc.nextLine();
            Alumno alumno = new Alumno(nif, nombre, apellidos, cicloFormativo, curso, fechaNacimiento);
            listaAlumnos.add(alumno);
            System.out.println("Alumno añadido correctamente.");
        }
    }
    
    public static void eliminarAlumno(ArrayList<Alumno> listaAlumnos, Scanner sc) {
        System.out.println("Introduce el NIF/NIE del alumno a eliminar:");
        String nif = sc.nextLine();
        if (existeAlumno(listaAlumnos, nif)) {
            listaAlumnos.removeIf(alumno -> alumno.getNif().equals(nif));
            System.out.println("Alumno eliminado correctamente.");
        } else {
            System.out.println("No existe un alumno con ese NIF/NIE.");
        }
    }
    
    public static void mostrarAlumno(ArrayList<Alumno> listaAlumnos, Scanner sc) {
        System.out.println("Introduce el NIF/NIE del alumno a mostrar:");
        String nif = sc.nextLine();
        if (existeAlumno(listaAlumnos, nif)) {
            for (Alumno alumno : listaAlumnos) {
                if (alumno.getNif().equals(nif)) {
                    System.out.println(alumno.toString());
                    break;
                }
            }
        } else {
            System.out.println("No existe un alumno con ese NIF/NIE.");
        }
    }

    public static boolean existeAlumno(ArrayList<Alumno> listaAlumnos, String nif) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNif().equals(nif)) {
                return true;
            }
        }
        return false;
    }
}
