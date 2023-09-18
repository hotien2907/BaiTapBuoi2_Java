package SS2_BT;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput;

        int a;
        int b;
        int c;
        do {
            System.out.println("nhập vào cạch a: ");
            a = sc.nextInt();
            System.out.println("nhập vào cạch b: ");
            b = sc.nextInt();
            System.out.println("nhập vào cạch c: ");
            c = sc.nextInt();

            if (CheckTamGia(a, b, c)) {
                String resultHTG = chuViDienTichHTG(a, b, c);
                System.out.println(resultHTG);
            } else {
                System.out.println("3 cạch ko phải là 3 cạch của tam giác");
            }


            System.out.println("Bạn có muốn tiếp tục không? (true/false)");
            continueInput = sc.nextBoolean();

        } while (continueInput);
    }

    public static boolean CheckTamGia(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }

    public static String chuViDienTichHTG(int a, int b, int c) {
        double chuViTG = a + b + c;
        double P = (a + b + c) / 2;
        double dienTichTG = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        return "chu vi HTG là: " + chuViTG + ", dien tich HTG là: " + dienTichTG;
    }
}
