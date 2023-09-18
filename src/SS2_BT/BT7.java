package SS2_BT;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật.\n" +
                    "2.Tính chu vi và diện tích hình tam giác\n" +
                    "3.Tính chu vi và diện tích hình tròn.\n" +
                    "4.Thoát");

            System.out.println("nhập vào lựa chọn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("nhập vào chiều dài hình chữ nhật");
                    int chieudai = sc.nextInt();
                    System.out.println("nhập vào chiều rộng HCN");
                    int chieurong = sc.nextInt();
                    String resultHCN = chuViDienTichHCN(chieudai, chieurong);
                    System.out.println(resultHCN);
                    break;
                case 2:
                    System.out.println("nhập vào chiều cách 1");
                    int cach1 = sc.nextInt();
                    System.out.println("nhập vào chiều cách 2");
                    int cach2 = sc.nextInt();
                    System.out.println("nhập vào chiều cách 3");
                    int cach3 = sc.nextInt();
                    String resultHTG = chuViDienTichHTG(cach1, cach2,cach3);
                    System.out.println(resultHTG);
                    break;
                case 3:
                    System.out.println("nhập vào bán kính");
                    int R = sc.nextInt();
                    String resultHT = chuviDienTichHT(R);
                    System.out.println(resultHT);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 4);

    }

    public static String chuViDienTichHCN(int chieudai, int chieurong) {
        double chuvi = (chieudai + chieurong) * 2;
        double dientich = chieudai * chieurong;
        return "chu vi HCN là: " + chuvi + ", dien tich HCN là: " + dientich;
    }

    public  static  String chuViDienTichHTG (int cach1, int cach2, int cach3){
        double chuViTG = cach1+ cach2+ cach3;
        double P =(cach1 + cach2 +cach3)/2;

        double dienTichTG =Math.sqrt(P*(P-cach1)*(P-cach2)*(P-cach3));
        return "chu vi HTG là: " + chuViTG + ", dien tich HTG là: " + dienTichTG;
    }
    public  static  String chuviDienTichHT(int R){
        float PI = 3.14f;

        double chuViHT = 2*PI* R;
        double dienTichHT = PI* Math.pow(R,2);
        return "chu vi HT là: " + chuViHT + ", dien tich HT là: " + dienTichHT;
    }


}
