import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);

        for (int i = 0; i<aulas.size(); i++){
            System.out.println("aula : "+ aulas.get(i));
        }

        System.out.println(aulas.size());

        aulas.forEach(aula ->{
            System.out.println("percorrendo :");
            System.out.println("Aula " + aula);});
        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println("Depois de ordenado: ");
        System.out.println(aulas);

        // System.out.println("**** ArrayList vs LinkedList ***");
        //
        // List<Integer> numerosArrayList = new ArrayList<>();
        // List<Integer> numerosLinkedList = new LinkedList<>();
        // int quantidadeElementos = 1000000;
        //
        // long tempoArrayList  = insereElementosNo(numerosArrayList, quantidadeElementos);
        // long tempoLinkedList = insereElementosNo(numerosLinkedList, quantidadeElementos);
        //
        // System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
        // System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
        //
        // tempoArrayList = removePrimeirosElementos(numerosArrayList);
        // tempoLinkedList = removePrimeirosElementos(numerosLinkedList);
        //
        // System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
        // System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
        //
        // private static long removePrimeirosElementos(List<Integer> numeros) {
        //     long ini = System.currentTimeMillis();
        //
        //     for (int i = 0; i < 100; i++) {
        //         numeros.remove(0); //removendo sempre o primeiro elemento
        //     }
        //     long fim = System.currentTimeMillis();
        //     return fim-ini;
        // }
        //
        // private static long insereElementosNo(List<Integer> numeros, int quantidade) {
        //     long ini = System.currentTimeMillis();
        //     for (int i = 0; i < quantidade; i++) {
        //         numeros.add(i);
        //     }
        //     long fim = System.currentTimeMillis();
        //     return fim-ini;
        // }

    }
}
