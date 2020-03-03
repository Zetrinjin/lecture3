import java.util.Random;

public class work3 {
    public static void main(String[] args) {

        double nums[] = new double[10];
        Random random = new Random();


        for(int i=0; i<nums.length; i++){
            nums[i] = random.nextDouble();

        }

        System.out.println("массив вещественных чисел");

        for(int i = 0; i<nums.length; i++) {
            if (i%10 == 0)
                System.out.println("");
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
        double var;

        for (int i=nums.length-1; i>=1; i--){
            for(int j = 0; j<i; j++){
                if(nums[j]>nums[j+1]){
                    var = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = var;
                }

            }
        }

        System.out.println("отсортированный массив вещественных чисел");

        for(int i = 0; i<nums.length; i++) {
            if (i%10 == 0)
                System.out.println("");
            System.out.print(nums[i] + " ");
        }

        double average,sum=0;

        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
        }

        average=sum/(nums.length-1);
        System.out.println(" ");
        System.out.println("среднее значение: " + average);

        double min=0,max=0;

        for (int i = 0; i<nums.length; i++){
            if(i==0) {
                min = nums[i];
                max = nums[i];
            }

            if(i+1==nums.length)
                break;
            if(min>nums[i+1]){
                min = nums[i+1];
            }
            if(max<nums[i+1]){
                max = nums[i+1];
            }
        }

        System.out.println("минимальное значение: " + min);
        System.out.println("максимальное значение: " + max);
    }
}
