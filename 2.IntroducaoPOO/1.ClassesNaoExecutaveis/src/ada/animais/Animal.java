package ada.animais;


public abstract class Animal {
  static int numeroDeAnimais;
  private String nome;
  private String cor;
  private int altura;
  private double peso;
  private double tamanhoRabo;
  private String estadoEspirito;

  public void comer() {
    System.out.println(nome + " está comendo");
    System.out.println("...");
    System.out.println("...");
    System.out.println(nome + "Comeu");
  }

  public void soar() {
    System.out.println(nome + " está soando");
    System.out.println("AU AU");
  }

  public String pegar() {
    System.out.println(nome + " está correndo atrás da bolinha");

    return "Bolinha devolvida";
  }

  public String interagir(String acao) {
    if (acao.equals("carinho")) {
      this.estadoEspirito = "feliz";
    } else {
      this.estadoEspirito = "triste";

    }
    return this.estadoEspirito;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getTamanhoRabo() {
    return tamanhoRabo;
  }

  public void setTamanhoRabo(double tamanhoRabo) {
    this.tamanhoRabo = tamanhoRabo;
  }

  public String getEstadoEspirito() {
    return estadoEspirito;
  }

  public void setEstadoEspirito(String estadoEspirito) {
    this.estadoEspirito = estadoEspirito;
  }

  public static int getNumeroDeAnimais() {
    return numeroDeAnimais;
  }

  public static void setNumeroDeAnimais(int numeroDeAnimais) {
    Animal.numeroDeAnimais = numeroDeAnimais;
  }

  public Animal() {   

    Animal.numeroDeAnimais++ ;
  }

  @Override
  public String toString() {
    return "Cachorro [nome=" + nome + "]";
  }

  
}