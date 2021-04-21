package datastructures;

import java.util.Arrays;

public class AOArrayList implements List{

    //int range = 5;
    private Object[] array = new Object[5];
    private int size;

    protected Object[] testArray = new Object[5];
    protected int testSize;


//    Do we need constructor?
//    AOArrayList(int size) {
//        array = new Object[size];
//    }

    protected void setSize(int value){
        size = value;
    }

    protected int getLength(){
        return array.length;
    }

    public void add(Object value){
        if(size == array.length) {
            int range = size;
            Object[] extendedArray = new Object[2 * range];
            for (int i = 0; i < array.length; i++) {
                extendedArray[i] = array[i];
            }
            array = extendedArray;
            String stringValue = String.valueOf(value);
            array[size] = stringValue;
            size++;
        } else{
            String stringValue = String.valueOf(value);
            array[size] = stringValue;
            size++;
        }
    }

    public void add(Object value, int index){
        validateIndex(index);
        add(value);
        for(int i=size-1; i>index; i--){
            Object temp;
            temp = array[i-1];
            array[i-1] = array[i];
            array[i] = temp;
        }
    }

    public Object remove(int index){
        validateIndex(index);
        Object removed = array[index];
        for (int i = index; i<size-1; i++){
            array[i]= array[i+1];
        }
        size--;
        return removed;
    }

    public Object get(int index){
        validateIndex(index);
        return array[index];
    }

    private void validateIndex(int index){
        if(index<0 || index >=size){
            throw new IndexOutOfBoundsException();
        }
    }

    public Object set(Object value, int index){
        String stringValue = String.valueOf(value);
        array[index] = stringValue;
        return array[index];
    }

    public void clear(){
        for(int i=0; i<size; i++){
            array[i] = null;
        }
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        for(int i=0; i<size; i++){
            if(array[i]!=null){
                break;
            }
            return false;
        }
        return true;
    }

    public boolean contains(Object value){
        for(int i=0; i<size; i++){
            if(array[i]==value){
                break;
            }
            return true;
        }
        return false;
    }

    public int indexOf(Object value){
        for(int i=0; i<size; i++) {
            String stringValue = String.valueOf(value);
            if (array[i].equals(stringValue)) {
                return i;
            }
        }
        return -1;

    }

    public int lastIndexOf(Object value){
        for(int i=(size-1); i>=0; i--){
            String stringValue = String.valueOf(value);
            if(array[i].equals(stringValue)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String showString() {
        Object completedlist[] = new Object[size];
        for(int i=0; i<size; i++){
            completedlist[i] = array[i];
        }
        String string = Arrays.toString(completedlist);
        return string;
    }


}
