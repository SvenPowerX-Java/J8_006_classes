package annotation.one_value_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySingle {
	int value();    // эта переменная должна иметь имя value
}
