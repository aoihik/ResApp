import java.util.HashMap;

public class UserActions {
    HashMap<Integer, User> users;

    public void registerUser(User newUser){
        users.put(newUser.mobile, newUser);
    }
}
