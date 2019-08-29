package oops.concept.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ExecuteQuery implements Callable<List<String>>{

	private String str;
	private int count;
	public ExecuteQuery(String str,int count) {
		// TODO Auto-generated constructor stub
		this.str = str;
		this.count = count;
	}
	@Override
	public List<String> call() throws Exception {
		// TODO Auto-generated method stub
		List<String> lst = new ArrayList<String>();
		while(this.count>0)
		{
		lst.add(this.str+this.count);
		this.count--;
		}
		return lst;
	}

}
