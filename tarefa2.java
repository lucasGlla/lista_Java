import java.util.Scanner;

public class tarefa2 {
    public static void main(String[] args){
        double celsius,fahrenheit,kelvin;


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a escala: \n F-Fahrenheit \n C-celsius \n K-kelvin");
        String escala = sc.nextLine().toUpperCase();
        System.out.println("Digite o valor:");
        double valor = sc.nextDouble();
        
        sc.close();

        switch(escala){
            case "C":
            fahrenheit = (valor * 9/5) + 32;
            kelvin = valor + 273.15;
            System.out.println("Fahrenheit: " + fahrenheit + "\nKelvin: " + kelvin);
            break;
            case "F":
            celsius = (valor - 32) * 9/5;
            kelvin = (valor - 32) * 5/9 + 273.15;
            System.out.println("Celsius: " + celsius + "\nKelvin: " + kelvin);
            break;
            case "K":
            fahrenheit = (valor - 273.15) * 9/5 + 32;
            celsius = valor - 273.15;
            System.out.println("Fahrenheit: " + fahrenheit + "\nCelsius:" + celsius);
            break;
            default:
            System.out.println("Essa escala nao existe");
            break;
        }
    }
}
