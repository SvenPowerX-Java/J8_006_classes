package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
	String str();
	
	int val();
}

public class Meta2 {
	@MyAnno(str = "Два параметра", val = 19)
	@MyAnno2(str = "Первый параметр", val = 20)
	public static void myMeth(String str, int i) {
		Meta2 ob = new Meta2();
		Meta ob1 = new Meta();
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth", String.class, int.class);
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " "+ anno.val());
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		myMeth("Тест", 10);
	}
}
