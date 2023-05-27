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

  public String getOrientacaoFinal() {
    return orientacaoFinal;
}

public void setOrientacaoFinal(String orientacaoFinal) {
    this.orientacaoFinal = orientacaoFinal;
}

public int getPorcentagemInfeccao() {
    return porcentagemInfeccao;
}

public void setPorcentagemInfeccao(int porcentagemInfeccao) {
    this.porcentagemInfeccao = porcentagemInfeccao;
}

public String getEstaRetornandoViagem() {
    return estaRetornandoViagem;
}

public void setEstaRetornandoViagem(String estaRetornandoViagem) {
    this.estaRetornandoViagem = estaRetornandoViagem;
}

public String getTeveContatoComPessoasSintomaticas() {
    return teveContatoComPessoasSintomaticas;
}

public void setTeveContatoComPessoasSintomaticas(String teveContatoComPessoasSintomaticas) {
    this.teveContatoComPessoasSintomaticas = teveContatoComPessoasSintomaticas;
}

public String getTeveSintomasRecentemente() {
    return teveSintomasRecentemente;
}

public void setTeveSintomasRecentemente(String teveSintomasRecentemente) {
    this.teveSintomasRecentemente = teveSintomasRecentemente;
}

public String getCartaoVacinaEmDia() {
    return cartaoVacinaEmDia;
  }

  public void setCartaoVacinaEmDia(String cartaoVacinaEmDia) {
    this.cartaoVacinaEmDia = cartaoVacinaEmDia;
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
    return getCartaoVacinaEmDia();
  }
  public void setcartaoVacinaEmDia(String cartaoDeVacinaEmDia){
    this.setCartaoVacinaEmDia(cartaoDeVacinaEmDia);
  }
  public String getteveSintomasRecentemente(){
    return getTeveSintomasRecentemente();
  }
  public void setteveSintomasRecentemente(String teveSintomasRecentemente){
    this.setTeveSintomasRecentemente(teveSintomasRecentemente);
  }
  public String getteveContatoComPessoasSintomaticas(){
    return getTeveContatoComPessoasSintomaticas();
  }
  public void setteveContatoComPessoasSintomaticas(String teveContatoComPessoasSintomaticas){
    this.setTeveContatoComPessoasSintomaticas(teveContatoComPessoasSintomaticas);
  }
  public String getestaRetornandoViagem(){
    return getEstaRetornandoViagem();
  }
  public void setestaRetornandoViagem(String estaRetornandoViagem){
    this.setEstaRetornandoViagem(estaRetornandoViagem);
  }
  public int getporcentagemInfeccao(){
    return getPorcentagemInfeccao();
  }
  public void setporcentagemInfeccao(int porcentagemInfeccao){
    this.setPorcentagemInfeccao(porcentagemInfeccao);
  }
  public String getorientacaoFinal(){
    return getOrientacaoFinal();
  }
  public void setorientacaoFinal(String orientacaoFinal){
    this.setOrientacaoFinal(orientacaoFinal);
  }
}