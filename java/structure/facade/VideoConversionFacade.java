package structure.facade;

import structure.facade.complex_medio_lib.*;

import java.io.File;

/**
 * We create a facade class to hide the framework's complexity behind a simple interface.
 * It's a trade-off between functionality and simplicity.
 */
public class VideoConversionFacade {
  private final AudioMixer audioMixer = new AudioMixer();

  public File convertVideo(String filepath, String format) {
    System.out.println("VideoConversionFacade: conversion started.");
    VideoFile file = new VideoFile(filepath);
    Codec sourceCodec = CodecFactory.extract(file);
    Codec destinationCodec =
        format.equals("mp4") ? new MPEG4CompressionCodec() : new OggCompressionCodec();
    VideoFile buffer = BitrateReader.read(file, sourceCodec);
    VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
    File result = audioMixer.fix(intermediateResult);
    System.out.println("VideoConversionFacade: conversion completed.");
    return result;
  }
}
