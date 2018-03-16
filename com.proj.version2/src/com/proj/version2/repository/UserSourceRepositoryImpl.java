package com.proj.version2.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.proj.version2.model.UserSource;

public class UserSourceRepositoryImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Transactional
	public List<UserSource> findSource(Integer id, Integer source){
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String currDate = ft.format(new Date()).toString();
		
		//select * from platform_score where (userId=1020) and (sourceId=2)and (time between bfrDate and currDate); 
		String queryString = "select us from UserSource us where (us.userId=?1) and (us.sourceId=?2) and (us.time between '" + currDate + "' and '"+ currDate+"')";
		Query query = entityManager.createQuery(queryString);
		
		query.setParameter(1, id);
		query.setParameter(2, source);
		query.setParameter(3, currDate);
		
		List list = query.getResultList();
		List<UserSource> res = new ArrayList<UserSource>();
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				UserSource p = (UserSource)list.get(i);
				res.add(p);
			}
		}
		
		return res;
		
	}
}
