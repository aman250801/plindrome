package com.aman;

public class Palindrome {
	
	    public static void main(String[] args) {
	        String input = "Madam";
	        checkPalindrome(input);
	    }

	    public static void checkPalindrome(String str) {
	        // Convert the string to lower case to make the check case-insensitive
	        String lowerStr = str.toLowerCase();
	        boolean flag = true;
	        
	        int length = lowerStr.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (lowerStr.charAt(i) != lowerStr.charAt(length - i - 1)) {
	                flag= false;
	                break;
	            }
	        }
	        
	        if (flag) {
	            System.out.println(str + " is a Palindrome");
	        } else {
	            System.out.println(str + " is not a Palindrome");
	        }
	    }
	}

	
	


