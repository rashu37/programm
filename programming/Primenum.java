public class Primenum{

   public static void main(String args[]){
   
   int number=4;
   int count=0;
   if(number<2){
     System.out.println("it is not prime num:"+ number);
	 for(int index=2; index<=number; index++){
	  if(number%index==0){
	     count++;
		 }
		 }
		 if(count<2){
		   System.out.println("it is a prime num:"+ number);
		   }else{
		   System.out.println("it is not a prime num:"+ number);
		   }
		   }
   }
		   }