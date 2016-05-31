package TwoNumbers;

import jdk.nashorn.internal.runtime.Undefined;

import java.util.Scanner;
/*В качестве аргументов командной строки указываются два числа a и b. Вывести в консоль все целые числа от а до b.
 Если не удалось распарсить число - писать нормальный текст на русском. Если пришло не два аргумента - выводить
  справку о том как пользоваться программой.
  */
 public class TwoNumbers  {
    private static int one1;
    private static int two1;

    public static void main(String[] args) {

        System.out.printf("Введите два числа");

        Scanner scan = new Scanner(System.in);
        try {
            String one = scan.next();
             one1 = Integer.parseInt(one);

            String two = scan.next();
             two1 = Integer.parseInt(two);

            if((!(args[0].equals(0)) & !(args[1].equals(0))) & !(toSignCheck(one1)==-1)  ) {
                System.out.printf("Между введенными числами "+ betweenTheNumbers(one1, two1) + " цифр" );
            }else {
                System.out.println("Справка:");
                System.out.println("Пожалуйста введите 2 положительных числа через пробел ");
                System.out.println("и нажмите Enter");
            }
        }
        catch(NumberFormatException e){
            System.err.printf("Вы ввели не число !");
            System.err.println("Пожалуйста повторите попытку!");

        }



    }

    private static int toSignCheck (int a) {
        if(a < 0) {
            return -1;
        }else if(a > 0){
            return 1;
        }
        return 0;
    }



    private static int betweenTheNumbers (int a, int b){
        int c;
        if (a > b){
            c = a - b;
        }else {
            c = b - a;
        }
        return (c);
    }
}
