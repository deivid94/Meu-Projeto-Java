public class exercicio3 {
    public static void main (String[] args){
        double precoOriginal = 1250;
        double percentualDesconto = 20;

        double valorComDeconto = (precoOriginal * (percentualDesconto / 100));
        System.out.println("Valor total sem deconto: " + (int)precoOriginal + " Reais");
        System.out.println("O valor com "+ (int)percentualDesconto+"%" + " é de: " + (int)(precoOriginal - valorComDeconto)+ " Reais" );
    }
    
}
