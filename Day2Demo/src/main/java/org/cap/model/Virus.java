package org.cap.model;

public class Virus {
	public int eff_no;
	public int vir_id;
	public Virus(int eff_no, int vir_id) {
		super();
		this.eff_no = eff_no;
		this.vir_id = vir_id;
	}
	public int getEff_no() {
		return eff_no;
	}
	public void setEff_no(int eff_no) {
		this.eff_no = eff_no;
	}
	public int getVir_id() {
		return vir_id;
	}
	public void setVir_id(int vir_id) {
		this.vir_id = vir_id;
	}

}
