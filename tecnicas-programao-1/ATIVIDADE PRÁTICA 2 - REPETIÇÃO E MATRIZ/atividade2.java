import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
        String [] [] usuarios = new String [6] [2];
        
        String login,senha;
        
        System.out.println("Crie o login e a senha para 6 usuários: ");
        for(int i = 0; i < 6;i++) {
        		System.out.println("login: ");
        		usuarios [i] [0] = entrada.nextLine().toLowerCase();
        		System.out.println("Senha: ");
        		usuarios [i] [1] = entrada.nextLine().toLowerCase();
        }
        
        System.out.println("Digite o login: ");
        login = entrada.nextLine().toLowerCase();
        
        System.out.println("Digite a senha: ");
        senha = entrada.nextLine().toLowerCase();
        
        boolean cheque = false;
        
        for(int i = 0; i < 6; i++) {
        		if(login.equals(usuarios[i] [0]) && senha.equals(usuarios[i] [1])) {
        			cheque = true;
        			break;
        	}
        }
        
        if (cheque) {
            System.out.println("Senha e usuário corretos!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
        
        
        entrada.close();
	}
}
