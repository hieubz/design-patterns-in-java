package structure.facade.complex_medio_lib;

import java.io.File;

public class AudioMixer {

  public File fix(VideoFile result) {
    System.out.println("AudioMixer: fixing audio...");
    return new File("tmp");
  }
}
