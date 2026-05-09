public class SolidRhombus {
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rombus(int n){
        for(int i=1; i<=n;i++)

            {
                // Print spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                // Print stars
                for(int k=1; k<=n; k++){
                    if(i==1 || i==n || k==1 || k==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }

    public static void diamond(int n)

    {
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            for (int k=1;k<=((2*i-1));k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half of the diamond
        for (int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            for (int k=1;k<=((2*i-1));k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

     
    }
    public static void main(String[] args) {
     
        // solid_rhombus(5);
        // System.out.println();
        // hollow_rombus(5);
        // System.out.println();
        diamond(7);
        
    }
}


