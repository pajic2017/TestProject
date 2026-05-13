package com.testproject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeProgramTests {

	@Test
	void identifiesSimplePalindrome() {
		assertTrue(PalindromeProgram.isPalindrome("level"));
	}

	@Test
	void ignoresCaseSpacesAndPunctuation() {
		assertTrue(PalindromeProgram.isPalindrome("A man, a plan, a canal: Panama!"));
	}

	@Test
	void identifiesNonPalindrome() {
		assertFalse(PalindromeProgram.isPalindrome("hello"));
	}

	@Test
	void treatsNullAsNonPalindrome() {
		assertFalse(PalindromeProgram.isPalindrome(null));
	}
}
