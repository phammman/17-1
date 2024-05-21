package baithuchanh.chuong4;

import java.util.ArrayList;
public class slide21 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("thit cho");
        arrayListString.add("la mo");
        arrayListString.add("mam tom");

        System.out.println("cac do can phan co khi di an thit cho ");
        for(int i = 0; i < arrayListString.size(); i++){
            System.out.println(arrayListString.get(i) + "\t");
        }
    }
}
