public class HighHeight{

  public static void main(String args[]){
  //int num=integer[0];
  int integer[]={34,65,43,76,70,37,19};
  int num=integer[0];
  for(int index=0; index<integer.length; index++){
  if(num<integer[index]){
  num=integer[index];
  }
  }
  System.out.println("The highest number is:" + num);
  }
  }