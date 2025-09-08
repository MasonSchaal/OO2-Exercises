
public class Trio implements MenuItem{

    private MenuItem sandwich;
    private MenuItem salad;
    private MenuItem drink;
    
    public Trio(MenuItem sandwich, MenuItem salad, MenuItem drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    
    @Override
    public String getName() {
        String str = String.format("%s/%s/%s Trio", sandwich.getName(), salad.getName(), drink.getName());
        return str;
    }

    @Override
    public double getPrice() {
        double lowestPrice = Math.min(Math.min(sandwich.getPrice(), salad.getPrice()), drink.getPrice());
        double price = (sandwich.getPrice() + salad.getPrice() + drink.getPrice()) - lowestPrice;
        return price;
    }

}
