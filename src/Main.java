import java.util.Locale;

public class Main {
    public static void main (String[] args){
      Locale.setDefault (Locale.US);
      int idade;
      double salario, altura;
      char genero;
      String nome;


       idade = 30;
       salario = 1.700;
       altura = 1.70;
       genero = 'F';
       nome = "Deivid Dioclecio Matins de Oliveira";

       System.out.println("IDADE = " + idade);
       System.out.println ("MEU SALARIO É:" + String.format("%.3f", salario));
       System.out.println (String.format("%.2f", altura) + "cm");
       System.out.println (genero);
       System.out.println ("Meu nome é: " + nome);
       

    }


}
