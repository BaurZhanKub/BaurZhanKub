import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] workers = {0,0,0};
        System.out.print("Оклад первого сотрудника: ");
        workers[0] = scan.nextInt();
        System.out.print("Оклад второго сотрудника: ");
        workers[1] = scan.nextInt();
        System.out.print("Оклад третего сотрудника: ");
        workers[2] = scan.nextInt();
        Arrays.sort(workers);
        int salary = workers[2]-workers[0];
        System.out.println("Максимальная заработная плата " + workers[2]);
        System.out.println("Минимальная заработная плата " + workers[0]);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat();
        df.setDecimalFormatSymbols(symbols);

        df.setGroupingSize(3);
        System.out.print("Раздница в окладах: ");
        System.out.println(df.format(salary));
    }
}
