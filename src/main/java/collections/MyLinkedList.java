package collections;

import java.util.*;

public class MyLinkedList<E> implements List<E> { //interfejs (implements),  <> oznacza ze klasa jest parametryzowana, interfejsy maja tylko abstrakcyjne metody
    //ktore TRZEBA NADPISAC

    private MyNode<E> firstNode = null; //MyNode jest to klasa pomocnicza - wagonik jest ona na dole, nazywa sie pierwszy node lub head
    private int actualSize;


    @Override
    public boolean add(E e) {
        MyNode<E> newNode = new MyNode<>(e); //tworze wagonik, ktory bedzie przechowywac kolejny element i uzuelnia go elementem e - bo konstruktor
        actualSize++;
        if (firstNode == null){
            firstNode = newNode;
            return true; //skonczylismy prace, koniec metody - dla pierwszego wezla
        }

        //aktualny node = first node
        MyNode<E> actualNode = firstNode;
        while (actualNode.nextNode != null){ //czy masz nastepnego? jak tak to...
            actualNode = actualNode.nextNode; //ustawmy go na aktualny
        }
        //tu actualNode to ostatni node
        actualNode.nextNode = newNode;

        return true;
    }

    @Override
    public void add(int index, E element) {
        actualSize++;
        MyNode<E> newNode = new MyNode<>(element);// nowy node

        MyNode<E> actual = firstNode; //reprezentuje node po nowym nodzie
        MyNode<E> beforeActual = null; //reprezentuje node przed nowym nodem
        for(int i = 1; i <= index; i++){//znajduje odpowiednie nodey
            beforeActual = actual;
            actual = actual.nextNode;

        }
        newNode.nextNode = actual; //nowy node wskazuje tego kto byl na jego miejscu jako jego kolejny

        if(beforeActual == null){ //dalej nie ma poprzedniego a wiec = zmienil sie pierwszy node!
            firstNode = newNode;
        }else{
            beforeActual.nextNode = newNode; //jesli byl poprzedni to ma wskazywac na ten nowy

        }

    }

    @Override
    public E get(int index) {
        /*switch(index){
            case 0:
                return firstNode.data;
            case 1:
                return firstNode.nextNode.data;
        }*/
        if(index < 0 || index >= actualSize){
            throw new IndexOutOfBoundsException();
        }
        MyNode<E> actualNode = firstNode;

        for(int i = 1; i <= index; i++){
            actualNode = actualNode.nextNode;
        }
        return actualNode.data;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return actualSize;

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    @Override
    public void clear() {

    }





    @Override
    public E remove(int index) {
        return null;
    }

    class MyNode<E> { //klasa wewnetrzna

        private E data;
        private MyNode<E> nextNode = null;
        //private MyNode<E> prev; robimy bez prev, ale w normalnej linkedliscie jest prev

        public MyNode(E data) {
            this.data = data;
        }


    }











    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }



    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }



    @Override
    public E set(int index, E element) {
        return null;
    }



    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}


