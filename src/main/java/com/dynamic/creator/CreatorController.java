package com.dynamic.creator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

/**
 * Created by nuhma on 2017-07-03.
 */
@RestController
@CrossOrigin
public class CreatorController {

    private static Logger LOG = LoggerFactory.getLogger(CreatorController.class);

    @SuppressWarnings("serial")
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException extends RuntimeException{

    }

    @Autowired
    private CreatorService creatorService;

    @RequestMapping(path = "/createClass", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CreatorResponse createClass(@RequestBody @Valid CreateClassRequest createClassRequest){

        return creatorService.createClass(createClassRequest);

    }



}
