package annotation.annotation_marker;

import java.lang.reflect.Method;

public class Marker {
	@MyMarker
	public static void myMeth() {
		Marker ob = new Marker();
		
		try {
			Method m = ob.getClass().getMethod("myMeth");
			
			if (m.isAnnotationPresent(MyMarker.class)) {
				System.out.println("Аннотация-маркер MyMarker присутствует.");
			}
		} catch (NoSuchMethodException exc) {
			System.out.println("Метод ненайден.");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}
}
