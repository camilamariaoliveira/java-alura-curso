import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        //um set não tem ordem então não possui comando como get
        // para acessar é necessário fazer um foreach
        // garante que terá apenas um elemento, sem duplicação
        // vantagem ? velocidade

        Collection<String> alunos = new HashSet<>();
        alunos.add("RodrigoTurini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sergio Lopes");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(alunos);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        List<String> alunosEmLista = new ArrayList<>(alunos);


    }
}
