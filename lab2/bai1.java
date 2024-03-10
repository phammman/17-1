import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int so1 = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int so2 = scanner.nextInt();

        int tong = so1 + so2;
        int hieu = so1 - so2;
        int tich = so1 * so2;
        int thuong = so1 / so2;
        int du = so1 % so2;

        boolean bang = so1 == so2;
        boolean lonhon = so1 > so2;
        boolean nhohon = so1 < so2;
        boolean lonhonbang = so1 >= so2;
        boolean nhohonbang = so1 <= so2;

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.println("Thương: " + thuong);
        System.out.println("Dư: " + du);
        System.out.println("So sánh 2 số:");
        System.out.println("Có bằng nhau không? " + bang);
        System.out.println("Có lớn hơn không? " + lonhon);
        System.out.println("Có nhỏ hơn không? " + nhohon);
        System.out.println("Có lớn hơn hoặc bằng không? " + lonhonbang);
        System.out.println("Có nhỏ hơn hoặc bằng không? " + nhohonbang);
    }
}