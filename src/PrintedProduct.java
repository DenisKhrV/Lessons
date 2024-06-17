abstract class PrintedProduct {
    private String name;
    private int pageQuantity;
    private String content;

    public void printContent() {
        System.out.println(content);
    }

    public void print() {
        System.out.println(name + pageQuantity + content);
    }

    public PrintedProduct(String name, int pageQuantity, String content) {
        this.name = name;
        this.pageQuantity = pageQuantity;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        Printable printable = new Book("Voina i mir", 10000, "Texxxxxxxxxxxxxxt", "Lev");
        printable.print();
        printable = new Magazine("National", 20, "Pictuuuuuure", 3);
        printable.print();
    }
}