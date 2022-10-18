/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak203_2110817310018_muhammadhafiz;

/**
 *
 * @author User
 */
public class Pegawai {
    public String nama;
    public String asal; //tipe data diganti mulai dari char ke String (change method char)//
    public String jabatan;
    public int umur;
    
    public String getNama(){
        return nama;
    }
    
    public String getAsal(){ //tipe data diganti mulai dari String ke char (change method char)//
        return asal;
    }
    
    public void setJabatan(String j){
        this.jabatan= j; //mendeklarasikan variabel jabatan dengan mengganti nama menjadi j//
    }

    
     
}
