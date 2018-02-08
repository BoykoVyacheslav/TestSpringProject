import model.repositories.UserRepository;
import model.entities.User;

public class Main {
    private static UserRepository ur;
    public static void main(String[] args) {

        User user=ur.findUsersByEmailAndPassword("admin@example.com","qwerty");
        System.out.println(user.toString());
    }
}
