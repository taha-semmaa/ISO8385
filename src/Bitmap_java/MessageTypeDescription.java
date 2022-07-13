package Bitmap_java;

public class MessageTypeDescription {
	String code;
	String condition;
	public MessageTypeDescription(String code) {
		super();
		this.code = code;
		if(code=="M")
			this.condition="Mandatory";
		if(code=="ME")
			this.condition="Mandatory Echo. Shall echo the same data as the original message";
		if(code=="O")
			this.condition="Optional";
		if(code=="OE")
			this.condition="Optional Echo, If populated should be echo of original data";
		if(code=="DCI")
			this.condition="Data element completed by DCI. Always present in message sent to Issuer";
		if(code=="DCI*")
			this.condition="Data element completed by DCI. Optional in message sent to Issuer";
		if(code=="NPI")
			this.condition="Field should not be populated.";
		if(code=="00")
			this.condition="Reserved for ISO use";
		if(code=="01")
			this.condition="Mandatory if fees affect reconciliation.";
		if(code=="02")
			this.condition="Mandatory if track data is not present";
		if(code=="03")
			this.condition="Mandatory. Shall contain the same data as the original Authorization (11xx) or financial (12xx) message";
		if(code=="04")
			this.condition="Mandatory if amount, cardholder billing or amount, cardholder billing fee is present";
		if(code=="05")
			this.condition="Mandatory when the reconciliation and transaction currencies differ and this data element was not provided in the request or advice message.";
		if(code=="06")
			this.condition="Mandatory if track data is captured at the point of service";
		if(code=="07")
			this.condition="Mandatory if the primary account number conforms to International Standard ISO 7812";
		if(code=="09")
			this.condition="Mandatory when the transaction originator institution is not the same as the acquiring institution";
		if(code=="10")
			this.condition="Mandatory when the forwarding institution is not the same as the institution originating the message";
		if(code=="11")
			this.condition="Mandatory when the transaction originator institution is not the same as the institution identified in either the PAN or PAN extended.";
		if(code=="12")
			this.condition="Mandatory if transaction affects reconciliation and this data element was not provided in the request or advice message";
		if(code=="13")
			this.condition="Mandatory if the reconciliation is not in balance. Contains the value calculated by the institution sending the reconciliation advice response.";
		if(code=="14")
			this.condition="Mandatory if the transaction affects reconciliation and checkpoint reconciliation is used and this data element was not provided in the request or advice message";
		if(code=="15")
			this.condition="Mandatory in a Issuer response message if the data element was present in the original request or advice message received by Issuer. If present, it shall contain the same data as the original message unless the Issuer has updated the data";
		if(code=="16")
			this.condition="Mandatory in a response message if the data element was present in the original request or advice message. If present, it shall contain the same data as the original message.";
		if(code=="17")
			this.condition="Mandatory in the advice if the data element was present in the original Authorization request/response/financial request/advice message. If present, it shall contain the same data as the original message.";
		if(code=="18")
			this.condition="Mandatory if the approval code is required to be less than six characters";
		if(code=="19")
			this.condition="Mandatory when the receiving institution is not the same as the final destination of the message";
	    if(code=="20")
	    	this.condition="Mandatory when the institution that processed (approved or denied) an Authorization or financial transaction is not the same institution identified in either the primary account number or the primary account number, extended.";
	    if(code=="21")
	    	this.condition="Mandatory if a partial approval, declined or rejected transaction";
	    if(code=="22")
	    	this.condition="Mandatory if different from date and time, local transaction";
	    if(code=="23")
	    	this.condition="Mandatory if transaction affects reconciliation and checkpoint reconciliation used";
	    if(code=="24")
	    	this.condition="Mandatory if this message is used for cut over or checkpoint reconciliation";
	    if(code=="25")
	    	this.condition="Mandatory if this message is used for checkpoint reconciliation";
	    if(code=="27")
	    	this.condition="Mandatory. Shall echo the first two positions of the processing code in the original message";
	    if(code=="28")
	    	this.condition="Mandatory if function code indicates card administration";
	    if(code=="29")
	    	this.condition="Mandatory if function code is other than card administration.";
	    if(code=="31")
	    	this.condition="Mandatory if function code is other than card administration.";
	    if(code=="32")
	    	this.condition="Mandatory if function code = ‘814’";
	    if(code=="33")
	    	this.condition="Mandatory for chip card transactions where the institution is certified for Full Chip Implementation";
	    if(code=="34")
	    	this.condition="Mandatory for chip card transactions where first 2 bytes of DE3 (processing Code) = 98.";
	    if(code=="35")
	    	this.condition="Mandatory if ABC = 6011 (ATM Request). Also Mandatory for Chip Card Transactions where first 2 bytes of DE3 (processing Code) = 98 or 99.";
	    if(code=="36")
	    	this.condition="Mandatory for MAC transactions where institution is certified for MAC";
	    if(code=="37")
	    	this.condition="Refer to Diners Club data element details for full description for how this field should be populated.";
	    if(code=="38")
	    	this.condition="Mandatory for transactions where Acquirers have attempted ProtectBuy";
	    if(code=="39")
	    	this.condition="Mandatory for Balance Inquiry transactions (where first 2 bytes of DE3 (Processing Code) = 31) and Incremental Authorisation";
	    if(code=="40")
	    	this.condition="Mandatory if present in 1110 message type";
	    if(code=="41")
	    	this.condition="Mandatory if a partial reversal";
	    if(code=="42")
	    	this.condition="Mandatory if Action Code (DE39) < 100 (approved) unless EMV approved off-line";
	    
	}
	@Override
	public String toString() {
		return "MessageTypeDescription [condition=" + condition + "]";
	}
	
	

}
