package adPortal.storage;

import adPortal.model.User;

public interface UserStorage {

    void addUser(User user);

    User getByPhone(String phone);
}
