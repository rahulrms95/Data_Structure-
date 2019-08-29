package oops.concept.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainExecuteClass {

	private static List<List<String>> lstList = new ArrayList<List<String>>();
	public MainExecuteClass() {
		// TODO Auto-generated constructor stub
		FutureTask<List<String>> tasks[] = new FutureTask[5];
		
		for(int i=0;i<5;i++)
		{
			tasks[i] = new FutureTask<>(new ExecuteQuery("abc"+i,i));
			new Thread(tasks[i]).start();;
		}
		
		/*for(int i=0;i<5;i++)
		{
			new Thread(tasks[i]).start();
		}*/
		for(int i=0;i<5;i++)
		{
			try {
				lstList.add(tasks[i].get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new MainExecuteClass();
		
		for(int i=0;i<lstList.size();i++)
		{
			for(int j=0;j<lstList.get(i).size();j++)
			{
				System.out.print(lstList.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
