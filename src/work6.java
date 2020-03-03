import java.util.Scanner;

public class work6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите число");
        int number = sc.nextInt();
        boolean fl = true;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                fl = false;
                break;
            }
        }

        if (fl)
            System.out.println(number + " простое число");
        else
            System.out.println(number + " составное число");
    }
}
