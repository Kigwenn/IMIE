public class Paire<T, B> {

	private T first;
	private B second;
	
	public Paire(T first, B second) {
		super();
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public B getSecond() {
		return second;
	}

	public void setSecond(B second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Paire [first=" + first + ", second=" + second + "]";
	}
	
}