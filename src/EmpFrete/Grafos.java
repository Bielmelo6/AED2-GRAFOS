package EmpFrete;

import java.util.ArrayList;

public class Grafos<TIPO>{

    private final ArrayList<Aresta<TIPO>> arestasG;
    private final ArrayList<Vertice<TIPO>> verticesG;

    public Grafos() {
        this.arestasG = new ArrayList<Aresta<TIPO>>();
        this.verticesG = new ArrayList<Vertice<TIPO>>();
    }

    public void addVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
        this.verticesG.add(novoVertice);
    }

    public void addAresta(Double distancia, TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(distancia, inicio, fim);
        if(inicio != null && fim != null){
            inicio.addArestaSaida(aresta);
            fim.addArestaEntrada(aresta);
            this.arestasG.add(aresta);
        }
    }

    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> vertice = null;
        for(int i = 0; i < this.verticesG.size(); i++){
            if(this.verticesG.get(i).getDado().equals(dado)){
                vertice = this.verticesG.get(i);
                break;
            }
        }
        return vertice;
    }

    public void buscaLargura(){
        ArrayList<Vertice<TIPO>> marcado = new ArrayList<Vertice<TIPO>>();
        ArrayList<Vertice<TIPO>> fila = new ArrayList<Vertice<TIPO>>();
        Vertice<TIPO> atual = this.verticesG.get(0);
        marcado.add(atual);
        System.out.println(atual.getDado());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice<TIPO> visitado = fila.get(0);
            for(int i = 0; i < visitado.getArestaSaida().size(); i++){
                Vertice<TIPO> proximo = visitado.getArestaSaida().get(i).getFim();
                if(!marcado.contains(proximo)){
                    marcado.add(proximo);
                    System.out.println(proximo.getDado());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
}
