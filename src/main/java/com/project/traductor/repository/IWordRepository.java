package com.project.traductor.repository;

import com.project.traductor.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWordRepository extends JpaRepository<Word, Long> {
}
