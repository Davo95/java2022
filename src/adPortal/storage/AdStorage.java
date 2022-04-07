package adPortal.storage;

import adPortal.model.Ad;
import adPortal.model.User;
import adPortal.model.enumModel.Category;

public interface AdStorage {

    void addAD(Ad ad);

    void printMyAllAds(User user);

    void printAllAds();

    void printAdByCategory(Category category);

    void deleteMyAllAds(User user);

    void deleteAdByTitle(String title, User currentUser);

}
