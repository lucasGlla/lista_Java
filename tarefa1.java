import java.util.Scanner;

public class tarefa1{
    public static void main(String[] args){
            double result,raizQ,raizC,a,b,c,d; 
            Scanner sc = new Scanner(System.in);
            System.out.println("Escolha a operacao: \n 1-Adicao \n 2-Subtracao \n 3-multiplicacao \n 4-divisao \n 5-raiz quadrada \n 6-raiz cubica \n 7-Operações basicas");
            int op = sc.nextInt();
            System.out.println("Digite o primeiro numero:");
            double x = sc.nextDouble();
            System.out.println("Digite o segundo numero:");
            double y = sc.nextDouble();
            
            switch(op){
                case 1:
                result = x + y;
                System.out.println(result);
                break;
                case 2:
                result = x - y;
                System.out.println(result);
                break;
                case 3:
                result = x * y;
                System.out.println(result);
                break;
                case 4:
                result = x / y;
                System.out.println(result);
                break;
                case 5:
                raizQ = Math.sqrt(x);
                System.out.println(raizQ);
                break;
                case 6:
                raizC = Math.cbrt(x);
                System.out.println(raizC);
                break;
                case 7:
                a = x + y;
                b = x - y;
                c = x * y;
                d = x / y;
                System.out.println("Adição:" + a + "\nSubtração:" + b + "\nMultiplacação: " + c + "\nDivisão:" + d);
                break;
                default:
                System.out.println("Não existe essa operacao!");
            }
        }

    }