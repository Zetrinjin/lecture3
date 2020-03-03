import java.util.Random;

public class work4 {
    public static void main(String[] args) {
        Random random = new Random();

        double nums[] = new double[3];

        double min=10,max=99;

        for(int i = 0; i<nums.length; i++){
            nums[i]=((Math.random()* (max-min)+1+min));
        }

        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        double minim=0;
        boolean fl=false;

        for(int i = 0; i<nums.length; i++){

            minim=nums[i];

            if(i+1==nums.length)
                break;

            if(minim>nums[i+1]) {
                fl = false;
                break;
            }
            else fl=true;
            }

        System.out.println(" ");
        if(fl)
            System.out.println("последовательность возрастающая");
        else
            System.out.println("последовательность не возрастающая");

        }
    }

