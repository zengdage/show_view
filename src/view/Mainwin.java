package view;

import java.awt.Graphics;
import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;

import xmlpulldemo.AttributeSet;
import xmlpulldemo.ParamValue;
import xmlpulldemo.YDResource;

public class Mainwin extends Basewin{

	public Mainwin(AttributeSet attrs) {
		super(attrs);
	}
	
	@Override
	public void setAttributeSet(AttributeSet attrs){	
		super.setAttributeSet(attrs);
		HashMap<String,ParamValue> map=YDResource.getInstance().getBasewinMap();	
		int count =attrs.getAttributeCount();
		int propertyCount = 0;
		for(int i=0;i<count ;i++){
			ParamValue key=map.get(attrs.getAttributeName(i));
			if(key==null){
				continue;
			}
			switch (key) {
			
			default:
				break;
			}
    	}
		
    }
	
	
	@Override
	public void showSelf(String space) {
		super.showSelf(space);
	}
	
	@Override
	public void printChild(int depth) {
		super.printChild(depth);
	}
	
	@Override
	public void outCode(Basewin win, Basewin parent, File file,PrintStream ps) {
		super.outCode(win, parent,file,ps);
		outMainWinCode(win, parent,ps);
		outMainWinCallBackCode(win, parent,ps);
	}
	
	public void outMainWinCode(Basewin win, Basewin parent,PrintStream ps) {

	}
	
	public void outMainWinCallBackCode(Basewin win, Basewin parent,PrintStream ps) {

		
	}
}
