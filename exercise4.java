// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов 
// не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.


package task1;

public class exercise4 {
    public static int[] getArray(){
        int[] firstArray = {18, 6, -1, 28, 12, -1, 0, 3, 1}; // Test: firstArray на 1 элемент больше secondArray
        int[] secondArray = {1, -2, 24, -20, 14, -5, 2, 20}; // Test: в secondArray можно добавить ноль
        int[] resultArray = new int[firstArray.length];
        
        try {
            for(int x = 0; x < resultArray.length; x++){
                resultArray[x] = firstArray[x] / secondArray[x];
            }
        } catch (IndexOutOfBoundsException e){
            System.err.println("Error: индекс вне границ массива!");
        } catch (ArithmeticException e){
            System.err.println("Error: деление на ноль!");
        }
        return resultArray;
    }
    // Исполняемая программа
    public static void main(String[] args){
                
        int[] resultArray = getArray();
        for(int i: resultArray)
            System.out.print(i + " ");

    }
}
