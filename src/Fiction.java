public class Fiction extends Book
{
  String mainCharacter;

  public Fiction(int numPages, String title, String author, boolean isAssigned, String genre, String mainCharacter)
  {
    super(numPages, title, author, isAssigned, genre);
    this.mainCharacter = mainCharacter;
  } // end full constructor with super

  //getters

  public String getMainCharacter()
  {
    return mainCharacter;
  }

  //setters

  public void setMainCharacter(String mainCharacter)
  {
    this.mainCharacter = mainCharacter;
  }

  @Override
  public void CheckOut(int studentId)
  {
    super.CheckOut(studentId);
  }

  @Override
  public String toString()
  {
    return "Fiction: " +  title + " by " + author + " has " + numPages + " pages. " + "It is " + isAssigned +" that it is assigned and its genre is " + genre + ". The main character is " + mainCharacter ;
  }
}
