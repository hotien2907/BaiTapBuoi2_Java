package SS2_BT;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("nhập giá trị đầu");
        int start = scaner.nextInt();
        System.out.println("nhập gia trị cuối");
        int end = scaner.nextInt();
        int sum =0;
        for (int i = start; i <=end ; i++) {
            if(i% 2 ==0) {
                sum+=i;
            }

        }
        System.out.println("tổng các số chẵn tron khoang "+ start +"-"+end +"là"+sum);
    }
}
