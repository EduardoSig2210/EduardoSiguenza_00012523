import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, result = 0, num1 = 0, num2 = 0;
         Scanner scanner = new Scanner(System.in);
         while (opcion != 5) {
             System.out.println("Bienvenino");
             System.out.printf("1. Suma %n2. Resta %n3. Multiplicacion %n4. Division %n5. Salir %nQue desea realizar ");
             opcion = scanner.nextInt();
             switch (opcion) {
                 case 1:
                     //Suma
                     System.out.println("Ingrese el primer numero: ");
                     num1 = scanner.nextInt();
                     System.out.println("Ingrese el segundo numero: ");
                     num2 = scanner.nextInt();
                     result = suma(num1,num2);
                     System.out.println("La suma de " + num1 + " y " + num2  + " es igual a " + result);
                     break;
                 case 2:
                    //Resta
                     System.out.println("Ingrese el primer numero: ");
                     num1 = scanner.nextInt();
                     System.out.println("Ingrese el segundo numero: ");
                     num2 = scanner.nextInt();
                     result = resta(num1,num2);
                     System.out.println("La resta de " + num1 + " y " + num2  + " es igual a " + result);
                     break;
                 case 3:
                     //Multiplicacion
                     System.out.println("Ingrese el primer numero: ");
                     num1 = scanner.nextInt();
                     System.out.println("Ingrese el segundo numero: ");
                     num2 = scanner.nextInt();
                     result = multiplicacion(num1,num2);
                     System.out.println("La multiplicacion de " + num1 + " y " + num2  + " es igual a " + result);
                     break;
                 case 4:
                     //Division
                     System.out.println("Ingrese el primer numero: ");
                     num1 = scanner.nextInt();
                     System.out.println("Ingrese el segundo numero: ");
                     num2 = scanner.nextInt();
                     if(num2==0){
                         System.out.println("La division entre 0 no es posible");
                     }
                     else {
                         result = division(num1,num2);
                         System.out.println("La division de " + num1 + " y " + num2  + " es igual a " + result);
                     }

                     break;
                 case 5:
                     System.out.println("Tenga un buen dia");
                    break;
                 default:
                     System.out.println("Opcion no valida");
             }
         }
    }
    public static int suma(int a, int b){
        int total=0;
        total=a+b;
        return total;
    }
    public static int resta(int a, int b){
        int total=0;
        total=a-b;
        return total;
    }
    public static int multiplicacion(int a, int b){
        int total=0;
        total=a*b;
        return total;
    }
    public static int division(int a, int b){
        int total=0;
        total=a/b;
        return total;
    }
}