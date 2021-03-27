package structures;

public class ListaComEncadeamento<T> implements Lista<T> {

	private NoLista<T> first;
	private NoLista<T> last;
	private int counter;

	public ListaComEncadeamento() {
		first = null;
		last = null;
		this.counter = 0;
	}

	@Override
	public void add(T obj) {
		NoLista<T> next = new NoLista<T>();
		next.setInfo(obj);
		next.setNext(null);
		if(first == null) {
			first = next;
			last = first;
		}
		
		last.setNext(next);	
		this.counter++;
	}

	@Override
	public void add(int index, T obj) {

	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeFirst(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public T set(int index, T obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(T obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(T obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
