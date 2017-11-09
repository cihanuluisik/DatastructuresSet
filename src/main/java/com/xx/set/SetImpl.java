package com.xx.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SetImpl implements Set {

    private Node[] itemArray= new Node[100];
    private int size;

    private class Node {
        private Object data;
        private Node next;
        Node(Object data) {
            this.data = data;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o) {
        int itemindex = objectIndex(o);
        if (itemArray[itemindex] == null ){
            itemArray[itemindex]    = new Node(o);
        } else {
            Node head = itemArray[itemindex];
            while ( head.next!= null){
                head = head.next;
            }
            head.next = new Node(o);
        }

        size++;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        int itemindex = objectIndex(o);

        Node head= itemArray[itemindex];
        if ( head == null ) return false;
        do {
            if ( head.data.equals(o)) return true;
           head = head.next;
        } while ( head !=null );

        return  false;
    }

    private int objectIndex(Object o) {
        return o == null ? 0 : (o.hashCode() % itemArray.length-1) + 1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
