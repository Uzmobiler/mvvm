package uz.mobiler.mvvm.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.mobiler.mvvm.repositories.UserRepository
import uz.mobiler.mvvm.utils.NetworkHelper
import java.lang.IllegalArgumentException

class ViewModelFactory(
    private val userRepository: UserRepository,
    val networkHelper: NetworkHelper
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UserViewModel::class.java)) {
            return UserViewModel(userRepository, networkHelper) as T
        }
        throw IllegalArgumentException("Error")
    }
}