import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums;
        nums = new int[100];
        int j = 0;

        for (int i = 0; j < 100; i++) {
            /*if(i==0)
                j--;*/
            if (i % 13 == 0 || i % 17 == 0) {
                nums[j] = i;
                j++;
            }
        }

        for(int i=0; i<100; i++){
            System.out.println(nums[i]);
        }

    }
}