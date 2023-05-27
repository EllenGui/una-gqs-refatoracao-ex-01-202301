import java.util.Scanner;

public class Pessoa {
  private String nome;
  private int idade;
  private String cartaoVacinaEmDia;
  private String teveSintomasRecentemente;
  private String teveContatoComPessoasSintomaticas;
  private String estaRetornandoViagem;
  private int porcentagemInfeccao;
  private String orientacaoFinal;

  
  
  public void coletaNome(Pessoa pessoa, Scanner scanner) {
   System.out.println("\nInforme o seu nome: ");
   nome = scanner.nextLine();
   
}

  public void coletaIdade(Pessoa pessoa, Scanner scanner) {
    System.out.println("\nInforme a sua idade: ");
    idade = scanner.nextInt();
}



  public String getNome(){
    return nome;
}
  public void setNome(String nome){
    this.nome = nome;
}
  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade){
    this.idade = idade;
  }
  public String getcartaoVacinaEmDia(){
    return cartaoVacinaEmDia;
  }
  public void setcartaoVacinaEmDia(String cartaoDeVacinaEmDia){
    this.cartaoVacinaEmDia = cartaoDeVacinaEmDia;
  }
  public String getteveSintomasRecentemente(){
    return teveSintomasRecentemente;
  }
  public void setteveSintomasRecentemente(String teveSintomasRecentemente){
    this.teveSintomasRecentemente = teveSintomasRecentemente;
  }
  public String getteveContatoComPessoasSintomaticas(){
    return teveContatoComPessoasSintomaticas;
  }
  public void setteveContatoComPessoasSintomaticas(String teveContatoComPessoasSintomaticas){
    this.teveContatoComPessoasSintomaticas = teveContatoComPessoasSintomaticas;
  }
  public String getestaRetornandoViagem(){
    return estaRetornandoViagem;
  }
  public void setestaRetornandoViagem(String estaRetornandoViagem){
    this.estaRetornandoViagem = estaRetornandoViagem;
  }
  public int getporcentagemInfeccao(){
    return porcentagemInfeccao;
  }
  public void setporcentagemInfeccao(int porcentagemInfeccao){
    this.porcentagemInfeccao = porcentagemInfeccao;
  }
  public String getorientacaoFinal(){
    return orientacaoFinal;
  }
  public void setorientacaoFinal(String orientacaoFinal){
    this.orientacaoFinal = orientacaoFinal;
  }
}