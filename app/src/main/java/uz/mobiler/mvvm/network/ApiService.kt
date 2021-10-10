package uz.mobiler.mvvm.network

import retrofit2.Response
import retrofit2.http.GET
import uz.mobiler.mvvm.database.entity.User

interface ApiService {

    @GET("users")
    suspend fun getUsers(): Response<List<User>>
}