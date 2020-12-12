package kr.co.Dr_Link.mvc.dto;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

/*

create table doctor (   -- �ǻ�
    doctor_num number(4) CONSTRAINT doctor_num_pk primary key,
    d_id varchar2(20) not null,
    d_pwd varchar2(20) not null,
    d_name varchar2(10) not null,
    d_jumin_num char(13) not null,
    d_phone_num char(13) not null,
    d_address varchar2(60) not null,
    d_email varchar2(30) not null,
    d_graduation varchar2(150) not null,
    d_career varchar2(200),
    d_licence varchar2(100),
    d_photo varchar2(50),
    d_regdate date default sysdate 
);

*/

public class DoctorDTO {
	private int doctor_num;
	private String d_id;
	private String d_pwd;
	private String d_name;
	private String d_jumin_num;
	private String d_phone_num;
	private String d_address;
	private String d_email;
	private String d_graduation;
	private String d_career;
	private String d_licence;
	private String d_photo;
	private MultipartFile file;
	
	
	public int getDoctor_num() {
		return doctor_num;
	}
	public void setDoctor_num(int doctor_num) {
		this.doctor_num = doctor_num;
	}
	public String getD_id() {
		return d_id;
	}
	public void setD_id(String d_id) {
		this.d_id = d_id;
	}
	public String getD_pwd() {
		return d_pwd;
	}
	public void setD_pwd(String d_pwd) {
		this.d_pwd = d_pwd;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_jumin_num() {
		return d_jumin_num;
	}
	public void setD_jumin_num(String d_jumin_num) {
		this.d_jumin_num = d_jumin_num;
	}
	public String getD_phone_num() {
		return d_phone_num;
	}
	public void setD_phone_num(String d_phone_num) {
		this.d_phone_num = d_phone_num;
	}
	public String getD_address() {
		return d_address;
	}
	public void setD_address(String d_address) {
		this.d_address = d_address;
	}
	public String getD_email() {
		return d_email;
	}
	public void setD_email(String d_email) {
		this.d_email = d_email;
	}
	public String getD_graduation() {
		return d_graduation;
	}
	public void setD_graduation(String d_graduation) {
		this.d_graduation = d_graduation;
	}
	public String getD_career() {
		return d_career;
	}
	public void setD_career(String d_career) {
		this.d_career = d_career;
	}
	public String getD_licence() {
		return d_licence;
	}
	public void setD_licence(String d_licence) {
		this.d_licence = d_licence;
	}
	public String getD_photo() {
		return d_photo;
	}
	public void setD_photo(String d_photo) {
		this.d_photo = d_photo;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
		
		// ���ε� ���� ����
		if(! file.isEmpty()){
			this.d_photo = file.getOriginalFilename();
			//this.b_fsize = file.getSize();
			
			//***********************************************
			// �ش� ��η� ����
			File f = new File("C:\\Users\\kosmo_01\\Desktop\\��������\\practice_1207\\Dr_Link\\webapp\\resources\\img\\doctor-profile\\"+d_photo);
			
			try {
				file.transferTo(f);
				
			} catch (IllegalStateException e) {				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	

	


}
