/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan3inputkeyboard;

import java.util.Scanner;
/**
 * @author LENOVO
 * NAMA      : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM       : 10118037
 * Deskripsi Program   : Program ini berisi program memasukkan input dari
 *                       keyboard.
 */
public class IF110118037Latihan3Inputkeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Masukkan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.nextLine();
        System.out.println("Nama Anda Adalah : " + nama);
        
    }
    
}
