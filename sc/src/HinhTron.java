import java.util.Scanner;

public class HinhTron extends HinhHoc {

        public float banKinh;

        public HinhTron(){
            ten = "HinhTron";
        }
        public void nhapBankinh(){
            System.out.println(" bankinh =");
            Scanner scanner = new Scanner (System.in);
            bankinh = Scanner.nextFloat();
        }
        public void tinhChuVi(){
            System.out.println(" chuvi =");
        }
        public void tinhDienTich(){
            System.out.println(" dientich:" + dientich);
        }
    }
  