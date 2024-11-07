import java.util.Scanner;

public class SearchNilai09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        int [] arrNIlai = {80, 85, 78, 96, 90, 82, 86} ;
        int key = 90;
        int hasil = 0;

        for (int i = 0; i < arrNIlai.length; i++) {
            if (key == arrNIlai[i]) {
                hasil = i;
                break;
            }
        } 
        System.out.println();
        System.out.println(" Nilai " + key + " ketemu di indeks ke- " + hasil );
        System.out.println();
    }
}
