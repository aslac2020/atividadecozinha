import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.Date;

class Cozinha{

  public enum Origem{
    Mineira, Chinesa, Italiana, Portuguesa
  }

  public Cozinha (int numeroPratos,
                  Origem tipo,
                  int numeroCozinheiros,
                  int tempoPreparo,
                  int horaAbertura,
                  int horaFechamento,
                  String pratoPrincipal
                )
                {
                  this.numeroPratos = numeroPratos;
                  this.tipo = tipo;
                  this.numeroCozinheiros = numeroCozinheiros;
                  this.tempoPreparo = tempoPreparo;
                  this.horaAbertura = horaAbertura;
                  this.horaFechamento = horaFechamento;
                  this.pratoPrincipal = pratoPrincipal;
                  ingredientes = new ArrayList<>();
                  funcionarios = new ArrayList<>();
                  vencimentos = new ArrayList<>();
  }
  private int numeroPratos;
  private Origem tipo;
  private int numeroCozinheiros;
  private int tempoPreparo;
  private int horaAbertura;
  private int horaFechamento;  
  private String pratoPrincipal;
  private List<Ingrediente> ingredientes;
  private List<Funcionario> funcionarios;
  private List<Vencimento> vencimentos;

void acrescentarIngredientes(String nome){
  Ingrediente ingrediente = new Ingrediente(nome);
  ingredientes.add(ingrediente);
}

void adicionarFuncionario(String nome, String atividade){
  Funcionario funcionario = new Funcionario(nome, atividade);
  funcionarios.add(funcionario);
}

 void adicionarDatadeValidade(String nome, LocalDate dataVencimento){
   Vencimento datavencimento = new Vencimento(nome, dataVencimento);
   vencimentos.add(datavencimento);
 }
 

@Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      String retorno = "";
      retorno += "Dados da Cozinha: \n";
      retorno += "------------------------- \n";
      retorno += "🍲  Prato Principal: " + pratoPrincipal + "\n";
      retorno += "🍽️  Numero de Pratos: " + numeroPratos +"\n";
      retorno += "🏪  Tipo:"+ tipo + "\n";
      retorno += "👨‍🍳  Cozinheiros: " + numeroCozinheiros + "\n";
      retorno += "⌛  Tempo de Preparo: " + tempoPreparo +  "\n";
      retorno += "🕗  Abertura: " + horaAbertura + " às " + horaFechamento + "\n\n";

      stringBuilder.append(retorno);

      stringBuilder.append("------------------------- \n");
      stringBuilder.append("Principais ingredientes: \n");

      for(Ingrediente ingrediente : ingredientes){
        retorno = ingrediente.nome.toString() + "\n";
        stringBuilder.append(retorno);
      }
      
 
      stringBuilder.append("------------------------- \n");
      stringBuilder.append("Funcionários: \n");

      for(Funcionario funcionario : funcionarios){
        retorno = funcionario.nome.toString() + " - " + funcionario.atividade.toString() +   "\n";
        stringBuilder.append(retorno);
      }

      stringBuilder.append("------------------------- \n");
      stringBuilder.append("Data de Validade: \n");
    
      for(Vencimento vencimento : vencimentos){
        
        LocalDate localdate = vencimento.dataVencimento;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedString = localdate.format(formatter);
        retorno = vencimento.nome.toString() +" - " +  " Validade : " +  formattedString +  "\n";
        stringBuilder.append(retorno);
      }

      return stringBuilder.toString();                      
                    
    }
}