package core;
import utils.generica.GenericList;

public class Ingesta implements IData {

    String nombre;
    GenericList<Alimento> alimentos;

    public Ingesta(String nombre) {
        this.nombre = nombre;
        this.alimentos = new GenericList<Alimento>();
    }

    public String getNombre() {
        return nombre;
    }

    public void getAlimentos() {
        GenericList<Alimento> iterator = this.alimentos;
        while (iterator.getFirst() != null) {
            System.out.println(iterator.getFirst().getValue().getNombre());
            iterator.deleteFront();
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
