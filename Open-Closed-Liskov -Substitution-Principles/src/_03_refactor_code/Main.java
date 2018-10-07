package _03_refactor_code;

public class Main {
  public static void main(String[] args) {
    GraphicEditor editor = new GraphicEditor();

    editor.drawDrawable(new Circle());
    editor.drawDrawable(new Rectangle());
  }
}
