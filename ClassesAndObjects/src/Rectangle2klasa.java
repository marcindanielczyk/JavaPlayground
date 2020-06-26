//pole i metody klasy (statyczne)

import org.w3c.dom.ls.LSOutput;

public class Rectangle2klasa {
    //Aby wywołać pole lub metodę statyczną musimy odwołać się do niej poprzez nazwę klasy.
    int userAmount = User.personCounter;
    double randomId = User.generateRanodomUserId();

    //Sposób deklarowania pól statycznych
    public class Rectangle {
        public static int biggestArea;
        public static int createdRectangleSum = 0;
    }

    //Sposób deklarowania metod statycznych
    public class Rectangle {
        public static double generateRandomRectangleId(){
            return Math.random() * 9999 + 1;
        }

    }


}
