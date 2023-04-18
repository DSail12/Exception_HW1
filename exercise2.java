// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 
// Код приложен в виде картинки к семинару.

//Ответ: 3
//NullPointerException
//IndexOutOfBoundsException
//NumberFormatException

package task1;

public class exercise2 {
    public static void main(String[] args) {
        String[][] array = {{"2", "4", "6", "7", "gs", "-7"}, {"2", "4", "5", null, "-"}};
        System.out.println(sum2d(array));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        if (arr != null) {
            for (int i = 0; i < arr.length; i++) { //NullPointerException
                for (int j = 0; j < arr[i].length; j++) { //IndexOutOfBoundsException
                    if (arr[i][j] != null) {
                        if (ifStringNumber(arr[i][j])) {
                            int val = Integer.parseInt(arr[i][j]); //NumberFormatException
                            sum += val;
                        }
                    }
                }
            }
        }
        return sum;
    }

    public static boolean ifStringNumber(String str) {
        int start = (str.charAt(0) == '-' && str.length() > 1) ? 1 : 0;
        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}


