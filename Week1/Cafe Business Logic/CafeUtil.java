import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[]prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++){
            sum = sum + prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.printf("%s %s\n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!\n", userName);
        System.out.printf("There are %s people ahead of you.", customers.size());
        customers.add(userName);
    }
}
