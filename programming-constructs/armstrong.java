import java.util.Scanner;
class armstrong{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter no");
int num = sc.nextInt();
int rem = 0;
int result = 0;
int temp = num;
while(num!=0){
rem=num%10;
result+=rem*rem*rem;
num=num/10;
}
if(result==temp){
System.out.println("Armstrong no");
}
else {
System.out.println("Not A Armstrong no");
}
}}

