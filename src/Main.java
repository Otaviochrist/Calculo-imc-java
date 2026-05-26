import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua altura?");
        var altura = sc.nextDouble();
        System.out.println("Quanto você pesa?");
        var peso = sc.nextDouble();
        var imc = (peso / (altura * altura));
        if (imc <= 18.5) {
            System.out.printf("Seu imc é de %.2f - Abaixo do peso%n", imc);
        } else if (imc > 18.5 && imc < 25) {
            System.out.printf("Seu imc é de %.2f - Peso ideal%n", imc);
        }  else if (imc > 24.9 && imc < 30) {
            System.out.printf("Seu imc é de %.2f - Levemente acima do peso%n", imc);
        }  else if (imc > 29.9 && imc < 35) {
            System.out.printf("Seu imc é de %.2f - Obesidade Grau I%n", imc);
        }  else if (imc > 34.9 && imc < 40) {
            System.out.printf("Seu imc é de %.2f - Obesidade Grau II (Severa)%n", imc);
        }  else if (imc > 40) {
            System.out.printf("Seu imc é de %.2f - Obesidade Grau III (Mórbida)%n", imc);
        }
      }
    }