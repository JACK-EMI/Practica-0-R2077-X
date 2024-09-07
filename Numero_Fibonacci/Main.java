import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero_entero;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un nummero entero 0<=numero<=45");
        numero_entero= sc.nextInt();
        if (0<=numero_entero && numero_entero<=45 ) {
            System.out.println("El valor del del fibonacci en la posicion que ingreso es: " + NumeroFibonaci.fibonacci(numero_entero));
            sc.close();    
        }
       else{
        System.out.print("Debe ingresar un valor dentro de los parametros");
       }
        


    }
}
