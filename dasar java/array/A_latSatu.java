package array;

import java.util.Scanner;

public class A_latSatu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * 1. Membuat array bilangan bulat dengan 5 elemen
         * 2. Input nilai dari keyboard
         * 3. Tampilkan seluruh isi array
         * 4. Tampilkan nilai array yang terkecil dan terbesar
         * 5. Hitung dan tampilkan total nilai array
         */       

        // ============= start 1 Membuat array bilangan bulat dengan 5 elemen =============================
        
        int[] arr = new int[5];

        // ============= end 1 Membuat array bilangan bulat dengan 5 elemen =============================

        int value = 0;
        int total = 0;
        boolean exit = false;


        do {
            System.out.println("Array dasar ");
            System.out.println("1. Ubah data array");
            System.out.println("2. Lihat data array");
            System.out.println("3. Lihat data array terkecil dan terbesar");
            System.out.println("4. Total data array");
            System.out.println("5. keluar");

            System.out.println("Pilih menu ");
            System.out.println("\n");
            
            int num = input.nextInt();

            switch (num) {
                // ============= start 2 Input nilai dari keyboard =============================
                case 1:
                    for(int i = 0; i < arr.length; i++) {
                        System.out.println("Masukan value array index ke "+i);
                        value = input.nextInt();
                        arr[i] = value;
                    }
                    break;
                // ============= start 2 Input nilai dari keyboard =============================

                // ============= start 3 Tampilkan seluruh isi array =============================
                case 2:
                    System.out.println(" Lihat data array ");
                    System.out.println("------------------");

                    for(int i = 0; i < arr.length; i++) {
                        System.out.println("array ke "+i+ " : "+arr[i]);
                    }

                    System.out.println("\n");   
                    break;
                // ============= end 3 Tampilkan seluruh isi array =============================

                // ============= start 4 Tampilkan array tekecil dan terbesar =============================
                case 3:
                    System.out.println("Lihat value array tekecil dan terbesar :");

                    int min = arr[0];
                    int max = arr[0];

                        for(int i = 0; i < arr.length; i++) {
                            
                            if(arr[i] < min) {
                                min = arr[i];
                            }
                            if(arr[i] > max) {
                                max = arr[i];
                            }
                          
                        }     
                        
                        System.out.println(java.util.Arrays.toString(arr));

                        System.out.println("Nilai terkecil " + min);
                        System.out.println("Nilai terbesar " + max);
                        
                    

                    break;
                // ============= end 4 Tampilkan array tekecil dan terbesar =============================

                // ============= start 5 Total data array =============================
                case 4:
                    for(int i =0; i < arr.length; i++) {     
                        total += arr[i];
                    }
                    System.out.println("Total value array : "+ total);
                    break;
                // ============= end 5 Total data array =============================

                case 5:
                    System.out.println("Terimakasih");
                    exit = true;
                    break;
                default:
                    System.out.println("Opsi yang anda pilih tidak ditemukan");
                    break;
            }
          

            if (num != 4) {
                System.out.println("Kembali ke menu ? (y/n)");
                String opsi = input.nextLine();

                while (!opsi.equalsIgnoreCase("y") && !opsi.equalsIgnoreCase("n")) {
                    System.out.println("Ketik y / n");
                    opsi = input.nextLine();
                }

                if (opsi.equalsIgnoreCase("n")) {
                    exit = true;
                    System.out.println("Terima kasih");
                }

            }
            
            
        } while (!exit);

        
        
    }




}
