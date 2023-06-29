import java.util.Scanner;
//2) Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        System.out.println(prime_numbers(num));
    }
    static String prime_numbers(int num){
        String numbers = "";
        int count;
        for (int i = 1; i <=num ; i++) {
            count = 0;
            for (int j = 1; j <=i ; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2){
                numbers += i+ " ";
            }
        }
        return numbers;
    }
}
