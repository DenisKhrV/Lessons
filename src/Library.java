public class Library {

    private PrintedProduct[] products;

    private int count;

    public Library(int size) {
        products = new PrintedProduct[size];
        count = 0;
    }

    public void addProduct(PrintedProduct product) {
        if (count == products.length) {
            return;
        }
        products[count] = product;
        count++;
    }

    public void printProducts() {
        for (int i = 0; i < count; i++) {
            products[i].printContent();
        }
    }
}
