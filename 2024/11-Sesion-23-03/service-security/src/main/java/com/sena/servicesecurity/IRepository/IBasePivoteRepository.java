package com.sena.servicesecurity.IRepository;


import com.sena.servicesecurity.Entity.ABaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface IBasePivoteRepository<T, ID> extends JpaRepository<T, Long>{

}
