import java.util.Scanner;

public class SearchNilai09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        int[] arrNilai = new int[7];
        int key = 78;

        System.out.print(" Masukkan banyaknya nilai yang akan diinput : ");
        int jumlahElemen = sc09.nextInt();

        for (int i = 1; i<7; i++) {
            System.out.print( " Masukkan nilai mahasiswa ke- " + (i) + " : ");
            arrNilai[i] = sc09.nextInt();
        }
        System.out.print( " Masukkan nilai yang ingin dicari : ");
        key = sc09.nextInt();

        int hasil = -1;
        for (int i=0; i<arrNilai.length; i++) {
            if (arrNilai[i] == key) {
                hasil = i;
                break;
            }
        }
        if (hasil !=-1) {
            System.out.println(" Nilai " + key + " ketemu, merupakan nilai mahasiswa ke- " + hasil);
        } else {
            System.out.println(" Nilai yang dicari tidak ditemukan " );
        }
    }
}
