package core;

public class Encuesta {

    private String fechaDeToma;

    public Encuesta(String fechaDeToma) {
        this.fechaDeToma = fechaDeToma;
    }

    public String getFechaDeToma() {
        return fechaDeToma;
    }

    public void mostrarArbol(Paciente paciente) {
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Fecha de Toma: " + getFechaDeToma());

        System.out.println("  " + paciente.getDia1().getDia());
        System.out.println("    " + paciente.getDia1().getDesayuno().getNombre());
        paciente.getDia1().getDesayuno().getAlimentos();
        System.out.println("    " + paciente.getDia1().getAlmuerzo().getNombre());
        paciente.getDia1().getAlmuerzo().getAlimentos();
        System.out.println("    " + paciente.getDia1().getComida().getNombre());
        paciente.getDia1().getComida().getAlimentos();
        System.out.println("    " + paciente.getDia1().getMerienda().getNombre());
        paciente.getDia1().getMerienda().getAlimentos();
        System.out.println("    " + paciente.getDia1().getCena().getNombre());
        paciente.getDia1().getCena().getAlimentos();

        System.out.println("  " + paciente.getDia2().getDia());
        System.out.println("    " + paciente.getDia2().getDesayuno().getNombre());
        paciente.getDia2().getDesayuno().getAlimentos();
        System.out.println("   " + paciente.getDia2().getAlmuerzo().getNombre());
        paciente.getDia2().getAlmuerzo().getAlimentos();
        System.out.println("   " + paciente.getDia2().getComida().getNombre());
        paciente.getDia2().getComida().getAlimentos();
        System.out.println("   " + paciente.getDia2().getMerienda().getNombre());
        paciente.getDia2().getMerienda().getAlimentos();
        System.out.println("   " + paciente.getDia2().getCena().getNombre());
        paciente.getDia2().getCena().getAlimentos();

        System.out.println(" " + paciente.getDia3().getDia());
        System.out.println("   " + paciente.getDia3().getDesayuno().getNombre());
        paciente.getDia3().getDesayuno().getAlimentos();
        System.out.println("   " + paciente.getDia3().getAlmuerzo().getNombre());
        paciente.getDia3().getAlmuerzo().getAlimentos();
        System.out.println("   " + paciente.getDia3().getComida().getNombre());
        paciente.getDia3().getComida().getAlimentos();
        System.out.println("   " + paciente.getDia3().getMerienda().getNombre());
        paciente.getDia3().getMerienda().getAlimentos();
        System.out.println("   " + paciente.getDia3().getCena().getNombre());
        paciente.getDia3().getCena().getAlimentos();

        System.out.println("  " + paciente.getDia4().getDia());
        System.out.println("   " + paciente.getDia4().getDesayuno().getNombre());
        paciente.getDia4().getDesayuno().getAlimentos();
        System.out.println("   " + paciente.getDia4().getAlmuerzo().getNombre());
        paciente.getDia4().getAlmuerzo().getAlimentos();
        System.out.println("   " + paciente.getDia4().getComida().getNombre());
        paciente.getDia4().getComida().getAlimentos();
        System.out.println("   " + paciente.getDia4().getMerienda().getNombre());
        paciente.getDia4().getMerienda().getAlimentos();
        System.out.println("   " + paciente.getDia4().getCena().getNombre());
        paciente.getDia4().getCena().getAlimentos();

        System.out.println("  " + paciente.getDia5().getDia());
        System.out.println("   " + paciente.getDia5().getDesayuno().getNombre());
        paciente.getDia5().getDesayuno().getAlimentos();
        System.out.println("   " + paciente.getDia5().getAlmuerzo().getNombre());
        paciente.getDia5().getAlmuerzo().getAlimentos();
        System.out.println("   " + paciente.getDia5().getComida().getNombre());
        paciente.getDia5().getComida().getAlimentos();
        System.out.println("   " + paciente.getDia5().getMerienda().getNombre());
        paciente.getDia5().getMerienda().getAlimentos();
        System.out.println("   " + paciente.getDia5().getCena().getNombre());
        paciente.getDia5().getCena().getAlimentos();

    }
}
