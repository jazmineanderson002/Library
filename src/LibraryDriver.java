public class LibraryDriver
{
    public static void main(String[] args)
    {
      Book dictionary = new Book(1500, "Webster's Dictionary", "Webster", false, "Fiction" );
      Fiction harryPotter = new Fiction (336, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling", true, "Fiction", "Harry Potter");
      Nonfiction calc = new Nonfiction(1000, "Calculus With Limits 10e", "Dr. Ron Larson", false, "Nonfiction", "Calculus");

      dictionary.setAssigned(true);
      dictionary.CheckOut(91052885);
      harryPotter.setGenre("Adventure fantasy");
      harryPotter.CheckOut(91070951);
      calc.setAssigned(false);
      calc.CheckOut(91070949);

      Library[] books = {dictionary, harryPotter, calc};
      for(Library e : books)
      {
        System.out.println(e);
        System.out.println();
      }
//      System.out.println(harryPotter);
//      System.out.println();
//      System.out.println(dictionary);
//      System.out.println();

    }

}
