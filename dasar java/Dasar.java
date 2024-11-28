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
        System.out.println("4. Input/Output program java");

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

        System.out.println("===========================================");
        System.out.println("5. Percabangan program java");
        
        System.out.println("pilih no");
        System.out.println("1. Satu");
        System.out.println("2. Dua");
        System.out.println("3. Tiga");
        System.out.println("\n");

        int pilih = scanner.nextInt();


        // If-Else
        if(pilih == 1) {
            System.out.println("Anda memilih No. " + pilih);
        } else if (pilih == 2) {
            System.out.println("Anda memilih No. " + pilih);
        } else if (pilih == 3) {
            System.out.println("Anda memilih No. " + pilih);
        } else {
            System.out.println("No. " + pilih + " yang anda pilih tidak dapat ditemukan!");
        }

        System.out.println("pilih Opsi ");
        System.out.println("1. Kesatu");
        System.out.println("2. Kedua");
        System.out.println("3. Ketiga");
        System.out.println("\n");
        int opsi = scanner.nextInt();

        // Switch Case
        switch (opsi) {
            case 1:
                System.out.println("Anda memilih opsi " + opsi);
                break;
            case 2:
                System.out.println("Anda memilih opsi " + opsi);
                break;
            case 3:
                System.out.println("Anda memilih opsi " + opsi);
                break;
                
                default:
                System.out.println("opsi " + opsi + " yang anda pilih tidak dapat ditemukan!");
                break;
        }

        System.out.println("===========================================");
        System.out.println("6. Perulangan program java");

        // For Loop
        System.out.println("Putar berapa kali ? ");
        System.out.println("\n");

        int putar = scanner.nextInt();
        
        if (putar == 0 || putar >= 20) {
            System.out.println("Pilihan yang anda pilih tidak ada!");
        } else {
            for(int i = 0; i < putar; i++) {
                System.out.println("Anda memilih " + (i+1) + " kali putaran!");
            }
        }

        // Do-While Loop
        boolean exit = false;
        do {
            System.out.println("Pilih menu ");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Snack");
            System.out.println("4. Keluar");
            System.out.println("\n");

            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("===================");
                    System.out.println("Daftar list makanan");
                    System.out.println("===================");
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("===================");
                    System.out.println("Daftar list minuman");
                    System.out.println("===================");
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("===================");
                    System.out.println("Daftar list snack");
                    System.out.println("===================");
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Terimakasih");
                    System.out.println("\n");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("Pilihan yang anda masukan tidak ada!");
                    break;
            }
            
        } while (!exit);
    }

}
