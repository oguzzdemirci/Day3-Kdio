public class UserManager {
    public void Add(User user){
        System.out.println("Student " +" "+user.getFirstName() + " " + user.getLastName() + " added!");
    }

    public void Update(User user){
        System.out.println("Instructor " +" "+user.getFirstName() + " " + user.getLastName() +" updated!");
    }

}
