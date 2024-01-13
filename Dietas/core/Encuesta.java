package core;

import utils.GenericTree;

public class Encuesta {

    String fechaToma;
    private GenericTree<IData> tree;

    public Encuesta(String fechaToma) {
        this.fechaToma = fechaToma;
        this.tree = new GenericTree<IData>();
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
    

    public void rellenarArbol(Paciente paciente){
        this.tree.insertNode(tree.getRoot(), paciente, 0, 0);

        this.tree.insertNode(tree.getRoot(), lunes, 1, 0);
        this.tree.insertNode(tree.getRoot(), martes, 2, 0);
        this.tree.insertNode(tree.getRoot(), miercoles, 3, 0);
        this.tree.insertNode(tree.getRoot(), jueves, 4, 0);
        this.tree.insertNode(tree.getRoot(), viernes, 5, 0);

        this.tree.insertNode(tree.getRoot(), desayuno, 1, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 1, 2);
        this.tree.insertNode(tree.getRoot(), comida, 1, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 1, 4);
        this.tree.insertNode(tree.getRoot(), cena, 1, 5);

        this.tree.insertNode(tree.getRoot(), desayuno, 2, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 2, 2);
        this.tree.insertNode(tree.getRoot(), comida, 2, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 2, 4);
        this.tree.insertNode(tree.getRoot(), cena, 2, 5);

        this.tree.insertNode(tree.getRoot(), desayuno, 3, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 3, 2);
        this.tree.insertNode(tree.getRoot(), comida, 3, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 3, 4);
        this.tree.insertNode(tree.getRoot(), cena, 3, 5);

        this.tree.insertNode(tree.getRoot(), desayuno, 4, 1);
        this.tree.insertNode(tree.getRoot(), almuerzo, 4, 2);
        this.tree.insertNode(tree.getRoot(), comida, 4, 3);
        this.tree.insertNode(tree.getRoot(), merienda, 4, 4);
        this.tree.insertNode(tree.getRoot(), cena, 4, 5);
    }


    
}
