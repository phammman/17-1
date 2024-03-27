import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieucao;
     public HinhTru(){
        ten = "Hinh Tru";
     }
     public void nhapchieucao(){
        super.nhapbankinh();

            System.out.print("chieu cao =");
            Scanner sc = new Scanner(System.in);
            chieucao = sc.nextFloat();
     }
     public void tinhthetich(){
        super.tinhdientich();
        thetich = dientich * chieucao;
     }

    

