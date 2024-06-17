public class Magazine extends PrintedProduct implements Printable{

    private int number;

    public Magazine(String name, int pageQuantity, String content, int number) {
        super(name, pageQuantity, content);
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println(super.getName() + " " + number);
    }
}
