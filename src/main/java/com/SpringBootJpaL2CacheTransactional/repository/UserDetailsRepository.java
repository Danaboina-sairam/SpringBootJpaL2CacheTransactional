package com.SpringBootJpaL2CacheTransactional.repository;

import com.SpringBootJpaL2CacheTransactional.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {

}
