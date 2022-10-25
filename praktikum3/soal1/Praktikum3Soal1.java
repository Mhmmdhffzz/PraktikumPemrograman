/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal1;
import java.util.Scanner;
import java.util.LinkedList;   
/**
 *
 * @author User
 */
public class Praktikum3Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Dadu huruf;
        int Jumlah = 0;
        
        LinkedList <Dadu> Nomor = new LinkedList <Dadu>();
        int n = angka.nextInt();
        
        for(int i = 0; i < n; i++) {
            huruf = new Dadu();
            huruf.AcakDadu();
            Nomor.add(huruf);
            
        }
        for(int i = 0; i < n; i++){
            System.out.println("Dadu ke- "+(i+1)+" bernilai "+Nomor.get(i).getNilaiDadu());
            Jumlah = Jumlah + Nomor.get(i).getNilaiDadu();
        }
        System.out.println("Total nilai dadu keseleruhan "+Jumlah);
    }
    
}
