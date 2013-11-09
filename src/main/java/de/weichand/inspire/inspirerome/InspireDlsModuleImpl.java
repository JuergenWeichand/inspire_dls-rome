/*
 * Copyright 2013 by Juergen Weichand
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.weichand.inspire.inspirerome;

import com.sun.syndication.feed.impl.EqualsBean;
import com.sun.syndication.feed.impl.ToStringBean;
import de.weichand.inspire.inspirerome.types.SpatialDatasetIdentifier;

/**
 * INSPIRE_DLS-Module Implementation
 * 
 * @version 1.0
 * @author Juergen Weichand <juergen@weichand.de>
 */
public class InspireDlsModuleImpl implements InspireDlsModule {

    private SpatialDatasetIdentifier spatialDatasetIdentifier;
    
    @Override
    public SpatialDatasetIdentifier getSpatialDatasetIdentifier() {        
        return spatialDatasetIdentifier;
    }

    @Override
    public void setSpatialDatasetIdentifier(SpatialDatasetIdentifier spatialDatasetIdentifier) {
        this.spatialDatasetIdentifier = spatialDatasetIdentifier;
    }

    @Override
    public String getUri() {
        return InspireDlsModule.URI;
    }


    @Override
    public Class getInterface() {
        return InspireDlsModule.class;
    }

    @Override
    public Object clone() {
        final InspireDlsModuleImpl inspireDlsModuleImpl = new InspireDlsModuleImpl();
        inspireDlsModuleImpl.copyFrom(this);
        return inspireDlsModuleImpl;
    }
    
    @Override
    public String toString() {
        final ToStringBean toStringBean = new ToStringBean(InspireDlsModuleImpl.class, this);
        return toStringBean.toString();
    }

    @Override
    public boolean equals(final Object obj) {
        final EqualsBean equalsBean = new EqualsBean(InspireDlsModuleImpl.class, this);
        return equalsBean.beanEquals(obj);
    }

    @Override
    public int hashCode() {
        final EqualsBean equalsBean = new EqualsBean(InspireDlsModuleImpl.class, this);
        return equalsBean.beanHashCode();
    }        

    public void copyFrom(Object object) {
        final InspireDlsModule source = (InspireDlsModule) object;
        setSpatialDatasetIdentifier(source.getSpatialDatasetIdentifier());
    }
}
