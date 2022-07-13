package Bitmap_java;

import java.util.ArrayList;

public class typeMessage {
	
	int mti;
	@Override
	public String toString() {
		return "typeMessage [name=" + name + ", source=" + source + "]";
	}
	String name;
	String source;
	public typeMessage(int mti,String source) {
		super();
		this.mti = mti;
		this.source=source;
		if(mti==1100)
			this.name="Authorization Request";
		else if(mti==1110)
			this.name="Authorization Request Response";
		else if(mti==1120)
			this.name="Authorization Advice";
		else if(mti==1130)
			this.name="Authorization Advice Response";
		else if(mti==1200)
			this.name="0 Financial Transaction Request";
		else if(mti==1210)
			this.name="Financial Transaction Response";
		else if(mti==1304)
			this.name="File Action Request";
		else if(mti==1314)
			this.name="File Action Request Response";
		else if(mti==1420)
			this.name="Reversal Advice";
		else if(mti==1430)
			this.name="Reversal Advice Response";
		else if(mti==1624)
			this.name="Administrative Advice";
		else if(mti==1634)
			this.name="Administrative Advice Response";
		else if(mti==1804)
			this.name="Network Management Request";
		else if(mti==1814)
			this.name="Network Management Request Response";
		
	}
	

  
		
		

	

	
	
	
	
	
	
	
	
	

}
