package com.example.androidformurlencoded;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;




import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddPostServer();
    }

    public void AddPostServer() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DjangoApi.DJANGO_SITE)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DjangoApi postApi= retrofit.create(DjangoApi.class);

        Call<RequestBody> call = postApi.addPostVoditel("androidstudiochc123", "android@gmail.com", "fnffnfkffk1", "fnffnfkffk1");

        call.enqueue(new Callback<RequestBody>() {
            @Override
            public void onResponse(Call<RequestBody> call, Response<RequestBody> response) {
                Log.d("good", "good");
            }
            @Override
            public void onFailure(Call<RequestBody> call, Throwable t) {
                Log.d("fail", "fail");
            }
        });
    }
}