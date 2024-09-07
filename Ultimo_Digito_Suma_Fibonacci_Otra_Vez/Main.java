import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n;
        long m;
        System.out.println("Ingrese el primer valor no negativo");
        n=sc.nextLong();
        System.out.println("Ingrese el segundo valor no negativo");
        m= sc.nextLong();
       
            System.out.println("El ultimo digito de la suma de los fibonaccis es : " + Ultimo_Digito_Suma_Fibonacci.lastDigitOfFibonacciSum(m, n));
        
        sc.close();
    }
}
