package SOLID.SRP.Example2.BetterCode;

public class Main {
  public static void main(String[] args) {
    FileProcessor fp = new FileProcessor("../desktop/navin");
    TextProcessor textProcessor = new TextProcessor(fp);
    textProcessor.convertTextToHTML();
  }
  
}
