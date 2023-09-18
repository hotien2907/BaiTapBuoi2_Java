package SS2_BT;

public class BT2 {
    public static void main(String[] args) {
        //hình chữ nhật
//
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j < 7; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("------------------");
        //hình tam giác
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("-------------------");
        //hình tam giác ngược

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("-------------------");
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("  *");
//            }
//            System.out.println(" ");
//        }
    }
}
