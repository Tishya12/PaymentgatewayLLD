package User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService {
    List<User> userList = new ArrayList<User>();

    public void addUser(UserDO userDO) {
        User user = new User();
        user.setEmail(userDO.getMail());
        user.setUsername(userDO.getName());
        user.setUserId((int) new Random().nextInt());
        userList.add(user);
    }

    public UserDO getUser(int userId) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                return convertUserToUserDO(user);
            }
        }
        return null;
    }

    public UserDO convertUserToUserDO(User user) {
        UserDO userDO = new UserDO();
        userDO.setMail(user.getEmail());
        userDO.setName(user.getUsername());
        return userDO;
    }


}
