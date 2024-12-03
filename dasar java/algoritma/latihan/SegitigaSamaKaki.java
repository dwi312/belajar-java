package latihan;

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        int tinggi = 5;
        
        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print("");
            }
            
            // Cetak bintang
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
