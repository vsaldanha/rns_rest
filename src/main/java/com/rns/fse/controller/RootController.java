package com.rns.fse.controller;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rns.fse.pojo.ApiResponse;

import static com.rns.fse.constant.Parameter.FILTER_BY;


@RestController
@RequestMapping(value = "/rns/fse")
public class RootController {
	
	/**
     * test by echo message.
     * @return String
     */
    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return str;
    }
    
    /**
  * Fetch product information from Product collection
  * @param fetchBy
  * @return
  * @throws IOException
  */
 @RequestMapping(value = "/fetch", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
 ApiResponse fetch(
         @RequestParam(value = FILTER_BY, required = false, defaultValue = "ALL") String fetchBy)
         throws IOException {
     return null;
 }

}
