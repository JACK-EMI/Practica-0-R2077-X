import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingresa la posicion del fibonacci");
        n= sc.nextLong();
        if(0<=n && n<= Math.pow(10, 14)){
            System.out.println("La suma de los cuadrados de todos los fibonaccis anterior al actual ingresado es: " +Ultimo_Digito_Suma_Cuadrados_Fib.ultimodigito(n));

        }
        sc.close();

    }
}