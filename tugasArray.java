/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author zaqiah ahmad
 */
public class tugasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Mendeklarasikan dan Menginisialisasi Array
        int[] arrayAngka = new int[5]; // Mendeklarasikan array integer dengan panjang 5
        arrayAngka[0] = 1; // Menginisialisasi elemen ke-0
        arrayAngka[1] = 2; // Menginisialisasi elemen ke-1
        arrayAngka[2] = 3; // Menginisialisasi elemen ke-2
        arrayAngka[3] = 4; // Menginisialisasi elemen ke-3
        arrayAngka[4] = 5; // Menginisialisasi elemen ke-4

        // Mengakses Elemen Array dan Menampilkan Nilainya
        System.out.println("Nilai arrayAngka[0]: " + arrayAngka[0]);
        System.out.println("Nilai arrayAngka[3]: " + arrayAngka[3]);

        // Array dengan Inisialisasi Awal
        String[] arrayHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        // Mengakses dan Menampilkan Elemen Array
        System.out.println("Hari pada indeks 2: " + arrayHari[2]);
    }
    
}
