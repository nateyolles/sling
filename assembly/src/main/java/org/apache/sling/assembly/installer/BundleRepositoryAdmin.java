/*
 * Copyright 2007 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.assembly.installer;

import java.net.URL;
import java.util.Iterator;

/**
 * The <code>BundleRepositoryAdmin</code> TODO
 */
public interface BundleRepositoryAdmin {


    void refreshRepositories();
    
    // Iterator of Repository instances
    Iterator getRepositories();
    
    void addRepository(URL url);
    
    void removeRepository(URL url);
    
    // Iterator of Resource instances
    Iterator getResources();

}
