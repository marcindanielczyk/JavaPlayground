package example;

public class Wazon {
    public String color;
    public int height;
    public int width;
    public boolean eatable;

    public int kwadrat(int height, int width) {
        return height * width;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Wazon wazon = (Wazon) o;
//
//        if (height != wazon.height) return false;
//        if (width != wazon.width) return false;
//        if (eatable != wazon.eatable) return false;
//        if (color != null) return color.equals(wazon.color);
//        return wazon.color == null;//jaki bedzie wynik jesli wazon.color bedzie null 1)
////        zwraca color.equals(wazon.color) jezeli color != null, a jezeli color = null to zwraca wazon.color == null
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wazon wazon = (Wazon) o;

        if (height != wazon.height) return false;
        if (width != wazon.width) return false;
        if (eatable != wazon.eatable) return false;
        return color != null ? color.equals(wazon.color) : wazon.color == null;//jak tutaj działa ? i : i jak sie nazywa 2)
//        jeżeli color nie bedzie null to color.equals(wazon.color), jezeli color=null to wazon.color == nulll.
    }
//    Skrócona wersja zapisu if else
//    Możliwości skrócenia kodu instrukcji warunkowej if
//
//            (i < 0) ? i-- : i++;
//
//    Jeżeli i mniejsze od zera to i-- jezeli false to i++
//
//            if (i < 0) {
//        i--;
//    } else {
//        i++;
//    }


    @Override

    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        // jezeli color != null to color.hashCode() a jak color == null to 0
        result = 31 * result + height;
        result = 31 * result + width;
        result = 31 * result + (eatable ? 1 : 0);
        return result;
    }
}
