package kr.co.Dr_Link.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.Dr_Link.mvc.dto.DoctorDTO;


@Repository("PatientDaoInter")
public class PatientDaoImp implements PatientDaoInter{


	@Autowired
	private SqlSessionTemplate ss;



}
