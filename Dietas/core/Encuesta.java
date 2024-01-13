package core;

import utils.GenericTree;
import utils.Node;

public class Encuesta {

    String fechaToma;
    private GenericTree<IData> paciente;

    public Encuesta(String fechaToma) {
        this.fechaToma = fechaToma;
        this.paciente = new GenericTree<IData>();
    }

    private Dia lunes = new Dia(1);
    private Dia martes = new Dia(2);
    private Dia miercoles = new Dia(3);
    private Dia jueves = new Dia(4);
    private Dia viernes = new Dia(5);

    private Ingesta desayuno = new Ingesta("Desayuno");
    private Ingesta almuerzo = new Ingesta("Almuerzo");
    private Ingesta comida = new Ingesta("Comida");
    private Ingesta merienda = new Ingesta("Merienda");
    private Ingesta cena = new Ingesta("Cena");
    

    public void generarArbol(Paciente paciente){
      

    }


    
}
