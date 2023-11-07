
public class Lacos {
    public static void main(String[] args) {
      
      for(int i = 0; i <= 20; i++)
        for(int j = i + 1; j <= 20 + 1; j++ )
          System.out.println(System.out.printf("%d * %d = %d", i,j,i*j));          
    }
}