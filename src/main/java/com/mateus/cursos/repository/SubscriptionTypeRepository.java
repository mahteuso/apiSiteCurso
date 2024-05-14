package com.mateus.cursos.repository;

import com.mateus.cursos.model.SubscriptionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType, Long> {
}
