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

            System.out.println("Masukan angka pertama");
            num1 = input.nextDouble();
            System.out.println("Masukan angka kedua");
            num2 = input.nextDouble();

            System.out.println("========================");
                System.out.println("Pilih operasi : ");
                System.out.println("1. Tambah");
                System.out.println("2. Kurang");
                System.out.println("3. Kali");
                System.out.println("4. Bagi");
                System.out.println("5. Keluar");
                System.out.println("Masukan piihan anda (1~4)");
                System.out.println("========================");
                
                int pilih = input.nextInt();
                
                double hasil = 0;

                switch (pilih) {
                    case 1:
                        hasil = tambah(num1, num2);
                        System.out.println(num1 + " + " + num2 + " = " + hasil);
                        break;
                    case 2:
                        hasil = kurang(num1, num2);
                        System.out.println(num1 + " - " + num2 + " = " + hasil);
                        break;
                    case 3:
                        hasil = kali(num1, num2);
                        System.out.println(num1 + " x " + num2 + " = " + hasil);
                        break;
                    case 4:
                        hasil = bagi(num1, num2);
                        System.out.println(num1 + " : " + num2 + " = " + hasil);
                        break;
                    case 5:
                        exit = true;
                        System.out.println("Terimakasih");
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
