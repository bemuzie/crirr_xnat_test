/*
 * GENERATED FILE
 * Created on Wed Oct 07 13:44:51 UTC 2015
 *
 */

/**
 * @author XDAT
 *
 */

function ext_clinicalAssessmentData(){
this.xsiType="ext:clinicalAssessmentData";

	this.getSchemaElementName=function(){
		return "clinicalAssessmentData";
	}

	this.getFullSchemaElementName=function(){
		return "ext:clinicalAssessmentData";
	}
this.extension=dynamicJSLoad('xnat_subjectAssessorData','generated/xnat_subjectAssessorData.js');
	this.Diagnosis =new Array();

	function getDiagnosis() {
		return this.Diagnosis;
	}
	this.getDiagnosis=getDiagnosis;


	function addDiagnosis(v){
		this.Diagnosis.push(v);
	}
	this.addDiagnosis=addDiagnosis;

	this.Bloodpressure_highbpCsBool=null;


	function getBloodpressure_highbpCsBool() {
		return this.Bloodpressure_highbpCsBool;
	}
	this.getBloodpressure_highbpCsBool=getBloodpressure_highbpCsBool;


	function setBloodpressure_highbpCsBool(v){
		this.Bloodpressure_highbpCsBool=v;
	}
	this.setBloodpressure_highbpCsBool=setBloodpressure_highbpCsBool;


	this.isBloodpressure_highbpCsBool=function(defaultValue) {
		if(this.Bloodpressure_highbpCsBool==null)return defaultValue;
		if(this.Bloodpressure_highbpCsBool=="1" || this.Bloodpressure_highbpCsBool==true)return true;
		return false;
	}

	this.Bloodpressure_systolic=null;


	function getBloodpressure_systolic() {
		return this.Bloodpressure_systolic;
	}
	this.getBloodpressure_systolic=getBloodpressure_systolic;


	function setBloodpressure_systolic(v){
		this.Bloodpressure_systolic=v;
	}
	this.setBloodpressure_systolic=setBloodpressure_systolic;

	this.Bloodpressure_diastolic=null;


	function getBloodpressure_diastolic() {
		return this.Bloodpressure_diastolic;
	}
	this.getBloodpressure_diastolic=getBloodpressure_diastolic;


	function setBloodpressure_diastolic(v){
		this.Bloodpressure_diastolic=v;
	}
	this.setBloodpressure_diastolic=setBloodpressure_diastolic;

	this.Neuro_sbt=null;


	function getNeuro_sbt() {
		return this.Neuro_sbt;
	}
	this.getNeuro_sbt=getNeuro_sbt;


	function setNeuro_sbt(v){
		this.Neuro_sbt=v;
	}
	this.setNeuro_sbt=setNeuro_sbt;

	this.Neuro_mmse=null;


	function getNeuro_mmse() {
		return this.Neuro_mmse;
	}
	this.getNeuro_mmse=getNeuro_mmse;


	function setNeuro_mmse(v){
		this.Neuro_mmse=v;
	}
	this.setNeuro_mmse=setNeuro_mmse;

	this.Neuro_bdsc=null;


	function getNeuro_bdsc() {
		return this.Neuro_bdsc;
	}
	this.getNeuro_bdsc=getNeuro_bdsc;


	function setNeuro_bdsc(v){
		this.Neuro_bdsc=v;
	}
	this.setNeuro_bdsc=setNeuro_bdsc;

	this.Neuro_cdr_memory=null;


	function getNeuro_cdr_memory() {
		return this.Neuro_cdr_memory;
	}
	this.getNeuro_cdr_memory=getNeuro_cdr_memory;


	function setNeuro_cdr_memory(v){
		this.Neuro_cdr_memory=v;
	}
	this.setNeuro_cdr_memory=setNeuro_cdr_memory;

	this.Neuro_cdr_orientation=null;


	function getNeuro_cdr_orientation() {
		return this.Neuro_cdr_orientation;
	}
	this.getNeuro_cdr_orientation=getNeuro_cdr_orientation;


	function setNeuro_cdr_orientation(v){
		this.Neuro_cdr_orientation=v;
	}
	this.setNeuro_cdr_orientation=setNeuro_cdr_orientation;

	this.Neuro_cdr_judgmentProblemSolving=null;


	function getNeuro_cdr_judgmentProblemSolving() {
		return this.Neuro_cdr_judgmentProblemSolving;
	}
	this.getNeuro_cdr_judgmentProblemSolving=getNeuro_cdr_judgmentProblemSolving;


	function setNeuro_cdr_judgmentProblemSolving(v){
		this.Neuro_cdr_judgmentProblemSolving=v;
	}
	this.setNeuro_cdr_judgmentProblemSolving=setNeuro_cdr_judgmentProblemSolving;

	this.Neuro_cdr_communityAffairs=null;


	function getNeuro_cdr_communityAffairs() {
		return this.Neuro_cdr_communityAffairs;
	}
	this.getNeuro_cdr_communityAffairs=getNeuro_cdr_communityAffairs;


	function setNeuro_cdr_communityAffairs(v){
		this.Neuro_cdr_communityAffairs=v;
	}
	this.setNeuro_cdr_communityAffairs=setNeuro_cdr_communityAffairs;

	this.Neuro_cdr_homeHobbies=null;


	function getNeuro_cdr_homeHobbies() {
		return this.Neuro_cdr_homeHobbies;
	}
	this.getNeuro_cdr_homeHobbies=getNeuro_cdr_homeHobbies;


	function setNeuro_cdr_homeHobbies(v){
		this.Neuro_cdr_homeHobbies=v;
	}
	this.setNeuro_cdr_homeHobbies=setNeuro_cdr_homeHobbies;

	this.Neuro_cdr_personalCare=null;


	function getNeuro_cdr_personalCare() {
		return this.Neuro_cdr_personalCare;
	}
	this.getNeuro_cdr_personalCare=getNeuro_cdr_personalCare;


	function setNeuro_cdr_personalCare(v){
		this.Neuro_cdr_personalCare=v;
	}
	this.setNeuro_cdr_personalCare=setNeuro_cdr_personalCare;

	this.Neuro_cdr_sumbox=null;


	function getNeuro_cdr_sumbox() {
		return this.Neuro_cdr_sumbox;
	}
	this.getNeuro_cdr_sumbox=getNeuro_cdr_sumbox;


	function setNeuro_cdr_sumbox(v){
		this.Neuro_cdr_sumbox=v;
	}
	this.setNeuro_cdr_sumbox=setNeuro_cdr_sumbox;

	this.Neuro_cdr_rating=null;


	function getNeuro_cdr_rating() {
		return this.Neuro_cdr_rating;
	}
	this.getNeuro_cdr_rating=getNeuro_cdr_rating;


	function setNeuro_cdr_rating(v){
		this.Neuro_cdr_rating=v;
	}
	this.setNeuro_cdr_rating=setNeuro_cdr_rating;

	this.Neuro_thinkingproblemSbool=null;


	function getNeuro_thinkingproblemSbool() {
		return this.Neuro_thinkingproblemSbool;
	}
	this.getNeuro_thinkingproblemSbool=getNeuro_thinkingproblemSbool;


	function setNeuro_thinkingproblemSbool(v){
		this.Neuro_thinkingproblemSbool=v;
	}
	this.setNeuro_thinkingproblemSbool=setNeuro_thinkingproblemSbool;


	this.isNeuro_thinkingproblemSbool=function(defaultValue) {
		if(this.Neuro_thinkingproblemSbool==null)return defaultValue;
		if(this.Neuro_thinkingproblemSbool=="1" || this.Neuro_thinkingproblemSbool==true)return true;
		return false;
	}

	this.Neuro_thinkingproblemCsBool=null;


	function getNeuro_thinkingproblemCsBool() {
		return this.Neuro_thinkingproblemCsBool;
	}
	this.getNeuro_thinkingproblemCsBool=getNeuro_thinkingproblemCsBool;


	function setNeuro_thinkingproblemCsBool(v){
		this.Neuro_thinkingproblemCsBool=v;
	}
	this.setNeuro_thinkingproblemCsBool=setNeuro_thinkingproblemCsBool;


	this.isNeuro_thinkingproblemCsBool=function(defaultValue) {
		if(this.Neuro_thinkingproblemCsBool==null)return defaultValue;
		if(this.Neuro_thinkingproblemCsBool=="1" || this.Neuro_thinkingproblemCsBool==true)return true;
		return false;
	}

	this.Neuro_consmemoryproblemBool=null;


	function getNeuro_consmemoryproblemBool() {
		return this.Neuro_consmemoryproblemBool;
	}
	this.getNeuro_consmemoryproblemBool=getNeuro_consmemoryproblemBool;


	function setNeuro_consmemoryproblemBool(v){
		this.Neuro_consmemoryproblemBool=v;
	}
	this.setNeuro_consmemoryproblemBool=setNeuro_consmemoryproblemBool;


	this.isNeuro_consmemoryproblemBool=function(defaultValue) {
		if(this.Neuro_consmemoryproblemBool==null)return defaultValue;
		if(this.Neuro_consmemoryproblemBool=="1" || this.Neuro_consmemoryproblemBool==true)return true;
		return false;
	}

	this.Neuro_strokebool=null;


	function getNeuro_strokebool() {
		return this.Neuro_strokebool;
	}
	this.getNeuro_strokebool=getNeuro_strokebool;


	function setNeuro_strokebool(v){
		this.Neuro_strokebool=v;
	}
	this.setNeuro_strokebool=setNeuro_strokebool;


	this.isNeuro_strokebool=function(defaultValue) {
		if(this.Neuro_strokebool==null)return defaultValue;
		if(this.Neuro_strokebool=="1" || this.Neuro_strokebool==true)return true;
		return false;
	}

	this.Neuro_sxStrokeBool=null;


	function getNeuro_sxStrokeBool() {
		return this.Neuro_sxStrokeBool;
	}
	this.getNeuro_sxStrokeBool=getNeuro_sxStrokeBool;


	function setNeuro_sxStrokeBool(v){
		this.Neuro_sxStrokeBool=v;
	}
	this.setNeuro_sxStrokeBool=setNeuro_sxStrokeBool;


	this.isNeuro_sxStrokeBool=function(defaultValue) {
		if(this.Neuro_sxStrokeBool==null)return defaultValue;
		if(this.Neuro_sxStrokeBool=="1" || this.Neuro_sxStrokeBool==true)return true;
		return false;
	}

	this.Neuro_sxTiaBool=null;


	function getNeuro_sxTiaBool() {
		return this.Neuro_sxTiaBool;
	}
	this.getNeuro_sxTiaBool=getNeuro_sxTiaBool;


	function setNeuro_sxTiaBool(v){
		this.Neuro_sxTiaBool=v;
	}
	this.setNeuro_sxTiaBool=setNeuro_sxTiaBool;


	this.isNeuro_sxTiaBool=function(defaultValue) {
		if(this.Neuro_sxTiaBool==null)return defaultValue;
		if(this.Neuro_sxTiaBool=="1" || this.Neuro_sxTiaBool==true)return true;
		return false;
	}

	this.Movement_spasticityBool=null;


	function getMovement_spasticityBool() {
		return this.Movement_spasticityBool;
	}
	this.getMovement_spasticityBool=getMovement_spasticityBool;


	function setMovement_spasticityBool(v){
		this.Movement_spasticityBool=v;
	}
	this.setMovement_spasticityBool=setMovement_spasticityBool;


	this.isMovement_spasticityBool=function(defaultValue) {
		if(this.Movement_spasticityBool==null)return defaultValue;
		if(this.Movement_spasticityBool=="1" || this.Movement_spasticityBool==true)return true;
		return false;
	}

	this.Movement_rigid=null;


	function getMovement_rigid() {
		return this.Movement_rigid;
	}
	this.getMovement_rigid=getMovement_rigid;


	function setMovement_rigid(v){
		this.Movement_rigid=v;
	}
	this.setMovement_rigid=setMovement_rigid;

	this.Movement_bradykBool=null;


	function getMovement_bradykBool() {
		return this.Movement_bradykBool;
	}
	this.getMovement_bradykBool=getMovement_bradykBool;


	function setMovement_bradykBool(v){
		this.Movement_bradykBool=v;
	}
	this.setMovement_bradykBool=setMovement_bradykBool;


	this.isMovement_bradykBool=function(defaultValue) {
		if(this.Movement_bradykBool==null)return defaultValue;
		if(this.Movement_bradykBool=="1" || this.Movement_bradykBool==true)return true;
		return false;
	}

	this.Movement_gait=null;


	function getMovement_gait() {
		return this.Movement_gait;
	}
	this.getMovement_gait=getMovement_gait;


	function setMovement_gait(v){
		this.Movement_gait=v;
	}
	this.setMovement_gait=setMovement_gait;

	this.Movement_abnormalgaitBool=null;


	function getMovement_abnormalgaitBool() {
		return this.Movement_abnormalgaitBool;
	}
	this.getMovement_abnormalgaitBool=getMovement_abnormalgaitBool;


	function setMovement_abnormalgaitBool(v){
		this.Movement_abnormalgaitBool=v;
	}
	this.setMovement_abnormalgaitBool=setMovement_abnormalgaitBool;


	this.isMovement_abnormalgaitBool=function(defaultValue) {
		if(this.Movement_abnormalgaitBool==null)return defaultValue;
		if(this.Movement_abnormalgaitBool=="1" || this.Movement_abnormalgaitBool==true)return true;
		return false;
	}
	this.Medication =new Array();

	function getMedication() {
		return this.Medication;
	}
	this.getMedication=getMedication;


	function addMedication(v){
		this.Medication.push(v);
	}
	this.addMedication=addMedication;

	this.Weight=null;


	function getWeight() {
		return this.Weight;
	}
	this.getWeight=getWeight;


	function setWeight(v){
		this.Weight=v;
	}
	this.setWeight=setWeight;

	this.DiabetesBool=null;


	function getDiabetesBool() {
		return this.DiabetesBool;
	}
	this.getDiabetesBool=getDiabetesBool;


	function setDiabetesBool(v){
		this.DiabetesBool=v;
	}
	this.setDiabetesBool=setDiabetesBool;


	this.isDiabetesBool=function(defaultValue) {
		if(this.DiabetesBool==null)return defaultValue;
		if(this.DiabetesBool=="1" || this.DiabetesBool==true)return true;
		return false;
	}

	this.HeartproblemsBool=null;


	function getHeartproblemsBool() {
		return this.HeartproblemsBool;
	}
	this.getHeartproblemsBool=getHeartproblemsBool;


	function setHeartproblemsBool(v){
		this.HeartproblemsBool=v;
	}
	this.setHeartproblemsBool=setHeartproblemsBool;


	this.isHeartproblemsBool=function(defaultValue) {
		if(this.HeartproblemsBool==null)return defaultValue;
		if(this.HeartproblemsBool=="1" || this.HeartproblemsBool==true)return true;
		return false;
	}

	this.TobaccouseBool=null;


	function getTobaccouseBool() {
		return this.TobaccouseBool;
	}
	this.getTobaccouseBool=getTobaccouseBool;


	function setTobaccouseBool(v){
		this.TobaccouseBool=v;
	}
	this.setTobaccouseBool=setTobaccouseBool;


	this.isTobaccouseBool=function(defaultValue) {
		if(this.TobaccouseBool==null)return defaultValue;
		if(this.TobaccouseBool=="1" || this.TobaccouseBool==true)return true;
		return false;
	}


	this.getProperty=function(xmlPath){
			if(xmlPath.startsWith(this.getFullSchemaElementName())){
				xmlPath=xmlPath.substring(this.getFullSchemaElementName().length + 1);
			}
			if(xmlPath=="subjectAssessorData"){
				return this.Subjectassessordata ;
			} else 
			if(xmlPath.startsWith("subjectAssessorData")){
				xmlPath=xmlPath.substring(19);
				if(xmlPath=="")return this.Subjectassessordata ;
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
				if(this.Subjectassessordata!=undefined)return this.Subjectassessordata.getProperty(xmlPath);
				else return null;
			} else 
			if(xmlPath=="Diagnosis"){
				return this.Diagnosis ;
			} else 
			if(xmlPath.startsWith("Diagnosis")){
				xmlPath=xmlPath.substring(9);
				if(xmlPath=="")return this.Diagnosis ;
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
				var index=0;
				if(options){
					if(options.index)index=options.index;
				}

			var whereArray;
				if (options.where){

				whereArray=new Array();

				for(var whereCount=0;whereCount<this.Diagnosis.length;whereCount++){

					var tempValue=this.Diagnosis[whereCount].getProperty(options.where.field);

					if(tempValue!=null)if(tempValue.toString()==options.where.value.toString()){

						whereArray.push(this.Diagnosis[whereCount]);

					}

				}
				}else{

				whereArray=this.Diagnosis;
				}

			var typeArray;
				if (options.xsiType){

				typeArray=new Array();

				for(var typeCount=0;typeCount<whereArray.length;typeCount++){

					if(whereArray[typeCount].getFullSchemaElementName()==options.xsiType){

						typeArray.push(whereArray[typeCount]);

					}

				}
				}else{

				typeArray=whereArray;
				}
				if (typeArray.length>index){
					return typeArray[index].getProperty(xmlPath);
				}else{
					return null;
				}
			} else 
			if(xmlPath=="BloodPressure/HighBP_CS_Bool"){
				return this.Bloodpressure_highbpCsBool ;
			} else 
			if(xmlPath=="BloodPressure/systolic"){
				return this.Bloodpressure_systolic ;
			} else 
			if(xmlPath=="BloodPressure/diastolic"){
				return this.Bloodpressure_diastolic ;
			} else 
			if(xmlPath=="Neuro/SBT"){
				return this.Neuro_sbt ;
			} else 
			if(xmlPath=="Neuro/MMSE"){
				return this.Neuro_mmse ;
			} else 
			if(xmlPath=="Neuro/Bdsc"){
				return this.Neuro_bdsc ;
			} else 
			if(xmlPath=="Neuro/CDR/memory"){
				return this.Neuro_cdr_memory ;
			} else 
			if(xmlPath=="Neuro/CDR/orientation"){
				return this.Neuro_cdr_orientation ;
			} else 
			if(xmlPath=="Neuro/CDR/judgment_problem_solving"){
				return this.Neuro_cdr_judgmentProblemSolving ;
			} else 
			if(xmlPath=="Neuro/CDR/community_affairs"){
				return this.Neuro_cdr_communityAffairs ;
			} else 
			if(xmlPath=="Neuro/CDR/home_hobbies"){
				return this.Neuro_cdr_homeHobbies ;
			} else 
			if(xmlPath=="Neuro/CDR/personal_care"){
				return this.Neuro_cdr_personalCare ;
			} else 
			if(xmlPath=="Neuro/CDR/sumbox"){
				return this.Neuro_cdr_sumbox ;
			} else 
			if(xmlPath=="Neuro/CDR/rating"){
				return this.Neuro_cdr_rating ;
			} else 
			if(xmlPath=="Neuro/ThinkingProblem_S_Bool"){
				return this.Neuro_thinkingproblemSbool ;
			} else 
			if(xmlPath=="Neuro/ThinkingProblem_CS_Bool"){
				return this.Neuro_thinkingproblemCsBool ;
			} else 
			if(xmlPath=="Neuro/ConsMemoryProblem_Bool"){
				return this.Neuro_consmemoryproblemBool ;
			} else 
			if(xmlPath=="Neuro/StrokeBool"){
				return this.Neuro_strokebool ;
			} else 
			if(xmlPath=="Neuro/Sx_Stroke_Bool"){
				return this.Neuro_sxStrokeBool ;
			} else 
			if(xmlPath=="Neuro/Sx_Tia_Bool"){
				return this.Neuro_sxTiaBool ;
			} else 
			if(xmlPath=="Movement/Spasticity_Bool"){
				return this.Movement_spasticityBool ;
			} else 
			if(xmlPath=="Movement/Rigid"){
				return this.Movement_rigid ;
			} else 
			if(xmlPath=="Movement/Bradyk_Bool"){
				return this.Movement_bradykBool ;
			} else 
			if(xmlPath=="Movement/Gait"){
				return this.Movement_gait ;
			} else 
			if(xmlPath=="Movement/AbnormalGait_Bool"){
				return this.Movement_abnormalgaitBool ;
			} else 
			if(xmlPath=="Medication"){
				return this.Medication ;
			} else 
			if(xmlPath.startsWith("Medication")){
				xmlPath=xmlPath.substring(10);
				if(xmlPath=="")return this.Medication ;
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
				var index=0;
				if(options){
					if(options.index)index=options.index;
				}

			var whereArray;
				if (options.where){

				whereArray=new Array();

				for(var whereCount=0;whereCount<this.Medication.length;whereCount++){

					var tempValue=this.Medication[whereCount].getProperty(options.where.field);

					if(tempValue!=null)if(tempValue.toString()==options.where.value.toString()){

						whereArray.push(this.Medication[whereCount]);

					}

				}
				}else{

				whereArray=this.Medication;
				}

			var typeArray;
				if (options.xsiType){

				typeArray=new Array();

				for(var typeCount=0;typeCount<whereArray.length;typeCount++){

					if(whereArray[typeCount].getFullSchemaElementName()==options.xsiType){

						typeArray.push(whereArray[typeCount]);

					}

				}
				}else{

				typeArray=whereArray;
				}
				if (typeArray.length>index){
					return typeArray[index].getProperty(xmlPath);
				}else{
					return null;
				}
			} else 
			if(xmlPath=="Weight"){
				return this.Weight ;
			} else 
			if(xmlPath=="Diabetes_Bool"){
				return this.DiabetesBool ;
			} else 
			if(xmlPath=="HeartProblems_Bool"){
				return this.HeartproblemsBool ;
			} else 
			if(xmlPath=="TobaccoUse_Bool"){
				return this.TobaccouseBool ;
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
			if(xmlPath=="subjectAssessorData"){
				this.Subjectassessordata=value;
			} else 
			if(xmlPath.startsWith("subjectAssessorData")){
				xmlPath=xmlPath.substring(19);
				if(xmlPath=="")return this.Subjectassessordata ;
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
				if(this.Subjectassessordata!=undefined){
					this.Subjectassessordata.setProperty(xmlPath,value);
				}else{
						if(options && options.xsiType){
							this.Subjectassessordata= instanciateObject(options.xsiType);//omUtils.js
						}else{
							this.Subjectassessordata= instanciateObject("xnat:subjectAssessorData");//omUtils.js
						}
						if(options && options.where)this.Subjectassessordata.setProperty(options.where.field,options.where.value);
						this.Subjectassessordata.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="Diagnosis"){
				this.Diagnosis=value;
			} else 
			if(xmlPath.startsWith("Diagnosis")){
				xmlPath=xmlPath.substring(9);
				if(xmlPath=="")return this.Diagnosis ;
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
				var index=0;
				if(options){
					if(options.index)index=options.index;
				}

			var whereArray;
				if (options && options.where){

				whereArray=new Array();

				for(var whereCount=0;whereCount<this.Diagnosis.length;whereCount++){

					var tempValue=this.Diagnosis[whereCount].getProperty(options.where.field);

					if(tempValue!=null)if(tempValue.toString()==options.where.value.toString()){

						whereArray.push(this.Diagnosis[whereCount]);

					}

				}
				}else{

				whereArray=this.Diagnosis;
				}

			var typeArray;
				if (options && options.xsiType){

				typeArray=new Array();

				for(var typeCount=0;typeCount<whereArray.length;typeCount++){

					if(whereArray[typeCount].getFullSchemaElementName()==options.xsiType){

						typeArray.push(whereArray[typeCount]);

					}

				}
				}else{

				typeArray=whereArray;
				}
				if (typeArray.length>index){
					typeArray[index].setProperty(xmlPath,value);
				}else{
					var newChild;
					if(options && options.xsiType){
						newChild= instanciateObject(options.xsiType);//omUtils.js
					}else{
						newChild= instanciateObject("ext:clinicalAssessmentData_Diagnosis");//omUtils.js
					}
					this.addDiagnosis(newChild);
					if(options && options.where)newChild.setProperty(options.where.field,options.where.value);
					newChild.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="BloodPressure/HighBP_CS_Bool"){
				this.Bloodpressure_highbpCsBool=value;
			} else 
			if(xmlPath=="BloodPressure/systolic"){
				this.Bloodpressure_systolic=value;
			} else 
			if(xmlPath=="BloodPressure/diastolic"){
				this.Bloodpressure_diastolic=value;
			} else 
			if(xmlPath=="Neuro/SBT"){
				this.Neuro_sbt=value;
			} else 
			if(xmlPath=="Neuro/MMSE"){
				this.Neuro_mmse=value;
			} else 
			if(xmlPath=="Neuro/Bdsc"){
				this.Neuro_bdsc=value;
			} else 
			if(xmlPath=="Neuro/CDR/memory"){
				this.Neuro_cdr_memory=value;
			} else 
			if(xmlPath=="Neuro/CDR/orientation"){
				this.Neuro_cdr_orientation=value;
			} else 
			if(xmlPath=="Neuro/CDR/judgment_problem_solving"){
				this.Neuro_cdr_judgmentProblemSolving=value;
			} else 
			if(xmlPath=="Neuro/CDR/community_affairs"){
				this.Neuro_cdr_communityAffairs=value;
			} else 
			if(xmlPath=="Neuro/CDR/home_hobbies"){
				this.Neuro_cdr_homeHobbies=value;
			} else 
			if(xmlPath=="Neuro/CDR/personal_care"){
				this.Neuro_cdr_personalCare=value;
			} else 
			if(xmlPath=="Neuro/CDR/sumbox"){
				this.Neuro_cdr_sumbox=value;
			} else 
			if(xmlPath=="Neuro/CDR/rating"){
				this.Neuro_cdr_rating=value;
			} else 
			if(xmlPath=="Neuro/ThinkingProblem_S_Bool"){
				this.Neuro_thinkingproblemSbool=value;
			} else 
			if(xmlPath=="Neuro/ThinkingProblem_CS_Bool"){
				this.Neuro_thinkingproblemCsBool=value;
			} else 
			if(xmlPath=="Neuro/ConsMemoryProblem_Bool"){
				this.Neuro_consmemoryproblemBool=value;
			} else 
			if(xmlPath=="Neuro/StrokeBool"){
				this.Neuro_strokebool=value;
			} else 
			if(xmlPath=="Neuro/Sx_Stroke_Bool"){
				this.Neuro_sxStrokeBool=value;
			} else 
			if(xmlPath=="Neuro/Sx_Tia_Bool"){
				this.Neuro_sxTiaBool=value;
			} else 
			if(xmlPath=="Movement/Spasticity_Bool"){
				this.Movement_spasticityBool=value;
			} else 
			if(xmlPath=="Movement/Rigid"){
				this.Movement_rigid=value;
			} else 
			if(xmlPath=="Movement/Bradyk_Bool"){
				this.Movement_bradykBool=value;
			} else 
			if(xmlPath=="Movement/Gait"){
				this.Movement_gait=value;
			} else 
			if(xmlPath=="Movement/AbnormalGait_Bool"){
				this.Movement_abnormalgaitBool=value;
			} else 
			if(xmlPath=="Medication"){
				this.Medication=value;
			} else 
			if(xmlPath.startsWith("Medication")){
				xmlPath=xmlPath.substring(10);
				if(xmlPath=="")return this.Medication ;
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
				var index=0;
				if(options){
					if(options.index)index=options.index;
				}

			var whereArray;
				if (options && options.where){

				whereArray=new Array();

				for(var whereCount=0;whereCount<this.Medication.length;whereCount++){

					var tempValue=this.Medication[whereCount].getProperty(options.where.field);

					if(tempValue!=null)if(tempValue.toString()==options.where.value.toString()){

						whereArray.push(this.Medication[whereCount]);

					}

				}
				}else{

				whereArray=this.Medication;
				}

			var typeArray;
				if (options && options.xsiType){

				typeArray=new Array();

				for(var typeCount=0;typeCount<whereArray.length;typeCount++){

					if(whereArray[typeCount].getFullSchemaElementName()==options.xsiType){

						typeArray.push(whereArray[typeCount]);

					}

				}
				}else{

				typeArray=whereArray;
				}
				if (typeArray.length>index){
					typeArray[index].setProperty(xmlPath,value);
				}else{
					var newChild;
					if(options && options.xsiType){
						newChild= instanciateObject(options.xsiType);//omUtils.js
					}else{
						newChild= instanciateObject("ext:clinicalAssessmentData_Medication");//omUtils.js
					}
					this.addMedication(newChild);
					if(options && options.where)newChild.setProperty(options.where.field,options.where.value);
					newChild.setProperty(xmlPath,value);
				}
			} else 
			if(xmlPath=="Weight"){
				this.Weight=value;
			} else 
			if(xmlPath=="Diabetes_Bool"){
				this.DiabetesBool=value;
			} else 
			if(xmlPath=="HeartProblems_Bool"){
				this.HeartproblemsBool=value;
			} else 
			if(xmlPath=="TobaccoUse_Bool"){
				this.TobaccouseBool=value;
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
		if (xmlPath=="Diagnosis"){
			this.addDiagnosis(v);
		}else if (xmlPath=="Medication"){
			this.addMedication(v);
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
		if (xmlPath=="Diagnosis"){
			return "http://nrg.wustl.edu/ext:clinicalAssessmentData_Diagnosis";
		}else if (xmlPath=="Medication"){
			return "http://nrg.wustl.edu/ext:clinicalAssessmentData_Medication";
		}
		else{
			return this.extension.getReferenceFieldName(xmlPath);
		}
	}

	/**
	 * Returns whether or not this is a reference field
	 */
	this.getFieldType=function(xmlPath){
		if (xmlPath=="Diagnosis"){
			return "field_NO_CHILD";
		}else if (xmlPath=="BloodPressure/HighBP_CS_Bool"){
			return "field_data";
		}else if (xmlPath=="BloodPressure/systolic"){
			return "field_data";
		}else if (xmlPath=="BloodPressure/diastolic"){
			return "field_data";
		}else if (xmlPath=="Neuro/SBT"){
			return "field_data";
		}else if (xmlPath=="Neuro/MMSE"){
			return "field_data";
		}else if (xmlPath=="Neuro/Bdsc"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/memory"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/orientation"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/judgment_problem_solving"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/community_affairs"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/home_hobbies"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/personal_care"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/sumbox"){
			return "field_data";
		}else if (xmlPath=="Neuro/CDR/rating"){
			return "field_data";
		}else if (xmlPath=="Neuro/ThinkingProblem_S_Bool"){
			return "field_data";
		}else if (xmlPath=="Neuro/ThinkingProblem_CS_Bool"){
			return "field_data";
		}else if (xmlPath=="Neuro/ConsMemoryProblem_Bool"){
			return "field_data";
		}else if (xmlPath=="Neuro/StrokeBool"){
			return "field_data";
		}else if (xmlPath=="Neuro/Sx_Stroke_Bool"){
			return "field_data";
		}else if (xmlPath=="Neuro/Sx_Tia_Bool"){
			return "field_data";
		}else if (xmlPath=="Movement/Spasticity_Bool"){
			return "field_data";
		}else if (xmlPath=="Movement/Rigid"){
			return "field_data";
		}else if (xmlPath=="Movement/Bradyk_Bool"){
			return "field_data";
		}else if (xmlPath=="Movement/Gait"){
			return "field_data";
		}else if (xmlPath=="Movement/AbnormalGait_Bool"){
			return "field_data";
		}else if (xmlPath=="Medication"){
			return "field_multi_reference";
		}else if (xmlPath=="Weight"){
			return "field_data";
		}else if (xmlPath=="Diabetes_Bool"){
			return "field_data";
		}else if (xmlPath=="HeartProblems_Bool"){
			return "field_data";
		}else if (xmlPath=="TobaccoUse_Bool"){
			return "field_data";
		}
		else{
			return this.extension.getFieldType(xmlPath);
		}
	}


	this.toXML=function(xmlTxt,preventComments){
		xmlTxt+="<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
		xmlTxt+="\n<ext:ClinicalAssessment";
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
		xmlTxt+="\n</ext:ClinicalAssessment>";
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
		for(var DiagnosisCOUNT=0;DiagnosisCOUNT<this.Diagnosis.length;DiagnosisCOUNT++){
			xmlTxt +="\n<ext:Diagnosis";
			xmlTxt +=this.Diagnosis[DiagnosisCOUNT].getXMLAtts();
			if(this.Diagnosis[DiagnosisCOUNT].xsiType!="ext:clinicalAssessmentData_Diagnosis"){
				xmlTxt+=" xsi:type=\"" + this.Diagnosis[DiagnosisCOUNT].xsiType + "\"";
			}
			if (this.Diagnosis[DiagnosisCOUNT].hasXMLBodyContent()){
				xmlTxt+=">";
				xmlTxt+=this.Diagnosis[DiagnosisCOUNT].getXMLBody(preventComments);
					xmlTxt+="</ext:Diagnosis>";
			}else {xmlTxt+="/>";}
		}
		var BloodpressureATT = ""
		if (this.Bloodpressure_highbpCsBool!=null)
			BloodpressureATT+=" HighBP_CS_Bool=\"" + this.Bloodpressure_highbpCsBool + "\"";
		if (this.Bloodpressure_systolic!=null)
			BloodpressureATT+=" systolic=\"" + this.Bloodpressure_systolic + "\"";
		if (this.Bloodpressure_diastolic!=null)
			BloodpressureATT+=" diastolic=\"" + this.Bloodpressure_diastolic + "\"";
		if(BloodpressureATT!=""){
			xmlTxt+="\n<ext:BloodPressure";
			xmlTxt+=BloodpressureATT;
			xmlTxt+="/>";
		}

			var child0=0;
			var att0=0;
			if(this.Neuro_cdr_personalCare!=null)
			child0++;
			if(this.Neuro_cdr_memory!=null)
			child0++;
			if(this.Neuro_strokebool!=null)
			child0++;
			if(this.Neuro_consmemoryproblemBool!=null)
			child0++;
			if(this.Neuro_bdsc!=null)
			child0++;
			if(this.Neuro_mmse!=null)
			child0++;
			if(this.Neuro_cdr_judgmentProblemSolving!=null)
			child0++;
			if(this.Neuro_sxStrokeBool!=null)
			child0++;
			if(this.Neuro_cdr_orientation!=null)
			child0++;
			if(this.Neuro_sbt!=null)
			child0++;
			if(this.Neuro_cdr_homeHobbies!=null)
			child0++;
			if(this.Neuro_sxTiaBool!=null)
			child0++;
			if(this.Neuro_cdr_sumbox!=null)
			child0++;
			if(this.Neuro_thinkingproblemCsBool!=null)
			child0++;
			if(this.Neuro_cdr_communityAffairs!=null)
			child0++;
			if(this.Neuro_thinkingproblemSbool!=null)
			child0++;
			if(this.Neuro_cdr_rating!=null)
			child0++;
			if(child0>0 || att0>0){
				xmlTxt+="\n<ext:Neuro";
			if(child0==0){
				xmlTxt+="/>";
			}else{
				xmlTxt+=">";
		if (this.Neuro_sbt!=null){
			xmlTxt+="\n<ext:SBT";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_sbt;
			xmlTxt+="</ext:SBT>";
		}
		if (this.Neuro_mmse!=null){
			xmlTxt+="\n<ext:MMSE";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_mmse;
			xmlTxt+="</ext:MMSE>";
		}
		if (this.Neuro_bdsc!=null){
			xmlTxt+="\n<ext:Bdsc";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_bdsc;
			xmlTxt+="</ext:Bdsc>";
		}
		var Neuro_cdrATT = ""
		if (this.Neuro_cdr_sumbox!=null)
			Neuro_cdrATT+=" sumbox=\"" + this.Neuro_cdr_sumbox + "\"";
		if (this.Neuro_cdr_rating!=null)
			Neuro_cdrATT+=" rating=\"" + this.Neuro_cdr_rating + "\"";
			var child1=0;
			var att1=0;
			if(this.Neuro_cdr_homeHobbies!=null)
			child1++;
			if(this.Neuro_cdr_personalCare!=null)
			child1++;
			if(this.Neuro_cdr_memory!=null)
			child1++;
			if(this.Neuro_cdr_sumbox!=null)
			att1++;
			if(this.Neuro_cdr_communityAffairs!=null)
			child1++;
			if(this.Neuro_cdr_judgmentProblemSolving!=null)
			child1++;
			if(this.Neuro_cdr_rating!=null)
			att1++;
			if(this.Neuro_cdr_orientation!=null)
			child1++;
			if(child1>0 || att1>0){
				xmlTxt+="\n<ext:CDR";
				xmlTxt+=Neuro_cdrATT;
			if(child1==0){
				xmlTxt+="/>";
			}else{
				xmlTxt+=">";
		if (this.Neuro_cdr_memory!=null){
			xmlTxt+="\n<ext:memory";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_cdr_memory;
			xmlTxt+="</ext:memory>";
		}
		if (this.Neuro_cdr_orientation!=null){
			xmlTxt+="\n<ext:orientation";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_cdr_orientation;
			xmlTxt+="</ext:orientation>";
		}
		if (this.Neuro_cdr_judgmentProblemSolving!=null){
			xmlTxt+="\n<ext:judgment_problem_solving";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_cdr_judgmentProblemSolving;
			xmlTxt+="</ext:judgment_problem_solving>";
		}
		if (this.Neuro_cdr_communityAffairs!=null){
			xmlTxt+="\n<ext:community_affairs";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_cdr_communityAffairs;
			xmlTxt+="</ext:community_affairs>";
		}
		if (this.Neuro_cdr_homeHobbies!=null){
			xmlTxt+="\n<ext:home_hobbies";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_cdr_homeHobbies;
			xmlTxt+="</ext:home_hobbies>";
		}
		if (this.Neuro_cdr_personalCare!=null){
			xmlTxt+="\n<ext:personal_care";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_cdr_personalCare;
			xmlTxt+="</ext:personal_care>";
		}
				xmlTxt+="\n</ext:CDR>";
			}
			}

		if (this.Neuro_thinkingproblemSbool!=null){
			xmlTxt+="\n<ext:ThinkingProblem_S_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_thinkingproblemSbool;
			xmlTxt+="</ext:ThinkingProblem_S_Bool>";
		}
		if (this.Neuro_thinkingproblemCsBool!=null){
			xmlTxt+="\n<ext:ThinkingProblem_CS_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_thinkingproblemCsBool;
			xmlTxt+="</ext:ThinkingProblem_CS_Bool>";
		}
		if (this.Neuro_consmemoryproblemBool!=null){
			xmlTxt+="\n<ext:ConsMemoryProblem_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_consmemoryproblemBool;
			xmlTxt+="</ext:ConsMemoryProblem_Bool>";
		}
		if (this.Neuro_strokebool!=null){
			xmlTxt+="\n<ext:StrokeBool";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_strokebool;
			xmlTxt+="</ext:StrokeBool>";
		}
		if (this.Neuro_sxStrokeBool!=null){
			xmlTxt+="\n<ext:Sx_Stroke_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_sxStrokeBool;
			xmlTxt+="</ext:Sx_Stroke_Bool>";
		}
		if (this.Neuro_sxTiaBool!=null){
			xmlTxt+="\n<ext:Sx_Tia_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Neuro_sxTiaBool;
			xmlTxt+="</ext:Sx_Tia_Bool>";
		}
				xmlTxt+="\n</ext:Neuro>";
			}
			}

			var child2=0;
			var att2=0;
			if(this.Movement_spasticityBool!=null)
			child2++;
			if(this.Movement_gait!=null)
			child2++;
			if(this.Movement_bradykBool!=null)
			child2++;
			if(this.Movement_rigid!=null)
			child2++;
			if(this.Movement_abnormalgaitBool!=null)
			child2++;
			if(child2>0 || att2>0){
				xmlTxt+="\n<ext:Movement";
			if(child2==0){
				xmlTxt+="/>";
			}else{
				xmlTxt+=">";
		if (this.Movement_spasticityBool!=null){
			xmlTxt+="\n<ext:Spasticity_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Movement_spasticityBool;
			xmlTxt+="</ext:Spasticity_Bool>";
		}
		if (this.Movement_rigid!=null){
			xmlTxt+="\n<ext:Rigid";
			xmlTxt+=">";
			xmlTxt+=this.Movement_rigid;
			xmlTxt+="</ext:Rigid>";
		}
		if (this.Movement_bradykBool!=null){
			xmlTxt+="\n<ext:Bradyk_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Movement_bradykBool;
			xmlTxt+="</ext:Bradyk_Bool>";
		}
		if (this.Movement_gait!=null){
			xmlTxt+="\n<ext:Gait";
			xmlTxt+=">";
			xmlTxt+=this.Movement_gait;
			xmlTxt+="</ext:Gait>";
		}
		if (this.Movement_abnormalgaitBool!=null){
			xmlTxt+="\n<ext:AbnormalGait_Bool";
			xmlTxt+=">";
			xmlTxt+=this.Movement_abnormalgaitBool;
			xmlTxt+="</ext:AbnormalGait_Bool>";
		}
				xmlTxt+="\n</ext:Movement>";
			}
			}

		for(var MedicationCOUNT=0;MedicationCOUNT<this.Medication.length;MedicationCOUNT++){
			xmlTxt +="\n<ext:Medication";
			xmlTxt +=this.Medication[MedicationCOUNT].getXMLAtts();
			if(this.Medication[MedicationCOUNT].xsiType!="ext:clinicalAssessmentData_Medication"){
				xmlTxt+=" xsi:type=\"" + this.Medication[MedicationCOUNT].xsiType + "\"";
			}
			if (this.Medication[MedicationCOUNT].hasXMLBodyContent()){
				xmlTxt+=">";
				xmlTxt+=this.Medication[MedicationCOUNT].getXMLBody(preventComments);
					xmlTxt+="</ext:Medication>";
			}else {xmlTxt+="/>";}
		}
		if (this.Weight!=null){
			xmlTxt+="\n<ext:Weight";
			xmlTxt+=">";
			xmlTxt+=this.Weight;
			xmlTxt+="</ext:Weight>";
		}
		if (this.DiabetesBool!=null){
			xmlTxt+="\n<ext:Diabetes_Bool";
			xmlTxt+=">";
			xmlTxt+=this.DiabetesBool;
			xmlTxt+="</ext:Diabetes_Bool>";
		}
		if (this.HeartproblemsBool!=null){
			xmlTxt+="\n<ext:HeartProblems_Bool";
			xmlTxt+=">";
			xmlTxt+=this.HeartproblemsBool;
			xmlTxt+="</ext:HeartProblems_Bool>";
		}
		if (this.TobaccouseBool!=null){
			xmlTxt+="\n<ext:TobaccoUse_Bool";
			xmlTxt+=">";
			xmlTxt+=this.TobaccouseBool;
			xmlTxt+="</ext:TobaccoUse_Bool>";
		}
		return xmlTxt;
	}


	this.hasXMLComments=function(){
	}


	this.hasXMLBodyContent=function(){
		if(this.Diagnosis.length>0) return true;
		if (this.Bloodpressure_highbpCsBool!=null)
			return true;
		if (this.Bloodpressure_systolic!=null)
			return true;
		if (this.Bloodpressure_diastolic!=null)
			return true;
			if(this.Neuro_cdr_personalCare!=null) return true;
			if(this.Neuro_cdr_memory!=null) return true;
			if(this.Neuro_strokebool!=null) return true;
			if(this.Neuro_consmemoryproblemBool!=null) return true;
			if(this.Neuro_bdsc!=null) return true;
			if(this.Neuro_mmse!=null) return true;
			if(this.Neuro_cdr_judgmentProblemSolving!=null) return true;
			if(this.Neuro_sxStrokeBool!=null) return true;
			if(this.Neuro_cdr_orientation!=null) return true;
			if(this.Neuro_sbt!=null) return true;
			if(this.Neuro_cdr_homeHobbies!=null) return true;
			if(this.Neuro_sxTiaBool!=null) return true;
			if(this.Neuro_cdr_sumbox!=null) return true;
			if(this.Neuro_thinkingproblemCsBool!=null) return true;
			if(this.Neuro_cdr_communityAffairs!=null) return true;
			if(this.Neuro_thinkingproblemSbool!=null) return true;
			if(this.Neuro_cdr_rating!=null) return true;
			if(this.Movement_spasticityBool!=null) return true;
			if(this.Movement_gait!=null) return true;
			if(this.Movement_bradykBool!=null) return true;
			if(this.Movement_rigid!=null) return true;
			if(this.Movement_abnormalgaitBool!=null) return true;
		if(this.Medication.length>0) return true;
		if (this.Weight!=null) return true;
		if (this.DiabetesBool!=null) return true;
		if (this.HeartproblemsBool!=null) return true;
		if (this.TobaccouseBool!=null) return true;
		if(this.hasXMLComments())return true;
		if(this.extension.hasXMLBodyContent())return true;
		return false;
	}
}
