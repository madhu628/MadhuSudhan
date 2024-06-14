package structuralDP;

//Define the MediaPlayer interface
interface MediaPlayer {
	void play(String audioType, String fileName);
}

//Implement the MediaPlayer interface with AudioPlayer
class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		// Built-in support to play mp3 music files
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		// MediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}
}

//Define the AdvancedMediaPlayer interface
interface AdvancedMediaPlayer {
	void playVlc(String fileName);

	void playMp4(String fileName);
}

//Implement the AdvancedMediaPlayer interface with VlcPlayer
class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// Do nothing
	}
}

//Implement the AdvancedMediaPlayer interface with Mp4Player
class Mp4Player implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		// Do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}

//Implement the MediaPlayer interface with MediaAdapter
class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedPlayer;

	MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedPlayer.playMp4(fileName);
		}
	}
}

//Main class to test the MediaPlayer and MediaAdapter
public class AdapterPattern {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "song.mp3");
		audioPlayer.play("mp4", "video.mp4");
		audioPlayer.play("vlc", "movie.vlc");
		audioPlayer.play("avi", "unknown.avi");
	}
}
