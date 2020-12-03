package com.example.timeattendance2.api;

import com.example.timeattendance2.model.StampResponse;
import com.example.timeattendance2.model.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> userLogin(
            @Field("appkey") String appkey,
            @Field("username") String username,
            @Field("password") String password,
            @Field("request_id") float request_id
    );

    @FormUrlEncoded
    @POST("stamp")
    Call<StampResponse> stampUser(
            @Field("token") String token,
            @Field("Latitude") float Latitude,
            @Field("Longitude") float Longitude,
            @Field("Image") byte[] Image,
            @Field("staffid") int staffid,
            @Field("siteIndex") int siteIndex,
            @Field("timeStamp") long timeStamp,
            @Field("isCheckIn") boolean isCheckIn,
            @Field("request_id") float request_id
    );

}