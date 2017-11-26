package annotation.one_value_annotation;

public @interface SomeAnno {
	int value();
	
	int xyz() default 0;
}
