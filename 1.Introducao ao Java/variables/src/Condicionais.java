
public class Condicionais {

  public static void main(String[] args) {
    int nota = 69; //Nice

    if(nota >= 70)
      System.out.println("aprovado");
    else
      System.out.println("não aprovado");



    String grado = "A";

    if(nota >= 90)
      grado = "A";
    else if(nota > 80 && nota < 90)
      grado = "B";
    else if(nota > 70 && nota < 80)
      grado = "C";
    else if(nota < 70)
      grado = "D";


    switch (grado){
      case "A":
      case "B":
        System.out.println("Aluno Aprovado");
        break;
      case "C":
      case "D":
        System.out.println("Aluno Reprovado");
        break;
    }
  }

}