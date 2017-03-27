package com.cc.resource

import com.cc.domain.Content
import com.cc.services.ContentFacade
import org.codehaus.jettison.json.JSONObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("content-service/content")
class ContentResource {

    @Autowired
    ContentFacade contentFacade

    @RequestMapping(value = "/{type}", method = RequestMethod.GET)
    public @ResponseBody Content getContentByType(@PathVariable("type")String type){
        contentFacade.getContent(type);
    }

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public @ResponseBody List<Content> getContents(){
        contentFacade.getAllContent();
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Content saveContent(@RequestBody Content content){
        contentFacade.insertContent(content)
    }

}
