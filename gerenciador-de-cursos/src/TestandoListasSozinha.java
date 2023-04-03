import java.util.*;

public class TestandoListasSozinha {

    public static void main(String[] args) {
       String curso1 = "Dominando C#";
       String curso2 = "Clean Code";
       String curso3 = "Desenvolvendo para todos - Mobile";

       ArrayList<String> cursos = new ArrayList<>();
       cursos.add(curso1);
       cursos.add(curso2);
       cursos.add(curso3);

       //cursos.remove(0);

        //System.out.println("O primeiro curso é o " + cursos.get(0));

       // foreach
        // for (String curso: cursos) {
        //     System.out.println("Os cursos disponíveis do semestre são: " + curso);
        // }

       // for normal
       //  for (int i = 0; i<cursos.size(); i++){
       //      System.out.println("Curso : "+ cursos.get(i));
       //  }

        Collections.sort(cursos);
        System.out.println(cursos);

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        System.out.println(alunos.size());
        alunos.add("Alberto");
        System.out.println(alunos.size());

    }
}