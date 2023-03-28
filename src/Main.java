import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int boyut, eleman,toplam=0;

        System.out.print("Dizinin Boyutunu Giriniz :");
        boyut = input.nextInt();
        int[] arr = new int[boyut];


        for (int i = -1; i < arr.length-1; i++) {

            System.out.print("Dizinin "+(i + 1) + " . Elemanınını Giriniz :");
            eleman = input.nextInt();

            arr[toplam++]=eleman;


        }
        Arrays.sort(arr);
        System.out.print("Küçükten Büyüğe Doğru Sıralama Şekli = ");
        System.out.println(Arrays.toString(arr));

    }
}