import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SuportUser sup = new SuportUser();
        System.out.println("Введите колличество студентов: ");
        int studentCount = sup.scn.nextInt();
        sup.scn.nextLine();
        String[] studentNames = new String[studentCount];
        String[] studentsSurname = new String[studentCount];
        String pattern = "|%2d | %7s| %s|";
        for (int i = 0; i < studentNames.length; i++) {
                System.out.println("Введите имена студентов:");
                studentNames[i] = sup.scn.nextLine();
                System.out.println("Введите фамилию студентов:");
                studentsSurname[i] = sup.scn.nextLine();
            }
        for (int i = 0; i <studentNames.length ; i++) {
            System.out.println(String.format(pattern, i+1, "Name " , studentNames[i]));
            System.out.println(String.format(pattern, i+1, "Surname " , studentsSurname[i]));
        }
        for (String surname: studentsSurname ) {
            System.out.println(surname);
        }
        sup.scn.close();
    }
}
