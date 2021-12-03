package Kotlin

suspend fun ArrayFunction(){
    val a = ArrayList<String>()
    a.addAll(listOf("aaa","bbb","ccc","ddd"))

    val result = a.map { it.contains("aaa") }
    println(result.toString())
}