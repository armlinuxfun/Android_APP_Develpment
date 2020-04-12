package com.example.a04_databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public MutableLiveData<Integer> num;
    public MyViewModel(){
        num = new MutableLiveData<Integer>();
        num.setValue(0);
    }

    public MutableLiveData<Integer> getNum() {
        return num;
    }

    public void add_num() {
        num.setValue(num.getValue() + 1);
    }
}
