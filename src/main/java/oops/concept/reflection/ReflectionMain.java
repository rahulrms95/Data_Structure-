package oops.concept.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ReflectionMain {

	
	public static void main(String[] args) {
		
		try {
			Constructor<?>[] cl = SingltonClass.class.getDeclaredConstructors();
			cl[0].setAccessible(true);
			SingltonClass obj = (SingltonClass) cl[0].newInstance("rahul");
			System.out.println(obj.name);
			SingltonClass obj1 = (SingltonClass) cl[0].newInstance("rahul2");
			System.out.println(obj1.name);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String , Integer> map = new HashMap<>();
		map.put("Rahul", 1302);
	}
}
