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
public class Prak104_2110817310018_MuhammadHafiz {
    public static void main(String[]args) {
        Scanner angka =new Scanner (System.in);
        int Andi1, Andi2, Andi3, Budi1, Budi2, Budi3;
        int pointAndi = 0, pointBudi =0;
        
        //masukkan Kartu Andi
        System.out.println("====INPUT====");
        System.out.print("Kartu Andi : ");
        Andi1 = angka.nextInt();
        Andi2 = angka.nextInt();
        Andi3 = angka.nextInt();
        angka.nextLine();
        
        //dimasukkan kedalam array andi
        int [] andi={Andi1,Andi2,Andi3,};
        
        //masukkan kartu Budi
        System.out.print("Kartu Budi : ");
        Budi1 = angka.nextInt();
        Budi2 = angka.nextInt();
        Budi3 = angka.nextInt();
        int [] budi = {Budi1, Budi2, Budi3};
        
        //pengkondisian kartu yang hanya di gunakan 2 s.d 10
         if ((Budi1 >= 2 && Budi1 <=10) &&
                (Budi2 >= 2 && Budi2 <=10) &&
                (Budi3 >= 2 && Budi3 <=10) &&
                (Andi1 >= 2 && Andi1 <= 10) &&
                (Andi2 >= 2 && Andi2 <=10) &&
                (Andi3 >=2 && Andi3 <=10)) {
        //Pertandingan dimulai dengan membandingkan tiap index andi dan budi
            int i = 0;
            while (i <= 2) {
                if (andi[i] > budi[i]) pointAndi++; //Tambahkan sebanyak 1 point untuk Andi
                else  if (budi[i] > andi[i]) pointBudi++; //Tambahkan sebanyak 1 point untuk Budi
                i++;
            }
            //Menentukan pemenang (Membandingkan pointAndi dan poinBudi)
            System.out.println("=====OUTPUT=====");
            if (pointAndi > pointBudi) System.out.println("Andi"); //Menampilkan nama Andi
            else if(pointBudi > pointAndi) System.out.println("Budi");
            else
                System.out.println("Seri"); //Menampilkan nama Andi
         } 
        
    }
}
