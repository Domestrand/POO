package ejer;
import java.util.Scanner;
public class Ejer {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombres del alumno:");
        String nombres = sc.nextLine();
        System.out.println("Ingrese apellidos del alumno:");
        String apellidos = sc.nextLine();
        System.out.println("Ingrese el ciclo (1 a mas):");
        int ciclo = sc.nextInt();
        System.out.println("Ingrese la pension anterior:");
        double pensionAnterior = sc.nextDouble();
        System.out.println("Ingrese el numero de cursos a llevar:");
        int cursos = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la carrera:");
        String carrera = sc.nextLine();

        double promedio = 0;
        if (ciclo > 1) {
            System.out.println("Ingrese el promedio ponderado del ciclo anterior:");
            promedio = sc.nextDouble();
            
        }
        Alumno alumno = new Alumno(nombres, apellidos, ciclo, pensionAnterior, cursos, carrera, promedio);

        double nuevaPension = alumno.calcularNuevaPension();
        String turno = alumno.obtenerTurno();
        String local = alumno.obtenerLocal();
        alumno.actualizarCursos();

        System.out.println("\n--- Resultado de Matricula ---");
        System.out.println("Alumno: " + alumno.getNombres() + " " + alumno.getApellidos());
        System.out.println("Carrera: " + alumno.getCarrera());
        System.out.println("Turno asignado: " + turno);
        System.out.println("Local asignado: " + local);
        System.out.printf("Nueva pension: %.2f\n", nuevaPension);
        System.out.println("Cursos a llevar: " + alumno.getCursos());
        
    }
    
}
