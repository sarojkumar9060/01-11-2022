
import java.util.Scanner;
public class factorialByRecursion {

    static int fact =1;
    public static void main(String args[]){
    
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number ");
        int no=s.nextInt(); 


        factorialByRecursion ob=new factorialByRecursion();
        ob.calcFact(no);
        System.out.println("factorial of this number"+fact);
    }
    void calcFact(int no){
        if(no>=1){
            fact=fact*no;
            calcFact(no-1);
        }
    }

}
