// //  Array- list of elements of the same type placed in contigous memory location
// // Array opration - create , input , output , insert , delete , search , update

// // 1.creating Array
// // datatype arrayName[] = new datatype[size];

import java.util.Scanner;

public class arrays
  {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc= new Scanner(System.in);

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
    }
        
    }


// // public class arrays {

// //     public static void subArray(int arr[]){
// //         int count = 0;
// //     for(int i=0;i<=arr.length;i++){
// //         for(int j=i;j<arr.length;j++){
// //             for(int k=i;k<=j;k++){
// //                 System.out.print(arr[k]+" ");
// //             }
// //             System.out.println();
// //             count++;
// //         }
    
// //     }
// //     System.out.println("Total subarrays: "+count);
// // }

// //    public static void MaxsubArraySum(int arr[]){
        
// //         int currentSum = 0;
// //         int maxSum = Integer.MIN_VALUE;
// //         int prefix[] = new int[arr.length];
// //         for(int i=0;i<arr.length;i++){
// //             for(int j=i;j<arr.length;j++){
// //                 // int sum = 0;
// //                 // for(int k=i;k<=j;k++){
// //                 //     sum += arr[k];
// //                 // }
// //                 // if(sum > maxSum){
// //                 //     maxSum = sum;
                

// //                 for(int i=1;i<arr.length;i++){
// //                     prefix[i] = prefix[i-1]+arr[i];

// //                 }

// //                 for(int i=0;i<arr.length;i++)
// //                 {
// //                     int start = i;
// //                     for(int j=i;j<arr.length;j++){
// //                         int end = j;
// //                         currentSum = prefix[end] - prefix[start-1];
// //                         if(currentSum > maxSum){
// //                             maxSum = currentSum;
// //                         }
// //                     }
                    
// //                 }
// //             }
// //         }
// //         System.out.println("Maximum subarray sum: "+maxSum);
// //     }
// //     public static void main(String[] args) {
// //         int[] arr = {1, -2, 6, -1, 3};
// //         // subArray(arr);
// //         MaxsubArraySum(arr);
// //     }
// // }


