package annotation.anno_ver_2;

import java.lang.reflect.Method;

public class Meta3 {
	@MyAnno3()
	public static void myMeth() {
		Meta3 ob = new Meta3();
		try {
			Class<?> c = ob.getClass();
			
			Method m = c.getMethod("myMeth");
			
			MyAnno3 anno = m.getAnnotation(MyAnno3.class);
			
			System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
			System.out.println("Метод не найден.");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
