public class Calcular_MCD {
public static int calcular_MCD(int x, int y){
    while(y!=0){
        int a= y;
        y= x % y ;
        x=a;

    }//este bucle continua hasta que y sea 0
    return x;
}
    
}