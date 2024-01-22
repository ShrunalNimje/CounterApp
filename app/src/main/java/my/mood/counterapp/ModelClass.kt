package my.mood.counterapp

data class ModelClass(var count : Int)

class Repository(){
    private val _count = ModelClass(0)

    fun getCounter() = _count

    fun increment(){
        getCounter().count++
    }

    fun decrement(){
        getCounter().count--
    }
}