package com.example.sawepeter.recylerview.activity.network;

import com.example.sawepeter.recylerview.activity.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SAWE PETER on 3/20/2018.
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> ger
}
