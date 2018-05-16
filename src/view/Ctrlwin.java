package view;

import java.util.HashMap;

import xmlpulldemo.AttributeSet;
import xmlpulldemo.ParamValue;
import xmlpulldemo.YDResource;

public class Ctrlwin extends Basewin{

	
	
	public Ctrlwin(AttributeSet attrs) {
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
			case win_spCaption:
				this.win_spCaption=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				propertyCount++;
				break;
			case win_spClassName:
				this.spClassName=YDResource.getInstance().getString(attrs.getAttributeValue(i));
				propertyCount++;
				break;
			default:
				break;
			}
    	}
		
	}

}
