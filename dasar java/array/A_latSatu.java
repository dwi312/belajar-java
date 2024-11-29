package array;

import java.util.Scanner;

public class A_latSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat array bilangan bulat dengan 5 elemen
        int[] arr = new int[5];
        
        // Input nilai dari keyboard
        int value = 0;
        int total = 0;
        boolean exit = false;


        do {
            System.out.println("Pilih index array ");
            System.out.println("1. array pertama");
            System.out.println("2. array kedua");
            System.out.println("3. array ketiga");
            System.out.println("4. array keempat");
            System.out.println("5. array kelima");
            System.out.println("6. keluar");
            System.out.println("Pilih index array ");
            System.out.println("\n");
            
            int elemen = input.nextInt();

            switch (elemen) {
                case 1:
                    System.out.println("Masukan value : ");
                    value = input.nextInt();
                    arr[elemen-1] = value;
                    break;
                case 2:
                    System.out.println("Masukan value : ");
                    value = input.nextInt();
                    arr[elemen-1] = value;
                    break;
                case 3:
                    System.out.println("Masukan value : ");
                    value = input.nextInt();
                    arr[elemen-1] = value;
                    break;
                case 4:
                    System.out.println("Masukan value : ");
                    value = input.nextInt();
                    arr[elemen-1] = value;
                    break;
                case 5:
                    System.out.println("Masukan value : ");
                    value = input.nextInt();
                    arr[elemen-1] = value;
                    break;
                case 6:
                    System.out.println("Terimakasih");
                    exit = true;
                    break;
                default:
                    System.out.println("Opsi yang anda pilih tidak ditemukan");
                    break;
            }
            
            
        } while (!exit);

        for(int i =0; i < arr.length; i++) {
            // Tampilkan seluruh isi array
            System.out.println("ini ke array("+ i + ") adalah "+arr[i]);
        }

        for(int i =0; i < arr.length; i++) {
            
            total += arr[i];
            System.out.println("\n");
        }

        // Hitung dan tampilkan total nilai array
        System.out.println("Total nilai array adalah "+total);

        
        
    }




}
