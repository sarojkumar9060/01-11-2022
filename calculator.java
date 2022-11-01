import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        String yn;

   do{
    
    Scanner s=new Scanner(System.in);
    System.out.println("enter first number ");
    int no1=s.nextInt();
    System.out.println("enter second number");
    int no2=s.nextInt();
    System.out.println("select sembole (+,-,*,/,%)");
    String sym=s.next();
    int res;
    switch(sym){
        case"+":res=no1+no2;
        System.out.println("addition is :"+res);
        break;
        case"-":res=no1-no2;
        System.out.println("addition is : "+res );
        break;

        case"*":res=no1*no2;
        System.out.println("multiplication is : "+res );
        break;
        case"/":res=no1/no2;
        System.out.println("division is : "+res );
        break;
        case"%":res=no1%no2;
        System.out.println("modulash is : "+res );
        break;
        default: System.out.println("invilide symbole");
        break;
    }
    System.out.println("do u want to continue (press y for yes and n for no ) ");
    yn=s.next();


   }while(yn.equals("y")||yn.equals("Y"));
        
    }

    
    
}
