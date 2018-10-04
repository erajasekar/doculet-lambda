/*
 * Copyright 2018 Doculet.net
 */
package com.doculet.lambda.controller;



import com.doculet.lambda.model.oEmbedData;
import com.doculet.lambda.model.oEmbedError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * EmbedController - Controller class to support oEmbed API.
 *
 * @author Rajasekar Elango
 */
@RestController
@EnableWebMvc
public class EmbedController {

    @GET
    @RequestMapping(path = "/oembed", method = RequestMethod.GET)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getoEmbed(@RequestParam("url") String url, @RequestParam(value = "format", defaultValue = "json") String format) {

        if (!format.equals("json")){
            return Response.serverError().entity(new oEmbedError("Only json format is supported")).build();
        }
        return Response.status(Response.Status.OK).entity(new oEmbedData(url)).build();
    }
}
