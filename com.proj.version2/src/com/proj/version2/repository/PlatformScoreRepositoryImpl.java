package com.proj.version2.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.proj.version2.model.PlatformScore;


public class PlatformScoreRepositoryImpl {
	@PersistenceContext
	private EntityManager entityManager;
	
	public static String getPastDate(int past) {  
	       Calendar calendar = Calendar.getInstance();  
	       calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);  
	       Date today = calendar.getTime();  
	       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
	       String result = format.format(today);  
	       System.out.println(result);
	       return result;  
	   }  
	
	@Transactional
	public List<PlatformScore> findSource(Integer period, Integer id, Integer source) {
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String currDate = ft.format(new Date()).toString();
		String bfrDate = getPastDate(period-1);
		
		//select * from platform_score where (userId=1020) and (sourceId=2)and (time between bfrDate and currDate); 
		String queryString = "select plt from PlatformScore plt where (plt.userId=?1) and (plt.sourceId=?2) and (plt.time between '" 
							+ bfrDate + "' and '"+ currDate+"')";
		Query query = entityManager.createQuery(queryString);
		
		System.out.println(query.toString());
		
		query.setParameter(1, id);
		query.setParameter(2, source);
		
		List list = query.getResultList();
		List<PlatformScore> res = new ArrayList<PlatformScore>();
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				PlatformScore p = (PlatformScore)list.get(i);
				res.add(p);
			}
		}
		
		return res;
		
	}
	
	@Transactional
	public List<PlatformScore> findSourceNoId(Integer period, Integer source) {
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String currDate = ft.format(new Date()).toString();
		String bfrDate = getPastDate(period-1);
		
		//select * from platform_score where (userId=1020) and (sourceId=2)and (time between bfrDate and currDate); 
		String queryString = "select plt from PlatformScore plt where (plt.sourceId=?1) and (plt.time between '" 
							+ bfrDate + "' and '"+ currDate+"')";
		Query query = entityManager.createQuery(queryString);
		
		query.setParameter(1, source);
		
		List list = query.getResultList();
		List<PlatformScore> res = new ArrayList<PlatformScore>();
		
		System.out.println(list.size());
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				PlatformScore p = (PlatformScore)list.get(i);
				res.add(p);
			}
		}
		
		return res;
		
	}
}
