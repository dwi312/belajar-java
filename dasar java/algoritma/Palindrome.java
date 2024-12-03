public class Palindrome {
    public static boolean cekPalindrome(String kata) {
        String bersih = kata.replaceAll("\\s", "").toLowerCase();
        int kiri = 0;
        int kanan = bersih.length() - 1;

        while (kiri < kanan) {
            if (bersih.charAt(kiri) != bersih.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }
        return true;
    }

    public static void main(String[] args) {
        String kata = "katak";
        System.out.println(cekPalindrome(kata));
    }
}