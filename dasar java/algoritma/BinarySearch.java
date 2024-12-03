public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int kiri = 0;
        int kanan = arr.length - 1;

        while (kiri <= kanan) {
            int tengah = kiri + (kanan - kiri) / 2;

            if (arr[tengah] == target) {
                return tengah;
            }

            if (arr[tengah] < target) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;
        int hasil = binarySearch(arr, target);
        
        if (hasil != -1) {
            System.out.println("Elemen ditemukan di index: " + hasil);
        } else {
            System.out.println("Elemen tidak ditemukan");
        }
    }
}