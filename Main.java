import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
System.out.println("Iniciando os trabalhos do restaurante...");

  Cozinha cozMin = new Cozinha(10, Cozinha.Origem.Mineira , 5, 30, 14, 20, "Virado a Paulista");
    
    cozMin.acrescentarIngredientes("🧆  Feijão", new Date(01-04-2022));
    cozMin.acrescentarIngredientes("🌾  Farinha", new Date(2022-05-03));
    cozMin.acrescentarIngredientes("🍚  Arroz", new Date(2022-06-2));
    cozMin.acrescentarIngredientes("🥓  Carne de Porco", new Date(2022-06-10));
    cozMin.acrescentarIngredientes("🐷  Linguiça", new Date(2022-02-15));

    cozMin.adicionarFuncionario("🤵  Andre", "Garçon");
    cozMin.adicionarFuncionario("👨‍🍳  Paulo", "Cozinheiro");
    cozMin.adicionarFuncionario("👩  Joice", "Gerente");
    cozMin.adicionarFuncionario("👩🏽  Joelma", "Atendente");

  Cozinha cozChi = new Cozinha(15,Cozinha.Origem.Chinesa, 1, 50, 13, 22, "Yakissoba 🍜");
    cozChi.acrescentarIngredientes("🍣  Champignon", new Date(2022-02-20));
    cozChi.acrescentarIngredientes("🥦  Brócolis", new Date(2022-03-10));
    cozChi.acrescentarIngredientes("🍝  Macarrão ", new Date(2022-05-10));
    cozChi.acrescentarIngredientes("🥩  Carne", new Date(2022-04-8));

    cozChi.adicionarFuncionario("🤵  TanaKara", "Garçon");
    cozChi.adicionarFuncionario("👨‍🍳  Kitabo", "Sushimam");
    cozChi.adicionarFuncionario("🕴️   Kiwaba", "Gerente");
    cozChi.adicionarFuncionario("🧑  TameAtende", "Atendente");


  Cozinha cozIt = new Cozinha(15,Cozinha.Origem.Italiana, 1, 50, 13, 22, "Lasanha");
    cozIt.acrescentarIngredientes("🍅  Molho", new Date(2022-03-8));
    cozIt.acrescentarIngredientes("🍝  Massa", new Date(2022-04-2));
    cozIt.acrescentarIngredientes("🧀  Mussarela", new Date(2022-06-11));
    cozIt.acrescentarIngredientes("🍖  Presunto", new Date(2022-06-11));

    cozIt.adicionarFuncionario("🤵  Giovanni", "Garçon");
    cozIt.adicionarFuncionario("👨‍🍳  Francesco", "Cozinheiro");
    cozIt.adicionarFuncionario("👩🏾  Maria", "Gerente");
    cozIt.adicionarFuncionario("👩🏼  Giuseppe", "Atendente");

  Cozinha cozPt = new Cozinha(7,Cozinha.Origem.Portuguesa, 1, 60, 12, 24, " Bolinho de Bacalhau ");
    cozPt.acrescentarIngredientes("🌾  Farinha Trigo", new Date(2022-05-10));
    cozPt.acrescentarIngredientes("🥚   Ovos", new Date(2022-05-10));
    cozPt.acrescentarIngredientes("🥔  Batata", new Date(2022-05-10));
    cozPt.acrescentarIngredientes("🐟  Bacalhau", new Date(2022-05-10));

    cozPt.adicionarFuncionario("🧑  Paulo", "Garçon");
    cozPt.adicionarFuncionario("👨‍🍳  Carlos", "Cozinheiro");
    cozPt.adicionarFuncionario("👩🏾  Beatriz;", "Gerente");
    cozPt.adicionarFuncionario("👩🏼  Leonor;", "Atendente");

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
  System.out.printf("Bem vindo ao Restaurante:  \n" + cozMin + "\n");
  break;
  case 2: 
  result = entrada.nextInt();
  System.out.printf("Bem vindo ao Restaurante: \n" + cozIt + "\n");
  break;
  case 3:
  result = entrada.nextInt();
  System.out.printf("Bem vindo ao Restaurante: \n" + cozChi + "\n");
  break;
  default:
   result = entrada.nextInt();
   System.out.printf("Bem vindo ao Restaurante: \n" + cozPt + "\n");
  break;
}



System.exit(0);

 
  }
}