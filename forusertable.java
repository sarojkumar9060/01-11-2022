import java.util.Scanner;

public class forusertable2{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println(     " enter the number you want to print ");
    int no=s.nextInt();
    for(int i=1; i<=10; i++){
        System.out.println(no*i);
    }
}
}




