package com.photosnap.reverseimageresult

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ReverseImageResultViewModelFactory : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>) =
        (ReverseImageResultViewModel() as T)
}