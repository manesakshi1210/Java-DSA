public class largestNum {
     public static void largestNumber(int numbers[])
     {    int large=0;
          for(int i=0;i<numbers.length;i++)
          {
            if(large<numbers[i])
            {
                large=numbers[i];
            }
            
          }

          System.out.print("Largest number is : "+large);
     }

        public static void main(String arg[])
        {
            int numbers[]={1,3,10,5,7,6,2};
            largestNumber(numbers);

        }
    
}
