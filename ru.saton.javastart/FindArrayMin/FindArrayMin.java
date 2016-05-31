package FindArrayMin;

//Поиск минимума в массиве, поиск первого номера минимума, поиск всех номеров минимумов.

public class FindArrayMin {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,32,1,2,2,6,20};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

        }
        System.out.println("Minimum = "+ min);
        System.out.println("Minimum in array[" + findNumberInMass(array, min) + "]");
        System.out.println("All minimums in array[" + findNumberInMass(array, min) + "," + findNumberInMassMinus(array, min) + "]");

    }
    // на вход подаем сам массив и то значение, которое нужно найти
    // возвращает порядковый номер элемента (привычный для людей) если данный
    // элемент был найден
    // иначе возвращает -1
    private static int findNumberInMass(int[] incomingMass, int needFind) {
        // проходим по циклу от первого элемента до "последнего"
        for (int i = 0; i < incomingMass.length; i++) {
            // если число найдено - цикл прерывается и возвращается номер позиции "для людей"
            if (needFind == incomingMass[i]) {
                return i ;
            }
        }
        //если в массиве нет нужного элемента - возвращаем -1
        return -1;

    }

    private static int findNumberInMassMinus(int[] incomingMass, int needFind) {
        // проходим по циклу от первого элемента до "последнего"
        for (int i = incomingMass.length-1; i > 0; i--) {
            // если число найдено - цикл прерывается и возвращается номер позиции "для людей"
            if (needFind == incomingMass[i]) {
                return i ;
            }
        }
        //если в массиве нет нужного элемента - возвращаем -1
        return -1;

    }

}

