// import java.util.Arrays;

// class ArrayUtils {
//     //Bruteforce approach to find second smallest and second largest element in an array
//     //Time complexity: O(nlogn) due to sorting the array
//     //Space complexity: O(1) as we are not using any extra space
//     public static void getElements(int[] arr, int nums) {
//         if(nums == 0 || nums == 1) {
//             System.out.println(-1);
//             System.out.println("");
//             System.out.println(-1);
//             System.out.println("\n");
//             return;
//         }

//         Arrays.sort(arr);
//         int small = arr[1];
//         int large = arr[nums-2];
//         System.out.println("Second smallest is: " + small);
//         System.out.println("Second largest is: " + large);
//     }

//     public static void main(String args[]) {
//         int[] arr = {1, 2, 4, 6, 7, 5};
//         int n = arr.length;
//         getElements(arr, n);
//     }
// }



//Best approach to find second smallest and second largest element in an array
//Time complexity: O(n) as we are traversing the array only once
//Space complexity: O(1) as we are not using any extra space



// class ArrayUtils {
 
//     public static void getElements(int[] arr, int nums) {
//         if(nums == 0 || nums == 1) {
//             System.out.println(-1);
//             System.out.println("");
//             System.out.println(-1);
//             System.out.println("\n");
//             return;
//         }
//         int small = Integer.MAX_VALUE;
//         int large = Integer.MIN_VALUE;
//         int second_Small = Integer.MAX_VALUE;
//         int second_Large = Integer.MIN_VALUE;
        
//         for(int i = 0; i < nums; i++) {
//            small = Math.min(small, arr[i]);
//               large = Math.max(large, arr[i]);
//         }
//         for(int i = 0; i < nums; i++) {
//             if(arr[i] != small) {
//                 second_Small = Math.min(second_Small, arr[i]);
//             }
//             if(arr[i] != large) {
//                 second_Large = Math.max(second_Large, arr[i]);
//             }
//         }
//         System.out.println("Second smallest is: " + second_Small);
//         System.out.println("Second largest is: " + second_Large);

//     }

//     public static void main(String args[]) {
//         int[] arr = {1, 2, 4, 6, 7, 5};
//         int n = arr.length;
//         getElements(arr, n);
//     }
// }




// Optimal approach to find second smallest and second largest element in an array
// Time complexity: O(n) as we are traversing the array only once
// Space complexity: O(1) as we are not using any extra space

class ArrayUtils {

    // Function to get second smallest element
    public static int secondSmallest(int[] arr, int nums) {
        if (nums < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for (int i = 0; i < nums; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }

        if (second_small == Integer.MAX_VALUE)
            return -1;

        return second_small;
    }

    // Function to get second largest element
    static private int secondLargest(int[] arr, int nums) {
        if (nums < 2)
            return -1;

        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < nums; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }

        if (second_large == Integer.MIN_VALUE)
            return -1;

        return second_large;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int nums = arr.length;

        int sS = secondSmallest(arr, nums);
        int sL = secondLargest(arr, nums);

        System.out.println("Second smallest is: " + sS);
        System.out.println("Second largest is: " + sL);
    }
}




// ******* Output ******
// Second smallest is: 2
// Second largest is: 6