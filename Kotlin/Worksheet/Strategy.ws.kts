typealias Strategy = (Int, Int) -> Int

class Context(val strategyImpl: Strategy ){
    fun use(a: Int, b:Int) = {
        strategyImpl(a,b)
    }
}


val addStrategy = fun(a:Int,b:Int) = a + b
val mulStrategy = fun(a:Int,b:Int) = a * b

val a = Context(addStrategy).use(1,2)
val m = Context(mulStrategy).use(1,2)

println("a = ${a()}   m = ${m()}")