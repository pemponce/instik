package fourthAndOthers.song

fun main(args: Array<String>) {

    val songName = readln()
    val artist = readln()

    val song = Song.Song(songName, artist)

    song.play()

    song.stop()
}