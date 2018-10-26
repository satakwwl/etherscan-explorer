package me.bing.web3j.app.service.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

/**
 * Created by tangjc on 2018/10/22.
 */
public class JsonHelper
{
    public static String parser(Object object)
    {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        try
        {
            String json = ow.writeValueAsString(object);
            return json;
        } catch (JsonProcessingException e)
        {
            e.printStackTrace();
            return null;
        }
    }

}
