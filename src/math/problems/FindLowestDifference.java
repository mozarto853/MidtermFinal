package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int number = lowestDifference(array1,array2);
        System.out.println(number);

    }
    public static int lowestDifference(int[] array1, int[]array2){
        Arrays.sort(array1);
        Arrays.sort(array2);
        int i=0;
        int j=0;
        int lowDifference = Integer.MAX_VALUE;
        while(i<array1.length && j<array2.length){
            int difference = Math.abs(array1[i] - array2[j]);
            if(difference<lowDifference){lowDifference = difference;}
            if(array1[i]<array2[j]){
                i++;
            }else{
                j++;
            }
        }
        return lowDifference;
    }

}
