package structure.facade;

import java.io.File;

/**
 * Application classes don't depend on a billion classes provided by the complex framework.
 * Also, if you decide to switch frameworks, you only need to rewrite the facade class.
 */
public class Demo {

  public static void main(String[] args) {
    VideoConversionFacade videoConverter = new VideoConversionFacade();
    File mp4Video = videoConverter.convertVideo("youtube_video.ogg", "mp4");
  }
}
