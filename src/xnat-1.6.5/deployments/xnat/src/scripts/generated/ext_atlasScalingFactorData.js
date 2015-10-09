/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:51 UTC 2015
 *
 */

/**
 * @author XDAT
 *
 */

function ext_atlasScalingFactorData(){
this.xsiType="ext:atlasScalingFactorData";

	this.getSchemaElementName=function(){
		return "atlasScalingFactorData";
	}

	this.getFullSchemaElementName=function(){
		return "ext:atlasScalingFactorData";
	}
this.extension=dynamicJSLoad('xnat_mrAssessorData','generated/xnat_mrAssessorData.js');

	this.Scalingfactor=null;


	function getScalingfactor() {
		return this.Scalingfactor;
	}
	this.getScalingfactor=getScalingfactor;


	function setScalingfactor(v){
		this.Scalingfactor=v;
	}
	this.setScalingfactor=setScalingfactor;

	this.Eta=null;


	function getEta() {
		return this.Eta;
	}
	this.getEta=getEta;


	function setEta(v){
		this.Eta=v;
	}
	this.setEta=setEta;

	this.Eicv=null;


	function getEicv() {
		return this.Eicv;
	}
	this.getEicv=getEicv;


	function setEicv(v){
		this.Eicv=v;
	}
	this.setEicv=setEicv;

	this.Basescannumber=null;


	function getBasescannumber() {
		return this.Basescannumber;
	}
	this.getBasescannumber=getBasescannumber;


	function setBasescannumber(v){
		this.Basescannumber=v;
	}
	this.setBasescannumber=setBasescannumber;


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="mrAssessorData"){
				return this.Mrassessordata ;
			} else 
			if(xmlPath.startsWith("mrAssessorData")){
				xmlPath=xmlPath.substring(14);
				if(xmlPath=="")return this.Mrassessordata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Mrassessordata!=undefined)return this.Mrassessordata.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="scalingFactor"){
				return this.Scalingfactor ;
			} else 
			if(xmlPath=="eta"){
				return this.Eta ;
			} else 
			if(xmlPath=="eICV"){
				return this.Eicv ;
			} else 
			if(xmlPath=="baseScanNumber"){
				return this.Basescannumber ;
			} else 
			if(xmlPath=="meta"){
				return this.Meta ;
			} else 
			{
				return this.extension.getProperty(xmlPath);
			}
	}


	this.setProperty=function(xmlPath,value){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="mrAssessorData"){
				this.Mrassessordata=value;
			} else 
			if(xmlPath.startsWith("mrAssessorData")){
				xmlPath=xmlPath.substring(14);
				if(xmlPath=="")return this.Mrassessordata ;
				if(xmlPath.startsWith("[")){
					if (xmlPath.indexOf("/")>-1){
						var optionString=xmlPath.substring(0,xmlPath.indexOf("/"));
						xmlPath=xmlPath.substring(xmlPath.indexOf("/")+1);
					}else{
						var optionString=xmlPath;
						xmlPath="";
					}
					
					var options = loadOptions(optionString);//omUtils.js
				}else{xmlPath=xmlPath.substring(1);}
				if(this.Mrassessordata!=undefined){
					this.Mrassessordata.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Mrassessordata= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Mrassessordata= instanciateObject("xnat:mrAssessorData");//omUtils.js
						}
						if(options && options.where)this.Mrassessordata.setProperty(options.where.field,options.where.value);
						this.Mrassessordata.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="scalingFactor"){
				this.Scalingfactor=value;
			} else 
			if(xmlPath=="eta"){
				this.Eta=value;
			} else 
			if(xmlPath=="eICV"){
				this.Eicv=value;
			} else 
			if(xmlPath=="baseScanNumber"){
				this.Basescannumber=value;
			} else 
			if(xmlPath=="meta"){
				this.Meta=value;
			} else 
			{
				return this.extension.setProperty(xmlPath,value);
			}
	}

	/**
	 * Sets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.setReferenceField=function(xmlPath,v) {
			this.extension.setReferenceField(xmlPath,v);
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
			return this.extension.getReferenceFieldName(xmlPath);
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="scalingFactor"){
			return "field_data";
		}else if (xmlPath=="eta"){
			return "field_data";
		}else if (xmlPath=="eICV"){
			return "field_data";
		}else if (xmlPath=="baseScanNumber"){
			return "field_data";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<ext:AtlasScalingFactor";
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
		xmlTxt+="\n</ext:AtlasScalingFactor>";
		return xmlTxt;
	}


	this.getXMLComments=function(preventComments){
		var str ="";
		if((preventComments==undefined || !preventComments) && this.hasXMLComments()){
		}
		return str;
	}


	this.getXMLAtts=function(){
		var attTxt = this.extension.getXMLAtts();
		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		xmlTxt+=this.extension.getXMLBody(preventComments);
		if (this.Scalingfactor!=null){
			xmlTxt+="\n<ext:scalingFactor";
			xmlTxt+=">";
			xmlTxt+=this.Scalingfactor;
			xmlTxt+="</ext:scalingFactor>";
		}
		else{
			xmlTxt+="\n<ext:scalingFactor";
			xmlTxt+="/>";
		}

		if (this.Eta!=null){
			xmlTxt+="\n<ext:eta";
			xmlTxt+=">";
			xmlTxt+=this.Eta;
			xmlTxt+="</ext:eta>";
		}
		else{
			xmlTxt+="\n<ext:eta";
			xmlTxt+="/>";
		}

		if (this.Eicv!=null){
			xmlTxt+="\n<ext:eICV";
			xmlTxt+=">";
			xmlTxt+=this.Eicv;
			xmlTxt+="</ext:eICV>";
		}
		else{
			xmlTxt+="\n<ext:eICV";
			xmlTxt+="/>";
		}

		if (this.Basescannumber!=null){
			xmlTxt+="\n<ext:baseScanNumber";
			xmlTxt+=">";
			xmlTxt+=this.Basescannumber.replace(/>/g,"&gt;").replace(/</g,"&lt;");
			xmlTxt+="</ext:baseScanNumber>";
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if (this.Scalingfactor!=null) return true;
		return true;//REQUIRED scalingFactor
	}
}
