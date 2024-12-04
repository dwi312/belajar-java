package latihan;

public class Persegi {
    public static void main(String[] args) {
        int n = 5; // Ukuran persegi
        
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                // Cetak bintang di pinggir atau ujung persegi
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
