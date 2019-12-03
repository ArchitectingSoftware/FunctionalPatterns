val x: Int by lazy  {
    print("(computing x) ")
    42
}


    print("x = ")
    println(x)

    val y = x + 7
    println(y)
    