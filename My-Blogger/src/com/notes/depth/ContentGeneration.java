//$Id$
/**
 * 
 */
package com.notes.depth;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

/**
 * @author bala-16089
 *
 */
public class ContentGeneration 
{
	public ContentGeneration() 
	{
		generateContent();
	}
	private JSONObject json = new JSONObject();
	public void generateContent()
	{
		PageInfo objectInfo = new PageInfo();
		objectInfo.setTitle("What is Object !");
		objectInfo.setImg_path("/images/object.png");
		List<String> objectContent = new ArrayList<>();
		objectContent.add("Object is an Instance of the class. Means once we created a class bike the blueprint of bike is ready. It can never be called a bike. So we need to create a real object with the help of blueprint/template that is class.\n");
		objectContent.add("An object can be created with the help of the keyword new, that creates an object with all of the behaviours of the blueprint.\n");
		objectContent.add("We can access the behaviour and state by creating objects. The Dot Operator(.) used to access the instances variables and methods inside the class.\n");
		objectInfo.setContent(objectContent);
		json.put("object", objectInfo);
		
		PageInfo packageInfo = new PageInfo();
		packageInfo.setTitle("Packages In Java !");
		packageInfo.setImg_path("/images/package.png");
		List<String> packageContent = new ArrayList<>();
		packageContent.add("In general, Packages means bundles or groups of items. the same applies in java too.");
		packageContent.add("Imagine a public library has thousands of books we need to take particularly Head first java Version-2, what will happen if all the books are not properly in order. It is a critical situation, right?\n");
		packageContent.add("Java comes with the facility to bundle the Classes, Interfaces and sub packages.Thus makes the way to categorises all the java files.");
		packageInfo.setContent(packageContent);
		json.put("package", packageInfo);
		
		PageInfo classInfo = new PageInfo();
		classInfo.setTitle("Class In Java !");
		classInfo.setImg_path("/images/class.png");
		List<String> classContent = new ArrayList<>();
		classContent.add("Class is a blueprint and it contains all the necessary features we can use.");
		classContent.add("Class is the keyword to create classes in java. Class is nothing but a user-defined datatype for creating an object.");
		classContent.add("Class has variables and methods together which can be compared to all the real world objects.");
		classInfo.setContent(classContent);
		json.put("class", classInfo);
		
		PageInfo stringImmutableInfo = new PageInfo();
		stringImmutableInfo.setTitle("String Immutable In Java !");
		stringImmutableInfo.setImg_path("/images/stringImmutable.png");
		List<String> stringImmutableContent = new ArrayList<>();
		stringImmutableContent.add("The term mutable variable means we can able to change the value, means at the address where it is stored. where as the immutable we cannot be able to change the value once it is initiated.\n");
		stringImmutableContent.add("String is the class now we are going to see how immutability applies in string class. when we declare a string and assign a value to it.\n"
				+ "Example :- String a = \"Change me if you are muttable\"\n");
		stringImmutableContent.add("String a holds the value try to change it.\n"
				+ "a = \"Changed\" \n"
				+ "Now a is changed to another variable how this is possible when a is immutable.");
		stringImmutableInfo.setContent(stringImmutableContent);
		json.put("string-immutable", stringImmutableInfo);
		
		PageInfo primitivesInfo = new PageInfo();
		primitivesInfo.setTitle("Primitives In Java !");
		primitivesInfo.setImg_path("/images/primitives.png");
		List<String> primitiveContent = new ArrayList<>();
		primitiveContent.add("The primitive types in java are,\n"
				+ "char\n"
				+ "boolean\n"
				+ "byte\n"
				+ "short\n"
				+ "int\n"
				+ "long\n"
				+ "float\n"
				+ "double");
		primitiveContent.add("In a program we always need to store something for a note or a flag or it can be anything that is useful for us to store some value is called variables.\n");
		primitiveContent.add("These are the primitive data types that can be used to specify what type of data we want to store in the memory location.\n");
		primitivesInfo.setContent(primitiveContent);
		json.put("primitives", primitivesInfo);
//		
		PageInfo exceptionInfo = new PageInfo();
		exceptionInfo.setTitle("Exception In Java !");
		exceptionInfo.setImg_path("/images/exception.png");
		List<String> exceptionContent = new ArrayList<>();
		exceptionContent.add("Let's imagine directly a situation to understand the exception handling. As I am assuming we everyone of us know some basic rules in cricket. Assume we are going to design the keeping game plan(i.e Opponent is batting our team is bowling).");
		exceptionContent.add("Fine ! , whenever our bowlers throw the ball the ball needs to hit the stump that is our ultimate goal and when batsman hits the ball, in that case we need to catch the ball or in the worst case scenario at-least we need to stop the ball to touch the boundary, right!\n");
		exceptionContent.add("Thus applies to exception handling, well we can say this is the real time example or just comparing the scenario to understand it better!.\n");
		exceptionInfo.setContent(exceptionContent);
		json.put("exception", exceptionInfo);
//		
		PageInfo instVarMethInfo = new PageInfo();
		instVarMethInfo.setTitle("Instance Variables and Methods In Java !");
		instVarMethInfo.setImg_path("/images/instanceVariablesMethods.png");
		List<String> instVarMethContent = new ArrayList<>();
		instVarMethContent.add("Java is an object oriented language so everything we need write in the class, inside class we can create variables and methods according to our use-case.");
		instVarMethContent.add("The instance variables are created when we call the new keyword to create an object in the heap memory.\n");
		instVarMethContent.add("The instance variables are just variables in the class but outside all the methods.\n");
		instVarMethInfo.setContent(instVarMethContent);
		json.put("instVarMeth", instVarMethInfo);
		
		PageInfo tryCatchInfo = new PageInfo();
		tryCatchInfo.setTitle("Try Catch In Java !");
		tryCatchInfo.setImg_path("/images/tryCatch.png");
		List<String> tryCatchContent = new ArrayList<>();
		tryCatchContent.add("Try:\n"
				+ "we need to create a block and put all the codes which maybe dependent on the run-time values in a block called try block.\n"
				+ "");
		tryCatchContent.add("Catch:\n"
				+ "Once we created the try block, the exception will throw in the unexpected situation held on the try block and then we need to create a catch block to catch the situation and not to terminate the application by mentioning some of the preventive measures in this catch block.\n"
				+ "");
		tryCatchContent.add("Finally\n"
				+ "Finally is the optional block, if we need we can use that. We need to add the statements which we need to execute if the exception is caught after try and catch.\n"
				+ "");
		tryCatchInfo.setContent(tryCatchContent);
		json.put("tryCatch", tryCatchInfo);
		
		PageInfo overloadingInfo = new PageInfo();
		overloadingInfo.setTitle("Overloading In Java !");
		overloadingInfo.setImg_path("/images/");
		List<String> overloadingContent = new ArrayList<>();
		overloadingContent.add("Overloading concept can be compared to DVD player bringing back to the old memories. What does it do?\n"
				+ "");
		overloadingContent.add("The Same DVD player can play different songs when we inserted usb, it plays songs in the usb and when we insert cd, it will play songs on the cd.");
		overloadingContent.add("Like the Same Overloading is the concept of having the same method name or constructor name, handling different types of arguments is called overloading.");
		overloadingInfo.setContent(overloadingContent);
		json.put("overloading", overloadingInfo);
		
		PageInfo toStringInfo = new PageInfo();
		toStringInfo.setTitle("toString() In Java !");
		toStringInfo.setImg_path("/images/tostring.png");
		List<String> toStringContent = new ArrayList<>();
		toStringContent.add("The toString() is the method in the object class, by default it is available for the every object we are creating (i.e every object by default extends the object class).\n"
				+ "");
		toStringContent.add("By Default toString method returns the string representation of the object that is it has a format to specify a object thats it.\n"
				+ "");
		toStringContent.add("The format is packageName.className@hexadecimal representation of hashcode.\n"
				+ "");
		toStringInfo.setContent(toStringContent);
		json.put("tostring", toStringInfo);
		
		PageInfo jvmInfo = new PageInfo();
		jvmInfo.setTitle("JVM In Java !");
		jvmInfo.setImg_path("/images");
		List<String> jvmContent = new ArrayList<>();
		jvmContent.add("JVM is just a virtual machine helps us to execute our application.");
		jvmContent.add("Java is WORA means we can write our application once and run anywhere the machine contains java runtime environment.\n"
				+ "");
		jvmContent.add("JVM handles the execution of the program , where javac (i.e compiler) converts the source code .java file into byte code .class file and the byte code it is given to the JVM and JVM converts into machine level code by the following stages.\n"
				+ "JVM has three components,\n"
				+ "Class Loader Subsystem\n"
				+ "Runtime Data Area \n"
				+ "Execution Engine");
		jvmInfo.setContent(jvmContent);
		json.put("jvm",jvmInfo);
		
		
		PageInfo collectionInfo = new PageInfo();
		collectionInfo.setTitle("Collections In Java !");
		collectionInfo.setImg_path("/images");
		List<String> collectionContent = new ArrayList<>();
		collectionContent.add("Collections are used for creating a group of objects as a single data structure, that is we have arrays to store a list of integers and string all primitives we can able to with arrays.");
		collectionContent.add("Like that we can able to perform all kinds of operations using collections we have dynamic structure like ArrayList,LinkedList,Vector and we have a HashSet , LinkedHashSet this won't allow any duplication values to store. and TreeSet does not allow random order it is always sorted.\n"
				+ "");
		collectionContent.add("java.util.Collections and java.util.Map are the root interface for collections.");
		collectionInfo.setContent(collectionContent);
		json.put("collection", collectionInfo);
	}
	public JSONObject getContent()
	{
		return json;
	}
}
