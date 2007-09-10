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
package org.apache.sling.console.web.internal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.service.log.LogService;

/**
 * The <code>StopAction</code> TODO
 *
 * @scr.component metatype="false"
 * @scr.reference name="log" interface="org.osgi.service.log.LogService"
 * @scr.service
 */
public class UninstallAction extends BundleAction {

    public static final String NAME = "uninstall";
    public static final String LABEL = "Uninstall";

    public String getName() {
        return NAME;
    }
    
    public String getLabel() {
        return LABEL;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see org.apache.sling.manager.web.internal.internal.Action#performAction(javax.servlet.http.HttpServletRequest)
     */
    public boolean performAction(HttpServletRequest request, HttpServletResponse response) {

        long bundleId = getBundleId(request);
        if (bundleId > 0) { // cannot stop system bundle !!
            Bundle bundle = getBundleContext().getBundle(bundleId);
            if (bundle != null) {
                try {
                    bundle.uninstall();
                } catch (BundleException be) {
                    log(bundle, "Cannot uninstall", be);
                }

            }
        }
        
        return true;
    }
}
    
