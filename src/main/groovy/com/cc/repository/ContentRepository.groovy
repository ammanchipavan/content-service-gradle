package com.cc.repository

import com.cc.domain.Content
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface ContentRepository extends MongoRepository<Content, Long>{

    Content findByContentType(String contentType)

    Content insert(Content content)

    List<Content> findAll()
}
