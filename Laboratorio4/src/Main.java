public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));

        store.addProduct(new Accessory("Headphones", 150.0));
        store.addProduct(new Accessory("Charger", 30.0));

        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        System.out.println("Aplicando descuento del 10%:");
        store.applyDiscount(tenPercentDiscount);
        
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        System.out.println("Aplicando descuento fijo de $50:");
        store.applyDiscount(fiftyDollarsDiscount);

        Discountable variableDiscount = product -> {
            if (product.getPrice() > 100) {
                return product.getPrice() * 0.8;
            } else {
                return product.getPrice();
            }
        };
        System.out.println("Aplicando descuento del 20% para productos mayores a $100:");
        store.applyDiscount(variableDiscount);

        Discountable combinedDiscount = product -> (product.getPrice() * 0.95) - 10.0;
        System.out.println("Aplicando descuento combinado (5% + $10):");
        store.applyDiscount(combinedDiscount);
    }
}


