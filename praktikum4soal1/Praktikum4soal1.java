/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4soal1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Praktikum4soal1 {

    /**
     * @param args the command line arguments
     */
 
       public static void main(String[] args) {
        Scanner buku = new Scanner(System.in);
        String judul;
        String penulis;
        int tahun;
        
        System.out.print("Judul: ");
        judul = buku.nextLine ();
        System.out.print("Penulis: ");
        penulis = buku.nextLine();
        System.out.print("Tahun Terbit: ");
        tahun = buku.nextInt();
        Buku buku1 = new Buku(judul, penulis, tahun);
        buku1.displayBuku();
    }
    }
    
