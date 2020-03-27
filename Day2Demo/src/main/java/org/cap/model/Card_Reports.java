package org.cap.model;

public class Card_Reports {
	public int card_id;
	public int report_id;
	public int getCard_id() {
		return card_id;
	}
	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}
	public int getReport_id() {
		return report_id;
	}
	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}
	public Card_Reports(int card_id, int report_id) {
		super();
		this.card_id = card_id;
		this.report_id = report_id;
	}

}
