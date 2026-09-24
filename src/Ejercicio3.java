import java.util.Scanner;


public class Ejercicio3 {
    
    public static void main(String [] args){

        System.out.printf("Introduzca un numero entero mayor de cero: ");

        Scanner s= new Scanner(System.in);

        int N=s.nextInt();

        while(N<=0){

        int N=s.nextInt();

            System.err.printf("El numero introducido no es valido, introduzca un numero entero mayor de cero: ");


        }


    }
}
