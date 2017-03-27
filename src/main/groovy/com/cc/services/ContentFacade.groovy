package com.cc.services

import com.cc.domain.Content
import com.cc.repository.ContentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ContentFacade {
    @Autowired
    ContentRepository contentRepository

    void insertContent(Content content) {
        contentRepository.save(content)
    }

    Content getContent(String contentType) {
        contentRepository.findByContentType(contentType)
    }

    List<Content> getAllContent() {
        contentRepository.findAll()
    }

}
