public class Leapyear{
     public static void main(String args[]){
	 
	 int year =100;
	 if(year % 400==0){
	    System.out.println("The year is leapyear:" + year);
	 }else if(year % 4==0 && year % 100 !=0){
		System.out.println("The year is leapyear:" + year); 
	 }else{
	   System.out.println("The year is not leapyear:" + year);
	   }
	   }
	   }
	   