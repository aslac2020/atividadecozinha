import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    
System.out.println("Iniciando os trabalhos do restaurante...");

  Cozinha cozMin = new Cozinha(10, Cozinha.Origem.Mineira , 5, 30, 14, 20, "Virado a Paulista");
    
    cozMin.acrescentarIngredientes("🧆  Feijão");
    cozMin.acrescentarIngredientes("🌾  Farinha");
    cozMin.acrescentarIngredientes("🍚  Arroz");
    cozMin.acrescentarIngredientes("🥓  Carne de Porco");
    cozMin.acrescentarIngredientes("🐷  Linguiça");

    cozMin.adicionarFuncionario("🤵  Andre", "Garçon");
    cozMin.adicionarFuncionario("👨‍🍳  Paulo", "Cozinheiro");
    cozMin.adicionarFuncionario("👩  Joice", "Gerente");
    cozMin.adicionarFuncionario("👩🏽  Joelma", "Atendente");

    cozMin.adicionarDatadeValidade("🧆  Feijão", LocalDate.of(2022, 03, 06));
    cozMin.adicionarDatadeValidade("🌾  Farinha", LocalDate.of(2022, 07, 05));
    cozMin.adicionarDatadeValidade("🍚  Arroz", LocalDate.of(2022, 05, 04));
    cozMin.adicionarDatadeValidade("🥓  Carne de Porco", LocalDate.of(2022, 06, 05));
    cozMin.adicionarDatadeValidade("🐷  Linguiça", LocalDate.of(2022, 06, 05));

  Cozinha cozChi = new Cozinha(15,Cozinha.Origem.Chinesa, 1, 50, 13, 22, "Yakissoba 🍜");
    cozChi.acrescentarIngredientes("🍣  Champignon");
    cozChi.acrescentarIngredientes("🥦  Brócolis");
    cozChi.acrescentarIngredientes("🍝  Macarrão");
    cozChi.acrescentarIngredientes("🥩  Carne");

    cozChi.adicionarFuncionario("🤵  TanaKara", "Garçon");
    cozChi.adicionarFuncionario("👨‍🍳  Kitabo", "Sushimam");
    cozChi.adicionarFuncionario("🕴️   Kiwaba", "Gerente");
    cozChi.adicionarFuncionario("🧑  TameAtende", "Atendente");

    cozChi.adicionarDatadeValidade("🍣  Champignon", LocalDate.of(2022, 03, 06));
    cozChi.adicionarDatadeValidade("🥦  Brócolis", LocalDate.of(2022, 07, 05));
    cozChi.adicionarDatadeValidade("🍝  Macarrão", LocalDate.of(2022, 05, 04));
    cozChi.adicionarDatadeValidade("🥩  Carne", LocalDate.of(2022, 06, 05));
    


  Cozinha cozIt = new Cozinha(15,Cozinha.Origem.Italiana, 1, 50, 13, 22, "Lasanha");
    cozIt.acrescentarIngredientes("🍅  Molho");
    cozIt.acrescentarIngredientes("🍝  Massa");
    cozIt.acrescentarIngredientes("🧀  Mussarela");
    cozIt.acrescentarIngredientes("🍖  Presunto");

    cozIt.adicionarFuncionario("🤵  Giovanni", "Garçon");
    cozIt.adicionarFuncionario("👨‍🍳  Francesco", "Cozinheiro");
    cozIt.adicionarFuncionario("👩🏾  Maria", "Gerente");
    cozIt.adicionarFuncionario("👩🏼  Giuseppe", "Atendente");


    cozIt.adicionarDatadeValidade("🍅  Molho", LocalDate.of(2022, 03, 06));
    cozIt.adicionarDatadeValidade("🍝  Massa", LocalDate.of(2022, 07, 05));
    cozIt.adicionarDatadeValidade("🧀  Mussarela", LocalDate.of(2022, 05, 04));
    cozIt.adicionarDatadeValidade("🍖  Presunto", LocalDate.of(2022, 06, 05));
    

  Cozinha cozPt = new Cozinha(7,Cozinha.Origem.Portuguesa, 1, 60, 12, 24, " Bolinho de Bacalhau ");
    cozPt.acrescentarIngredientes("🌾  Farinha Trigo" );
    cozPt.acrescentarIngredientes("🥚   Ovos" );
    cozPt.acrescentarIngredientes("🥔  Batata" );
    cozPt.acrescentarIngredientes("🐟  Bacalhau");

    cozPt.adicionarFuncionario("🧑  Paulo", "Garçon");
    cozPt.adicionarFuncionario("👨‍🍳  Carlos", "Cozinheiro");
    cozPt.adicionarFuncionario("👩🏾  Beatriz;", "Gerente");
    cozPt.adicionarFuncionario("👩🏼  Leonor;", "Atendente");

    cozPt.adicionarDatadeValidade("🌾  Farinha Trigo", LocalDate.of(2022, 03, 06));
    cozPt.adicionarDatadeValidade("🥚   Ovos", LocalDate.of(2022, 07, 05));
    cozPt.adicionarDatadeValidade("🥔  Batata", LocalDate.of(2022, 05, 04));
    cozPt.adicionarDatadeValidade("🐟  Bacalhau", LocalDate.of(2022, 06, 05));


System.out.println("Qual seu Restaurante Favorito ? ");
System.out.println("1 - Mineira, 2 - Italiana, 3 - Chinesa, 4 - Portuguesa");

Scanner entrada = new Scanner(System.in);
 int opcoes;
 opcoes = entrada.nextInt();
 int result = opcoes;

 System.out.println("Confirme o numero novamente!");

  switch (result)
  {
  case 1: 
  result = entrada.nextInt();
  System.out.printf("Bem vindo ao Restaurante Mineiro:  \n" +"\n" + cozMin + "\n");
  break;
  case 2: 
  result = entrada.nextInt();
  System.out.printf("Bem vindo ao Restaurante Italiano: \n" + "\n" + cozIt + "\n");
  break;
  case 3:
  result = entrada.nextInt();
  System.out.printf("Bem vindo ao Restaurante Chinês: \n" +"\n" + cozChi + "\n");
  break;
  default:
   result = entrada.nextInt();
   System.out.printf("Bem vindo ao Restaurante Português: \n" +"\n" + cozPt + "\n");
  break;
}

  }
}