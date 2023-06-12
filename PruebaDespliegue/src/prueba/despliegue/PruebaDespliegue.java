/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba.despliegue;

 import java.util.Scanner;

public class PruebaDespliegue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = input.nextInt();

        System.out.println("Los números entre " + numero1 + " y " + numero2 + " son:");

        // Se guarda el numero menor y el numero mayor que se ingreso
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        // Muestra los números entre el menor y el mayor, excluyendo los números ingresados
        for (int i = menor + 1; i < mayor; i++) {
            numbers.add(i);
            
        }
        
        for (int i = 0 ; i < numbers.size(); i++) {
         
            if (numbers.get(i)%2 == 0){
                System.out.println(numbers.get(i));
            }
        }
    } 
}

