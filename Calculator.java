//Класс реализует калькулятор.
public class Calculator {

    /**
     * @zeroValue - значение, которое присваивается переменной result
     */
    double zeroValue = 0;

    //результат вычисления.
    public double result;

    //Суммируем аргументы.
    //Addition
    //@param params Аргументы суммирования.
    public void add(double a, double b) {
        this.result = a + b;
    }

    //Вычитаем аргументы
    //Subtraction
    public void subtract(double a, double b) {
        this.result = a - b;
    }

    //Умножаем аргументы
    //Multiplication
    public void multiply(double a, double b) {
        this.result = a * b;
    }

    //Делим аргументы
    //Division
    public void divide(double a, double b) {
        this.result = a / b;
    }

    //Получить результат.
    //@return результат вычисления.
    public double getResult() {
        return this.result;
    }

    //Очистить результат вычисления
    public void cleanResult() {
        this.result = zeroValue;
    }
}