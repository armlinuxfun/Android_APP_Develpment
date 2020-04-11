package com.example.a03_livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> LikedNumber;
    public MyViewModel(){
        LikedNumber = new MutableLiveData<Integer>();
        LikedNumber.setValue(0);
    }

    public MutableLiveData<Integer> getLikedNumber() {
        return LikedNumber;
    }

    public void setLikedNumber(MutableLiveData<Integer> likedNumber) {
        LikedNumber = likedNumber;
    }
    public void AddLikedNumber(int n){
        LikedNumber.setValue(getLikedNumber().getValue() + n);
    }
}
