
package praktikum4soal1;

import java.util.Scanner;
public class Praktikum4soal1 {

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
    
