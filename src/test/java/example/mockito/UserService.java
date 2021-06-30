package example.mockito;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserService {
    public void saveUser(String userId) {
        System.out.println("Saving user [" + userId + "] info...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("User [" + userId + "] info saved");
    }
}
