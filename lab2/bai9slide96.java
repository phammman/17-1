import java.util.Scanner;

public class bai9slide96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        demVaInSoKyTu(chuoi);

        scanner.close();
    }

    public static void demVaInSoKyTu(String chuoi) {
        int soKyTuThuong = 0;
        int soKyTuHoa = 0;
        int soChuSo = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);

            if (Character.isLowerCase(kyTu)) {
                soKyTuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                soKyTuHoa++;
            } else if (Character.isDigit(kyTu)) {
                soChuSo++;
            }
        }

        System.out.println("Số ký tự thường trong chuỗi: " + soKyTuThuong);
        System.out.println("Số ký tự hoa trong chuỗi: " + soKyTuHoa);
        System.out.println("Số chữ số trong chuỗi: " + soChuSo);
    }
}