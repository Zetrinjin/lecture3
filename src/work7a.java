import java.util.Scanner;

public class work7a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите факториал");
        int number = sc.nextInt();
        int multi=1;

        for (int i = 1; i <= number; i++){

            multi *=i;
        }

        System.out.println(multi + " множимое факториала");
    }
}
