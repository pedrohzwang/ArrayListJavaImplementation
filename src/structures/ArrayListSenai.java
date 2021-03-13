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
        
    }

    private void resizeArrayList() {
        array = new Integer[array.length + 1];
        
    }

}
