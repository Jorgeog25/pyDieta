import java.util.Scanner;

import core.*;

public class Main {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del paciente: ");
        String nombre = sc.nextLine();

        Paciente paciente = new Paciente(nombre, "01/01/2024", 80, 1.80);

        Encuesta encuesta = new Encuesta("01/01/2024");
        encuesta.rellenarArbol(paciente);

        System.out.println("Que deseas hacer?");
        encuesta.mostrarArbol();

    }
}
