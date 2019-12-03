//Example 3: Using a case class
data class PointClass (val x:Int, val y:Int)



val point = PointClass(1,2)

println("x = ${point.x}, and y = ${point.y}")