package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

public class OptionsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("label")
	private String label;

	@SerializedName("value")
	private int value;

	@SerializedName("selected")
	private boolean selected;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public void setSelected(boolean selected){
		this.selected = selected;
	}

	public boolean isSelected(){
		return selected;
	}

	@Override
 	public String toString(){
		return 
			"OptionsItem{" + 
			"name = '" + name + '\'' + 
			",label = '" + label + '\'' + 
			",value = '" + value + '\'' + 
			",selected = '" + selected + '\'' + 
			"}";
		}
}