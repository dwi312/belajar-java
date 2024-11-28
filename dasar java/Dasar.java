import java.util.Scanner;

public class Dasar {
    public static void main(String[] args) {
        System.out.println("1. membuat struktur dasar program java");

        System.out.println("===========================================");

        System.out.println("2. membuat Deklarasi Variabel program java");

        // Tipe Data Primitif
        int angka = 10;                 // Bilangan bulat
        double desimal = 3.14;          // Bilangan desimal
        char huruf = 'A';               // Karakter tunggal
        boolean status = true;           // Nilai benar/salah
        String teks = "Hello World";    // Teks/string

        // Deklarasi tanpa inisialisasi
        int umur;
        umur = 25;

        // Konstanta
        final double PI = 3.14159;

        System.out.println("ini adalah Bilangan bulat int : " +angka);
        System.out.println("ini adalah Bilangan desimal double : " +desimal);
        System.out.println("ini adalah karater tunggal char : " +huruf);
        System.out.println("ini adalah nilai benar/salah boolean : " +status);
        System.out.println("ini adalah text string : " + teks);

        System.out.println("berapa usia budi sekarang ? jawaban " + umur);
        System.out.println("rumus lingkaran adalah  " + PI);


        System.out.println("===========================================");
        System.out.println("3. Operator Dasar program java");


        // Operator Aritmatika
        int a = 10, b = 5;
        int tambah = a + b;     // Penjumlahan
        int kurang = a - b;     // Pengurangan
        int kali = a * b;       // Perkalian
        int bagi = a / b;       // Pembagian
        int modulus = a % b;    // Sisa pembagian

        // Operator Perbandingan
        boolean lebihBesar = (a > b);
        boolean samaDengan = (a == b);

        System.out.println("===========================================");
        System.out.println("3. Input/Output program java");

        // Input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Input teks
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Input angka
        System.out.print("Masukkan umur: ");
        int usia = scanner.nextInt();

        // Output
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + usia);
        
        scanner.close();
    }

}
