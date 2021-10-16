import java.util.Scanner;

public class App {
    java.util.Scanner;
    public static void main (String args []){
        int opcionAP;
        int opcion123;
        Scanner sc = new Scanner(System.in);

        System.out.println("a.Seleccionar la figura");
        System.out.println("b.Seleccionar propiedad a calcular: 1. área o 2. perimetro");
        System.out.println("c.Solicitar los atributos de la figura: lados,medidas, etc");
        System.out.println("d.Imprimir en pantalla el resultado de los calculos");
        System.out.println("x. Salir");
        int opcion = sc.nextInt().charAt(0);
        char x = sc.nextInt().charAt(0);
        opcion123= sc.nextInt().charAt();
        int resultado = sc.nextInt().charAt();
        opcionAP = sc.nextInt();

        switch (opcion){
            case 'a':
                System.out.println("Elige la figura a calcular 1. circulo 2.cuadrado 3.triangulo");
                if (opcion123==1){
                    System.out.println("La figura elegida es CIRCULO");
                }else if (opcion123==2){
                    System.out.println("La figura elegida es CUADRADO");
                } else if (opcion123==3) {
                    System.out.println("La figura elegida es TRIANGULO");
                }else {

                    System.out.println("SOLO SE ACEPTA 1 o 2 o 3");
                }while (opcion123 !=1 || opcion123!=2 || opcion123!=3);
                break;
            case 'b':
                System.out.println("Selecciona lo que que deseas calcular:  ");
                System.out.println("1. AREA");
                System.out.println("2. PERIMETRO");
                if (opcionAP==1){
                    //CALCULAR AREA //antes selecciono figura y si no avisar
                    System.out.println("Calculo de area......");
                } else if(opcionAP==2){
                    System.out.println("Calculo de perimetro......");
                }else {
                    System.out.println("SOLO SE ACEPTA 1 O 2");
                }while (opcionAP !=1 || opcionAP!=2);
                break;
            case 'c':
                System.out.println("Regitra los atibutos a calcular");

                break;

            case 'd':
                System.out.println("El resultado de tu operación es: "+resultado);
                break;

            case 'x':
                if (opcion == x){
                    System.out.println("Gracias por usar Calculadora Mich:3");
                }
                break;

            default:
                break;
        }
    }
}
