import java.util.Scanner;

/*
import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0 ){
            System.out.println("el numero es par");

        }else{
            System.out.println("el numero es impar");
        }
    }
}
*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();
        int factorial =1;
        for ( int i = 1; i <= numero; i++ ){
            factorial *= i;
        }
        System.out.println("La factorial del numero "+numero+" es: "+factorial);
    }
}
*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.print(numero + "X"+ i + "= "+ (numero *i)+" . ");
        }
    }
}
 */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) esPrimo = false;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if(esPrimo){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
*/
/*

//serie fibonacci
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();
        int a = 0, b = 1;

        System.out.print("Serie: "+a+", "+b+", ");
        for(int i=2; i<=n; i++){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas notas deseas ingresar?: ");
        int cantidad = scanner.nextInt();
        double suma = 0;

        for(int i = 0; i < cantidad; i++){
            System.out.print("Ingrese un numero: "+i+": ");
            double nota = scanner.nextDouble();
            suma += nota;

        }
        double promedio = suma/cantidad;
        System.out.println("El promedio es: "+promedio);

    }
}
*/


//Adivinanza numero secreto
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int numeroSecreto = rand.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        int intento;
        int intentos=0;

        System.out.println("Adivina el numero entre 1 y 100.");
        do{
            intento =sc.nextInt();
            intentos++;
            if(intento<numeroSecreto){
                System.out.println("El numero es mayor.");
            }else if (intento>numeroSecreto){
                System.out.println("El numero es menor.");
            }else{
                System.out.println("El numero es correcto. Y lo lograste con tan solo "+intentos+" intentos");
            }
        }while(intento != numeroSecreto);

    }
}



