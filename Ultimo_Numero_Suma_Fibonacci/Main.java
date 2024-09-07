import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n;
        System.out.println("Ingre la posicion del fibonaci que se va sumar");
        n= sc.nextLong();
        if(0<=n && n<=Math.pow(10, 14)){
            System.out.println("El valor de la suma del ultimo digito del fibonaci: " + n + " es: " + Ultimo_numero_suma_fibonacci.ultimonumerosumafibonacci(n));
        }
        sc.close();
    }
   

    }

