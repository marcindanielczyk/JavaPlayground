package pakietdoimportustatycznego;

import static java.lang.String.copyValueOf;

public class Door {
    public int height;
    public int width;
    public Window window;
    public char[] chars;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Window getWindow() {
        return window;
    }

    //uzycie klasy w obrebie tego samego pakietu
    public void setWindow(Window window) {
        this.window = window;
    }

    //statyczna metoda wymaga importu statycznego
//    public char policz(){
//        return copyValueOf(chars);
//    }
}
