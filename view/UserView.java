package view;

import model.User;
import service.UserService;

public class UserView {
    
    private final UserService service = new UserService();

    public void start() {
        User user1 = service.createUser("Bob");
        User user2 = service.createUser("Alla");

        service.saveUser(user2);

        service.reportUser(user1);
        service.reportUser(user2);
    } 
}
