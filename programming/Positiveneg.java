public class Positiveneg{


    public static void main(String args[]){
	
	int element[]={2,-3,4,2,-5,-6,0};
	int positive=0;
	int negative=0;
	for(int i=0; i<element.length;i++){
	if(element[i]>0){
		positive++;
		
	System.out.println("the element is positive:" + element[i]
	);
	}else{
		negative++;
	System.out.println("the element is negative:"+ element[i]);
	}
	}
	
	System.out.println(" Positive count:" + positive);
	System.out.println("Negative count:" + negative);
	}
}