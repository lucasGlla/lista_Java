import java.util.Scanner;

public class tarefa3 {
    public static void main(String[] args){
        String nome,sobrenome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = sc.nextLine();

        String[] nomeSeparado = nomeCompleto.split(" ");

        nome = nomeSeparado[0];
        nome = nome.substring(0,1).toUpperCase() + nome.substring(1);
        sobrenome = nomeSeparado[1];
        sobrenome = sobrenome.substring(0,1).toUpperCase() + sobrenome.substring(1);

        if(sobrenome.equals("Wayne")){
            System.out.println("Acesso liberado,sr." + sobrenome);
        } else if(sobrenome.equals("Kent")){
            System.out.println("Sai dai,mane!");
        } else if(nome.equals("Diana")){
            System.out.println("Bem vinda,princesa de Themyscara");
        } else{
            System.out.println("Cai fora");
        }
    }
}
