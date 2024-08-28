public class SumofArray {
    public static void main(String[] args) {
        int[] array = {20, 30, 45, 30}; 
        int sum = 0;
		int rem=0;
		int add=0;
        for (int i = 0; i < array.length; i++) {
            sum =sum+array[i]; 
		
			                                                        //20 is cuppon
		System.out.println("the bill on each things:"+array[i]);
		}
				for (int i = 0; i < array.length; i++) {
					
					if(sum>100){
				rem=array[i]-20;
				System.out.println("the cuppon is applied:"+rem);
				}else{
					System.out.println("the cuppon is not applied");	
				}
					
			}
			System.out.println("the total bill is:"+sum);	
			
	}
}