package EmpFrete;

import java.util.*;

public class Vertice<TIPO> implements Comparable<Vertice<TIPO>>{

    public TIPO dado;
    public ArrayList<Aresta<TIPO>> arestaEntrada;
    public ArrayList<Aresta<TIPO>> arestaSaida;
    public final ArrayList<Aresta<TIPO>> vizinhos;
    public LinkedList<Vertice<TIPO>> caminho;
    public Double distanciaMin = Double.POSITIVE_INFINITY;
    public int compareTo(Vertice<TIPO> outro){
        return Double.compare(distanciaMin, outro.distanciaMin);
    }
    public Vertice(TIPO valor){
        this.dado = valor;
        this.arestaEntrada = new ArrayList<Aresta<TIPO>>();
        this.arestaSaida = new ArrayList<Aresta<TIPO>>();
        vizinhos = new ArrayList<Aresta<TIPO>>();
        caminho = new LinkedList<Vertice<TIPO>>();
    }

    public TIPO getDado() {
        return dado;
    }

    public void setDado(TIPO dado) {
        this.dado = dado;
    }

    public ArrayList<Aresta<TIPO>> getArestaEntrada() {
        return arestaEntrada;
    }

    public void setArestaEntrada(ArrayList<Aresta<TIPO>> arestaEntrada) {
        this.arestaEntrada = arestaEntrada;
    }

    public ArrayList<Aresta<TIPO>> getArestaSaida() {
        return arestaSaida;
    }

    public void setArestaSaida(ArrayList<Aresta<TIPO>> arestaSaida) {
        this.arestaSaida = arestaSaida;
    }

    public void addArestaEntrada(Aresta<TIPO> aresta){
        this.arestaEntrada.add(aresta);
    }

    public void addArestaSaida(Aresta<TIPO> aresta){
        this.arestaSaida.add(aresta);
    }

    public ArrayList<Aresta<TIPO>> getVizinhos() {
        return vizinhos;
    }
}
