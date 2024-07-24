//Number Game

import java.util.Scanner;

class A
{   int num , count;
    int random;
   public void guess()
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number ");
        num=sc.nextInt();

        random=(int)(Math.random()*10);

        if(random==num)
        {
            System.out.println("You won ");
            count++;
        }

        else if (num<random) {
            System.out.println("Too low ");
            
        }

        else
        {
            System.out.println("Too high");
        }
    }   
}

public class Task1 {
    
    public static void main(String[] args) {
        
        A obj=new A();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++)
        {

            System.err.print("Press 1 to Play : ");
            int ch=sc.nextInt();
        
            switch(ch)
            {
                case 1 : obj.guess();
                break;

                default : System.out.println("Invalid choice ");
            }
        }    
        System.out.println("Total Score = "+obj.count);    
        
    }
}
