package com.daomy.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.daomy.dao.NewsRepository;
import com.daomy.model.News;

@Service
@Transactional
public class NewsService {
	
	private final NewsRepository newsRepository;
	
	public NewsService(NewsRepository newsRepository) {
		this.newsRepository = newsRepository;
	}
	
	public List<News> findAll(){
		List<News> news=new ArrayList<News>();
		for(News new_s:newsRepository.findAll()){
			news.add(new_s);
		}
		return news;
	}
	public News findNews(int id){
		return newsRepository.findOne(id);
	}
	
	public void save(News news){
		newsRepository.save(news);
	}

	public void delete(int id){
		newsRepository.delete(id);
	}
}
