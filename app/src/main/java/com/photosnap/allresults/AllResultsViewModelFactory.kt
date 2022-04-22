package com.photosnap.allresults

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class AllResultsViewModelFactory: ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>) =
        (AllResultsViewModel() as T)
}