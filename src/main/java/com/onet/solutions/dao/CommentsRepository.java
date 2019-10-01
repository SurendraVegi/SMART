package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long>{

}
