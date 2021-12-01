
class Trump(color : Color, number : String) {
    private var isKnown = false

    init {
        println("このカードの色は${color}数字は${number}相手に知られているか${isKnown}")
    }

    fun setIsKnown(IsBeenKnow : Boolean) {
         isKnown = IsBeenKnow
     }
    fun getIsKnown() : Boolean = isKnown


}