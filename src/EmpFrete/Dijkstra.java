package EmpFrete;

import java.util.*;

public class Dijkstra<TIPO> {

    public void calculo(Vertice<TIPO> inicio) {
        // Algo:
        // 1. Take the unvisited node with minimum weight.
        // 2. Visit all its neighbours.
        // 3. Update the distances for all the neighbours (In the Priority Queue).
        // Repeat the process till all the connected nodes are visited.

        inicio.distanciaMin = 0.0;
        PriorityQueue<Vertice<TIPO>> fila = new PriorityQueue<Vertice<TIPO>>();
        fila.add(inicio);

        while (!fila.isEmpty()) {

            Vertice<TIPO> u = fila.poll();

            for (Aresta<TIPO> vizinho : u.vizinhos) {
                Double newDist = u.distanciaMin + vizinho.distancia;

                if (vizinho.fim.distanciaMin > newDist) {
                    // Remove the node from the queue to update the distance value.
                    fila.remove(vizinho.fim);
                    vizinho.fim.distanciaMin = newDist;

                    // Take the path visited till now and add the new node.s
                    vizinho.fim.caminho = new LinkedList<Vertice<TIPO>>(u.caminho);
                    vizinho.fim.caminho.add(u);

                    //Reenter the node with new distance.
                    fila.add(vizinho.fim);
                }
            }
        }
    }
}

