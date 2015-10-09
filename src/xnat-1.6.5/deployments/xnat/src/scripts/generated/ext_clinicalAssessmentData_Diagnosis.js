/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:51 UTC 2015
 *
 */

/**
 * @author XDAT
 *
 */

function ext_clinicalAssessmentData_Diagnosis(){
this.xsiType="ext:clinicalAssessmentData_Diagnosis";

	this.getSchemaElementName=function(){
		return "clinicalAssessmentData_Diagnosis";
	}

	this.getFullSchemaElementName=function(){
		return "ext:clinicalAssessmentData_Diagnosis";
	}

	this.Diagnosis=null;


	function getDiagnosis() {
		return this.Diagnosis;
	}
	this.getDiagnosis=getDiagnosis;


	function setDiagnosis(v){
		this.Diagnosis=v;
	}
	this.setDiagnosis=setDiagnosis;

	this.Type=null;


	function getType() {
		return this.Type;
	}
	this.getType=getType;


	function setType(v){
		this.Type=v;
	}
	this.setType=setType;

	this.Number=null;


	function getNumber() {
		return this.Number;
	}
	this.getNumber=getNumber;


	function setNumber(v){
		this.Number=v;
	}
	this.setNumber=setNumber;

	this.ExtClinicalassessmentdataDiagnosisId=null;


	function getExtClinicalassessmentdataDiagnosisId() {
		return this.ExtClinicalassessmentdataDiagnosisId;
	}
	this.getExtClinicalassessmentdataDiagnosisId=getExtClinicalassessmentdataDiagnosisId;


	function setExtClinicalassessmentdataDiagnosisId(v){
		this.ExtClinicalassessmentdataDiagnosisId=v;
	}
	this.setExtClinicalassessmentdataDiagnosisId=setExtClinicalassessmentdataDiagnosisId;

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
			if(xmlPath=="Diagnosis"){
				return this.Diagnosis ;
			} else 
			if(xmlPath=="type"){
				return this.Type ;
			} else 
			if(xmlPath=="number"){
				return this.Number ;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			if(xmlPath=="ext_clinicalAssessmentData_Diagnosis_id"){
				return this.ExtClinicalassessmentdataDiagnosisId ;
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
			if(xmlPath=="Diagnosis"){
				this.Diagnosis=value;
			} else 
			if(xmlPath=="type"){
				this.Type=value;
			} else 
			if(xmlPath=="number"){
				this.Number=value;
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			if(xmlPath=="ext_clinicalAssessmentData_Diagnosis_id"){
				this.ExtClinicalassessmentdataDiagnosisId=value;
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
		if (xmlPath=="Diagnosis"){
			return "field_data";
		}else if (xmlPath=="type"){
			return "field_data";
		}else if (xmlPath=="number"){
			return "field_data";
		}
		else{
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<ext:clinicalAssessmentData_Diagnosis";
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
		xmlTxt+="\n</ext:clinicalAssessmentData_Diagnosis>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		str += "<!--hidden_fields[";
		var hiddenCount = 0;
			if(this.ExtClinicalassessmentdataDiagnosisId!=null){
				if(hiddenCount++>0)str+=",";
				str+="ext_clinicalAssessmentData_Diagnosis_id=\"" + this.ExtClinicalassessmentdataDiagnosisId + "\"";
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
		if (this.Type!=null)
			attTxt+=" type=\"" +this.Type +"\"";
		else attTxt+=" type=\"\"";//REQUIRED FIELD

		if (this.Number!=null)
			attTxt+=" number=\"" +this.Number +"\"";
		//NOT REQUIRED FIELD

		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		if (this.Diagnosis!=null){
			xmlTxt+=this.Diagnosis.replace(/>/g,"&gt;").replace(/</g,"&lt;");
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
			if (this.ExtClinicalassessmentdataDiagnosisId!=null) return true;
			if (this.ext_clinicalAssessmentData_id_fk!=null) return true;
			return false;
	}


	this.hasXMLBodyContent=function(){
		if (this.Diagnosis!=null) return true;
		if(this.hasXMLComments())return true;
		return false;
	}
}
