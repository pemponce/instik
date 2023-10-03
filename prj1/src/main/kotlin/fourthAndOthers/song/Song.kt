package fourthAndOthers.song

class Song {

    class Song(title_param: String, artist_param: String) {

        val title = title_param.toUpperCase()
        val artist = artist_param

        fun play() {
            println("Now playing: $title \nby: $artist")
        }

        fun stop() {
            println("Stopped song")
        }
    }
}