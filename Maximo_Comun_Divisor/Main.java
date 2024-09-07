import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int valor1,valor2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresa el primer valor entero no negativo: ");
        valor1=sc.nextInt();
        System.out.println("Ingresa el segundo valor entero no negativo menor o igual a 10^9: ");
        valor2= sc.nextInt();
        if(valor1>=1 &&  valor2<=Math.pow(10, 9)){
        int mcd= Calcular_MCD.calcular_MCD(valor1, valor2);
        System.out.println("El maximo comun divisor de: " + valor1 + " y " + valor2 + " es: " +mcd);
        }else{
            System.out.println("Debe ingresar un valor dentro de los parametros");
        }
        sc.close();

    }
    
}
