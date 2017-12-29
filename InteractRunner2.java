import java.util.Scanner;

/**
 * Класс для запуска калькулятора. Поддерживает ввод пользователя.
 */
public class InteractRunner2 {
    Calculator calcObject = new Calculator();
    Scanner reader = new Scanner(System.in);
    double argValue;
    String command;

    /**
     * MAIN
     * Метод последовательно вызывающий методы согласно логике
     */
    public static void main(String[] args) {
        InteractRunner2 intRunObject = new InteractRunner2();
        intRunObject.startMethod();
    }

    /**
     * ЗАПРОС ЧИСЛА
     * Метод запрашивает число в консоли для дальнейшей работы с ним
     */
    public void enterArg () {
        System.out.println("Enter arg/ Введите аргумент : ");
        argValue = reader.nextDouble();
    }

    /**
     * ЗАПРОС ТИПА ОПЕРАЦИИ
     * Метод просит ввести выбранный оператор в консоли
     * (команда проводит желаемую мат.операцию или другая команда)
     */
    public void chooseOperation () {
        System.out.println("Enter command / Введите команду : ");
        command = reader.next();
        algorythmWhichOperationWasChoosed();
    }

    /**
     * вызов метода (-алгоритма действий) этого класса согласно желаемому действию
     */
    public void algorythmWhichOperationWasChoosed () {
        switch (command) {
            case "0":
                cleanResultAlg();
                break;
            case "info":
                infoAboutOperatorValues();
                chooseOperation();
                break;
            case "+":
                addAlg();
                break;
            case "-":
                subtractAlg();
                break;
            case "*":
                multiplyAlg();
                break;
            case "/":
                divideAlg();
                break;
            default:
                System.out.println("ERROR: wrong operator value");
                chooseOperation();
        }
    }

    /**
     * АЛГОРИТМ действий при операции СТАРТ ПРОГРАММЫ
     */
    public void startMethod () {
        System.out.println("Запущен калькулятор. Добро пожаловать!");
        infoAboutOperatorValues();
        cleanResultAlg();
    }

    /**
     * АЛГОРИТМ действий при операции ВЫЗОВ ИНФОРМАЦИИ
     */
    public void infoAboutOperatorValues () {
        System.out.println("Список команд-операторов калькулятора\n" +
                "+ - приплюсовать (сложение)\n" +
                "- - вычесть\n" +
                "* - умножить\n" +
                "/ - разделить\n" +
                "^ - возвести в степень\n" +
                "0 - обнулить результат\n" +
                "info - вызвать этот список команд снова");
    }

    /**
     * АЛГОРИТМ действий при операции ОЧИСТКА РЕЗУЛЬТАТА
     */
    public void cleanResultAlg () {
        calcObject.cleanResult();
        System.out.println("Результат очищен");
        enterArg(); //ввод первого аргумента, после очистки памяти
        calcObject.result = argValue; //присваивание значения введённого аргумента результату
        chooseOperation();
    }

    /**
     * Вывод результата в консоль
     */
    public void getResultToConsole () {
        System.out.println(" = " + calcObject.getResult());
    }

    /**
     * АЛГОРИТМ действий при операции СЛОЖЕНИЯ
     */
    public void addAlg() {
        enterArg();
        calcObject.add(calcObject.result, argValue);
        getResultToConsole();
        chooseOperation();
    }

    /**
     * АЛГОРИТМ действий при операции ВЫЧИТАНИЯ
     */
    public void subtractAlg() {
        enterArg();
        calcObject.subtract(calcObject.result, argValue);
        getResultToConsole();
        chooseOperation();
    }

    /**
     * АЛГОРИТМ действий при операции УМНОЖЕНИЯ
     */
    public void multiplyAlg() {
        enterArg();
        calcObject.multiply(calcObject.result, argValue);
        getResultToConsole();
        chooseOperation();
    }

    /**
     * АЛГОРИТМ действий при операции ДЕЛЕНИЯ
     */
    public void divideAlg() {
        enterArg();
        calcObject.divide(calcObject.result, argValue);
        getResultToConsole();
        chooseOperation();
    }
}
