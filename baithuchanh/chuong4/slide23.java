package baithuchanh.chuong4;

import java.util.ArrayList;
import java.util.Scanner;
public class slide23 {
    public static void main(String[] args) {
        int number;
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so luong phan tu cua ArrayList :");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("nhap vao phan tu thu " + i +": ");
            number = scanner.nextInt();
            arrayListInteger.add(number);
        }
        int max = arrayListInteger.get(0);
        for(int i = 0; i < arrayListInteger.size(); i++){
            if(arrayListInteger.get(i).compareTo(max)> 0){
                max = arrayListInteger.get(i);

            }
        }
        System.out.println("phan tu lon nhat trong ArrayList = " +max);
    }
}
