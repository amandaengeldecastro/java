import java.util.Scanner;
import java.util.Calendar;

public class Login {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Calendar agora = Calendar.getInstance();
        int hora = agora.get(Calendar.HOUR_OF_DAY); //	int hora = agora.get(Calendar.HOUR) + ((Calendar.PM==1)?12:0);
        System.out.println("Insira o seu usuario: ");
        String usuario = entrada.nextLine();
        
        System.out.println("Insira a sua senha: ");
        String senha = entrada.nextLine();
        
        if((hora >=6 && hora<12) && (usuario.equals("compass") && senha.equals("compass123"))){
            System.out.println("Bom dia, voce se logou ao nosso sistema.");
            } else if((hora >= 12 && hora<18) && (usuario.equals("compass") && senha.equals("compass123"))){
            System.out.print("Boa tarde, voce se logou ao nosso sistema. ");
        } else if ((hora >= 18 && hora < 00) &&  (usuario.equals("compass") && senha.equals("compass123"))){
            System.out.print("Boa noite,voce se logou ao nosso sistema ");
        } else if ((hora >=00 && hora<6) && (usuario.equals("compass") && senha.equals("compass123"))){
            System.out.print("Boa madrugada, voce se logou ao nosso sistema. ");
        } else {
                System.out.println("Usuario e/ou senha incorretos.");
        }  	
        
        entrada.close();
    }
}
