package com.www.yyh.service.impl;

import com.www.yyh.dao.PersonDao;
import com.www.yyh.entity.Person;
import com.www.yyh.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao personDao;

    @Override
    public List<Person> getPersonList() {
        return personDao.getPersonList();
    }
}
