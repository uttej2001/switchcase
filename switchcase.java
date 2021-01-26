package switchcase;
import java.util.Scanner;
public class switchcase{
    public static void main(string[] args){
        int choice;
        System.out.println("pick one :1. Hi\t2. Hey\t3. Hello\t");
        Scanner s=new Scanner(System.in);
        choice=s.nextInt();
        switch(choice)
        {
           case 1 : System.out.println("you said hi");
                   break;
           case 2 : System.out.println("you said hey"):
                   break;
           case 3 : System.out.println("you said hello");
                   break;
           default : System.out.println("invasion chioce.");
        }
   }
}
