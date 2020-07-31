package com.www.yyh.dao;
import com.www.yyh.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends MongoRepository<User, Long> {

    User findByPersonNo(@Param("personNo") String personNo);

}