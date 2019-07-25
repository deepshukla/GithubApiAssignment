package com.lex.githubapiassignment;

import android.arch.lifecycle.ViewModel;

import com.lex.githubapiassignment.models.Comment;
import com.lex.githubapiassignment.models.Gist;

import java.util.ArrayList;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;



@SuppressWarnings("WeakerAccess")
public class MyViewModel extends ViewModel {




    Observable<ArrayList<Gist>> loadFeed() {
        return RetrofitSingleton.getInstance().provideClient()
                .getGistsObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    Observable<ArrayList<Comment>> loadComment(int id) {
        return RetrofitSingleton.getInstance().provideClient()
                .commentList(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}
