interface Sound{
    fun play() : Unit
}

class Music : Sound{
    override fun play() : Unit{
        println("Im playing music")
    }
}

object SoundSource{
    val getSound: Sound?
        get()   {
            val available = true
            return if (available)  Music() else null
        }
}

SoundSource.getSound?.play()