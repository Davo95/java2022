package adPortal.storage.impl;

import adPortal.model.Ad;
import adPortal.model.User;
import adPortal.model.enumModel.Category;
import adPortal.storage.AdStorage;

import java.util.LinkedList;
import java.util.List;

public class AdStorageImpl implements AdStorage {

    private List<Ad> adList = new LinkedList<>();

    @Override
    public void addAD(Ad ad) {
        adList.add(ad);
    }

    @Override
    public void printMyAllAds(User user) {
        for (Ad ad : adList) {
            if (ad.getUser().equals(user)){
                System.out.println(ad);
            }
        }

    }

    @Override
    public void printAllAds() {
        for (Ad ad : adList) {
            System.out.println(ad);
        }
    }

    @Override
    public void printAdByCategory(Category category) {
        for (Ad ad : adList) {
            if (ad.getCategory() == category){
                System.out.println(ad);
            }
        }
    }

    @Override
    public void deleteMyAllAds(User user) {
        for (Ad ad : adList) {
            if (ad.getUser().equals(user)){
                adList.remove(ad);
            }
        }
    }

    @Override
    public void deleteAdByTitle(String title, User currentUser) {
        for (Ad ad : adList) {
            if (ad.getTitle().contains(title) && ad.getUser().equals(currentUser)){
                adList.remove(ad);
            }
        }
    }
}
