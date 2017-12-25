//Класс реализует калькулятор.
public class Calculator {
	
	//результат вычисления.
	public double result;
	
	//Суммируем аргументы.
	//@param params Аргументы суммирования.
	public void add(double ... params) {
		for (Double param : params) {
			this.result += param;
		}
	}
	
	//Получить результат.
	//@return результат вычисления.
	public double getResult() {
		return this.result;
	}
	
	//Очистить результат вычисления
	public void cleanResult() {
		this.result = 0;
	}
}