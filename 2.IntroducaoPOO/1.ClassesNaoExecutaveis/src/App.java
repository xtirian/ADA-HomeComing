import ada.animais.domesticos.Cachorro;
import ada.animais.domesticos.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Classes Não executaveis");

        Cachorro vilma = new Cachorro();
        Cachorro teresa = new Cachorro();
        Gato Bruno = new Gato();
        Gato Henrique = new Gato();

        /*vilma.nome = "Vilma";
        vilma.cor = "Marrom";
        vilma.altura = 1;
        vilma.peso = 5.5;
        vilma.tamanhoRabo = 1.2;*/

        vilma.setAltura(1);
        vilma.setCor("Marrom");
        vilma.setNome("Vilma");
        vilma.setPeso(5.5);
        vilma.setTamanhoRabo(1.2);


        System.out.println(vilma);

        vilma.comer();
        vilma.soar();
        Bruno.soar();
        System.out.println(vilma.pegar());        


        System.out.println("O cachorro está " + vilma.interagir("carinho"));

        System.out.println(vilma);

        System.out.println(Cachorro.getNumeroDeAnimais());
        }

        

        
}
