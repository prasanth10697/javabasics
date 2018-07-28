import java.util.*;
public class Even{
	public static void main(String args[]){
		Scanner scnr=new Scanner(System.in);
		int num=scnr.nextInt();
		int num2=scnr.nextInt();
		for(int i=num;i<num2;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
