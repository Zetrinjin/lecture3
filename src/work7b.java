import java.util.Scanner;

//

public class work7b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("введите факториал");
        int number = sc.nextInt();
        int multi=1;

        while(number>1){
            multi *=number;
            number--;
        }

        System.out.println(multi + " множимое факториала");
    }
}
