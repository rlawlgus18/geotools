/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2015, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.data.wfs.internal.v2_0;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.eclipse.emf.common.util.ECollections;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import net.opengis.wfs20.AbstractType;
import net.opengis.wfs20.FeatureTypeType;

/**
 * Test class for {@link FeatureTypeInfoImpl}.
 *
 * @author Jan Venstermans
 */
public class FeatureTypeInfoImplTest {

    private FeatureTypeType fttMock;

    private FeatureTypeInfoImpl featureType;

    @Before
    public void setup() {
        // mock featureType
        fttMock = Mockito.mock(FeatureTypeType.class);
        featureType = new FeatureTypeInfoImpl(fttMock);
    }

    // One parameter, no view params, no mappings => no parameters
    @Test
    public void testGetAbstractWhenFeatureTypeTypeAbstractIsEmpty() {
        when(fttMock.getAbstract()).thenReturn(ECollections.<AbstractType> emptyEList());
        String abstractExpected = "";

        String abstractResult = featureType.getAbstract();

        assertEquals(abstractExpected, abstractResult);
    }

}
