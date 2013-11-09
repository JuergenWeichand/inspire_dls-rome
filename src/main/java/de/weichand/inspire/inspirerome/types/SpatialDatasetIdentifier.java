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
package de.weichand.inspire.inspirerome.types;

import com.sun.syndication.feed.impl.EqualsBean;
import com.sun.syndication.feed.impl.ToStringBean;
import java.io.Serializable;

/**
 * SpatialDatasetIdentifier Type
 * 
 * @version 1.0
 * @author Juergen Weichand <juergen@weichand.de>
 */
public class SpatialDatasetIdentifier implements Serializable {
    
    private String code;
    private String namespace;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    
    @Override
    public String toString() {
        final ToStringBean tsBean = new ToStringBean(SpatialDatasetIdentifier.class, this);

        return tsBean.toString();
    }

    @Override
    public boolean equals(final Object obj) {
        final EqualsBean eBean = new EqualsBean(SpatialDatasetIdentifier.class, this);

        return eBean.beanEquals(obj);
    }

    @Override
    public int hashCode() {
        final EqualsBean equals = new EqualsBean(SpatialDatasetIdentifier.class, this);

        return equals.beanHashCode();
    }    
    
}
