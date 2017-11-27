package annotation.anno_type;

public class TypeAnnoDemo<@What(description = "Данные обобщёого типа") T> {
	@TypeAnno String str;
	@EmptyOK String test;
	String @MaxLen(10) [] @NotZeroLen [] w;
	@TypeAnno Integer[] vec;
	
	public @Unique TypeAnnoDemo(){}
	
	public static void myMeth(int i) {
		TypeAnnoDemo<@TypeAnno Integer> ob = new TypeAnnoDemo<@TypeAnno Integer>();
		
		@Unique TypeAnnoDemo<Integer> ob2 = new @Unique TypeAnnoDemo<Integer>();
		Object x = new Integer(10);
		Integer y;
		
		y = (@TypeAnno Integer) x;
	}

	public static void main(String[] args) {
		myMeth(10);
	}
	
	public int f(@TypeAnno TypeAnnoDemo<T>this, int x) {
		return 10;
	}
	
	public @TypeAnno Integer f2(int j, int k) {
		return j + k;
	}
	
	public @Recommended	Integer f3(String str) {
		return str.length() / 2;
	}
	
	public void  f4() throws @TypeAnno NullPointerException {
		//...
	}
	
	class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
	
	}
}
