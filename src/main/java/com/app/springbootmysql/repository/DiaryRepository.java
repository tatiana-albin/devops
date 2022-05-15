package com.app.springbootmysql.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.transaction.annotation.Transactional;

import com.app.springbootmysql.domain.DiaryEntry;

@Transactional
@RepositoryRestResource(collectionResourceRel = "entry", path = "diary")
public interface DiaryRepository extends JpaRepository<DiaryEntry, Long> { 

	List<DiaryEntry> findByCreatedAfter(@Param("after") @DateTimeFormat(iso = ISO.DATE) Date date);
	List<DiaryEntry> findByCreatedBetween(@Param("after") @DateTimeFormat(iso = ISO.DATE) Date after,@Param("before") @DateTimeFormat(iso = ISO.DATE) Date before);
	List<DiaryEntry> findByTitleContaining(@Param("word") String word);
	List<DiaryEntry> findBySummaryContaining(@Param("word") String word);
	
}
