import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите второе число:");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите что вы хотите сделать?(+ - * /)");
        String opperation = scanner.nextLine();
        opperations(opperation,num,num2);
    }
    static int summa(int number1, int number2){
        int result = number1 + number2;
        return result;
    }
    static int subtraction(int number1, int number2){
        int result = number1 - number2;
        return result;
    }
    static int division(int number1, int number2){
        int result = number1 / number2;
        return result;
    }
    static int multiplication(int number1, int number2){
        int result = number1 * number2;
        return result;
    }
    static void opperations(String opperation,int number1, int number2 ){
        switch (opperation){
            case ("+") :
                System.out.println(summa(number1,number2));
                break;
            case ("/") :
                if (number2 == 0) {
                    System.out.println("На ноль делить нельзя");
                    break;
                }
                else {
                    System.out.println(division(number1, number2));
                    break;
                }
            case ("*") :
                System.out.println(multiplication(number1,number2));
                break;
            case ("-") :
                System.out.println(subtraction(number1,number2));
                break;
            default:
                System.out.println("Чето не то ввели");
                break;
            }
        }

    }

