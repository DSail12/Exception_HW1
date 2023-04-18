// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

package task1;



import java.util.Scanner;

public class exercise1 {
    
    static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        System.out.println("Enter string: ");
        return scanner.nextLine();
    }
    
    // № 1: Реализация исключения RuntimeException (проверка на ввод числа с консоли пользователем)
    public static Integer getNumber(){
        System.out.println("Enter number: ");
        if (!scanner.hasNextInt()) {
            throw new RuntimeException("Wrong number, try again.");
        }
        return scanner.nextInt();
    }

    //  № 2: Реализация исключения NumberFormatException (проверка на правильность формата строки перед преобразованием в число)
    public static Integer getStringToInt(String slovo){
        int num = 0;
        try { 
            num = new Integer(slovo);
            System.out.println("Результат преобразования: " + num);
        }catch (NumberFormatException e) {  
            System.err.println("Неправильный формат строки!");  
        }
        return num;
    }   

    //  № 3: Реализация исключения Exception (расчет факториала)
    public static int getFactorial(int num){
        int result = 1;
        try{
            if(num < 1) throw new Exception("The number is less than 1");
            for(int i = 1; i <= num; i++){
                result *= i;
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            result = num;
        }
        return result;
    }

    // Исполняемая программа
    public static void main(String[] args){
        int number = getNumber();
        String name = getString();
        System.out.println("Вы ввели число: " + number); //  Запуск метода № 1
        getStringToInt(name); //  Запуск метода № 2
        System.out.println(getFactorial(number)); //  Запуск метода № 3
    }
}