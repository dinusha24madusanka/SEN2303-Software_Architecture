import java.util.Scanner;
public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want extras with your tea (yes/no)?");
        boolean teaextras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        System.out.println("Do you want extras with your coffee (yes/no)?");
        boolean coffeeextras = scanner.nextLine().trim().equalsIgnoreCase("yes");

        Beverages tea = new Tea();
        boolean teaExtras = false;
        tea.setWantsExtras(teaExtras);
        Beverages coffee = new Tea();
        coffee.setWantsExtras(teaExtras);

        System.out.println("Making tea...");
        tea.finalTemplateMethod();

        System.out.println("\nMaking coffee...");
        coffee.finalTemplateMethod();

        scanner.close();


    }
}