package first_demo;
/*
	Обьём паралелипипеда
	Программа использующая класс Box
	Обьявляем обьект типа Box
 */
public class BoxDemo {
	public static void main(String[] args) {
		Box myBox = new Box();
		double vol;
		myBox.with = 10;
		myBox.height = 20;
		myBox.depth = 15;
		
		vol = myBox.with * myBox.height * myBox.depth;
		System.out.println(" Обьём равен " + vol);
		
		
	}
}
