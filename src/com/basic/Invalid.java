import java.util.*;

public class Invalid{
   public static void main(String args[]){
	   boolean isvowel=false;
       Scanner scnr = new Scanner(System.in);
       char n=scnr.next().charAt(0);
	   if('a'==n||'e'==n||'i'==n||'o'==n||'u'==n){
		   isvowel=true;
	     System.out.println("Vowel");
	   }else if(n>='a'&& n<='z'){
	    System.out.println("Consontant");
	   }else{
	    System.out.println("invalid");
	   }
   }
}