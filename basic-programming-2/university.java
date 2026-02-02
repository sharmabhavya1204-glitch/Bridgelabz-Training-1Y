import java.util.Scanner;
class university{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Fees");
int a = sc.nextInt();
int df = a-((a/100)*10);
System.out.println("fees after discounted"+df);
}
}
