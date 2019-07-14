package com.daniel.baseline.util;

import com.daniel.baseline.model.Identifiable;

/**
 * Test entity generation functions for unit tests.
 *
 * @author jong
 *
 */
public class TestEntities {

    public static final Long ID1 = 1L;
    public static final Long ID2 = 2L;
    public static final Long ID3 = 3L;
    public static final Long ID4 = 4L;

    /**
     * Function to get entity by id.
     * @param id
     *          Id for entity requested.
     * @return Identifiable
     */
    public static Identifiable getEntity(String id) {
        return new Identifiable();
    }
}

