package com.vipuldamor87.koin.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vipuldamor87.koin.data.model.CalendarResponse
import com.vipuldamor87.koin.data.model.MatchCalendar
import com.vipuldamor87.koin.data.repository.MainRepository
import com.vipuldamor87.koin.utils.NetworkHelper
import com.vipuldamor87.koin.utils.Resource
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _users = MutableLiveData<Resource<List<MatchCalendar>>>()
    val users: LiveData<Resource<List<MatchCalendar>>>
        get() = _users


    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _users.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getUsers().let {

                    if (it.isSuccessful) {
                      _users.postValue(Resource.success(it.body()))

                    } else _users.postValue(Resource.error(it.errorBody().toString(), null))
                }
            } else _users.postValue(Resource.error("No internet connection", null))
        }
    }
}
