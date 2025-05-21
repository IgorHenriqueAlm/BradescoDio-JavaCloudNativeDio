public class Computer implements VideoPlayer, MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("O computer está tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computer está pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computer está parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O computer está reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computer está pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computer está parando o vídeo");
    }

}
