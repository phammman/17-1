package baithuchanh.chuong4;

import java.util.LinkedList;
public class slide38 {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<String>();
        List.add("JAVA");
        List.add("C#");
        List.add("PHP");
        List.add("java");
        
        System.out.println("vi du su dung phuong thuc addALL()");
        System.out.println("-----------------------------------");
        LinkedList<String> listA =  new LinkedList<String>();
        listA.addAll(listA);
        System.out.println("listA:");
        
    }
}