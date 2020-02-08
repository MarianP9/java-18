package week_3_oop;

class Book {
    private String name;
    private int pageNr;

    public Book(String name, int pageNr) {
        this.setName(name);
        this.setPageNr(pageNr);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNr() {
        return pageNr;
    }

    public void setPageNr(int pageNr) {
        this.pageNr = pageNr;
    }
}
