import java.util.Scanner;

import core.*;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema de encuesta");
        System.out.println("Ingrese el nombre del paciente: ");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();

        Paciente paciente = new Paciente(nombre ,"02/02/2024", 1.80, 80);
        Encuesta encuesta = new Encuesta("02/02/2024");
        boolean exit = false;

        do {

            System.out.println("1. Ingresar alimentos a un dia");
            System.out.println("2. Mostrar arbol");
            System.out.println("3. Salir");
            System.out.println("Ingrese una opcion: ");
            switch (getInt()) {
                case 1:
                    System.out.println("Selecciona el dia: ");
                    switch (getInt()) {
                        case 1:
                            System.out.println("Selecciona la ingesta: Seleccione ingesta: 1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                            switch (getInt()) {
                                case 1:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia1().getDesayuno().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 2:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia1().getAlmuerzo().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 3:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia1().getComida().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 4:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia1().getMerienda().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 5:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia1().getCena().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case -1:
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                            break;
                            
                        case 2:
                            System.out.println("Selecciona la ingesta: Seleccione ingesta: 1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                            switch (getInt()) {
                                case 1:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia2().getDesayuno().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 2:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia2().getAlmuerzo().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 3:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia2().getComida().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 4:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia2().getMerienda().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 5:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia2().getCena().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case -1:
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("Selecciona la ingesta: Seleccione ingesta: 1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                            switch (getInt()) {
                                case 1:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia3().getDesayuno().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 2:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia3().getAlmuerzo().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 3:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia3().getComida().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 4:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia3().getMerienda().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 5:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia3().getCena().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case -1:
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                            break;

                        case 4:
                        System.out.println("Selecciona la ingesta: Seleccione ingesta: 1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                            switch (getInt()) {
                                case 1:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia4().getDesayuno().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 2:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia4().getAlmuerzo().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 3:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia4().getComida().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 4:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia4().getMerienda().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 5:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia4().getCena().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case -1:
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                            break;

                        case 5:
                        System.out.println("Selecciona la ingesta: Seleccione ingesta: 1 (Desayuno) / 2 (Media mañana) / 3 (Almuerzo) / 4 (Merienda) / 5 (Cena) / -1 (Menu anterior)");
                            switch (getInt()) {
                                case 1:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia5().getDesayuno().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 2:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia5().getAlmuerzo().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 3:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia5().getComida().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 4:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia5().getMerienda().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case 5:
                                    System.out.println("Ingrese el alimento: ");
                                    paciente.getDia5().getCena().addAlimento(new Alimento(getAlimento(), 0));
                                    break;
                                case -1:
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }
                            break;

                        default:
                            break;
                    }
                    break;

                case 2:
                    encuesta.mostrarArbol(paciente);
                    System.out.println();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    System.out.println();
                    break;
            }
            
        } while (!exit);

        System.out.println("Gracias por usar el sistema de encuesta");
    }

    static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    static String getAlimento() {
        Scanner scanner = new Scanner(System.in);
        String alimento = scanner.nextLine();
        return alimento;
    }
}
