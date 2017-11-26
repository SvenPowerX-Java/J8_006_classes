package annotation.ssa_youtube;

/**
 * //  Область применения
 *@Target(ElementType.ANNOTATION_TYPE)  //над другими аннотациями
 *@Target(ElementType.CONSTRUCTOR)    // над конструктором
 *@Target(ElementType.FIELD)  //над полями класса
 *@Target(ElementType.LOCAL_VARIABLE) // над локальной переменной метода
 *@Target(ElementType.METHOD)     //над методом
 *@Target(ElementType.PACKAGE)    // над аргументом метода
 *@Target(ElementType.TYPE)   // над классом или интерфейсом
 
 * // Время жизни
 *@Retention(RetentionPolicy.CLASS)     //пока работает компилятор
 *@Retention(RetentionPolicy.SOURCE)     // будет присутствовать только в исходном коде
 *@Retention(RetentionPolicy.RUNTIME)     // runtime
// */

import java.lang.annotation.*;

@Documented //  Попадает в JavaDoc
@Inherited  //  Унаследуется потомками
@Target(ElementType.TYPE)   //  Область применения
@Retention(RetentionPolicy.RUNTIME)     //Время жизни

public @interface Service {
	
	boolean lazyLoad() default false;
	
	String name();
}



