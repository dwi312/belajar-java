package latihan;

import java.util.Scanner;

/**
 *  1. Buat program untuk mencetak pola segitiga siku-siku bintang Input: 5 Output: *
 *  2. Buat program untuk mencetak pola angka naik Input: 5 Output: 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5
 *  3. Buat program untuk mencetak pola piramida terbalik Input: 5 Output
 *  4. Buat program untuk mencetak pola berlian bintang Input: 5 Output
 *  5. Buat program untuk mencetak pola segitiga palindrom angka Input: 5 Output: 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 *  6. Buat program untuk mencetak pola butterfly Input: 5 Output
 *  7. Buat program untuk mencetak pola paskal Input: 5 Output: 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1
 *  8. Buat program untuk mencetak pola spiral Input: 5 Output: 1 2 3 4 5 16 17 18 19 6 15 24 25 20 7 14 23 22 21 8 13 12 11 10 9
 *  9. Buat program untuk mencetak pola hollow diamond Input: 5 Output: 
 */


public class Pola {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            int num = input.nextInt();

            switch (num) {
                case 1:
                    segitaSiku();
                    break;
                case 2:
                    angkaNaik();
                    break;
                case 3:
                    piramidTerbalik();
                    break;
                case 4:
                    // berlianBintang();
                    break;
                case 5:
                    // segitigaPalindrom();
                    break;
                case 6:
                    // butterfly();
                    break;
                case 7:
                    // paskal();
                    break;
                case 8:
                    // spiral();
                    break;
                case 9:
                    // hollowDiamond();
                    break;
                case 10:
                    System.out.println("Keluar dari program");
                    System.out.println("Terimakasih");
                    exit = true;
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            backToMenu(num, exit);
            
        } while (!exit);


        
    }

    private static void tampilkanMenu() {
        String[] menu = new String[] {
            "mencetak pola segitiga siku-siku",
            "mencetak pola angka naik",
            "mencetak pola piramida terbalik",
            "mencetak pola berlian bintang",
            "mencetak pola segitiga palindrom",
            "mencetak pola butterfly",
            "mencetak pola paskal",
            "mencetak pola spiral",
            "mencetak pola hollow diamond",
            "keluar",
        };

        System.out.println("===== Kumpulan pola Java =====");
        for(int i = 0; i < menu.length; i++) {
            System.out.println((i+1)+". "+ menu[i]);
        }
    }

    private static void backToMenu(int num , boolean exit) {
        if (num != 10) {
            System.out.println("Kembali ke menu ? y / n");
            String backMenu = input.next();

            while(!backMenu.equalsIgnoreCase("y") && !backMenu.equalsIgnoreCase("n")) {
                System.out.println("Ketik Y atau N");
                backMenu = input.next();
            }

            if (backMenu.equalsIgnoreCase("n")) {
                System.out.println("Keluar dari program");
                System.out.println("Terimakasih");
                exit = true;
            }
        }

    }
    private static void segitaSiku() {
        System.out.println("mencetak pola segitiga siku-siku");
        System.out.print("Masukan tinggi line: ");
        int tinggi = input.nextInt();

        System.out.println("");
        for(int i = 1; i <= tinggi; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void angkaNaik() {
        System.out.println("mencetak pola segitiga siku-siku");
        System.out.print("Masukan tinggi line: ");
        int tinggi = input.nextInt();

        System.out.println("");
        for(int i = 1; i <= tinggi; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    private static void piramidTerbalik() {
        System.out.println("mencetak pola segitiga siku-siku");
        System.out.print("Masukan tinggi line: ");
        int tinggi = input.nextInt();

        System.out.println("");
        for(int i = 1; i <= tinggi; i++) {
            for(int j = 1; j < i + 1; j++) {
                System.out.print(" ");
                // output:
                // loop 1 = k(1) < (0+1) = 1 => false => 
                // loop 2 = k(5) > (5+0) = 1 => false => _ 
            }

            for(int k = 1; k <= ((tinggi-i)*2)+1; k++) {
                System.out.print("*");
                // output:
                // loop 1 = k(1) < ((5-1)*2)+1 = 9 => true => 123456789
                // loop 2 = k(1) < ((5-2)*2)+1 = 7 => true => 1234567
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
