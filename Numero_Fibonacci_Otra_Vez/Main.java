import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long x;
        int y;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el primer valor");
        x=sc.nextLong();
        System.out.println("Ingresa el segundo valor");
        y=sc.nextInt();
        long periodopisano=Calcular_Fibonacci.periodo_pisano(y);
        x=x % periodopisano;
        long resultado= Calcular_Fibonacci.calcular_fibonacci(x, y);
        System.out.println("El fibonaci es: " +resultado );
        sc.close();
    }
    
}
