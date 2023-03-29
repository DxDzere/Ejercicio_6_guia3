/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6_guia3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_6_guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, opc;
        String rpta;
        boolean bool = false;
        
        System.out.println("Ingrese 2 numeros para operar");
        System.out.println("1er numero: ");
        num1=leer.nextInt();
        System.out.println("2do numero: ");
        num2=leer.nextInt();
        
        do{
            System.out.println("MENU");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            System.out.println("Elija una opcion: ");
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println(num1+"+"+num2+"="+(num1+num2));
                    break;
                case 2:
                    System.out.println(num1+"-"+num2+"="+(num1-num2));
                    break;
                case 3:
                    System.out.println(num1+"x"+num2+"="+(num1*num2));
                    break;
                case 4:
                    System.out.println(num1+"/"+num2+"="+(num1/num2));
                    break;
                case 5:
                    System.out.println("Seguro desea salir? (S/N)");
                    rpta = leer.nextLine();
                    if(rpta.toUpperCase().equals("S")){
                        bool=true;
                    }else{
                        bool=false;
                    }
                    break;
            }
        }while(bool);
        
    }
    
}
