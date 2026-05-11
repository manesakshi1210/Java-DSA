public class reverseArray {

    public static void Reverse(int[] number) {

        int first = 0;
        int last = number.length - 1;

        while (first < last) {

            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {

        int[] number = {2, 4, 6, 8, 10};
         for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

         System.out.println( "ReverseArray: ");
        Reverse(number);

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}