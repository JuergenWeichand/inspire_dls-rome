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
import com.rometools.rome.feed.module.Module;
import de.weichand.inspire.inspirerome.types.SpatialDatasetIdentifier;

/**
 * INSPIRE_DLS-Module Interface
 * 
 * @version 1.0
 * @author Juergen Weichand <juergen@weichand.de>
 */
public interface InspireDlsModule extends Module {
    
    public static final String URI = "http://inspire.ec.europa.eu/schemas/inspire_dls/1.0";
    
    public SpatialDatasetIdentifier getSpatialDatasetIdentifier();
    
    public void setSpatialDatasetIdentifier(SpatialDatasetIdentifier spatialDatasetIdentifier);
       
}
