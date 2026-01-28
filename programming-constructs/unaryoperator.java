import java.util.Scanner;
class unaryoperator{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter No");
int a=sc.nextInt();
System.out.println(a++);
System.out.println(--a);
System.out.println(++a);
System.out.println(a--);
}
}