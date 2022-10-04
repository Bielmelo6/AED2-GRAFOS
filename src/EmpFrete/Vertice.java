package EmpFrete;

import java.util.ArrayList;

public class Vertice<TIPO>{

    private TIPO dado;
    private ArrayList<Aresta<TIPO>> arestaEntrada;
    private ArrayList<Aresta<TIPO>> arestaSaida;

    public Vertice(TIPO valor){
        this.dado = valor;
        this.arestaEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestaSaida = new ArrayList<Aresta<TIPO>>();
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }


    public void addArestaEntrada(Aresta<TIPO> aresta){
        this.arestaEntrada.add(aresta);
    }

    public void addArestaSaida(Aresta<TIPO> aresta){
        this.arestaSaida.add(aresta);
    }
}
