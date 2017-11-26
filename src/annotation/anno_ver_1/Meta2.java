package annotation.anno_ver_1;

import java.lang.annotation.*;
import java.lang.reflect.*;

@What(description = "Аннотация тестового класса")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {
	@What(description = "Аннотация тестового метода")
	@MyAnno(str = "Тест", val = 100)
	public static void myMeth() {
		Meta2 ob = new Meta2();
		try {
			Annotation annos[] = ob.getClass().getAnnotations();
			
			//выKвести все аннотации для класса Meta2:
			System.out.println("Все аннотации для класса Meta2:");
			for (Annotation a :
					annos) {
				System.out.println(a);
			}
			System.out.println();
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			
			System.out.println("Все аннотации для метода myMeth():");
			for (Annotation a :
					annos) {
				System.out.println(a);
			}
		} catch (NoSuchMethodException exc) {
			System.out.println("Метод не найден.");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
