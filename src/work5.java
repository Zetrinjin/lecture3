import java.util.Scanner;

public class work5 {
    public static void main(String[] args){

        int nums1[][] = {{2,3},
                        {4,5}};
        int nums2[][] = {{2,3},
                        {6,7}};

        if(equals(nums1,nums2))
            System.out.println("элементы одинаковы");
        else
            System.out.println("элементы разные");
    }

    private static boolean equals(int[][] nums1, int[][] nums2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите 2 часла для сравнения элементов массива");

        int i= sc.nextInt();
        int j= sc.nextInt();

        return nums1[i][j] == nums2[i][j];
    }
}



