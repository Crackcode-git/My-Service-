package com.libraray.dao;

import com.libraray.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LibraryRepo {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(Library library) {
        mongoTemplate.save(library);
    }

}
