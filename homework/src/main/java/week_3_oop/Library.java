package week_3_oop;

class Library {
    private Book[] bookArray;

    public Library() {}

    public Library(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    /**
     * Adds a given book to the library
     *
     * @param book Book to be added to library
     */
    public void add(Book book) {
        if (bookArray == null) {
            bookArray = new Book[1];
            bookArray[0] = book;
        } else {
            int newLength = bookArray.length + 1;
            Book[] newArray = new Book[newLength];
            System.arraycopy(bookArray, 0, newArray, 0, newLength - 1);
            newArray[newLength - 1] = book;
            bookArray = newArray;
        }
    }

    /**
     * Deletes the book from the library that has the same name as the one given to the method, if it exists
     *
     * @param book Book to be deleted from library
     */
    public void delete(Book book) {
        int indexToDelete = -1;
        int currentIndex = 0;
        for (Book bookFromArray : bookArray) {
            if (bookFromArray.getName().equals(book.getName()))
                indexToDelete = currentIndex;
            else
                currentIndex++;
        }
        if (indexToDelete != -1) {
            Book[] newArray = new Book[bookArray.length - 1];
            System.arraycopy(bookArray, 0, newArray, 0, indexToDelete);
            System.arraycopy(bookArray, indexToDelete + 1, newArray, indexToDelete, bookArray.length - indexToDelete - 1);
            bookArray = newArray;
        }
    }

    /**
     * Prints the info of all the books present in the library
     */
    public void list() {
        for (Book book : bookArray) {
            if (book instanceof Novel)
                System.out.println(book.toString());
            else if (book instanceof Artbook)
                System.out.println(book.toString());
        }
    }
}
