package com.ab.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import com.ab.model.WebServiceModel;

@Transactional
public interface WebServiceRepository extends JpaRepository<WebServiceModel, Integer> {

	@Modifying
	@Query(value = "update web_service_model set uname = ?, umail = ?, upassword = ? where uid = ?", nativeQuery = true)
	int updateRecordById(String uname, String umail, String password, int id);
	
	Optional<WebServiceModel> findByumail(String umail);
}
