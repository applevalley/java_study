package ch18;

// declaration for ClassCastException
class ParentClass {}
class ChildClass extends ParentClass {}

public class VariousExceptionClass {

	public static void main(String[] args) {

		// ArrayIndexOutOfBoundsException
		
//		Integer[] arr1 = {1, 2, 3, 4, 5};
//		for(int i = 0; i < 6; i++) {
//			System.out.println(arr1[i]);
//		}

		// ClassCastException
		
		ParentClass cls1 = new ChildClass();
//		// reference variable cls1 refers instance from ChildClass extends ParentClass.
//		// there is no problem parent-class-typed reference variable refer instance from child-class.
//		// therefore, child-class typed variable can refer reference variable cls1(it means instance from child-class) casted to ChildClass
		ChildClass cls2 = (ChildClass)cls1; // it runs
//		
//		System.out.println();
//		
//		ParentClass cls3 = new ParentClass();
//		// but, if reverse it, it doesn't work. 
//		ChildClass cls4 = (ChildClass)cls3; // child-class variable = new parent-class()  <- impossible!

		// NullPointerException
		
//		String myStr1 = null;
//		System.out.println(myStr1); // it will print null
		
		// Exception! NullPointerException will occur when calls method with reference variable saving null
//		int lenForStr = myStr1.length();  
	}

}
