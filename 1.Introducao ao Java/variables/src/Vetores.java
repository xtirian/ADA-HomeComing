import java.util.Arrays;

public class Vetores {
  public static void main(String[] args) {

    int[] numeros = new int[5]; // instanciando um array de tamanho 5 elementos

    numeros[0] = 31;
    numeros[1] = 2;
    numeros[2] = 54;
    numeros[3] = 56;
    numeros[4] = 24;

    for (int i = 0; i < numeros.length; i++) {
      System.out.println(numeros[i]);
    }

    System.out.println(Arrays.toString(numeros));

    int maior = numeros[0];
    int menor = numeros[0];
    int media;

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maior)
        maior = numeros[i];

      if (numeros[i] < menor)
        menor = numeros[i];
    }

    media = (maior + menor) / 2;

    System.out.println(maior);
    System.out.println(menor);
    System.out.println(media);

  }

}