import java.util.Scanner;
class relationaloperators{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Age");
int a=sc.nextInt();
if(a>=18){System.out.println("allowed");}
else{System.out.println("not allowed");}
}
}