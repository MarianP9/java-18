package week_3_oop;

class Main {
    public static void main(String[] args) {
        Novel novel1 = new Novel("To Kill a Mockingbird",
                281,
                "Southern Gothic");
        Novel novel2 = new Novel("The Handmaid's Tale",
                311,
                "Dystopian");
        Artbook artbook1 = new Artbook("The Art of Mirror's Edge: Catalyst",
                184,
                9);
        Artbook artbook2 = new Artbook("The Art and Soul of Blade Runner 2049",
                220,
                8);
        Artbook testArtbook = new Artbook("Test artbook",
                -1,
                -1);

        Library library = new Library();

        library.add(novel1);
        library.add(novel2);
        library.add(artbook1);
        library.add(testArtbook);
        library.add(artbook2);

        library.delete(testArtbook);

        library.list();
    }
}
