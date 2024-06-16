package User;

public class UserController {

    UserService userService = new UserService();

    public void addUser(UserDO userDO){
        userService.addUser(userDO);
    }

    public UserDO getUser(int userId){
       return userService.getUser(userId);
    }

}
