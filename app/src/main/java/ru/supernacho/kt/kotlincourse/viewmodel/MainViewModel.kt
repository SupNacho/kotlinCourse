package ru.supernacho.kt.kotlincourse.viewmodel

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val counter = ObservableField<Long?>().apply { set(0) }

    fun onClick(){
        counter.set(counter.get()?.inc())
    }
}