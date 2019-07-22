package ds.practice.string;

public class StringByte {

	
	public static void main(String[] args) {
		
		String str = ";rahul.#?";
		byte[] bytes = str.getBytes();
		
		for(int i=0;i<bytes.length;i++)
		{
			System.out.print(bytes[i]+" ");
		}
		System.out.println();
		for(int i=0;i<bytes.length;i++)
		{
			System.out.print((char)bytes[i]);
		}
		
		System.out.println();
		
		String name="rahul";
		name = name+"kumar";
		String nam = "rahulkumar";
		System.out.println(name.hashCode()+" "+nam.hashCode());
		
	}
}
