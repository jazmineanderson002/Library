public class Book implements Library
{
    int numPages = 0;
    String title = "";
    String author = "";
    boolean isAssigned = false;
    String genre = "";

    public Book()
    {
        isAssigned = false;
        numPages = 0;
        title = "none";
        author = "John Doe";
        genre = "blah";
    }

    public Book(int numPages, String title, String author, boolean isAssigned, String genre)
    {
        this.numPages = numPages;
        this.title = title;
        this.author = author;
        this.isAssigned = isAssigned;
        this.genre = genre;
    }

    public int getNumPages()
    {
        return numPages;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean isAssigned()
    {
        return isAssigned;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setNumPages(int numPages)
    {
        this.numPages = numPages;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setAssigned(boolean assigned)
    {
        isAssigned = assigned;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }


    @Override
    public void CheckOut(int studentId)
    {

    }

    @Override
    public String toString()
    {
        return "Book{" +
                "numPages=" + numPages +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAssigned=" + isAssigned +
                ", genre='" + genre + '\'' +
                '}';
    }
}