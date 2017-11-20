package nasledovanie;

import first_demo.Box;

public class RefDemo {
	public static void main(String[] args) {
		BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
		Box plainBox = new Box();
		double vol;
		
		System.out.println("Объём weightBox равен" + weightBox.volume());
		System.out.println("Вес weightBox = " + weightBox.weight);
		System.out.println();
		//Присвоить ссылке на обьект BoxWeight ссылки на объект Box
		plainBox = weightBox;
		System.out.println("Объём plainBox = " + plainBox.volume());
//		System.out.println("plainBox = " + plainBox.weight); //Ошибка
	}
}
