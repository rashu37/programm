public class Count{
   public static void main(String args[]){
   
   int even=0;
   int odd=0;
     for(int index=1; index<=50; index++){
     if(index % 2==0){
		 even++;
		 //System.out.println("the total number of even:" + even);
	 }else{
		 odd++;
	     //System.out.println("the total number of odd:" + odd);
   }
	
}
System.out.println("the total number of even:" + even);
System.out.println("the total number of odd:" + odd);
   
   }
}