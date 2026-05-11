
public class array01 {

    public static void update(int marks[])
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;

        }
        
    }
    public static void main(String[] args) {
    //     int marks[] = new int[50];
    //     Scanner sc= new Scanner(System.in);

    //     marks[0]=sc.nextInt(); //phy
    //     marks[1]=sc.nextInt(); //che
    //     marks[2]=sc.nextInt(); //bio

    //     for (int i =0; i<marks.length; i++)
    //     {
    //         System.out.print(marks[i]);
    //     }
    //    System.out.println("Physics Marks :"+marks[0]);
    //     System.out.println("Chemistry Marks :"+marks[1]);
    //      System.out.println("Bio Marks :"+marks[2]);

    //     System.out.print(marks.length);

    int marks[] = {90,98,60,79};
    for (int i =0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

    update(marks);
     System.out.println();
    for (int i =0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
