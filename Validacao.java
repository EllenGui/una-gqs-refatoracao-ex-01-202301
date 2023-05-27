import java.util.Scanner;

public class Validacao {
  public void calcularValidacaoFinal(Pessoa pessoa, Mensagem mensagem, boolean erroTentativas) {
    // Valido se imprimo a mensagem de erro
    if (erroTentativas == true) {
      mensagem.imprimirMensagemErro();
    } else {
      CalculoPorcentagem calculoPorcentagem = new CalculoPorcentagem();
      calculoPorcentagem.calculaPorcentagem(pessoa);

      // Verifico se a pessoa está retornando de viagem
      if (pessoa.getEstaRetornandoViagem().equals("SIM")) {
        mensagem.imprimirRelatorioFinal(pessoa);
      } else {

        // Verifico a porcentagem de infecção
        if (pessoa.getPorcentagemInfeccao() >= 90) {
          pessoa.setOrientacaoFinal("Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado.");
          mensagem.imprimirRelatorioFinal(pessoa);
        } else {
          pessoa.setOrientacaoFinal("Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
          mensagem.imprimirRelatorioFinal(pessoa);
        }
      }
    }
  }

  public void validacaoDasProximasPerguntas(Mensagem mensagem, Pessoa pessoa, boolean erroTentativas, Scanner scanner) {
    // Valido se continuo perguntando ou se vou direto para a mensagem final
    if (erroTentativas == false)
      erroTentativas = mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa, scanner);

    if (erroTentativas == false) {
      erroTentativas = mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa, scanner);
    }

    if (erroTentativas == false) {
      // erroTentativas = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa,
      // scanner);
    }
  }
}
