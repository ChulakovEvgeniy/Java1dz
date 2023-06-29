import java.util.Scanner;
//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        System.out.println(summa(num));
        System.out.println(proizved(num));
    }
    static int summa(int num){
        int summ = 0;
        for (int i = 1; i <= num; i++) {
            summ += i;
        }
        return summ;
    }
    static int proizved(int num){
        int summ = 1;
        for (int i = 1; i <= num; i++) {
            summ *= i;
        }
        return summ;
    }
}
