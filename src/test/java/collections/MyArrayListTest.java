package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest extends ListTest{
    public MyArrayListTest() { //konstruktory z parametrem sie nie dziedzicza, wiec musimy stworzyc wlasny konstruktor
        super(new MyArrayList<>());
    }


}