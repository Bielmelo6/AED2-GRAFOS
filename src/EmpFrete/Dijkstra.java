package EmpFrete;

import java.util.*;

public class Dijkstra<TIPO> {

    public void menorCaminho(Vertice<TIPO> inicio) {
        // 1. Guarde o nó que ainda não foi visitado com a distância mínima.
        // 2. Visite todos os vizinhos.
        // 3. Atualize todas das distâncias dos vizinhos(Na fila de prioridade)
        // Repita o processo até que todos os nós sejam visitados.

        inicio.distanciaMin = 0.0;
        PriorityQueue<Vertice<TIPO>> fila = new PriorityQueue<Vertice<TIPO>>();
        fila.add(inicio);

        while (!fila.isEmpty()) {

            Vertice<TIPO> temp = fila.poll();

            for (Aresta<TIPO> vizinho : temp.vizinhos) {
                Double novaDist = temp.distanciaMin + vizinho.distancia;

                if (vizinho.fim.distanciaMin > novaDist) {
                    // Remove o valor da fila para atualizar a distância.
                    fila.remove(vizinho.fim);
                    vizinho.fim.distanciaMin = novaDist;

                    // Pegue o caminho visitado até agora e adicione o vértice.
                    vizinho.fim.caminho = new LinkedList<Vertice<TIPO>>(temp.caminho);
                    vizinho.fim.caminho.add(temp);

                    //Reinsira o vértice com a nova distância.
                    fila.add(vizinho.fim);
                }
            }
        }
    }
}

