package kr.co.Dr_Link.mvc.dto;

public class PrescriptionDTO {
	private int dep_num;
	private int medicine_num;
	private int treatment_num;
	private String [] dosage;
	private String [] quantity;
	private String [] days;
	private String payment_check;
	
	public int getDep_num() {
		return dep_num;
	}
	public void setDosage(String [] dosage) {
		this.dosage = dosage;
	}
	public void setQuantity(String [] quantity) {
		this.quantity = quantity;
	}
	public String[] getDosage() {
		return dosage;
	}
	public String[] getQuantity() {
		return quantity;
	}
	public String[] getDays() {
		return days;
	}
	public void setDays(String [] days) {
		this.days = days;
	}
	public void setDep_num(int dep_num) {
		this.dep_num = dep_num;
	}
	public int getMedicine_num() {
		return medicine_num;
	}
	public void setMedicine_num(int medicine_num) {
		this.medicine_num = medicine_num;
	}
	public int getTreatment_num() {
		return treatment_num;
	}
	public void setTreatment_num(int treatment_num) {
		this.treatment_num = treatment_num;
	}
	
	public String getPayment_check() {
		return payment_check;
	}
	public void setPayment_check(String payment_check) {
		this.payment_check = payment_check;
	}
	


}
