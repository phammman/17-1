package baithuchanh.chuong4;

import java.util.ArrayList;

public class slide17 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();

        arrayListString.add("JAVA");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");

        System.out.println("cac phan tu co trong arrayListString la :");
        for(int i = 0; i < arrayListString.size(); i++){
            System.out.println(arrayListString.get(i) + "\t");
        }
    }
    
}
