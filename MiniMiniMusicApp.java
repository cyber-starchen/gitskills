import javax.sound.midi.*;
public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini =new MiniMiniMusicApp;
        mini.play();
    }
    public void play(){
        try {
            Sequencer player =MidiSystem.getSequencer();
            player.open();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
