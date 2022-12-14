package EmpFrete;
import java.util.Scanner;

public class Main<TIPO>{

    public static void main(String[] args) {


        Grafo<String> grafo = new Grafo<>();

        //Cidades com sede da Empresa
        grafo.addVertice("Recife"); //0
        grafo.addVertice("Fortaleza"); //1
        grafo.addVertice("Salvador"); //2
        grafo.addVertice("João Pessoa"); //3
        grafo.addVertice("Maceió"); //4
        //Cidades sem sede da Empresa
        grafo.addVertice("Teresina"); //5
        grafo.addVertice("Aracaju"); //6
        grafo.addVertice("Natal"); //7
        grafo.addVertice("São Luís"); //8
        grafo.addVertice("Feira de Santana"); //9
        grafo.addVertice("Campina Grande"); //10
        grafo.addVertice("Caruaru"); //11
        grafo.addVertice("Juazeiro do Norte"); //12
        grafo.addVertice("Arapiraca"); //13
        grafo.addVertice("Petrolina"); //14

        grafo.addAresta(133.2, "Recife", "Caruaru");
        grafo.addAresta(133.2, "Caruaru", "Recife");
        grafo.addAresta(117.1, "Recife", "João Pessoa");
        grafo.addAresta(257.1, "Recife", "Maceió");
        grafo.addAresta(200.6, "Recife", "Campina Grande");
        grafo.addAresta(200.6, "Campina Grande", "Recife");
        grafo.addAresta(257.1, "Maceió", "Recife");
        grafo.addAresta(128.9, "Maceió", "Arapiraca");
        grafo.addAresta(128.9, "Arapiraca", "Maceió");
        grafo.addAresta(282.7, "Maceió", "Aracaju");
        grafo.addAresta(282.7, "Aracaju", "Maceió");
        grafo.addAresta(584.0, "Maceió", "Feira de Santana");
        grafo.addAresta(584.0, "Feira de Santana", "Maceió");
        grafo.addAresta(126.8, "João Pessoa", "Campina Grande");
        grafo.addAresta(126.8, "Campina Grande", "João Pessoa");
        grafo.addAresta(181.0, "João Pessoa", "Natal");
        grafo.addAresta(181.0, "Natal", "João Pessoa");
        grafo.addAresta(117.1, "João Pessoa", "Recife");
        grafo.addAresta(241.0, "João Pessoa", "Caruaru");
        grafo.addAresta(241.0, "Caruaru", "João Pessoa");
        grafo.addAresta(115.5, "Salvador", "Feira de Santana");
        grafo.addAresta(115.5, "Feira de Santana", "Salvador");
        grafo.addAresta(323.4, "Salvador", "Aracaju");
        grafo.addAresta(323.4, "Aracaju", "Salvador");
        grafo.addAresta(484.0, "Salvador", "Arapiraca");
        grafo.addAresta(484.0, "Arapiraca", "Salvador");
        grafo.addAresta(400.7, "Fortaleza", "Juazeiro do Norte");
        grafo.addAresta(400.7, "Juazeiro do Norte", "Fortaleza");
        grafo.addAresta(903.3, "Fortaleza", "São Luís");
        grafo.addAresta(903.3, "São Luís", "Fortaleza");
        grafo.addAresta(634.2, "Fortaleza", "Teresina");
        grafo.addAresta(634.2, "Teresina", "Fortaleza");
        grafo.addAresta(536.1, "Fortaleza", "Natal");
        grafo.addAresta(536.1, "Natal", "Fortaleza");
        grafo.addAresta(144.4, "Caruaru", "Campina Grande");
        grafo.addAresta(144.4, "Campina Grande", "Caruaru");
        grafo.addAresta(221.6, "Caruaru", "Arapiraca");
        grafo.addAresta(221.6, "Arapiraca", "Caruaru");
        grafo.addAresta(582.0, "Caruaru", "Petrolina");
        grafo.addAresta(582.0, "Petrolina", "Caruaru");
        grafo.addAresta(481.9, "Arapiraca", "Feira de Santana");
        grafo.addAresta(481.9, "Feira de Santana", "Arapiraca");
        grafo.addAresta(347.4, "Juazeiro do Norte", "Petrolina");
        grafo.addAresta(347.4, "Petrolina", "Juazeiro do Norte");
        grafo.addAresta(642.7, "Petrolina", "Teresina");
        grafo.addAresta(642.7, "Teresina", "Petrolina");
        grafo.addAresta(395.9, "Feira de Santana", "Petrolina");
        grafo.addAresta(395.9, "Petrolina", "Feira de Santana");
        grafo.addAresta(440.6, "Teresina", "São Luís");
        grafo.addAresta(440.6, "São Luís", "Teresina");
        grafo.addAresta(584.8, "Teresina", "Juazeiro do Norte");
        grafo.addAresta(584.8, "Juazeiro do Norte", "Teresina");


        Dijkstra<String> obj = new Dijkstra<String>();
        Scanner scanInt = new Scanner(System.in);
        Scanner scanCidade = new Scanner(System.in);
        Scanner scanDestino = new Scanner(System.in);
        Scanner scanIndex = new Scanner(System.in);


        System.out.println("\nDIGITE A AÇÃO: \n1 BUSCA EM LARGURA \n2 ROTA MAIS CURTA ENTRE DUAS CIDADES \n3 TODAS AS ROTAS MAIS CURTAS PARTINDO DA CIDADE \n4 DISTÂNCIA DE DETERMINADA ARESTA");

        int acao = scanInt.nextInt();

        switch (acao) {
            case 1 -> {
                System.out.println("Digite o Número da cidade que você quer começar: \nRecife: 0\nFortaleza: 1\nSalvador: 2\nJoão Pessoa: 3\nMaceió: 4\nTeresina: 5\nAracaju: 6\nNatal: 7\nSão Luís: 8\nFeira de Santana: 9\nCampina Grande: 10\nCaruaru: 11\nJuazeiro do Norte: 12\nArapiraca: 13\nPetrolina: 14");
                int index = scanIndex.nextInt();
                grafo.buscaLargura(index);
            }
            case 2 -> {
                System.out.println("Qual cidade é o ponto de partida?");
                String cidade = scanCidade.nextLine();
                obj.menorCaminho(grafo.getVertice(grafo.getVertice(cidade).getDado()));
                System.out.println("Destino desejado: ");
                String dest = scanDestino.nextLine();
                for (Vertice<String> rota : grafo.getVerticesG()) {
                    if (rota.getDado().equals(dest)) {
                        System.out.print("Destino - " + rota.getDado() + " , Distância Mínima - " + rota.distanciaMin + "\nCaminho - [ ");
                        for (Vertice<String> caminhoV : rota.caminho) {
                            System.out.print(caminhoV.getDado() + " > ");
                        }
                        System.out.println("" + rota.getDado() + " ]");
                    }
                }
            }
            case 3 -> {
                System.out.println("Você quer ver os caminhos de partindo de que cidade?");
                String cidade2 = scanCidade.nextLine();
                obj.menorCaminho(grafo.getVertice(grafo.getVertice(cidade2).getDado()));
                for (Vertice<String> rota2 : grafo.getVerticesG()) {
                    System.out.print("\nDestino - " + rota2.getDado() + " , Distância Mínima - " + rota2.distanciaMin + "\nCaminho - [ ");
                    for (Vertice<String> caminhoV2 : rota2.caminho) {
                        System.out.print(caminhoV2.getDado() + " > ");
                    }
                    System.out.println("" + rota2.getDado() + " ]");
                }
            }
            case 4 -> {
                System.out.println("Você gostaria de ver a distância(em Km) de que aresta?");
                System.out.println("Início: ");
                String verticeI = scanCidade.nextLine();
                System.out.println("Destino: ");
                String verticeF = scanDestino.nextLine();
                if (grafo.getAresta(grafo.getVertice(verticeI), grafo.getVertice(verticeF)) == null) {
                    System.out.println("Essa aresta não existe!");
                } else {
                    System.out.println("A distância entre " + verticeI + " e " + verticeF + " é de: " + grafo.getAresta(grafo.getVertice(verticeI), grafo.getVertice(verticeF)).getDistancia() + " Km");
                }
            }
        }
    }
}
