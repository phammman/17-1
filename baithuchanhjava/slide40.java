import java.util.Scanner;

public class slide40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số ngày: ");
        int day = scanner.nextInt();

        String dayOfWeek;

        switch (day) {
            case 1:
                dayOfWeek = "Chủ nhật";
                break;
            case 2:
                dayOfWeek = "Thứ hai";
                break;
            case 3:
                dayOfWeek = "Thứ ba";
                break;
            case 4:
                dayOfWeek = "Thứ tư";
                break;
            case 5:
                dayOfWeek = "Thứ năm";
                break;
            case 6:
                dayOfWeek = "Thứ sáu";
                break;
            case 7:
                dayOfWeek = "Thứ bảy";
                break;
            default:
                dayOfWeek = "Số ngày không hợp lệ";
                break;
        }

        System.out.println("Ngày " + day + " là " + dayOfWeek);
    }
}
