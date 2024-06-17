class Book extends PrintedProduct implements Printable {
    private String authorName;

    public Book(String name, int pageQuantity, String content, String authorName) {
        super(name, pageQuantity, content);
        this.authorName = authorName;
    }
    // Так как у книги, в отличие от журнала, есть конкретный автор,
    // создадим это поле в унаследованном классе


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void print() {
        System.out.println(super.getName() + " " + authorName);
    }
}