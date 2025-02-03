package SOLID.SRP.Example2.BetterCode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {

  // Now this class has only one responsibility to read from the filePath and write to 
  // the given file and converting logic is moved to TextProcessor class.

    private String filePath;

    public FileProcessor(String filePath){
      this.filePath = filePath;
    }

    public String readAllText() throws IOException {
    String content = new String(Files.readAllBytes(Paths.get(this.filePath)));
    return content;
  }

  public void writeToFile(String text) throws IOException {
    String outputFilePath = Paths.get(this.filePath).getFileName().toString().replaceFirst("[.][.^]+$", "");
    System.out.println(outputFilePath);
    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))){
      writer.write(text);
    }

  }
  
}
