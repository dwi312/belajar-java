package latihan;

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        int tinggi = 5;
        
        for (int i = 1; i <= tinggi; i++) {
            // output:
            // tinggi = 5 => 5x loop
            // i < 1 = true. loop 1
            // i < 2 = true. loop 2
            // i < 3 = true. loop 3
            // i < 4 = true. loop 4
            // i < 5 = true. loop 5
            // i < 6 = false. stop loop

            // Cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print("0");
                // output:
                // loop 1 = j(1) < (5-1) = 4 => true => 0000
                // loop 2 = j(1) < (5-2) = 3 => true => 000
                // loop 3 = j(1) < (5-3) = 2 => true => 00
                // loop 4 = j(1) < (5-4) = 1 => true => 0
                // loop 5 = j(1) < (5-5) = 0 => false
            }
            
            // Cetak bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(k);
                // output:
                // loop 1 = k(1) < ((2*1)-1) = 1 => true => 1
                // loop 2 = k(1) < ((2*2)-1) = 3 => true => 123
                // loop 3 = k(1) < ((2*3)-1) = 5 => true => 12345
                // loop 4 = k(1) < ((2*4)-1) = 7 => true => 1234567
                // loop 5 = k(1) < ((2*5)-1) = 9 => true => 123456789
            }
            
            System.out.println();
        }

        // output:
        // loop 1 => 0000 => 1
        // loop 2 => 000 => 123
        // loop 3 => 00 => 12345
        // loop 4 => 0 => 1234567
        // loop 5 =>  => 123456789
    }
}
