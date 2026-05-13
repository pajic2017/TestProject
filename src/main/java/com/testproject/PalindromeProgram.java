package com.testproject;

/**
 * A small command-line program for checking whether text is a palindrome.
 */
public class PalindromeProgram {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java com.testproject.PalindromeProgram <text>");
			return;
		}

		String input = String.join(" ", args);
		String result = isPalindrome(input) ? "is a palindrome" : "is not a palindrome";
		System.out.printf("\"%s\" %s.%n", input, result);
	}

	/**
	 * Returns true when the supplied text reads the same forward and backward.
	 * The comparison ignores case, spaces, punctuation, and symbols.
	 */
	public static boolean isPalindrome(String text) {
		if (text == null) {
			return false;
		}

		int left = 0;
		int right = text.length() - 1;

		while (left < right) {
			char leftChar = text.charAt(left);
			char rightChar = text.charAt(right);

			if (!Character.isLetterOrDigit(leftChar)) {
				left++;
				continue;
			}

			if (!Character.isLetterOrDigit(rightChar)) {
				right--;
				continue;
			}

			if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}
}
