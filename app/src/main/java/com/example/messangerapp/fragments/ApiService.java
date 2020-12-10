package com.example.messangerapp.fragments;

import com.example.messangerapp.notifications.MyResponse;
import com.example.messangerapp.notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAiXiyOuY:APA91bEW-Qrf9oTHnWxTY23u7zKoEHV6K-7bdv7dUFH15nslOCUT7i_LoYBR65p69h8aZRiinwYLdjofC3kWLYjL95r8RTjWLH2-PUmJknkY3_t-xKwNiWFP7LCRrc2VnLG0XNdhxZyu"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
