public class Client {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
            new Book(20, "1234"),
            new Book(22, "1235"),
            new Book(25, "1236"),
            new Fruit(2, 1, "Apple"),
            new Fruit(5, 3, "Banana"),
        };

        int total = calculatePrice(items);
        System.out.println("Total : " + total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;

        for(ItemElement item : items) {
            sum += item.accept(visitor);
        }

        return sum;
    }
}
