package classes;

public class Classesing {

	public static void main(String[] args) {
		// reference types
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;

		System.out.println(sayi2);
            //diziler reference tiptir!!
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };

		sayilar1 = sayilar2;
		sayilar1[0] = 12;
		System.out.println(sayilar2[0]);

	}

}
