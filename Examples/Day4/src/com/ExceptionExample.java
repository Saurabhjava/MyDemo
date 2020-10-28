package com;
class UserException extends Exception {
	public String toString() {
		return "Invalid Age";
	}
}
public class ExceptionExample {
	public void setAge(int age) throws UserException   {
		if(age < 18)
			throw new UserException();
		System.out.println("Age="+age);
	}
	public static void main(String[] args)  {
		ExceptionExample ex=new ExceptionExample();
		try {
			ex.setAge(32);
		} catch (UserException e) {
			System.out.println(e);
		}
	}

}
