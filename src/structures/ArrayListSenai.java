package structures;

public class ArrayListSenai {

    private Integer[] array;
    private boolean resizable;
    private int initialCapacity;
    private int counter;
    private static int X;

    public ArrayListSenai() {
        this(10);
    }

    public ArrayListSenai(int initialCapacity) {
        this(initialCapacity, true);
    }

    public ArrayListSenai(int initialCapacity, boolean resizable) {
        this.initialCapacity = initialCapacity;
        this.resizable = resizable;
        array = new Integer[initialCapacity];
        X = 1;
        counter = 0;
    }

    public void add(Integer obj) {
        array[counter] = obj;
        counter++;
        
        if(resizable && counter == array.length){
            resizeArrayList();
        }
    }

    public void add(int index, Integer obj) {
        if(index > array.length || index < array.length){
            throw new IndexOutOfBoundsException();
        }
    }

    private void resizeArrayList() {
        Integer[] array2 = new Integer[array.length + X];
        System.arraycopy(array, 0, array2, 0, array.length);
        array = new Integer[array2.length];
        System.arraycopy(array2, 0, array, 0, array2.length);
    }

    public int size(){
        return counter;
    }

    public boolean isFull(){
        if(resizable) {
            return false;
        }
        if(counter == array.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(counter == 0){
            return true;
        }
        return false;
    }

    public void clear(){
        array = new Integer[initialCapacity];
    }

    public Integer get(int index){
        if(index > array.length || index < array.length){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public Integer set(int index, Integer obj){
        if(index > array.length || index < array.length){
            throw new IndexOutOfBoundsException();
        }
        Integer old = array[index];
        array[index] = obj;
        return old;
    }


}
