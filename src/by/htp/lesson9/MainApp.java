package by.htp.abc;

public class C extends B {

	{
		System.out.println("CL1");
//new C ();
	}

	public C() {
		System.out.println("C ()");
	}

	public C(String c) {
		super();
		System.out.println("C (String c)");
	}

	
	public C (Object obj) {
		this ("a");
		
		//привет как дела проверка
		
		/**
		 @author Tatsiana_Aliaksandro
		 
		 */
	}
}
