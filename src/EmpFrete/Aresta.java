package EmpFrete;

public class Aresta<TIPO> {

    private Double distancia;
    private Vertice<TIPO> inicio;
    private Vertice<TIPO> fim;

    public Aresta(Double distancia, Vertice<TIPO> inicio, Vertice<TIPO> fim) {
        this.distancia = distancia;
        this.inicio = inicio;
        this.fim = fim;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Vertice<TIPO> getInicio() {
        return inicio;
    }

    public void setInicio(Vertice<TIPO> inicio) {
        this.inicio = inicio;
    }

    public Vertice<TIPO> getFim() {
        return fim;
    }

    public void setFim(Vertice<TIPO> fim) {
        this.fim = fim;
    }
}
