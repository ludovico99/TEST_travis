package helloworld;

public class Test_generalization extends Test{
	public String stringa;
	public static int z=5;
	
	public Test_generalization(String x) {
		this();
		this.stringa=x;
	}
	public Test_generalization() {
		super(z);
	}
}
