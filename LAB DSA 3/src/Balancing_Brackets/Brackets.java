package Balancing_Brackets;

import java.util.Stack;

public class Brackets 
{
	
	static boolean checkingBracket(String bracketExpression) 
	{
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i < bracketExpression.length(); i++) 
		{
			
			char character = bracketExpression.charAt(i);
			
			if(character == '(' || character == '[' || character == '{') 
			{
				
				stack.push(character);
				continue;
			}
			
			if(stack.isEmpty()) 
				return false;
			
			char c;
			
			switch(character) 
			{
			
				case '}':
					
					c = stack.pop();
					if(c == '(' || c == '[')
						return false;
					break;
				
				case ')':
					
					c = stack.pop();
					if(c == '{' || c == '[')
						return false;
					break;
					
				case ']':
					c = stack.pop();
					if(c == '(' || c == '{')
						return false;
					break;
			
				}
			
			return (stack.isEmpty());
		}
		return false;
	}
		
		
		public static void main(String[] args) 
		{
			
			String bracketExpression = "([[{}]])";
			
			boolean result;
			
			result = checkingBracket(bracketExpression);
			
			if (result) 
			
				
					System.out.println("The entered string has balanced brackets");
				
				else
					
					System.out.println("The entered string do not contain balanced brackets");
				
		}
	}


