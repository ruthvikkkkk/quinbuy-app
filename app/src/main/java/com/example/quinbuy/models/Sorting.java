package com.example.quinbuy.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Sorting{

	@SerializedName("parameter")
	private String parameter;

	@SerializedName("options")
	private List<OptionsItem> options;

	public void setParameter(String parameter){
		this.parameter = parameter;
	}

	public String getParameter(){
		return parameter;
	}

	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	public List<OptionsItem> getOptions(){
		return options;
	}

	@Override
 	public String toString(){
		return 
			"Sorting{" + 
			"parameter = '" + parameter + '\'' + 
			",options = '" + options + '\'' + 
			"}";
		}
}