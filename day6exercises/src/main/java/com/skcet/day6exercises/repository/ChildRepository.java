package com.skcet.day6exercises.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skcet.day6exercises.entity.ChildEntity;
@Repository
public interface ChildRepository extends JpaRepository<ChildEntity,Integer> {

}
