package collections;

public class MyContainer<E> { //wpisany typ danych w array liscie bedzie aie wpisywac pod E
    //tzw. generyczność

    private E data;

    public E getData() {
        return data;
    }

    public void setData(E e) {
        data = e;
    }
}
