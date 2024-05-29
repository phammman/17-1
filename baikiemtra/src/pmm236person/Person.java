package pmm236person;

import java.util.Scanner;

public class Person {
    String hovaten;
    int tuoi;
    float luong;
    void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ho va ten :");
        hovaten = scanner.nextLine();
        System.out.println("nhap vao tuoi :");
        tuoi = scanner.nextInt();
        System.out.println("nhap vao luong trung binh :");
        luong = scanner.nextFloat();
    }
    void xuatThongtin(){
        System.out.println("thong tin cua sinh vien la :");
        System.out.println("ho va ten :" +hovaten);
        System.out.println("tuoi :" +tuoi);
        System.out.println("luong trung binh la :" +luong);
    }

    
}