
package proyect;

import java.util.*;
public class PROYECT {

   
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
       
       int opcion;
       int numero1;
       int numero2;
       
       
        System.out.println("1- sumar");
        System.out.println("2- restar");
        System.out.println("3- multiplicar");
        System.out.println("4- dividir");
        System.out.println("5- raiz cuadrada");
        System.out.println("6- raiz cubica");
        System.out.println("7- elevar al exponente");
        System.out.println("8- hallar su porcentaje");
        System.out.println("9- salir");
        System.out.println("");
        
         System.out.println("elija la opcion");
         opcion= sc.nextInt();
         
        // HACEMOS LAS OPERACIONES EN CONDICIONALES
        switch(opcion){
            case 1 :
                System.out.print("digite el primer numero:");
                numero1=sc.nextInt();
                
                System.out.print("digite el segundo numero: ");
                numero2=sc.nextInt();
                
             int   resultado = numero1 + numero2;
                System.out.println("----------------------------------------");
                System.out.println("la suma es:" + resultado );
                System.out.println(".......................................................");
                break;
                 case 2 :
                System.out.print("digite el primer numero:");
                numero1=sc.nextInt();
                
                System.out.print("digite el segundo numero: ");
                numero2=sc.nextInt();
                
                resultado = numero1 - numero2;
                System.out.println("----------------------------------------");
                System.out.println("la resta es:" + resultado );
                System.out.println(".......................................................");
                break; case 3 :
                System.out.print("digite el primer numero:");
                numero1=sc.nextInt();
                
                System.out.print("digite el segundo numero: ");
                numero2=sc.nextInt();
                
               resultado = numero1 * numero2;
                System.out.println("----------------------------------------");
                System.out.println("el producto es:" + resultado );
                System.out.println(".......................................................");
                break; case 4 :
                System.out.print("digite el primer numero:");
                numero1=sc.nextInt();
                
                System.out.print("digite el segundo numero: ");
                numero2=sc.nextInt();
                if(numero2==0 ){
                    System.out.println("  ");
                    System.out.println("no se puede dividir entre 0");
                    System.out.println("");
                }
                else{
                resultado = numero1 / numero2;
                System.out.println("----------------------------------------");
                System.out.println("la division es:" + resultado );
                System.out.println(".......................................................");}
                break;
                case 5 :
                System.out.print("digite el primer numero:");
                numero1=sc.nextInt();
               resultado = (int)Math.sqrt(numero1);
                System.out.println("----------------------------------------");
                System.out.println("la raizcuadrada es:" + resultado );
                System.out.println(".......................................................");
                break; 
                case 6 :
                System.out.print("digite el primer numero:");
                numero1=sc.nextInt();
                
           
                
              resultado = (int)Math.cbrt(numero1);
                System.out.println("----------------------------------------");
                System.out.println("la raiz cubica es:" + resultado );
                System.out.println(".......................................................");
                break; case 7 :
                System.out.print("digite la base(primer numero):");
                numero1=sc.nextInt();
                
                System.out.print("digite el exponente(segundo numero): ");
                numero2=sc.nextInt();
                
               resultado = (int)Math.pow(numero1, numero2);
               
                System.out.println("----------------------------------------");
                System.out.println("el numero"+ numero1 + "elevado al exponente" + numero2 +"resulta" +resultado );
                System.out.println(".......................................................");
                break;
                 case 8 :
                System.out.print("digite el numero:");
                numero1=sc.nextInt();
                
                System.out.print("digite el porcentaje: ");
                numero2=sc.nextInt();
                
                resultado = (int)(numero2/100)*numero1 ;
                System.out.println("----------------------------------------");
                System.out.println( "el" + "  " + numero2 + "%  de " + numero1 + "  " +" es" + "  " + resultado);
                System.out.println(".......................................................");
                break;
                 case 9 :
                     System.out.println("");
                     System.out.println("");
                System.out.print("usted salio de calculadora");
                
                     System.out.println("");
                
                 default: 
                     System.out.println("opcion no disponible");
                break;
        }
    }
    
}
