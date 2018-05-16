package orange;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import view.Basewin;
import xmlpulldemo.LayoutInflate;


public class Inflate {


	
	public static Basewin getLayout(String str) {
		LayoutInflate inflate=new LayoutInflate();
		return inflate.inflate(str, null);
	}
	

}
