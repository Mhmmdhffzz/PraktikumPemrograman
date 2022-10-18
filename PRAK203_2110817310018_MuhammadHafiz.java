/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak203_2110817310018_muhammadhafiz;

/**
 *
 * @author User
 */
public class PRAK203_2110817310018_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel"; //
        p1.setJabatan("Assasin"); //menambahkan method setJabatan di class pegawai//
        p1.umur=17; //menambahkan variabel umur//
        
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun ");
    }
    
    
}
