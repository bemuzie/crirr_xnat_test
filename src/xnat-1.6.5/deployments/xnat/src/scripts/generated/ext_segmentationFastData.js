/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:51 UTC 2015
 *
 */

/**
 * @author XDAT
 *
 */

function ext_segmentationFastData(){
this.xsiType="ext:segmentationFastData";

	this.getSchemaElementName=function(){
		return "segmentationFastData";
	}

	this.getFullSchemaElementName=function(){
		return "ext:segmentationFastData";
	}
this.extension=dynamicJSLoad('xnat_mrAssessorData','generated/xnat_mrAssessorData.js');
	this.Brainvolume =null;
	function getBrainvolume() {
		return this.Brainvolume;
	}
	this.getBrainvolume=getBrainvolume;


	function setBrainvolume(v){
		this.Brainvolume =v;
	}
	this.setBrainvolume=setBrainvolume;

	this.Brainvolume_BrainvolumeXnatVolumetricregionId=null;


	function getBrainvolume_BrainvolumeXnatVolumetricregionId(){
		return this.Brainvolume_BrainvolumeXnatVolumetricregionId;
	}
	this.getBrainvolume_BrainvolumeXnatVolumetricregionId=getBrainvolume_BrainvolumeXnatVolumetricregionId;


	function setBrainvolume_BrainvolumeXnatVolumetricregionId(v){
		this.Brainvolume_BrainvolumeXnatVolumetricregionId=v;
	}
	this.setBrainvolume_BrainvolumeXnatVolumetricregionId=setBrainvolume_BrainvolumeXnatVolumetricregionId;

	this.Brainpercent=null;


	function getBrainpercent() {
		return this.Brainpercent;
	}
	this.getBrainpercent=getBrainpercent;


	function setBrainpercent(v){
		this.Brainpercent=v;
	}
	this.setBrainpercent=setBrainpercent;


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
			if(xmlPath=="brainVolume"){
				return this.Brainvolume ;
			} else 
			if(xmlPath.startsWith("brainVolume")){
				xmlPath=xmlPath.substring(11);
				if(xmlPath=="")return this.Brainvolume ;
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
				if(this.Brainvolume!=undefined)return this.Brainvolume.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="brainPercent"){
				return this.Brainpercent ;
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
			if(xmlPath=="brainVolume"){
				this.Brainvolume=value;
			} else 
			if(xmlPath.startsWith("brainVolume")){
				xmlPath=xmlPath.substring(11);
				if(xmlPath=="")return this.Brainvolume ;
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
				if(this.Brainvolume!=undefined){
					this.Brainvolume.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Brainvolume= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Brainvolume= instanciateObject("xnat:volumetricRegion");//omUtils.js
						}
						if(options && options.where)this.Brainvolume.setProperty(options.where.field,options.where.value);
						this.Brainvolume.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="brainPercent"){
				this.Brainpercent=value;
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
		if (xmlPath=="brainVolume"){
			this.setBrainvolume(v);
		}
		else{
			this.extension.setReferenceField(xmlPath,v);
		}
	}

	/**
	 * Gets the value for a field via the XMLPATH.
	 * @param v Value to Set.
	 */
	this.getReferenceFieldName=function(xmlPath) {
		if (xmlPath=="brainVolume"){
			return "http://nrg.wustl.edu/xnat:volumetricRegion";
		}
		else{
			return this.extension.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="brainVolume"){
			return "field_single_reference";
		}else if (xmlPath=="brainPercent"){
			return "field_data";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<ext:SegmentationFast";
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
		xmlTxt+="\n</ext:SegmentationFast>";
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
		if (this.Brainpercent!=null)
			attTxt+=" brainPercent=\"" +this.Brainpercent +"\"";
		//NOT REQUIRED FIELD

		return attTxt;
	}


	this.getXMLBody=function(preventComments){
		var xmlTxt=this.getXMLComments(preventComments);
		xmlTxt+=this.extension.getXMLBody(preventComments);
		if (this.Brainvolume!=null){
			xmlTxt+="\n<ext:brainVolume";
			xmlTxt+=this.Brainvolume.getXMLAtts();
			if(this.Brainvolume.xsiType!="xnat:volumetricRegion"){
				xmlTxt+=" xsi:type=\"" + this.Brainvolume.xsiType + "\"";
			}
			if (this.Brainvolume.hasXMLBodyContent()){
				xmlTxt+=">";
				xmlTxt+=this.Brainvolume.getXMLBody(preventComments);
				xmlTxt+="</ext:brainVolume>";
			}else {xmlTxt+="/>";}
		}
		else{
			xmlTxt+="\n<ext:brainVolume/>";//REQUIRED
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if (this.Brainvolume!=null){
			if (this.Brainvolume.hasXMLBodyContent()) return true;
		}
		return true;//REQUIRED brainVolume
	}
}
