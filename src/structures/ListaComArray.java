package structures;

public class ListaComArray <T> implements Lista<T>{

    private T[] array;
    private boolean resizable;
    private int initialCapacity;
    private int counter;
    private static int X;

    public ListaComArray() {
        this(10);
    }

    public ListaComArray(int initialCapacity) {
        this(initialCapacity, true);
    }

    public ListaComArray(int initialCapacity, boolean resizable) {
        this.initialCapacity = initialCapacity;
        this.resizable = resizable;
        array = (T[]) new Object[initialCapacity];
        X = 1;
        counter = 0;
    }

    @Override
    public void add(T obj) {
        array[counter] = obj;
        counter++;
        
        if(resizable && counter == array.length){
            resizeArrayList();
        }
    }

    @Override
    public void add(int index, T obj) {
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }

        for(int i = counter; i >= index; i--){
            array[i+1] = array[i];
        }

        array[index] = obj;
        counter++;

        if(resizable && counter == array.length){
            resizeArrayList();
        }
    }

    private void resizeArrayList() {
        T[] array2 = (T[]) new Object[array.length + X];
        System.arraycopy(array, 0, array2, 0, array.length);
        array = (T[]) new Object[array2.length];
        System.arraycopy(array2, 0, array, 0, array2.length);
    }

    @Override
    public int size(){
        return counter;
    }

    public boolean isFull(){
        if(resizable) {
            return false;
        }
        else if(counter == array.length){
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty(){
       return counter == 0;
    }

    @Override
    public void clear(){
        array = (T[]) new Object[initialCapacity];
    }

    @Override
    public T get(int index){
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public T set(int index, T obj){
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        T old = array[index];
        array[index] = obj;
        return old;
    }

    @Override
    public boolean contains(T obj){
        for(int i = 0; i <= counter; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index){
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }

        T elementoRemovido = array[index];

        for (int i = index; i < counter; i++){
            array[i] = array[i + 1];
        }
        counter--;
        return elementoRemovido;
    }

    @Override
    public boolean removeFirst(T obj){
        this.remove(this.indexOf(obj));
        return false;
    }

    @Override
    public int indexOf(T obj){
        if(contains(obj)){
            for(int i = 0; i <= counter; i++){
                if(array[i] == obj){
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public T[] toArray(){
        int i2 = 0;
        T[] array2 = (T[]) new Object[counter];
        for (int i = 0; i < array.length; i++){
            if (array[i] != null){
                array2[i2] = array[i];
                i2++;
            }
        }
        return array2;
    }

    @Override
    public int lastIndexOf(T obj){
        int ultimaPosicao = -1;
        if(this.contains(obj)){
            for(int i = this.indexOf(obj); i <= counter; i++){
                if(array[i] == obj && i > ultimaPosicao){
                    ultimaPosicao = i;
                }
            }
        }
        return ultimaPosicao;
    }
}
