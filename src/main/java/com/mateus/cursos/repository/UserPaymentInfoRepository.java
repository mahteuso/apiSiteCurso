package com.mateus.cursos.repository;

import com.mateus.cursos.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
