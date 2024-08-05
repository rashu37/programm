public class Factorial{

   public static void main(String args[]){
   
   
   int element[]={2,4,5,7,5,4};
   
   for(int i=0;i<element.length;i++){
    int number=element[i];
	long factorial=1;
	for(int j=1;j<=number;j++){
	factorial=factorial*j;
	}
	System.out.println("the factorial of element:" + factorial);
	}
	}
	}
     
   