import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên bất kỳ: ");
        int num = sc.nextInt();

        if (num < 2){
            System.out.printf("%d không phải số nguyên tố", num);
        } else {
            boolean check = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.printf("%d là số nguyên tố", num);
            } else {
                System.out.printf("%d không phải số nguyên tố", num);
            }
        }
    }
}