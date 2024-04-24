package com.example.kotlinlearning.classes


//As noted above, abstract classes can have constructors, and interfaces cannot, but otherwise they are very similar.
//You can use multiple interfaces in a class, but you can only subclass from one abstract class.

abstract class MediaPlayer{
    abstract fun play()
    fun playerStatus(status:String){
        println("Player status is $status")
    }
}

interface Streamable{
    fun stream(url:String)
}

//Delegation using singleton
object TheDefaultStreamer:Streamable{
    override fun stream(url: String) {
        println("Default Streaming....\tfrom $url")
    }

}

class VideoPlayer(streamable: Streamable=TheDefaultStreamer): MediaPlayer(),Streamable by streamable{
    override fun play() {
        println("Playing Video")
    }
    override fun stream(url: String) {
        println("Streaming video from url: $url")
    }

}

class AudiPlayer(streamable: Streamable=TheDefaultStreamer): MediaPlayer(),Streamable by streamable{
    override fun play() {
        println("Playing Audio")
    }
}
