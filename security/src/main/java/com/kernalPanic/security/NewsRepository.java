package com.kernalPanic.security;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NewsRepository extends MongoRepository<NewsArticle, ObjectId> {
}
