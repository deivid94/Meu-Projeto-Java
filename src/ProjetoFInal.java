import java.util.Random;
import java.util.Scanner;


public class ProjetoFInal { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero interio: ");
        int valorDigitado = sc.nextInt();


        Random  random = new Random();
        int numeroAleatorioCriado = random.nextInt(100);
      
        if (valorDigitado == numeroAleatorioCriado){
            System.out.println("Parabens!! voce acertou o numero: " +numeroAleatorioCriado);
        }else {
            System.out.println("infelizmente voce errou o numero criado era: " +numeroAleatorioCriado);
        }



    }
}
