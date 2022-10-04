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
public class Prak103_2110817310018_MuhammadHafiz {
    public static void main(String[]args) {
        int i=1;
        Scanner angka=new Scanner(System.in);
        int input = angka.nextInt();
        do{
            if(input %7==0){
                continue;
            }
            System.out.print(" " + input + " ");
            input--;
            i++;
            
        } while(i<=5);
    }
}
