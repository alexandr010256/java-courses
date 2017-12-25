public class Calculate {

	public static void main(String[] arg) {
		System.out.println("Calculate");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double summ = first + second;
		System.out.println("Sum " + summ);
		double vichit = first - second;
		System.out.println("vichit " + vichit);
		double umnoj = first * second;
		System.out.println("umnoj " + umnoj);
		double delen = first / second;
		System.out.println("delen " + delen);
		double stepen = Math.pow(first, second);
		System.out.println("stepen " + stepen);
		
	}

}