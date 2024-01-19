package my.mood.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _count = mutableStateOf(0)

    val count : MutableState<Int> = _count

    fun increment() : Int{
        return _count.value++
    }

    fun decrement() : Int{
        return _count.value--
    }
}