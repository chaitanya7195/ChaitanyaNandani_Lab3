package que2;

public class Driver {

	public static void main(String[] args) {
		Node root = null;
		root = insert(root, 40);
		root = insert(root, 20);
		root = insert(root, 60);
		root = insert(root, 10);
		root = insert(root, 30);
		root = insert(root, 50);
		root = insert(root, 70);

		int sum = 130;
		findPair(root, sum);

	}

}
