import java.util.*;
import java.io.*;
class Leet_medium_2
{
    public static void main()
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        while(n!=0)
        {
            int a=0;
            for(int i=2;i<=n;i++)
            {
                if(n%i==0)
                a++;
            }
                if(a==1)
                c++;
            n--;
        }
        System.out.println(c);
        
              
    }
}
