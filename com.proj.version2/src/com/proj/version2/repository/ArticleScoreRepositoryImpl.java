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

import com.proj.version2.model.ArticleScore;
import com.proj.version2.model.PlatformScore;
import com.proj.version2.model.UserSource;

public class ArticleScoreRepositoryImpl {
	@PersistenceContext
	private EntityManager entityManager;
	
	public static String getPastDate(int past) {  
	       Calendar calendar = Calendar.getInstance();  
	       calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - past);  
	       Date today = calendar.getTime();  
	       SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
	       String result = format.format(today);  
	       return result;  
	   }  
	
	@Transactional
	public List<ArticleScore> findSource(Integer period, Integer id, Integer source){
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String currDate = ft.format(new Date()).toString();
		String bfrDate = getPastDate(period-1);
		
		//select * from platform_score where (userId=1020) and (sourceId=2)and (time between bfrDate and currDate); 
		String queryString = "select art from ArticleScore art where (art.userId=?1) and (art.sourceId=?2) and (art.time between '" 
							+ bfrDate + "' and '"+ currDate+"')";
		Query query = entityManager.createQuery(queryString);
		
		query.setParameter(1, id);
		query.setParameter(2, source);
		
		List list = query.getResultList();
		List<ArticleScore> res = new ArrayList<ArticleScore>();
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				ArticleScore p = (ArticleScore)list.get(i);
				res.add(p);
			}
		}
		
		return res;
	}
	
	@Transactional
	public List<ArticleScore> findSourceNoId(Integer period, Integer source){
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String currDate = ft.format(new Date()).toString();
		String bfrDate = getPastDate(period-1);
		
		//select * from platform_score where (userId=1020) and (sourceId=2)and (time between bfrDate and currDate); 
		String queryString = "select art from ArticleScore art where(art.sourceId=?1) and (art.time between '" 
							+ bfrDate + "' and '"+ currDate+"')";
		Query query = entityManager.createQuery(queryString);
		
		query.setParameter(1, source);
		
		List list = query.getResultList();
		List<ArticleScore> res = new ArrayList<ArticleScore>();
		
		System.out.println(list.size());
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				ArticleScore p = (ArticleScore)list.get(i);
				res.add(p);
			}
		}
		
		return res;
	}
	
	@Transactional
	public List<ArticleScore> findSourceNoPeriod(Integer id, Integer source){
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String currDate = ft.format(new Date()).toString();
		
		//select * from platform_score where (userId=1020) and (sourceId=2)and (time between bfrDate and currDate); 
		String queryString = "select art from ArticleScore art where (art.userId=?1) and (art.sourceId=?2) and (art.time between '" 
				+ currDate + "' and '"+ currDate+"')";
		Query query = entityManager.createQuery(queryString);
		
		query.setParameter(1, id);
		query.setParameter(2, source);
		
		List list = query.getResultList();
		List<ArticleScore> res = new ArrayList<ArticleScore>();
		
		if(list != null) {
			for(int i = 0; i < list.size(); i++) {
				ArticleScore p = (ArticleScore)list.get(i);
				res.add(p);
			}
		}
		
		return res;
	}
}
