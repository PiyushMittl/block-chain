package com.piyush.app.blockchain;

import java.util.Date;

public class Block {

	public int		index;
	public String	timeStamp;
	public Data		data;
	public String	hash;
	public String	previousHash;

	public Block(Data data) {

		this.timeStamp = ""+new Date().getTime();
		this.data = data;

	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	@Override
	public String toString() {
		return "hash " + this.getHash() + "\n" + "previous hash " + this.getPreviousHash() + "\n" + "data " + this.data.toString() + "" + "\n";
	}

}
