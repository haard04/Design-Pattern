// Component interface
 interface Shop {
    public String getDescription();
    public double getCost();
}

// Concrete Component
 class basicShop implements Shop {
    public String getDescription() {
        return "Shop";
    }

    public double getCost() {
        return 20000.0;
    }
}

// Decorator
 abstract class shopDecorator implements Shop {
    protected Shop shop;

    public shopDecorator(Shop shop) {
        this.shop = shop;
    }

    public String getDescription() {
        return shop.getDescription();
    }

    public double getCost() {
        return shop.getCost();
    }
}

// Concrete Decorator
 class cashCounter extends shopDecorator {
    public cashCounter(Shop shop) {
        super(shop);
    }

    public String getDescription() {
        return shop.getDescription() + ", cashCounter";
    }

    public double getCost() {
        return shop.getCost() + 1000.0;
    }
}

// Concrete Decorator
class holdings extends shopDecorator {
    public holdings(Shop shop) {
        super(shop);
    }

    public String getDescription() {
        return shop.getDescription() + ", holdings";
    }

    public double getCost() {
        return shop.getCost() + 1500.0;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        // Create a basic shop
        Shop shop = new basicShop();

        // Decorate it with leather seats
        shop = new cashCounter(shop);

        // Decorate it with a navigation system
        shop = new holdings(shop);

        // Print the shop's description and cost
        System.out.println(shop.getDescription());
        System.out.println(shop.getCost());
    }
}
