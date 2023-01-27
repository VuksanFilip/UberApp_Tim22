package com.example.uberapp_tim22.service;

import com.example.uberapp_tim22.DTO.UserDTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface IUserService {

    @Headers(
            {"User-Agent: Mobile-Android",
                    "Content-Type:application/json"}
    )

    @GET(ServiceUtils.user + "/{id}/block")
    Call<UserDTO> blockUser(@Path("id") String id);

}