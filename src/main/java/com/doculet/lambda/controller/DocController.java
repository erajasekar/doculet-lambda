/*
 * Copyright 2018 Doculet.net
 */
package com.doculet.lambda.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.ws.rs.Produces;


/**
 * DocController - Controller class sharing doculet doc.
 */
@RestController
@EnableWebMvc
public class DocController {

    @RequestMapping(path = "/doc/{docId}", method = RequestMethod.GET)
    @Produces("text/html")
    public String getoEmbed(@PathVariable("docId") String docId) {
        return  "<html>\n" +
                "    <head>\n" +
                "        <link href=\"/css/idea.css\" rel=\"stylesheet\">\n" +
                "        <link href=\"/css/colony.css\" rel=\"stylesheet\">\n" +
                "        <link rel=\"alternate\" type=\"application/json+oembed\" href=\"https://doculet.net/doc/15d05096e7076183d74469ed32ba234f\" title=\"Doculet\">\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>Your Title</h1>\n" +
                "<div class=\"paragraph\">\n" +
                "<p>Start writing&#8230;&#8203;.</p>\n" +
                "</div>\n" +
                "<div class=\"paragraph\">\n" +
                "<p>Here is a code example to get you started.</p>\n" +
                "</div>\n" +
                "<div class=\"listingblock\">\n" +
                "<div class=\"title\">find_max.py</div>\n" +
                "<div class=\"content\">\n" +
                "<pre class=\"highlightjs highlight\"><code class=\"language-python hljs\" data-lang=\"python\">numbers = [10,50,20,30,100,60]\n" +
                "maxValue = 0  <i class=\"conum\" data-value=\"1\"></i><b>(1)</b>\n" +
                "for n in numbers:\n" +
                "    if n &gt; maxValue: <i class=\"conum\" data-value=\"2\"></i><b>(2)</b>\n" +
                "        maxValue = n\n" +
                "\n" +
                "print(\"Max is : \" + str(maxValue)) <i class=\"conum\" data-value=\"3\"></i><b>(3)</b></code></pre>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div class=\"colist arabic\">\n" +
                "<table>\n" +
                "<tr>\n" +
                "<td><i class=\"conum\" data-value=\"1\"></i><b>1</b></td>\n" +
                "<td>Initialize maxValue to smallest value</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><i class=\"conum\" data-value=\"2\"></i><b>2</b></td>\n" +
                "<td>If current number is greater than maxValue, update maxValut to current.</td>\n" +
                "</tr>\n" +
                "<tr>\n" +
                "<td><i class=\"conum\" data-value=\"3\"></i><b>3</b></td>\n" +
                "<td>Prints 100.</td>\n" +
                "</tr>\n" +
                "</table>\n" +
                "</div>\n" +
                "    </body>\n" +
                "</html>\n";
    }

}
