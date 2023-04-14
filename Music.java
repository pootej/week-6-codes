// Different types of songs, such as PopSong and JazzSong,
// may be subclasses of Song and override the play()
// method to play the song audio in a different way based on their specific
// genre and style.
// For example, a PopSong may play the audio with a catchy beat and chorus,
// while a JazzSong may play the audio with a smooth melody and improvisation.

class GanaBajana {
  void play() {
    System.out.println("playing nornaml song");
  }
}

class Song extends GanaBajana {
  void plays() {
    super.play();
    System.out.println("ok dude im playing jazz song");
  }
}

class Music {
  public static void main(String args[]) {
    Song s = new Song();
    s.plays();
  }
}