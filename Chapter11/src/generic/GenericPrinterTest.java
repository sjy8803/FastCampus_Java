package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		// plastic
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
		powderPrinter.printing();
		plasticPrinter.printing();
		
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<>();	// Material 상위에 속하지 않기때문에 오류발생
	}

}
