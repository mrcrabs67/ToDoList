package ToDoList;

public class Task {
    long id;
    String title;
    Status[] status = Status.values();

    void Printval(){
        System.out.println((id + " " + title + " " + status));
    }
}
