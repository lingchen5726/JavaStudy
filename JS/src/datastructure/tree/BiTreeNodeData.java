package datastructure.tree;

public class BiTreeNodeData {
	int idata = 0;
	String strData = "";
	
	public BiTreeNodeData(int data) {
		this.idata = data;
	}

	public BiTreeNodeData(String data) {
		this.strData = data;
	}

	public int getIdata() {
		return idata;
	}

	public void setIdata(int idata) {
		this.idata = idata;
	}

	public String getStrData() {
		return strData;
	}

	public void setStrData(String strData) {
		this.strData = strData;
	}

	public void show() {
		if (this.idata>0) {
			System.out.println("Int: "+this.idata); 
		} else if(!"".equalsIgnoreCase(this.strData)) {
			System.out.println("String "+this.strData);
		}
	}
}
