public class Faktorial {
    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * hitungFaktorial(n - 1);
    }

    public static void main(String[] args) {
        int angka = 5;
        System.out.println("Faktorial " + angka + " = " + hitungFaktorial(angka));
    }

}
