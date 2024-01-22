import java.util.Scanner;

public class KiemTraSoChanLe {

    public static void main(String[] args) {
        // Nhập vào số
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int so = scanner.nextInt();

        // Kiểm tra số chẵn lẻ
        boolean chan = so % 2 == 0;

        // Hiển thị kết quả
        if (chan) {
            System.out.println(so + " là số chẵn.");
        } else {
            System.out.println(so + " là số lẻ.");
        }
    }
}
