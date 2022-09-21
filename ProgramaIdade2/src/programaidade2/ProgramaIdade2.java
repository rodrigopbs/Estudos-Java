/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade2;

import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class ProgramaIdade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Que ano você nasceu? : ");
        int nasc = t.nextInt();
        int i = 2022 - nasc;
        System.out.println("Sua idade é: "+i);
        if (i>=18){
               System.out.println("Maior de Idade");
        }
        else {
            System.out.println("Menor de Idade");
        }
        // TODO code application logic here
    }
    
}
