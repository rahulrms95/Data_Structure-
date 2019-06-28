package ds.practice.others;

public class AbstractImp extends FinalAbstract{

	public AbstractImp()
	{
		super("rahul");
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Print");
	}

	public static void main(String[] args) {

		new AbstractImp().print();
		/*FinalAbstract fin = new FinalAbstract("rahul") {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Final Abstract Class");
			}
		};

		fin.print();
		fin.test();*/
	}
}
