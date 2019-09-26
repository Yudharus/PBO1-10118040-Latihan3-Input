
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Moch Yudha Rusdian
 * Kelas     : PBO1
 * NIM       : 10118040
 * Deskripsi : Memasukan atau input nilai dari keyboard
 */
public class input{
    public static void main(String[] args) {
        System.out.print("Masukan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
}
