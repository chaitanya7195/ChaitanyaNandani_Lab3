package que1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Bracket {
	public static boolean areBracketsBalanced(String expr) {

		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {

			char c = expr.charAt(i);

			
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
				continue;
			}

			if (stack.isEmpty())
				return false;

			char check = stack.pop();
			switch (c) {
			case ')':
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (stack.isEmpty());
	}

}
