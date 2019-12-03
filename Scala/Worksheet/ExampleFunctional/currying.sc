//multiple arg lists
def addFn(x:Int)(y:Int) = x+y

val t1 = addFn(2)(3)

val add2Fn = addFn(2) _
add2Fn(3)
add2Fn(5)

//single argument list
def addFn2(x:Int,y:Int) = x+y

val t2 = addFn2(2,3)
val addFn2c = addFn2(2,_:Int)
addFn2c(3)
addFn2c(5)

val addFn3c = addFn2(_:Int,5)
addFn3c(10)
