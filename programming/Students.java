public class Students{
    public String names;
	public double grades[];
	
	
	public Students(String names,double grades[]){
		this.names=names;
		this.grades=grades;
		for(int index=0; index<grades.length; index++){
		System.out.println("Name:" + names);
		System.out.println("Grades:" + grades[index]);
		}
	}
	
	public double getsum(double marks[]){
		double sum=0;
		for(int index=0; index<marks.length; index++){
			sum=sum+marks[index];
		}
		return sum;
	
	}
	
	public void getavarage(double marks[]){
	
		  double avg=getsum(marks)/marks.length;
		  System.out.println("Avarage is: " + avg);
	
    }
	
	public double getmax(double marks[]){
		double max=marks[0];
		for(int index=0; index<marks.length; index++){
			if(marks[index]>max){
				max=marks[index];
			}
		}
		return max;
	
	}
    
	public double getmini(double marks[]){
		double minimum=marks[0];
		for(int index=0; index<marks.length; index++){
			if(marks[index]<minimum){
				minimum=marks[index];
			}
		}
		return minimum;
	
	}


	
	 
}



	 