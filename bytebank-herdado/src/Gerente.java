public class Gerente extends Funcionario {
   // Gerente é um funcionário, gerente herda da class Funcionario
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if (this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

   public double getBonificacao(){
       System.out.println("Chamando o método de bonificação do Gerente");
        return super.getBonificacao() + super.getSalario();
    }

}