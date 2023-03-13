public class Designer extends Funcionario {
   // Gerente é um funcionário, gerente herda da class Funcionario

   public double getBonificacao(){
       System.out.println("Chamando o método de bonificacao do Designer");
        return super.getBonificacao() + 200;
    }

}
