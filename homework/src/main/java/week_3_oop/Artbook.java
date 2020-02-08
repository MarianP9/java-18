package week_3_oop;

class Artbook extends Book {
    private int paperQuality;

    public Artbook(String name, int pageNr, int paperQuality) {
        super(name, pageNr);
        this.setPaperQuality(paperQuality);
    }

    public int getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(int paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return "Album name: " + this.getName() +
                ", pages: " + this.getPageNr() +
                ", paper quality: " + this.getPaperQuality();
    }
}
