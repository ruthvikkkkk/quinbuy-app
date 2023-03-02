package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

public class TrackerFields{

	@SerializedName("is_ner_eligible")
	private String isNerEligible;

	@SerializedName("group_type")
	private String groupType;

	@SerializedName("sales_velocity_components")
	private String salesVelocityComponents;

	public void setIsNerEligible(String isNerEligible){
		this.isNerEligible = isNerEligible;
	}

	public String getIsNerEligible(){
		return isNerEligible;
	}

	public void setGroupType(String groupType){
		this.groupType = groupType;
	}

	public String getGroupType(){
		return groupType;
	}

	public void setSalesVelocityComponents(String salesVelocityComponents){
		this.salesVelocityComponents = salesVelocityComponents;
	}

	public String getSalesVelocityComponents(){
		return salesVelocityComponents;
	}

	@Override
 	public String toString(){
		return 
			"TrackerFields{" + 
			"is_ner_eligible = '" + isNerEligible + '\'' + 
			",group_type = '" + groupType + '\'' + 
			",sales_velocity_components = '" + salesVelocityComponents + '\'' + 
			"}";
		}
}