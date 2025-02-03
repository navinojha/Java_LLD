package SOLID.SRP.Example2.BetterCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextProcessor {

  private FileProcessor fileProcessor; // Composition

  public TextProcessor(FileProcessor fileProcessor){
    this.fileProcessor = fileProcessor;
  }

  public void convertTextToHTML(){
    try {
      System.out.println("Please specify the full file path to convert to HTML.");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String fullFilePath = reader.readLine();
      if(fullFilePath == null || fullFilePath.isEmpty()){
        return;
      }

      String inputText = this.fileProcessor.readAllText();
      String[] paragraphs = inputText.split("(\\r\\n?|\\n)");

      StringBuilder sb = new StringBuilder();
      for (String paragraph : paragraphs) {
        if(paragraph.trim().isEmpty()){
          continue;
        }
        sb.append("<p>").append(paragraph).append("</p>\n");
        sb.append("</br>\n");

        this.fileProcessor.writeToFile(sb.toString());

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
  
}
