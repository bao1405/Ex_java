import java.util.Scanner;
public class bai6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = scanner.nextInt();
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Tổng các chữ số là: " + sum);
    }
}
