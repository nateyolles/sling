/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.rewriter.impl;

import org.apache.sling.rewriter.Serializer;
import org.apache.sling.rewriter.SerializerFactory;

/**
 * This sax serializer serializes xhtml-
 * @scr.component metatype="no"
 * @scr.service
 * @scr.property name="pipeline.type" value="xhtml-serializer"
 */
public class XHtmlSerializerFactory implements SerializerFactory {

    /**
     * @see org.apache.sling.rewriter.SerializerFactory#createSerializer()
     */
    public Serializer createSerializer() {
        return new XHTMLSerializer();
    }
}
