package uz.mobiler.mvvm.repositories

import uz.mobiler.mvvm.database.AppDatabase
import uz.mobiler.mvvm.database.entity.User
import uz.mobiler.mvvm.network.ApiService

class UserRepository(
    private val apiService: ApiService,
    private val appDatabase: AppDatabase
) {

    suspend fun getRemoteUsers() = apiService.getUsers()

    suspend fun getLocalUsers() = appDatabase.userDao().getAllUsers()

    suspend fun addUsers(list: List<User>) = appDatabase.userDao().addUsers(list)
}