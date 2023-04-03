import java.util.Objects;

public class Aluno {

    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
    //Feito no curso:
    // @Override
    // public boolean equals(Object obj) {
    //     Aluno outro =(Aluno) obj;
    //     return this.nome.equals(outro.nome);
    // }
    // @Override
    // public int hashCode(){
    //     return this.nome.hashCode();
    // }

    //Gerado pela ide
    // @Override
    // public boolean equals(Object o) {
    //     if (this == o) return true;
    //     if (!(o instanceof Aluno aluno)) return false;
    //     return getNumeroMatricula() == aluno.getNumeroMatricula() && getNome().equals(aluno.getNome());
    // }
    // @Override
    // public int hashCode() {
    //     return Objects.hash(getNome(), getNumeroMatricula());
    // }

    //o que o curso sugeriu que seria o resultado (IDE Eclipse):
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + numeroMatricula;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numeroMatricula != other.numeroMatricula)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno: "+ this.nome + ", Matricula=" + this.numeroMatricula +'.';
    }
}