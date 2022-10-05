package EmpFrete;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Grafos<String> grafo = new Grafos<String>();

        Scanner scanIndex = new Scanner(System.in);

        //Cidades com sede da Empresa
        grafo.addVertice("Recife"); //1
        grafo.addVertice("Fortaleza"); //2
        grafo.addVertice("Salvador"); //3
        grafo.addVertice("João Pessoa"); //4
        grafo.addVertice("Maceió"); //5
        //Cidades sem sede da Empresa
        grafo.addVertice("Teresina");
        grafo.addVertice("Aracaju");
        grafo.addVertice("Natal");
        grafo.addVertice("São Luís");
        grafo.addVertice("Feira de Santana");
        grafo.addVertice("Campina Grande");
        grafo.addVertice("Caruaru");
        grafo.addVertice("Juazeiro do Norte");
        grafo.addVertice("Arapiraca");
        grafo.addVertice("Petrolina");

        grafo.addAresta(133.2, "Recife", "Caruaru");
        grafo.addAresta(133.2, "Caruaru", "Recife");
        grafo.addAresta(117.1, "Recife", "João Pessoa");
        grafo.addAresta(257.1, "Recife", "Maceió");
        grafo.addAresta(200.6, "Recife", "Campina Grande");
        grafo.addAresta(200.6, "Campina Grande", "Recife");
        grafo.addAresta(599.5, "Maceió", "Salvador");
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
        grafo.addAresta(670.7, "João Pessoa", "Fortaleza");
        grafo.addAresta(117.1, "João Pessoa", "Recife");
        grafo.addAresta(241.0, "João Pessoa", "Caruaru");
        grafo.addAresta(241.0, "Caruaru", "João Pessoa");
        grafo.addAresta(599.5, "Salvador", "Maceió");
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
        grafo.addAresta(670.7, "Fortaleza", "João Pessoa");
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

        System.out.println("Digite o Número da cidade que você quer começar: (Recife: 0, Fortaleza: 1, Salvador: 2, João Pessoa: 3, Maceió: 4)");
        int index = scanIndex.nextInt();
        grafo.buscaLargura(index);
    }
}