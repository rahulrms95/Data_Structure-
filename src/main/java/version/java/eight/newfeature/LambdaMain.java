package version.java.eight.newfeature;

public class LambdaMain {

	
	public static void main(String[] args) {
		
		FunctionInterface fi = new FunctionInterface() {
			
			@Override
			public void method(int value) {
				// TODO Auto-generated method stub
				System.out.println("This is function interface"+value);
			}
		};
		
		FunctionInterface lambda = (value) -> {
			
			System.out.println("this is lambda Expression Example "+value);
		};
		lambda.method(5);
		lambda.defaultMethod();
	}
}
