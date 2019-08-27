public class Book implements Library
{
    int numPages ;
    String title ;
    String author ;
    boolean isAssigned ;
    String genre ;

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
        if(isAssigned)
        {
            System.out.println(title + " is already assigned");
            System.out.println();
        }
        else
        {
            System.out.println("You have checked out " + title);
            System.out.println();
        }
    }

    @Override
    public String toString()
    {
        return "Book: " + title + " by " + author + " has " + numPages + " pages. " + "It is " + isAssigned +" that it is assigned and its genre is " + genre;
    }
}
