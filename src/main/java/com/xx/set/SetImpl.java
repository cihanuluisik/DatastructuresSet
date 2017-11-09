package com.xx.set;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class SetImpl implements Set {

    private Object[] itemArray= new Object[100];
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o) {
        int objectsHashcode = o.hashCode();
        int itemindex = objectsHashcode % itemArray.length;
        itemArray[itemindex] = o;
        size++;
        return true;
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
