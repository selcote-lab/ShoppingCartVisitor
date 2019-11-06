public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}

class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruit implements ItemElement {
    private int pricePerkg;
    private int weight;
    private String name;

    public Fruit(int pricePerkg, int weight, String name) {
        this.pricePerkg = pricePerkg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerkg() {
        return pricePerkg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}