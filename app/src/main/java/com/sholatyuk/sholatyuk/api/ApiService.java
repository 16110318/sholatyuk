package com.sholatyuk.sholatyuk.api;

import com.sholatyuk.sholatyuk.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("yogyakarta.json")
    Call<ModelJadwal> getJadwal();

}
