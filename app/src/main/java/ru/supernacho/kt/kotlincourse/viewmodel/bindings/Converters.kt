package ru.supernacho.kt.kotlincourse.viewmodel.bindings

import androidx.databinding.BindingConversion

@BindingConversion
fun converterLongToString(value: Long?): String{
    return value.toString()
}