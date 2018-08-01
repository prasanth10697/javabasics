import java.util.Scanner;
class Armstrongs {
 public static void main(String[] args){
  int total=0,a,b,c,d; 
  Scanner scnr=new Scanner(System.in);
  int num=scnr.nextInt();
  d=num;
while(num>0){
  a=num%10;
  num=num/10;
  total=total+a*a*a;
}
if(total==d){
    System.out.println("Yes");
}
else{
    System.out.println("No");
}
}
}