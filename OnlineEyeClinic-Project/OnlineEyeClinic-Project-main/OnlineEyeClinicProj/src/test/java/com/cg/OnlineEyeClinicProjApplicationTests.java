package com.cg;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import javax.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.dao.IDoctorRepo;



@SpringBootTest
@Transactional
class OnlineEyeClinicProjApplicationTests {


    @Autowired
    IDoctorRepo repo;
    @Test
    public void testDoctorId() {
    	int id=18;
    	assertNotNull(repo.findById(id).get());
    	
    }
    @Test
    public void testDoctorGet() {
    	assertNotNull(repo.findAll());
    }
    
    
	
}

