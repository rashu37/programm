public class StudentRunner{

   public static void main(String args[]){
   double as[]={89.0,55.0,83.0,90.6};
   Students student=new Students("Hasini",as);

   
   double sum=student.getsum(student.grades);
   System.out.println("sum :"+sum);
   
   student.getavarage(student.grades);
   
   double max=student.getmax(student.grades);
   System.out.println("Maximum score:"+max);
   
   double mini=student.getmini(student.grades);
   System.out.println("Minimum score:"+mini);
   
   }
   
   }

