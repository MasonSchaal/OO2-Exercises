
public class UtensilCheck {

    public static boolean requireFork(MenuItem item) {
        if ((item instanceof Sandwich) || (item instanceof Salad)) {
            return true;
        }
        return false;
    }
    
    public static boolean requireKnife(MenuItem item ) {
        if (item instanceof Sandwich) {
            return true;
        }
        return false;
    }
    
    public static boolean requireSpoon(MenuItem item) {
        if (item instanceof Cappuccino) {
            return true;
        }
        return false;
    }
    
    public static boolean requireStraw(MenuItem item) {
        if ((item instanceof Drink) && !(item instanceof Cappuccino)) {
            return true;
        }
        return false;
    }
}
