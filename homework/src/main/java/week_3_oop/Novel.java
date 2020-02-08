package week_3_oop;

class Novel extends Book {
    private String type;

    public Novel(String name, int pageNr, String type) {
        super(name, pageNr);
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel name: " + this.getName() +
                ", pages: " + this.getPageNr() +
                ", type: " + this.getType();
    }
}
