package com.ydkim2110.drinkshopapp.Retrofit;

import com.ydkim2110.drinkshopapp.Model.Banner;
import com.ydkim2110.drinkshopapp.Model.Category;
import com.ydkim2110.drinkshopapp.Model.CheckUserResponse;
import com.ydkim2110.drinkshopapp.Model.User;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Kim Yongdae on 2018-11-30
 * email : ydkim2110@gmail.com
 */
public interface IDrinkShopAPI {

    @FormUrlEncoded


    @POST("checkuser.php")
    Call<CheckUserResponse> checkUserExists(@Field("phone") String phone);

    @FormUrlEncoded
    @POST("register.php")
    Call<User> registerNewUser(@Field("phone") String phone,
                               @Field("name") String name,
                               @Field("birthdate") String birthdate,
                               @Field("address") String address);

    @FormUrlEncoded
    @POST("getuser.php")
    Call<User> getUserInformation(@Field("phone") String phone);

    @GET("getbanner.php")
    Observable<List<Banner>> getBanners();

    @GET("getmenu.php")
    Observable<List<Category>> getMune();

}