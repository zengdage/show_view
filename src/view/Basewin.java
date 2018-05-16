package view;


import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import xmlpulldemo.AttributeSet;
import xmlpulldemo.ParamValue;
import xmlpulldemo.Params;
import xmlpulldemo.YDResource;

public class Basewin extends Win{
	
	public Params params;
	
	public List<Basewin> child_list = new ArrayList<Basewin>();

	

	public Basewin(AttributeSet attrs) {
		setAttributeSet(attrs);
		System.out.println("["+Thread.currentThread().getStackTrace()[2].getFileName()+","+Thread.currentThread().getStackTrace()[2].getLineNumber()+"]");
	}
	
	@Override
	public void paint(Graphics g){
		System.out.println("paint");
		paintChildren(g);
	}
	

	
	
	public void addView(Basewin win, Params params){
		child_list.add(win);
		add(win);
	}
	
	public void removeView(Basewin win) {
		child_list.remove(win);
		remove(win);
	}
	
	public void setLayoutParams(Params params){
		this.params = params;
	}
	
	public Params generateLayoutParams(AttributeSet attrs){
		return null;
	}
	
	@Override
	public void setAttributeSet(AttributeSet attrs){	
		HashMap<String,ParamValue> map=YDResource.getInstance().getBasewinMap();	
		int count =attrs.getAttributeCount();

		for(int i=0;i<count ;i++){
			ParamValue key=map.get(attrs.getAttributeName(i));
			//System.out.println(attrs.getAttributeName(i));
			if(key==null){
				System.out.println("error:"+attrs.getAttributeName(i));
				continue;
			}
			switch (key) {
			case app_name:
				App.app_name=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case win_id:
				break;
			case win_name:
				this.win_name=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case win_DataType:
				this.win_DataType=attrs.getAttributeIntValue(i, 0);
				break;
			case win_WinType:
				this.win_WinType=attrs.getAttributeIntValue(i, 0);
				break;
			case win_dwStyle:
				this.win_dwStyle=attrs.getAttributeIntValue(i, 0);
				break;
			case win_dwExStyle:
				this.win_dwExStyle=attrs.getAttributeIntValue(i, 0);
				break;
			case lyr_type:
				this.lyr_type=attrs.getAttributeIntValue(i, 0);
				break;
			case lyr_status:
				this.lyr_status=attrs.getAttributeIntValue(i, 0);
				break;
			case lyr_intersts:
				this.lyr_intersts=attrs.getAttributeIntValue(i, 0);
				break;
			case lyr_clip_left:
				this.lyr_clip_left=attrs.getAttributeIntValue(i, 0);
				break;
			case lyr_clip_right:
				this.lyr_clip_right=attrs.getAttributeIntValue(i, 0);
				break;
				
			case lyr_clip_top:
				this.lyr_clip_top=attrs.getAttributeIntValue(i, 0);
				break;
			case lyr_clip_boottom:
				this.lyr_clip_boottom=attrs.getAttributeIntValue(i, 0);
				break;
			case lyr_zordeer:
				this.lyr_zordeer=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_left:
				this.win_left=attrs.getAttributeIntValue(i, 0);
				break;
			case win_top:
				this.win_top=attrs.getAttributeIntValue(i, 0);
				break;
			case win_right:
				this.win_right=attrs.getAttributeIntValue(i, 0);
				break;
			case win_bottom:
				this.win_bottom=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_client_left:
				this.win_client_left=attrs.getAttributeIntValue(i, 0);
				break;
			case win_client_top:
				this.win_client_top=attrs.getAttributeIntValue(i, 0);
				break;
			case win_client_right:
				this.win_client_right=attrs.getAttributeIntValue(i, 0);
				break;
			case win_client_bottom:
				this.win_client_bottom=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_bkcolor:
				this.win_bkcolor=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case win_font:
				this.win_font=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_invalid_left:
				this.win_invalid_left=attrs.getAttributeIntValue(i, 0);
				break;
			case win_invalid_right:
				this.win_invalid_right=attrs.getAttributeIntValue(i, 0);
				break;
			case win_invalid_top:
				this.win_invalid_top=attrs.getAttributeIntValue(i, 0);
				break;
			case win_invalid_bottom:
				this.win_invalid_bottom=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_clip_left:
				this.win_clip_left=attrs.getAttributeIntValue(i, 0);
				break;
			case win_clip_right:
				this.win_clip_right=attrs.getAttributeIntValue(i, 0);
				break;
			case win_clip_top:
				this.win_clip_top=attrs.getAttributeIntValue(i, 0);
				break;
			case win_clip_boottom:
				this.win_clip_boottom=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_zordeer:
				this.win_zordeer=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_callback:
				this.win_callback=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case notify_proc:
				this.notify_proc=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case win_vscroll_minPos:
				this.win_vscroll_minPos=attrs.getAttributeIntValue(i, 0);
				break;
			case win_vscroll_maxPos:
				this.win_vscroll_maxPos=attrs.getAttributeIntValue(i, 0);
				break;
			case win_vscroll_curPos:
				this.win_vscroll_curPos=attrs.getAttributeIntValue(i, 0);
				break;
			case win_vscroll_pageStep:
				this.win_vscroll_pageStep=attrs.getAttributeIntValue(i, 0);
				break;
			case win_vscroll_barStart:
				this.win_vscroll_barStart=attrs.getAttributeIntValue(i, 0);
				break;
			case win_vscroll_barLen:
				this.win_vscroll_barLen=attrs.getAttributeIntValue(i, 0);
				break;
			case win_vscroll_status:
				this.win_vscroll_status=attrs.getAttributeIntValue(i, 0);
				break;
				
			case win_hscroll_minPos:
				this.win_hscroll_minPos=attrs.getAttributeIntValue(i, 0);
				break;
			case win_hscroll_maxPos:
				this.win_hscroll_maxPos=attrs.getAttributeIntValue(i, 0);
				break;
			case win_hscroll_curPos:
				this.win_hscroll_curPos=attrs.getAttributeIntValue(i, 0);
				break;
			case win_hscroll_pageStep:
				this.win_hscroll_pageStep=attrs.getAttributeIntValue(i, 0);
				break;
			case win_hscroll_barStart:
				this.win_hscroll_barStart=attrs.getAttributeIntValue(i, 0);
				break;
			case win_hscroll_barLen:
				this.win_hscroll_barLen=attrs.getAttributeIntValue(i, 0);
				break;
			case win_hscroll_status:
				this.win_hscroll_status=attrs.getAttributeIntValue(i, 0);
				break;
			
			case focus_bmp:
				this.focus_bmp=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case unfocus_bmp:
				this.unfocus_bmp=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case bmp_x:
				this.bmp_x=attrs.getAttributeIntValue(i, 0);
				break;
			case bmp_y:
				this.bmp_y=attrs.getAttributeIntValue(i, 0);
				break;
			case txt_x:
				this.txt_x=attrs.getAttributeIntValue(i, 0);
				break;
			case txt_y:
				this.txt_y=attrs.getAttributeIntValue(i, 0);
				break;
			case txt_align:
				this.txt_align=attrs.getAttributeIntValue(i, 0);
				break;
			case text:
				this.text=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case focus_txt_color:
				this.focus_txt_color=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case unfocus_txt_color:
				this.unfocus_txt_color=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case font:
				this.font=attrs.getAttributeIntValue(i, 0);
				break;
			case charset:
				this.charset=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case bkcolor:
				this.bkcolor=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			case alpha:
				this.alpha=attrs.getAttributeBooleanValue(i, true);
				break;
				
			case draw_sts:
				this.draw_sts=attrs.getAttributeIntValue(i, 0);
				break;
			case status:
				this.status=attrs.getAttributeIntValue(i, 0);
				break;
			case bmp_num:
				this.bmp_num=attrs.getAttributeIntValue(i, 0);
				break;
			case bmp_array:
				this.bmp_array=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
				
			case pos_num:
				this.pos_num=attrs.getAttributeIntValue(i, 0);
				break;
			case pos_array:
				this.pos_array=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				break;
			default:
				System.out.println("default:"+attrs.getAttributeName(i));
				break;
			}
			
    	}
    }
	
