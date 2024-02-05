import java.util.Random;
import java.util.Scanner;

public class ProjetoJavaFinalRefatorado {
  public static void main(String[] args) {
   for(int i = 0; i < 4; i++ ){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero inteiro de 0 a 100: ");
    String numeroInformadoPeloUsuario = sc.nextInt();
    
    Random numeroAletorio = new Random();
    numeroAletorio.nextInt(100);
    if (numeroInformadoPeloUsuario == numeroAletorio){
      System.out.println("Parabens voce Acertou");
    }else {
      System.out.println("Fim de jogo");
    }
   }
  }
}
