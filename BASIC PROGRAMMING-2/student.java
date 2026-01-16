import java.util.Scanner;
class student{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enten No. Pen");
int a = sc.nextInt();
System.out.println("Enten No. Student");
int b = sc.nextInt();
int n = a/b;
int r = a%b;
System.out.println("no of pen each student get"+n);
System.out.println("remaining"+r);
}
}
