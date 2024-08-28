public class Sumoftwonum{

   public static void main(String args[]){
   
   int elements[]={3,5,2,7,8,4,3,6,9};
   int numbers=0;
   
    for(int i=0; i<elements.length;i++){
       for(int j=i+1; j<elements.length; j++){
		   if(elements[i]==elements[j]){
			   numbers=elements[i]+elements[j];
			   
            }
			
		}	
		

	}
	System.out.println("the sum of two same num:" + numbers);
   }
}
	 
	 