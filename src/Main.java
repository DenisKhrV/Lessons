public class Main {
    public static void main(String[] args) {

        Book book = new Book("W&P", 12, "text", "Tolstoy");
        System.out.println(book.getName());

        Book b = new Book("War and Peace", 1000, "War and Peace content", "Lev Tolstoy");
        Magazine m = new Magazine("Java Magazine", 100, "Lots of information about Java", 1);

        b.printContent(); // Будет напечатано: War and Peace content
        m.printContent(); // Будет напечатано: Lots of information about Java

        PrintedProduct book2 = new Book("123", 1, "123", "author");
        System.out.println(book2);
        PrintedProduct printedProduct = new PrintedProduct("asd", 1, "asd") {
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        };
        System.out.println(printedProduct);

        Library library = new Library(4);
        Book book1 = new Book("Name", 200, "Midididsdfsd", "Gogi");
        Magazine magazine = new Magazine("Neame", 20, "content", 2);

        library.addProduct(book1);
        library.addProduct(magazine);

        library.printProducts();
    }
}
