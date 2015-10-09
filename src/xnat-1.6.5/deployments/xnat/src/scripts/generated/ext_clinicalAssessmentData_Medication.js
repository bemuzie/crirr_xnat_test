/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:51 UTC 2015
 *
 */

/**
 * @author XDAT
 *
 */

function ext_clinicalAssessmentData_Medication(){
this.xsiType="ext:clinicalAssessmentData_Medication";

	this.getSchemaElementName=function(){
		return "clinicalAssessmentData_Medication";
	}

	this.getFullSchemaElementName=function(){
		return "ext:clinicalAssessmentData_Medication";
	}

	this.Name=null;


	function getName() {
		return this.Name;
	}
	this.getName=getName;


	function setName(v){
		this.Name=v;
	}
	this.setName=setName;

	this.Type=null;


	function getType() {
		return this.Type;
	}
	this.getType=getType;


	function setType(v){
		this.Type=v;
	}
	this.setType=setType;

	this.Dose=null;


	function getDose() {
		return this.Dose;
	}
	this.getDose=getDose;


	function setDose(v){
		this.Dose=v;
	}
	this.setDose=setDose;

	this.History=null;


	function getHistory() {
		return this.History;
	}
	this.getHistory=getHistory;


	function setHistory(v){
		this.History=v;
	}
	this.setHistory=setHistory;

	this.ExtClinicalassessmentdataMedicationId=null;


	function getExtClinicalassessmentdataMedicationId() {
		return this.ExtClinicalassessmentdataMedicationId;
	}
	this.getExtClinicalassessmentdataMedicationId=getExtClinicalassessmentdataMedicationId;


	function setExtClinicalassessmentdataMedicationId(v){
		this.ExtClinicalassessmentdataMedicationId=v;
	}
	this.setExtClinicalassessmentdataMedicationId=setExtClinicalassessmentdataMedicationId;

	this.ext_clinicalAssessmentData_id_fk=null;


	this.getext_clinicalAssessmentData_id=function() {
		return this.ext_clinicalAssessmentData_id_fk;
	}


	this.setext_clinicalAssessmentData_id=function(v){
		this.ext_clinicalAssessmentData_id_fk=v;
	}


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="name"){
				return this.Name ;
			} else 
			if(xmlPath=="type"){
				return this.Type ;
			} else 
			if(xmlPath=="dose"){
				return this.Dose ;
			} else 
			if(xmlPath=="history"){
				return this.History ;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			if(xmlPath=="ext_clinicalAssessmentData_Medication_id"){
				return this.ExtClinicalassessmentdataMedicationId ;
			} else 
			if(xmlPath=="ext_clinicalAssessmentData_id"){
				return this.ext_clinicalAssessmentData_id_fk ;
			} else 
			{
				return null;
			}
	}


	this.setProperty=function(xmlPath,value){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="name"){
				this.Name=value;
			} else 
			if(xmlPath=="type"){
				this.Type=value;
			} else 
			if(xmlPath=="dose"){
				this.Dose=value;
			} else 
			if(xmlPath=="history"){
				this.History=value;
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			if(xmlPath=="ext_clinicalAssessmentData_Medication_id"){
				this.ExtClinicalassessmentdataMedicationId=value;
			} else 
			if(xmlPath=="ext_clinicalAssessmentData_id"){
				this.ext_clinicalAssessmentData_id_fk=value;
			} else 
			{
				return null;
			}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.setReferenceField=function(xmlPath,v) {
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="name"){
			return "field_data";
		}else if (xmlPath=="type"){
			return "field_data";
		}else if (xmlPath=="dose"){
			return "field_data";
		}else if (xmlPath=="history"){
			return "field_data";
		}
		else{
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<ext:clinicalAssessmentData_Medication";
		xmlTxt+=this.getXMLAtts();
		xmlTxt+=" xmlns:arc=\"http://nrg.wustl.edu/arc\"";
		xmlTxt+=" xmlns:cat=\"http://nrg.wustl.edu/catalog\"";
		xmlTxt+=" xmlns:ext=\"http://nrg.wustl.edu/ext\"";
		xmlTxt+=" xmlns:pipe=\"http://nrg.wustl.edu/pipe\"";
		xmlTxt+=" xmlns:prov=\"http://www.nbirn.net/prov\"";
		xmlTxt+=" xmlns:scr=\"http://nrg.wustl.edu/scr\"";
		xmlTxt+=" xmlns:val=\"http://nrg.wustl.edu/val\"";
		xmlTxt+=" xmlns:wrk=\"http://nrg.wustl.edu/workflow\"";
		xmlTxt+=" xmlns:xdat=\"http://nrg.wustl.edu/security\"";
		xmlTxt+=" xmlns:xnat=\"http://nrg.wustl.edu/xnat\"";
		xmlTxt+=" xmlns:xnat_a=\"http://nrg.wustl.edu/xnat_assessments\"";
		xmlTxt+=" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"";
		xmlTxt+=">";
		xmlTxt+=this.getXMLBody(preventComments)
		xmlTxt+="\n</ext:clinicalAssessmentData_Medication>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		str += "<!--hidden_fields[";
		var hiddenCount = 0;
			if(this.ExtClinicalassessmentdataMedicationId!=null){
				if(hiddenCount++>0)str+=",";
				str+="ext_clinicalAssessmentData_Medication_id=\"" + this.ExtClinicalassessmentdataMedicationId + "\"";
			}
			if(this.ext_clinicalAssessmentData_id_fk!=null){
				if(hiddenCount++>0)str+=",";
				str+="ext_clinicalAssessmentData_id=\"" + this.ext_clinicalAssessmentData_id_fk + "\"";
			}
		str +="]-->";
		}
		return str;
	}


	this.getXMLAtts=function(){
		var attTxt = "";
		if (this.Name!=null)
			attTxt+=" name=\"" +this.Name +"\"";
		//NOT REQUIRED FIELD

		if (this.Type!=null)
			attTxt+=" type=\"" +this.Type +"\"";
		//NOT REQUIRED FIELD

		if (this.Dose!=null)
			attTxt+=" dose=\"" +this.Dose +"\"";
		//NOT REQUIRED FIELD

		if (this.History!=null)
			attTxt+=" history=\"" +this.History +"\"";
		//NOT REQUIRED FIELD

		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		return xmlTxt;
	}


	this.hasXMLComments=function(){
			if (this.ExtClinicalassessmentdataMedicationId!=null) return true;
			if (this.ext_clinicalAssessmentData_id_fk!=null) return true;
			return false;
	}


	this.hasXMLBodyContent=function(){
		if(this.hasXMLComments())return true;
		return false;
	}
}
