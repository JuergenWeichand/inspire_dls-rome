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
package de.weichand.inspire.inspirerome.io;

import com.rometools.rome.feed.module.Module;
import com.rometools.rome.io.ModuleParser;
import de.weichand.inspire.inspirerome.InspireDlsModule;
import de.weichand.inspire.inspirerome.InspireDlsModuleImpl;
import de.weichand.inspire.inspirerome.types.SpatialDatasetIdentifier;
import java.util.Locale;
import org.jdom2.Element;
import org.jdom2.Namespace;

/**
 * Parser for inspire_dls Elements
 * 
 * @version 1.0
 * @author Juergen Weichand <juergen@weichand.de>
 */
public class InspireDlsModuleParser implements ModuleParser {

    private static final Namespace NS = Namespace.getNamespace("inspire_dls", InspireDlsModule.URI);

    @Override
    public String getNamespaceUri() {
        return InspireDlsModule.URI;
    }

    public Module parse(Element element, Locale locale) {

        final InspireDlsModuleImpl inspireDlsModuleImpl = new InspireDlsModuleImpl();
        final SpatialDatasetIdentifier spatialDatasetIdentifier = new SpatialDatasetIdentifier();

        Element code = element.getChild("spatial_dataset_identifier_code", NS);
        Element namespace = element.getChild("spatial_dataset_identifier_namespace", NS);

        if (code != null && namespace != null) {
            spatialDatasetIdentifier.setCode(code.getText().trim());
            spatialDatasetIdentifier.setNamespace(namespace.getText().trim());
            inspireDlsModuleImpl.setSpatialDatasetIdentifier(spatialDatasetIdentifier);
            return inspireDlsModuleImpl;
        } else {
            return null;
        }
    }
}
