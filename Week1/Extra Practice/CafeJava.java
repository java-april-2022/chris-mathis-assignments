public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripPrice = 2.5;
        double lattePrice = 4.0;
        double cappucinoPrice = 4.5;
        double DripPrice = 2.5;
        double LattePrice = 4.0;
        double CappucinoPrice = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        // 1. Cindhuri ordered a coffee.
        System.out.println(customer1 + pendingMessage);

        // 2. Noah ordered a cappucino.
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }

        // 3. Sam ordered 2 lattes, and would like to know the total up front.
        System.out.println(customer2 + displayTotalMessage + lattePrice * 2);
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }

        // 4. Jimmy just realized he was charged for a coffee but had ordered a latte.
        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripPrice));
    }
}

