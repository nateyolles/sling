/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.validation.impl;

import java.util.Dictionary;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.validation.model.spi.ValidationModelCache;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

/**
 * Invalidates the cache of the {@link ValidationModelRetrieverImpl} by sending an event through the {@link EventAdmin}
 */
@Service
@Component
public class ValidationModelCacheImpl implements ValidationModelCache {

    @Reference
    protected EventAdmin eventAdmin;
    
    @Override
    public void invalidate() {
        eventAdmin.sendEvent(new Event(ValidationModelRetrieverImpl.CACHE_INVALIDATION_EVENT_TOPIC, (Dictionary<String, ?>) null));
    }

}
