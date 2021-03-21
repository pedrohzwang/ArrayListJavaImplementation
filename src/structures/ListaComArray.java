package structures;

public class ListaComArray {

    private Integer[] array;
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
        else if(counter == array.length){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
       return counter == 0;
    }

    public void clear(){
        array = new Integer[initialCapacity];
    }

    public Integer get(int index){
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public Integer set(int index, Integer obj){
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Integer old = array[index];
        array[index] = obj;
        return old;
    }

    public boolean contains(Integer obj){
        for(int i = 0; i <= counter; i++){
            if(array[i] == obj){
                return true;
            }
        }
        return false;
    }

    public Integer remove(int index){
        if(index > array.length || index < 0){
            throw new IndexOutOfBoundsException();
        }

        Integer elementoRemovido = array[index];

        for (int i = index; i < counter; i++){
            array[i] = array[i + 1];
        }
        counter--;
        return elementoRemovido;
    }

    public boolean removeFirst(Integer obj){
        this.remove(this.indexOf(obj));
        return false;
    }

    public int indexOf(Integer obj){
        if(contains(obj)){
            for(int i = 0; i <= counter; i++){
                if(array[i] == obj){
                    return i;
                }
            }
        }
        return -1;
    }

    public Integer[] toArray(){
        int i2 = 0;
        Integer[] array2 = new Integer[counter];
        for (int i = 0; i < array.length; i++){
            if (array[i] != null){
                array2[i2] = array[i];
                i2++;
            }
        }
        return array2;
    }

    public int lastIndexOf(Integer obj){
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
