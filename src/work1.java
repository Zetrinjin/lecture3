import java.util.Scanner;

public class work1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[] {1,2,3,4,5,6};

        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        int var = 0;
        int leng = nums.length - 1;

        for(int i = 0; i<nums.length; i++)
            for(int j=leng; j>0; j--) {
                if (j<i)
                    break;
                if (i < j) {

                    var = nums[i];
                    nums[i] = nums[j];
                    nums[j] = var;
                    leng--;
                    break;
                }
            }

        System.out.println(" ");
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
