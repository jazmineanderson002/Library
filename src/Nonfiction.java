public class Nonfiction extends Book
{
  String basedOn = "";

  public Nonfiction(int numPages, String title, String author, boolean isAssigned, String genre, String basedOn)
  {
    super(numPages, title, author, isAssigned, genre);
    this.basedOn = basedOn;
  }

  //getters

  public String getBasedOn()
  {
    return basedOn;
  }

  //setters

  public void setBasedOn(String basedOn)
  {
    this.basedOn = basedOn;
  }

  @Override
  public void CheckOut(int studentId)
  {
    super.CheckOut(studentId);
  }

  @Override
  public String toString()
  {
    return "Nonfiction: " +  title + " by " + author + " has " + numPages + " pages. " + "It is " + isAssigned +" that it is assigned and its genre is " + genre + ". It is based on " + basedOn;
  }
}
