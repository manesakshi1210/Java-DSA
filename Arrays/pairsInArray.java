public class pairsInArray {
    public static void pairs(int number[])
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=i;j<number.length;j++)
                {
               

                    System.out.println("("+number[i]+","+number[j]+")");


                }
            
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        System.out.println("Pairs");
        pairs(number);
    }
}
