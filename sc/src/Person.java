import java.util.Scanner;

public class Person {
    public String hovaten;
    public int tuoi;
    public Float chieucao;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap hovaten:");
        hovaten = sc.nextLine();
        System.out.println("nhap tuoi:");
        tuoi = sc.nextInt();
        System.out.println("nhap chieucao:");
        chieucao = sc.nextFloat();
    }
    public void inthongtin(){
        System.out.println("HovaTen:" + hovaten);   
        System.out.println("tuoi:" + tuoi);
        System.out.println("chieucao:" + chieucao);     
    }
}