package jaaa;
	/**
	 * 
	 * @author Administrator
	 *
	 */
public class Person {
	private static Person person=new Person();
	public static Person getPerson() {
		return person;
	}
	private Person() {
		System.out.println("构造函数执行");
	}
}
