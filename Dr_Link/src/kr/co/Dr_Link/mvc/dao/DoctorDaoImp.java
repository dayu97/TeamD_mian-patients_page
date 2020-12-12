package kr.co.Dr_Link.mvc.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.Dr_Link.mvc.dto.DoctorDTO;
import kr.co.Dr_Link.mvc.dto.PrescriptionDTO;

@Repository("DoctorDaoInter")
public class DoctorDaoImp implements DoctorDaoInter {
	
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public DoctorDTO doctor_profile(DoctorDTO vo) {
		System.out.println("===> ss doctor_profile() 실행");
		return ss.selectOne("doctor.doctor_profile",vo);
	}



}
