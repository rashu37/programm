public class Reversenum{

    public static void main(String args[]){
	
	long number=9838475719L;
	long reverse=0;
	 long rem=0;
	  while(number!=0){
	  rem=number %10;
	  reverse=reverse*10+rem;
	  System.out.println("Reverse number:" + rem);
	  number=number/10;
	  }
	  }
	  }
	 