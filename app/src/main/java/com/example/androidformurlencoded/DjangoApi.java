package com.example.androidformurlencoded;


import okhttp3.RequestBody;
import retrofit2.Call;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DjangoApi {

    String DJANGO_SITE = "http://13.125.171.174:8000/";

    @POST("/register/")
    @FormUrlEncoded
    @Headers({ "X-CSRFToken:Z7sJzsoWEt7TALa34KZDlMmcLyVzcEtykPi77Uf7eNYtMO41wzVrMhadj0wSc0tt", "Cookie: csrftoken=Z7sJzsoWEt7TALa34KZDlMmcLyVzcEtykPi77Uf7eNYtMO41wzVrMhadj0wSc0tt"})
    Call<RequestBody> addPostVoditel(@Field("username") String username,
                                     @Field("email") String email,
                                     @Field("password1") String password1,
                                     @Field("password2") String password2
    );
}