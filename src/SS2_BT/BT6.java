package SS2_BT;

import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int num1 =  scanner.nextInt();
                    if (CheckChanLe(num1)) {
                        System.out.println(num1 + " là số chẵn");
                    } else {
                        System.out.println(num1 + " là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int num2 =  scanner.nextInt();
                    if (checkSoNguyenTo(num2)) {
                        System.out.println(num2 + " là số nguyên tố");
                    } else {
                        System.out.println(num2 + " không phải là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Nhập số cần kiểm tra: ");
                    int num3 =  scanner.nextInt();
                    if (soChiaHetCho3(num3)) {
                        System.out.println(num3 + " là số chia hết cho 3");
                    } else {
                        System.out.println(num3 + " không phải số chia hết cho 3");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ");
            }
        } while (choice != 4);
    }

    public static boolean CheckChanLe(int num) {
        return num % 2 == 0;
    }

    public static boolean checkSoNguyenTo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean soChiaHetCho3(int num) {
        return num % 3 == 0;
    }
}
