package org.cap.model;

public class Updates {
	public int up_id;
	public int up_no;
	public Updates(int up_id, int up_no) {
		super();
		this.up_id = up_id;
		this.up_no = up_no;
	}
	public int getUp_id() {
		return up_id;
	}
	public void setUp_id(int up_id) {
		this.up_id = up_id;
	}
	public int getUp_no() {
		return up_no;
	}
	public void setUp_no(int up_no) {
		this.up_no = up_no;
	}
	

}
