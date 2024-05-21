package baithuchanh.chuong4;

import java.util.LinkedList;
import java.util.Scanner;
public class slide41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("thang 1");
        linkedList.add("thang 2");
        linkedList.add("thang 3");
        linkedList.add("thang 4");
        linkedList.add("thang 5");
        linkedList.add("thang 6");
        linkedList.add("thang 7");
        linkedList.add("thang 8");
        linkedList.add("thang 9");
        linkedList.add("thang 10");
        linkedList.add("thang 11");
        linkedList.add("thang 12");

        System.out.println("nhap vao chi so cua phan tu can lay :");
        int index = scanner.nextInt();
        if(index < 0 || (index > (linkedList.size()-1))){
            System.out.println("chi so lay phai lon hon 0 va nh hon " +(linkedList.size()-1));
        }else{
            String node = linkedList.get(index);
            System.out.println("phan tu ch so = " + index + "trong linkeList la " + node);  
        }
        String firstNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();
        System.out.println("\nphan tu dau tien trong danh sach la " + firstNode + " phan tu cuoi cung trong danh sach la :" + lastNode);

    }    
}
