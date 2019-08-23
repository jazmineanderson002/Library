public interface Library
{
    int numPages = 0;
    String title = "" , author = "", genre = "";
    boolean isAssigned = false;

    public void CheckOut(int studentId);
}