	public int getAllSubchildItem() {
		return 0;
	}
	
	public int getDirectSubchildItem() {
		int size = child_list.size();
		return size;
	}
	
	public void calcute() {

	}
	
	@Override
	public String toString() {
		return ""+this.getClass().getSimpleName();
	}
	

	
	public void printChild(int depth) {
		if(depth == 0)
			System.out.println(this);
		String space = "";
		for(int i=0;i<depth+1;i++) {
			space += "\t";
		}
		for(int i=0; i<child_list.size(); i++) {
			System.out.println(space+child_list.get(i));
			child_list.get(i).showSelf(space);
			child_list.get(i).printChild(depth+1);
		}
	}
	
	public void showSelf(String space) {
		space += "\t";
		System.out.println(space+"win_id="+this.win_id);
		System.out.println(space+"win_name="+this.win_name);
		System.out.println(space+"win_DataType="+this.win_DataType);
		System.out.println(space+"win_WinType="+this.win_WinType);
		System.out.println(space+"win_dwStyle="+this.win_dwStyle);
		System.out.println(space+"win_dwExStyle="+this.win_dwExStyle);
		
		System.out.println(space+"lyr_type="+this.lyr_type);
		System.out.println(space+"lyr_status="+this.lyr_status);
		System.out.println(space+"lyr_intersts="+this.lyr_intersts);
		System.out.println(space+"lyr_clip_left="+this.lyr_clip_left);
		System.out.println(space+"lyr_clip_right="+this.lyr_clip_right);
		System.out.println(space+"lyr_clip_top="+this.lyr_clip_top);
		System.out.println(space+"lyr_clip_boottom="+this.lyr_clip_boottom);
		System.out.println(space+"lyr_zordeer="+this.lyr_zordeer);
		
		System.out.println(space+"win_left="+this.win_left);
		System.out.println(space+"win_top="+this.win_top);
		System.out.println(space+"win_right="+this.win_right);
		System.out.println(space+"win_bottom="+this.win_bottom);
		System.out.println(space+"win_client_left="+this.win_client_left);
		System.out.println(space+"win_client_top="+this.win_client_top);
		System.out.println(space+"win_client_right="+this.win_client_right);
		System.out.println(space+"win_client_bottom="+this.win_client_bottom);
		
		System.out.println(space+"win_bkcolor="+this.win_bkcolor);
		System.out.println(space+"win_font="+this.win_font);
		System.out.println(space+"win_invalid_left="+this.win_invalid_left);
		System.out.println(space+"win_invalid_right="+this.win_invalid_right);
		System.out.println(space+"win_invalid_top="+this.win_invalid_top);
		System.out.println(space+"win_invalid_bottom="+this.win_invalid_bottom);
		System.out.println(space+"win_clip_left="+this.win_clip_left);
		System.out.println(space+"win_clip_right="+this.win_clip_right);
		System.out.println(space+"win_clip_top="+this.win_clip_top);
		System.out.println(space+"win_clip_boottom="+this.win_clip_boottom);
		
		System.out.println(space+"win_zordeer="+this.win_zordeer);
		System.out.println(space+"win_callback="+this.win_callback);
		System.out.println(space+"notify_proc="+this.notify_proc);
		
		System.out.println(space+"win_vscroll_minPos="+this.win_vscroll_minPos);
		System.out.println(space+"win_vscroll_maxPos="+this.win_vscroll_maxPos);
		System.out.println(space+"win_vscroll_curPos="+this.win_vscroll_curPos);
		System.out.println(space+"win_vscroll_pageStep="+this.win_vscroll_pageStep);
		System.out.println(space+"win_vscroll_barStart="+this.win_vscroll_barStart);
		System.out.println(space+"win_vscroll_barLen="+this.win_vscroll_barLen);
		System.out.println(space+"win_vscroll_status="+this.win_vscroll_status);
		
		System.out.println(space+"win_hscroll_minPos="+this.win_hscroll_minPos);
		System.out.println(space+"win_hscroll_maxPos="+this.win_hscroll_maxPos);
		System.out.println(space+"win_hscroll_curPos="+this.win_hscroll_curPos);
		System.out.println(space+"win_hscroll_pageStep="+this.win_hscroll_pageStep);
		System.out.println(space+"win_hscroll_barStart="+this.win_hscroll_barStart);
		System.out.println(space+"win_hscroll_barLen="+this.win_hscroll_barLen);
		System.out.println(space+"win_hscroll_status="+this.win_hscroll_status);
		
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
	public void outCode(Basewin win, Basewin parent, File file,PrintStream ps) {
		for(int i=0;i<win.child_list.size();i++) {
			Basewin wBasewin = win.child_list.get(i);
			wBasewin.outCode(wBasewin, win, file,ps);
		}
	}


}
