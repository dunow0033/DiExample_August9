package com.example.diexample_august9.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.diexample_august9.repository.ShibeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class ShibeViewModel @Inject constructor(
    shibeRepository: ShibeRepository
) : ViewModel() {

    val shibes = shibeRepository.getShibes().asLiveData(Dispatchers.IO)

}
