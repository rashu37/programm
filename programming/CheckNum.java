public class CheckNum{
      public static void main(String args[]){
	  
	  int array[]={3,5,6,4,2,0,8,3,2};
	  int num=3;
	  for(int index=0; index<array.length; index++){
	  if(array[index]==3 ){
	   System.out.println("The element is present,yes:" + array[index]);
	   }else{
	   System.out.println("The element is not present:"+ array[index]);
	   }
	   }
	   }
}