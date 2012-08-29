/*
 * Copyright 2011 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.vaadin.tests.serialization;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.WrappedRequest;
import com.vaadin.tests.components.AbstractTestUI;
import com.vaadin.tests.widgetset.TestingWidgetSet;
import com.vaadin.tests.widgetset.server.DummyLabel;
import com.vaadin.ui.Label;

@Widgetset(TestingWidgetSet.NAME)
public class SerializerNamespaceTest extends AbstractTestUI {

    @Override
    protected void setup(WrappedRequest request) {
        addComponent(new Label("The real label"));
        addComponent(new DummyLabel("The dummy label"));
    }

    @Override
    protected String getTestDescription() {
        return "Using connectors with different state classes having the same simple name should not cause any client-side exceptions";
    }

    @Override
    protected Integer getTicketNumber() {
        return Integer.valueOf(8683);
    }

}
