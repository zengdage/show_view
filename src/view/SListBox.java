package view;


import java.io.File;
import java.io.PrintStream;
import java.util.HashMap;

import xmlpulldemo.AttributeSet;
import xmlpulldemo.ParamValue;
import xmlpulldemo.YDResource;

public class SListBox extends Basewin{

	public SListBox(AttributeSet attrs) {
		super(attrs);
	}
	
	@Override
	public void showSelf(String space) {
		super.showSelf(space);
		space += "\t";
		System.out.println(space+"focus_bmp="+this.focus_bmp);
		System.out.println(space+"unfocus_bmp="+this.unfocus_bmp);
		System.out.println(space+"bmp_x="+this.bmp_x);
		System.out.println(space+"bmp_y="+this.bmp_y);
		System.out.println(space+"txt_x="+this.txt_x);
		System.out.println(space+"txt_y="+this.txt_y);
		System.out.println(space+"txt_align="+this.txt_align);
		System.out.println(space+"text="+this.text);
		System.out.println(space+"focus_txt_color="+this.focus_txt_color);
		System.out.println(space+"unfocus_txt_color="+this.unfocus_txt_color);
		
		System.out.println(space+"font="+this.font);
		System.out.println(space+"charset="+this.charset);
		System.out.println(space+"bkcolor="+this.bkcolor);
		System.out.println(space+"alpha="+this.alpha);
		System.out.println(space+"draw_sts="+this.draw_sts);
		System.out.println(space+"status="+this.status);
		
	}
	
	@Override
	public void printChild(int depth) {
		super.printChild(depth);
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
	public void outCode(Basewin win, Basewin parent,File file,PrintStream ps) {
		super.outCode(win, parent,file,ps);
		outCtrCode(win, parent,ps);
	}
	
	public void outCtrCode(Basewin win, Basewin parent,PrintStream ps) {
		StringBuffer code = new StringBuffer();

		
	}

}

