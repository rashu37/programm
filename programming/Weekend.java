public class Weekend{

  public static void main(String args[]){
  
  String days[]={"monday","Tue","Wed","thur","friday","sat","sun"};
  for(int i=0;i<days.length; i++){
  if(days[i]=="monday" || days[i]=="Tue" || days[i]=="Wed" || days[i]=="thur" || days[i]=="friday"){
  
  System.out.println("the days are:" + days[i]);
  }else{
  System.out.println("the days are weekend:"+ days[i]);
  }
  }
  }
  }