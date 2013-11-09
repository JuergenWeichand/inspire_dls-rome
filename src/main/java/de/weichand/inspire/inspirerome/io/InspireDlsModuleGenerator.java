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

import com.sun.syndication.feed.module.Module;
import com.sun.syndication.io.ModuleGenerator;
import de.weichand.inspire.inspirerome.InspireDlsModule;
import java.util.HashSet;
import java.util.Set;
import org.jdom.Element;
import org.jdom.Namespace;

/**
 * Generator for inspire_dls Elements
 * 
 * @version 1.0
 * @author Juergen Weichand <juergen@weichand.de>
 */
public class InspireDlsModuleGenerator implements ModuleGenerator {

    private static final Namespace NS = Namespace.getNamespace("inspire_dls", InspireDlsModule.URI);

    @Override
    public String getNamespaceUri() {
        return InspireDlsModule.URI;
    }

    @Override
    public Set getNamespaces() {
        final Set namespaces = new HashSet();
        namespaces.add(NS);
        return namespaces;
    }

    @Override
    public void generate(Module module, Element element) {

        if (!(module instanceof InspireDlsModule)) {
            return;
        }

        final InspireDlsModule inspireModule = (InspireDlsModule) module;

        if (inspireModule.getSpatialDatasetIdentifier() != null) {

            if (inspireModule.getSpatialDatasetIdentifier().getCode() != null) {
                element.addContent(generateSimpleElement("spatial_dataset_identifier_code", inspireModule.getSpatialDatasetIdentifier().getCode()));
            }

            if (inspireModule.getSpatialDatasetIdentifier().getNamespace() != null) {
                element.addContent(generateSimpleElement("spatial_dataset_identifier_namespace", inspireModule.getSpatialDatasetIdentifier().getNamespace()));
            }
        }
    }

    protected Element generateSimpleElement(final String name, final String value) {
        final Element element = new Element(name, InspireDlsModuleGenerator.NS);
        element.addContent(value);
        return element;
    }
}
