package baithuchanh.chuong3;

import baithuchanh.chuong3.animal.animal;
import baithuchanh.chuong3.animal.dog;
import baithuchanh.chuong3.animal.pig;

public class vd2 {
    public static void main(String[] args) {
        animal an1 = new dog();
        an1.Move();
        an1.Eat();
        animal an2 = new pig();
        an2.Move();
        an2.Eat();
    }
}    