package helloworld;

public class Helloworld {
	public static void main(String[] args) {
		int z=Integer.parseInt("210");
		Test d=new Test(z);
		String a="Hello world\n";
		String b=a.toUpperCase();
		Test_generalization c=new Test_generalization(b);
		c.intdastampare(91);
		int x= Integer.parseInt("110");
		d.intdastampare(x);
		System.out.println(b + d.x + "\n" + d.y + "\n"+ c.stringa + Test_generalization.z + "\n" +c.y + "\n" + c.x);
	}

}