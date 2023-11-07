import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class StringsDatas {
  public static void main(String[] args) {

    String nome = "José";

    System.out.println(nome.toUpperCase());
    System.out.println(nome.toLowerCase());
    System.out.println(nome.length());

    String nomeOutro = "josé";
    System.out.println(nome.equals(nomeOutro));
    System.out.println(nome.equalsIgnoreCase(nomeOutro));

    // DATAS

    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale("pt", "BR");
    String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

    int horaAtual = LocalDateTime.now().getHour();

    String saudacao;

    if (horaAtual >= 5 && horaAtual < 12)
      saudacao = "Bom dia";
    else if (horaAtual >= 12 && horaAtual < 19)
      saudacao = "Boa tarde";
    else
      saudacao = "Boa noite";   


    System.out.printf("Olá %s, hoje é %s, %s %n", nome, diaSemana, saudacao.toUpperCase());

  }


}