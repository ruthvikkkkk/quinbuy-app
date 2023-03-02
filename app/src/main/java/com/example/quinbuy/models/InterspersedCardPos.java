package com.example.quinbuy.models;

import com.google.gson.annotations.SerializedName;

public class InterspersedCardPos{

	@SerializedName("Lokasi toko")
	private int lokasiToko;

	@SerializedName("RAM")
	private int rAM;

	public void setLokasiToko(int lokasiToko){
		this.lokasiToko = lokasiToko;
	}

	public int getLokasiToko(){
		return lokasiToko;
	}

	public void setRAM(int rAM){
		this.rAM = rAM;
	}

	public int getRAM(){
		return rAM;
	}

	@Override
 	public String toString(){
		return 
			"InterspersedCardPos{" + 
			"lokasi toko = '" + lokasiToko + '\'' + 
			",rAM = '" + rAM + '\'' + 
			"}";
		}
}