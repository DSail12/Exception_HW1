// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и 
// возвращающий новый массив, каждый элемент которого равен разности элементов двух 
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
// оповестить пользователя.

package task1;

public class exercise3 {
 
    public static int[] getArray(){
        int[] firstArray = {18, 6, -1, 28, 12, -1, 0, 3, 1}; // Test: firstArray на 1 элемент больше secondArray
        int[] secondArray = {0, -2, 24, -20, 14, -5, 2, 20};
        int[] resultArray = new int[firstArray.length];
        if (firstArray.length != secondArray.length) {
            throw new IndexOutOfBoundsException("Error: индекс вне границ массива!");
        } else {
            for(int x = 0; x < resultArray.length; x++){
                resultArray[x] = firstArray[x] - secondArray[x];
            }
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
