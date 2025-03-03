package SOLID.SRP.Example2.ProblematicCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HTMLConverter {
  public static void main(String[] args) {
    try {
      System.out.println("Please specify the full file path to convert to HTML.");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String fullFilePath = reader.readLine();
      if(fullFilePath == null || fullFilePath.isEmpty()){
        return;
      }

      String inputText = readAllText(fullFilePath);
      String[] paragraphs = inputText.split("(\\r\\n?|\\n)");

      StringBuilder sb = new StringBuilder();
      for (String paragraph : paragraphs) {
        if(paragraph.trim().isEmpty()){
          continue;
        }
        sb.append("<p>").append(paragraph).append("</p>\n");
        sb.append("</br>\n");

        writeToFile(fullFilePath, sb.toString());

      }
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    System.out.println("Press any key to exit");

    try {
      System.in.read();  // wait for a key press to exit
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static String readAllText(String fullFilePath) throws IOException {
    String content = new String(Files.readAllBytes(Paths.get(fullFilePath)));
    return content;
  }

  public static void writeToFile(String fullFilePath, String text) throws IOException {
    String outputFilePath = Paths.get(fullFilePath).getFileName().toString().replaceFirst("[.][.^]+$", "");
    System.out.println(outputFilePath);
    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))){
      writer.write(text);
    }

  }
}
