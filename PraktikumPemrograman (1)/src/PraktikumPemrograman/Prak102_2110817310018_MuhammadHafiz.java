/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumPemrograman;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Prak102_2110817310018_MuhammadHafiz {
     public static void main(String[] args) {
    int angka, bilangan;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan : ");
        angka = keyboard.nextInt();
        
        int i = 7;
        while (i >= 0) {            
            if (angka % 2 == 0){
                bilangan = (angka / 2) - 1;
            } else {
                bilangan = angka;
            }
            
            if (i == 7){
               System.out.print(bilangan);
            } else {
                System.out.print(", " + bilangan);
            }
            
            angka++;
            i--;
        }
    }
    
}
