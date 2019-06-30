package oops.concept.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {


	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setAge(23);
		emp.setName("rahul");
		emp.setDepartment("HLS");
		emp.setDesignation("Engineer");
		emp.setEmp_id("1302");
		//storeData(emp);

		Employee empOb = (Employee) retrieveObjFromFile("employee.txt");
		System.out.println(empOb.getName()+" "+empOb.getEmp_id()+" "+empOb.getDepartment()+" "+empOb.getAge());
	}

	/**
	 * To Store Object in File 
	 * @param 
	 *	 * **/
	public static void storeData(Object obj) 
	{
		FileOutputStream fos;
		try {
			/*FileWriter write = new FileWriter("employee.txt");
			write.flush();
			write.close();*/
			fos = new FileOutputStream("employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * To Retrieve Object from File 
	 * @param 
	 * 
	 *	 * **/
	public static Object retrieveObjFromFile(String file)
	{
		Object obj = null ;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			obj = ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
