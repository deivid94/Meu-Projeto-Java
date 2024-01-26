public class Senha {
    public static void main (String[] args){
        String  senha = "123456";
        if (senha.equals("12345")){
            System.out.println("Acesso Autorizado");
        }else {
            System.err.println("Senha Incorreta");
        }
    }
}
