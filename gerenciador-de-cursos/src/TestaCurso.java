import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes =new Curso("Dominando as coleções do Java", "Paulo Silveira");

        //Não vai funcionar mais por causa do Collections.unmodifiableList(aulas)
        // javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelagem com coleções", 22));

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(javaColecoes.getAulas());
        



    }
}
