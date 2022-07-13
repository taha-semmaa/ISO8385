package Bitmap_java;
//format
public class AttributesLength {
	String designation;
	String description;
	
	public AttributesLength(String designation) {
		super();
		this.designation = designation;
		if(designation.equals("3"))
		{
			this.description="Fixed length data element, n type data elements are assumed to be right-justified with leading zeros. All\r\n others are left-justified with trailing spaces.";
		}
		else if(designation.equals("LLVAR"))
		{
			this.description="Length of variable data that follows, 00 through 99";
		}
		else if(designation.equals("LLLVAR"))
	    {
		   this.description="Length of variable data that follows, 000 through 999";
	    }
		else if(designation.equals("LLVAR, 17"))
	   {
		  this.description="Example. Variable length up to a maximum of 17. All variable length data elements shall contain two or three positions at the beginning of the data element to identify the number of positions following to the end of the data element.";
	   }
	  
}

	@Override
	public String toString() {
		return "AttributesLength [description=" + description + "]";
	}
	

}
