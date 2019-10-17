/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg37.ratanilai;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Permai Ramadhan
 * NIM  :10118060
 */
public class PBO210118060LatihanKe37RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukan Banyaknya Mahasiswa\t: ");
        Scanner banyak = new Scanner(System.in);
        mhs.BanyakMhs=banyak.nextInt();
        mhs.masukNilai();
        System.out.println("");
        mhs.HasilHitung();
        System.out.println("Developed By : Permai Ramadhan");
    }
    
}
