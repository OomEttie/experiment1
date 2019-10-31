package com.example.experiment1.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mTextDetail;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

        mTextDetail = new MutableLiveData<>();
        mTextDetail.setValue("Extra Detail to test updated 1.0");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getTextDetail() {
        return mTextDetail;
    }

}