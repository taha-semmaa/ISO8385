package Bitmap_java;

public class Attribute {
	String designation;
	String description;
	public Attribute(String designation) {
		super();
		this.designation = designation;
	     if(designation.contains("anp"))
			this.description="Alphabetic, numeric and space (pad) characters";
		else if(designation.contains("ans"))
			this.description="Alphabetic, numeric and special characters";
		else if(designation.contains("ans-b"))
			this.description="Alphabetic, numeric, special characters and binary representation of data in BER-TLV data field types";
		else if(designation.contains("an"))
			this.description="Alphabetic and numeric characters";
		else if(designation.contains("as"))
			this.description="Alphabetic and special characters";
		else if(designation.contains("ns"))
			this.description="Numeric and special characters";
		else if(designation.contains("np"))
			this.description="Numeric and space (pad) characters";
		else if(designation.contains("MM"))
			this.description="Month 01 through 12";
		else if(designation.contains("DD"))
			this.description="Day 01 through 31";
		else if(designation.contains("YY"))
			this.description="Year 00 through 99";
		else if(designation.contains("Hh"))
			this.description="Hour 00 through 23";
		else if(designation.contains("Mm"))
			this.description="Minute 00 through 59";
		else if(designation.contains("Ss"))
			this.description="Second 00 through 59";
		else if(designation.contains("a"))
			this.description="Alphabetic character, A through Z and a through z";
		else if(designation=="n*")
			this.description="Numbers in the N* format are represented by its direct Hex value (i.e., each number is defined using 4 bits)";
		else if(designation.contains("n"))
			this.description="Numeric";
		else if(designation.contains("p"))
			this.description="Pad character space";
		else if(designation.contains("s"))
			this.description="Special characters";
		else if(designation.contains("b"))
			this.description="Binary representation of data";
		else if(designation.contains("z"))
			this.description="Track 2 code set as defined by ISO 7813";
	
		
		
	}
	@Override
	public String toString() {
		return "Attribute [description=" + description + "]";
	}
	
	

}
