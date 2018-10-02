/*
 * Copyright 2018 Doculet.net
 */
package com.doculet.lambda.controller;



import com.doculet.lambda.model.oEmbedData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * EmbedController - Controller class to support oEmbed API.
 *
 * @author Rajasekar Elango
 */
@RestController
@EnableWebMvc
public class EmbedController {

    @RequestMapping(path = "/oEmbed", method = RequestMethod.GET)
    public oEmbedData getoEmbed(@RequestParam("url") String url) {
        return new oEmbedData(url);
    }

}
