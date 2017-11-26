package annotation.ssa_youtube;


public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		MyClass a = new MyClass();
		Class<MyClass> aclass = (Class<MyClass>) a.getClass();
		//второй способ
//		Class<MyClass> aclass = MyClass.class;
		//третий метод выбрасует Exception
		Class<?> c = Class.forName("java.lang.Byte");
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getModifiers());
		System.out.println(c.getSuperclass());
		System.out.println(c.getInterfaces());
		
	}
	
}
