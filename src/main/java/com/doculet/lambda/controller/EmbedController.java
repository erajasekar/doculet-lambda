/*
 * Copyright 2018 Doculet.net
 */
package com.doculet.lambda.controller;



import com.doculet.lambda.model.oEmbedData;
import com.doculet.lambda.model.oEmbedError;
import com.doculet.lambda.support.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

/**
 * EmbedController - Controller class to support oEmbed API.
 *
 * @author Rajasekar Elango
 */
@RestController
@EnableWebMvc
public class EmbedController {

    private static Logger log = LoggerFactory.getLogger(EmbedController.class);

    @GET
    @RequestMapping(path = "/oembed", method = RequestMethod.GET)
    @Produces(MediaType.APPLICATION_JSON)
    public oEmbedData getoEmbed(@RequestParam("url") String url,
                                @RequestParam(value = "format", defaultValue = "json") String format,
                                @RequestParam(value = "maxwidth") Optional<Integer> maxWidth,
                                @RequestParam(value = "maxheight") Optional<Integer> maxHeight) {

        if (!format.equals("json")){
            // todo better error handling
            String msg = format + " is not supported";
            log.error("msg");
            throw new RuntimeException(msg);
        }
        return new oEmbedData(url, maxWidth, maxHeight);
    }
}
