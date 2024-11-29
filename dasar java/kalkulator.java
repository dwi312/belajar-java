import java.util.InputMismatchException;
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean exit =false;
        double num1 = 0;
        double num2 = 0;
        

        do {
            
            System.out.println("========================");
            System.out.println("KALKULATOR");
            System.out.println("========================");

            num1 = validasiAngka(input, "Masukan angka pertama");

            num2 = validasiAngka(input, "Masukan angka kedua");

            System.out.println("========================");
                System.out.println("Pilih operasi : ");
                System.out.println("1. Tambah");
                System.out.println("2. Kurang");
                System.out.println("3. Kali");
                System.out.println("4. Bagi");
                System.out.println("5. Keluar");
                System.out.println();
                
                int pilih = 0;
                pilih = validasiPilihan(input,"Masukan piihan anda (1~4)");
                System.out.println("========================");
                System.out.println("\n");


                double hasil = 0;
                String oper;


                switch (pilih) {
                    case 1:
                        oper = "+";
                        hasil = tambah(num1, num2);
                        cetak(num1,oper, num2, hasil);
                        break;
                    case 2:
                        oper = "-";
                        hasil = kurang(num1, num2);
                        cetak(num1,oper, num2, hasil);
                        break;
                    case 3:
                        oper = "x";    
                        hasil = kali(num1, num2);
                        cetak(num1,oper, num2, hasil);    
                        break;
                    case 4:
                        oper = "/";
                        hasil = bagi(num1, num2);
                        cetak(num1,oper, num2, hasil);
                        break;
                    case 5:
                        System.out.println("Terimakasih");
                        exit = true;
                        break;
                
                    default:
                        System.out.println("Pilihan anda pilih tidak ada!");
                        break;
                }
                System.out.println("\n");
                System.out.println("Apakah anda inggin kembali ? (y/n)");
                String back = input.next();

                if (back.equalsIgnoreCase("n")) {
                    exit = true;
                    System.out.println("Terimakasih");
                }

            clearScreen();
            
        } while (!exit);
        
    }

    private static double validasiAngka(Scanner input, String prompt) {
        double angka = 0;
        boolean valid = false;

        do {
            System.out.println(prompt);
            try {
                angka = input.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("yang anda masukan bukan angka!");
                input.next();
            }
            
        } while (!valid);
        return angka;
    }

    private static int validasiPilihan(Scanner input, String prompt) {
        int angka = 0;
        boolean valid = false;

        do {
            System.out.println(prompt);
            try {
                angka = input.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("yang anda masukan bukan angka!");
                input.next();
            }
            
        } while (!valid);
        return angka;
    }

    private static void cetak(double a, String o, double b, double c) {
        System.out.println(a + " " + o + " " + b + " = " + c);
    }

    private static double tambah(double a, double b) {
        return a + b;
    }

    private static double kurang(double a, double b) {
        return a - b;
    }

    private static double kali(double a, double b) {
        return a * b;
    }

    private static double bagi(double a, double b) {
        if(b == 0) {
            System.out.println("Pembagian tidak boleh angka 0");
            return 0;
        }
        return a / b;
    }

    private static void clearScreen() throws Exception{
        try {
            if(System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.println("\033\143");
            }
        }catch(Exception e) {
            System.err.println("Tidak bisa clear screen.");
        }
    }

}
