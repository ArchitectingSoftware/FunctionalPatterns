
interface OutputStream {
    fun write(b: Byte)
    fun write(stream: Array<Byte>)
}

class FileOutputStream(val path: String) : OutputStream {
    override fun write(stream:Array<Byte>) = println("Writing byte array to $path")
    override fun write(b:Byte) = println("Writing byte to $path")
}

class Buffering(val outStream: OutputStream) : OutputStream by outStream {
    override fun write(b: Byte) {
        println("Im in the enhanced class")
        outStream.write(b)
    }

    fun ImTotallyNew() = println("Im totally new")
}

class NewStuff (val outStream: OutputStream) : OutputStream by outStream {
    fun newTest() = println("New test output")
}



    val b: Byte = 'x'.toByte()
    val a: Array<Byte> = arrayOf(1,2,3,4,5)

    val t1 = FileOutputStream("/foo/path")
    t1.write(a)
    t1.write(b)

    val t2 = Buffering(t1)
    t2.write(b)
    t2.write(a)
    t2.ImTotallyNew()

    val t3 = NewStuff(t1)
    t3.newTest()
    t3.write(b)
    t3.write(a)
