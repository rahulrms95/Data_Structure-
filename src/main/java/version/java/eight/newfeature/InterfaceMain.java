package version.java.eight.newfeature;

public class InterfaceMain {

	
	public static void main(String[] args) {
		
		Interface inter = new InterfaceImp();
		inter.defaultMethod();
		inter.needToImpl();
		Interface.staticMethod();
		
		InterfaceImp imp = new InterfaceImp();
		
		imp.defaultMethod();
		imp.needToImpl();
		imp.staticMethod();
	}
	
}
