package iterator_practice;

public class Iterator {

	public static void main(String[] args) {
		// �����q
		// Iterator�u�J��Ԃ��v�̈�

		int[] list = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < list.length; i++) {
			int j = list[i];
			System.out.println(j);
		}
	}

	public interface Iterater {
		public abstract boolean hasNext();

		public abstract Object next();
	}

}
