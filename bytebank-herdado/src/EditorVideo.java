public class EditorVideo extends Funcionario {
   // Gerente é um funcionário, gerente herda da class Funcionario

   public double getBonificacao(){
       System.out.println("Chamando o método de bonificacao do Editor de Vídeo");
        return super.getBonificacao() + 100;
    }

}
