

public class Music {

    void playMusic(String musicLocation) {

      try {
          File musicPath = new File(musicLocation);

          if (musicPath.exists()) {
                  AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                  Clip clip = AudioSystem.getClip();
                  clip.start();

                  

          } else {
            System.out.println("Can't find file");

          }

      } catch(exeption ex){
          ex.printStackTrace();
      }
    }
















}
