public class Main {
    public static void main(String[] args) throws Exception {
        rumMusic(new Computer());
        rumVideo(new Computer());
    }

    public static void rumVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void rumMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}
