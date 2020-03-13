package ua.lviv.lgs.hw1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws IOException {
		
		annotField(Dog.class);

	}
	
	public static void annotField(Class<?> currentClass) throws IOException {
		
		Field[] fields = currentClass.getDeclaredFields();

		File fileText = new File("textAnnot.txt");

		Writer wr = new FileWriter(fileText);
		for (int i = 0; i < fields.length; i++) {
			if(fields[i].getAnnotation(MyAnnotation.class)!=null){
				wr.write(fields[i].getName() +"\n");
			}
		}
		wr.close();
		
	}

}
