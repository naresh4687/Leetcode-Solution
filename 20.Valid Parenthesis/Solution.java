import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(isValid(str)) {
			System.out.println("Valid parenthesis");
		} else {
			System.out.println("InValid parenthesis");
		}
	}
	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		int len=s.length();
		for(int i=0; i<len; i++) {
			char ch=s.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(') {
				stack.push(ch);
			} else {
				if(stack.isEmpty()) {
					return false;
				} else {
					char popchar=stack.pop();
					if(ch==']' && popchar!='[' ||
					        ch=='}' && popchar!='{' ||
					        ch==')' && popchar!='(' ) {
						return false;
					}
				}
			}
		}
		return stack.isEmpty();

			

		}
}