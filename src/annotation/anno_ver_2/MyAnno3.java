package annotation.anno_ver_2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno3 {
	
	String str() default "Тестирование";
	
	int val() default 9000;
}
