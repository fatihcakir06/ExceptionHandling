package exceptionHandling;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		/*String[] cities = { "ankara", "istanbul" };

		try {
			System.out.println(cities[1]);
		} catch (Exception e) {
			System.out.println("bir hata olu�tu.");
		} finally {
			System.out.println("ben her t�rl� �al���r�m.");
		}*/

		
		try {
			 for (String product : addProduct("�ilek")) {
					System.out.println(product);
				} 
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

	public static ArrayList<String> addProduct(String productName) throws BusinessException { // throws Exception -- void d�nd�rmezse
																			// exception d�nd�r�r.
		ArrayList<String> productNames = new ArrayList<String>();
		productNames.add("elma");
		productNames.add("armut");

		if (productNames.contains(productName)) {
			throw new BusinessException("ayn� isimde �r�n olamaz.");
		}else {
			productNames.add(productName);
		}
		return productNames;
	}

}
