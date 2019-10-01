public class Book {
    private int pages;
    private String title;
    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }
    public int getPages() {
        return pages;
    }
    public String getTitle() {
        return title;
    }
    public void setPages(int newPage) {

        pages = newPage;
    }
    public void setTitle(String newTitle) {

        title = newTitle;
    }
    public String toString() {

        return "The book title is " + title + " and it has " + pages + " pages";
    }
    public boolean equals(Book obj) {
        return (pages == obj.getPages() && title.equals(obj.getTitle()));
    }
    public int compareTo(Book obj) {
        if (pages < obj.getPages()) {
            return -1;
        }
        else if(pages > obj.getPages()) {
            return 1;
        }
        else
            return 0;
    }

}
