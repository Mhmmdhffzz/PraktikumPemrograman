/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak201_2110817310018_muhammadhafiz;

/**
 *
 * @author User
 */
public class PRAK201_2110817310018_MuhammadHafiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Buah Arumanis = new Buah("Arumanis", 0.3f, 13, 3.9f, 65000, 5000);
        Buah Manalagi = new Buah("Manalagi", 0.5f, 17, 8.5f, 127500, 7500);
        Buah ManggaMadu = new Buah("ManggaMadu", 0.375f, 12, 4.5f, 78000, 6500);
        
        Arumanis.DisplayBuah ();
        System.out.println("");
        Manalagi.DisplayBuah();
        System.out.println("");
        ManggaMadu.DisplayBuah();
        System.out.println("");
    }
    
}
