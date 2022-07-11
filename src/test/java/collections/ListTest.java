package collections;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public abstract class ListTest { //robimy klase testowa dla wsyztskich list

    private List<Integer> elements; //nie towrzymy tutaj nowej listy

    public ListTest(List<Integer> elements) { //konstruktor wymaga wstawienia listy ktora bedzie testowana przez te klase
        this.elements = elements;
    }

    @Test
    public void addShouldHandleOneElement(){
        elements.add(10);

        assertEquals(1, elements.size());
        assertEquals(10, elements.get(0));
    }

    @Test
    public void addShouldHandleFewElements(){


        elements.add(23);
        elements.add(11);


        assertEquals(2, elements.size());
        assertEquals(23, elements.get(0));
        assertEquals(11, elements.get(1));
    }

    @Test
    public void addShouldHandleManyElements(){

        elements.add(23);
        elements.add(11);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13);
        elements.add(13); //11 elements

        assertEquals(11, elements.size());
        assertEquals(13, elements.get(10));

    }

    @Test
    public void itsImpossibleToAddNullValue(){
        elements.add(null);

        assertEquals(0, elements.size());
    }

    @Test //na wyjatki

    public void shouldThrowExceptionWhenOutOfBound(){
        try{

            elements.get(100);
        } catch (Exception e){
            assertEquals(IndexOutOfBoundsException.class, e.getClass());
            return;
        }
        fail();
    }

    @Test
    public void indexedAddShouldMakeRoomForNewNumber(){
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        elements.add(1, 9);
        assertEquals(5, elements.size());
        assertEquals(9, elements.get(1));
        assertEquals(3, elements.get(2));
        assertEquals(4, elements.get(3));
        assertEquals(8, elements.get(4));

        // 6 , 3, 4, 8    = 4 actualSize -> to jest dla arraylisty, nie linkedlisty
        // 0   1  2  3

        // 6 , 3, 4, 8, 8
        // 6 , 3, 4, 4, 8
        // 6 , 3, 3, 4, 8
        // 6 , 9, 3, 4, 8

    }

    @Test
    public void shouldFindMatchingElement(){
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);

        boolean shouldFind = elements.contains(3);
        boolean shouldNotFind = elements.contains(10);

        assertTrue(shouldFind);
        assertFalse(shouldNotFind);

    }

    @Test
    public void removeShouldEraseFromObject(){
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);
        elements.add(9);
        elements.add(10);
        elements.add(11);

        elements.remove(Integer.valueOf(4));

        assertEquals(6, elements.size());
        assertEquals(6, elements.get(0));
        assertEquals(3, elements.get(1));
        assertEquals(8, elements.get(2));
        assertEquals(9, elements.get(3));
        assertEquals(10, elements.get(4));
        assertEquals(11, elements.get(5));
    }

    @Test
    public void removeShouldEraseFromIndex(){
        elements.add(6);
        elements.add(3);
        elements.add(4);
        elements.add(8);
        elements.add(9);
        elements.add(10);
        elements.add(11);

        elements.remove(1);

        assertEquals(6, elements.size());
        assertEquals(6, elements.get(0));
        assertEquals(4, elements.get(1));
        assertEquals(8, elements.get(2));
        assertEquals(9, elements.get(3));
        assertEquals(10, elements.get(4));
        assertEquals(11, elements.get(5));
    }



}
