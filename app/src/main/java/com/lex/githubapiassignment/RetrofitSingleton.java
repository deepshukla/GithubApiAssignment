package com.lex.githubapiassignment;

import com.lex.githubapiassignment.models.Comment;
import com.lex.githubapiassignment.models.Gist;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;


final class RetrofitSingleton {
    private static volatile RetrofitSingleton instance = null;
    private GistApi client;

    private RetrofitSingleton() {
        Retrofit retrofit =
                new Retrofit.Builder().baseUrl("https://api.github.com/repos/firebase/firebase-ios-sdk/")
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create()).build();
        client = retrofit.create(GistApi.class);
    }

    static RetrofitSingleton getInstance() {
        if (instance == null) {
            synchronized(RetrofitSingleton.class) {
                if (instance == null) {
                    instance = new RetrofitSingleton();
                }
            }
        }
        return instance;
    }

    GistApi provideClient() {
        return client;
    }

    interface GistApi {

        @GET("issues")
        Call<ArrayList<Gist>> getGists();
        @GET("issues")
        Observable<ArrayList<Gist>>getGistsObservable();
        @GET("issues/{id}/comments")
        Observable<ArrayList<Comment>>commentList(@Path("id") int groupId);


    }
}
