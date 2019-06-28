package ds.practice.others;

public class FinalKeyWord {
	
	final int Emp_Id;
	
	public  FinalKeyWord(int i)
	{
		this.Emp_Id = i;
	}
	
	public void setEmpId(int id)
	{
	}
	public static void main(String[] args) {
		
		FinalKeyWord fn = new FinalKeyWord(44);
		System.out.println(fn.Emp_Id);
		System.out.println();
		
	}

}
