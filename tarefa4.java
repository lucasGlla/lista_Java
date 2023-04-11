import java.util.Scanner;

public class tarefa4 {
    public static void main(String[] args){
        double raizQ,raizC;

        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite um numéro: ");
        double valor = sc.nextDouble();
        
        sc.close();

        if(valor % 2 == 0){
            raizC = Math.cbrt(valor);
            System.out.println("O numéro é par e sua raiz cubica é " + raizC);
        }else{
            raizQ = Math.sqrt(valor);
            System.out.println("O numéro é impar e sua raiz quadrada é " + raizQ);
        }
    } 
}
