package SS2_BT;

public class BT5 {
    public static void main(String[] args) {
        int N =1;
        while (true){
            if(CheckNum(N)){
                System.out.println(N);
                break;
            }
          N++;
        }

    }

    public static boolean CheckNum(int num) {
        if (num % 5 == 0 && num % 7 == 0 && num % 11 ==0) {
           return true;
        }
        return false;
    }

}
