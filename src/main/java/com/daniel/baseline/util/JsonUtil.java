package com.daniel.baseline.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Helper class to convert between JSONs and POJOs.
 *
 */
public class JsonUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String toJsonString(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    /**
     * Function to convert object to Json string.
     * @param object
     *              Object to be converted
     * @return Json string
     */
    public static String getJsonString(Object object) {
        try {
            return toJsonString(object);
        } catch (JsonProcessingException e) {
            return "";
        }
    }

}
