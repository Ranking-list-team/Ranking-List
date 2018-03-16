package com.proj.version2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.mysql.jdbc.log.Log;
import com.proj.version2.model.PlatformScore;

public class PlatformScoreRepositoryImpl{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(PlatformScore platformScore) {
		entityManager.persist(platformScore);

	}
	
	private static String getPastDate(int past) {  
	       Calendar calendar = Calendar.getInstance();  
	       calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);  
	       Date today = calendar.getTime();  
	       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
	       String result = format.format(today);  
	       return result;  
	   }  
	
	@Transactional
	public List<PlatformScore> findSource(Integer sourceId, Integer period, Integer userId) {
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String currDate = ft.format(new Date()).toString();
		String bfrDate = getPastDate(period-1);
		
		//select * from platform_score where (userId=1020) and (sourceId=2)and (time between bfrDate and currDate); 
		String queryString = "select plt from PlatformScore plt where (plt.userId=:uid) and (plt.sourceId=:sid) and (plt.time between" + bfrDate + "and" + currDate + ")";
		Query query = entityManager.createQuery(queryString);
		
		query.setParameter("uid", userId);
		query.setParameter("sid", sourceId);
		
		List list = query.getResultList();
		
		System.out.println(list.size());
		return null;
	}
	
}
