
fun main(args: Array<String>) {
/*
    val num = powNumber(2.0)

    println(num)

    val func = {x : Int ,y : Int  ->x + y}
    var test = func(1,2)
    println(test)

    val myFunc: (Int,Int) ->Int = {a,b ->a+b }
    test = myFunc(2,3)
    println(test)

    test = num()
    println(test);

    println("====================")


    for( i in 0 until 5){
        println(test)
    }

    println("=====================")

    var i = arrayListOf<String>("aaa","bbb","ccc")

    i.add(0,"zzz")
    println(i)

 */

    //var card =  Trump(Color.Diamond,"4")
    //println(card.getIsKnown())

    var a = ArrayList<String>()
    a.add("aaa")
    a = ArrayList()

    val func = {a: ArrayList<String> ->a}
    var b = func(a)
    println(b)
    //fun getArray () : ArrayList<String> = a.add("aaa")


}
/*fun getArray(a : ArrayList<String>) : ArrayList<String> {
    return a
    }
*/