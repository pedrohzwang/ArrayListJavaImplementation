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
		} else {
			last.setNext(next);
			last = next;
		}

		this.counter++;
	}

	@Override
	public void add(int index, T obj) {
		if(index < 0 || index > counter){
			throw new IndexOutOfBoundsException();
		}
		NoLista prev = this.getEl(index - 1);
		NoLista old = this.getEl(index);
		NoLista newElement = new NoLista();
		newElement.setInfo(obj);
		newElement.setNext(old);
		if (prev != null){
			prev.setNext(newElement);
		}
//
		this.counter++;
	}

	@Override
	public T remove(int index) {
		NoLista prev = null;
		NoLista actual = this.first;
		if(index < 0 || index > this.counter){
			throw new IndexOutOfBoundsException();
		}
		for(int i = 0; i < index; i++){
			if(actual.equals(this.getEl(index))){
				prev.setNext(actual.getNext());
				break;
			}
			prev = actual;
			actual = actual.getNext();
		}

		this.counter--;
		return (T) actual.getInfo();
	}

	@Override
	public boolean removeFirst(T obj) {
		return false;
	}

	@Override
	public T get(int index) {
		NoLista actual = this.first;
		if(index < 0 || index > this.counter){
			throw new IndexOutOfBoundsException();
		}
		for(int i = 0; i < index; i++){
			if(actual.getNext() != null){
				actual = actual.getNext();
			}
		}
		return (T) actual.getInfo();
	}

	private NoLista<T> getEl(int index) {
		NoLista actual = this.first;
		if(index < 0 || index > this.counter){
			throw new IndexOutOfBoundsException();
		}
		for(int i = 0; i < index; i++){
			if(actual.getNext() != null){
				actual = actual.getNext();
			}
		}
		return actual;
	}

	@Override
	public void clear() {
		this.first = null;
		this.last = null;
		this.counter = 0;
	}

	@Override
	public T set(int index, T obj) {
		if(index < 0 || index > counter){
			throw new IndexOutOfBoundsException();
		}
		NoLista element = (NoLista<T>)this.get(index);
		NoLista old = element;
		element.setInfo(obj);

		return (T) old.getInfo();
	}

	@Override
	public int size() {
		return counter;
	}

	@Override
	public boolean isEmpty() {
		return counter == 0;
	}

	@Override
	public boolean contains(T obj) {
		return false;
	}

	@Override
	public int indexOf(T obj) {
		return 0;
	}

	@Override
	public int lastIndexOf(T obj) {
		return 0;
	}

	@Override
	public T[] toArray() {
		return null;
	}

}
