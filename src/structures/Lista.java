package structures;

public interface Lista<T> {

	public void add(T obj);
	
	public void add(int index, T obj);
	
	public T remove(int index);
	
	public boolean removeFirst(T obj);
	
	public T get(int index);
	
	public void clear();
	
	public T set(int index, T obj);
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean contains(T obj);
	
	public int indexOf(T obj);
	
	public int lastIndexOf(T obj);
	
	public T[] toArray();
}
