package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@HippoEssentialsGenerated(internalName = "lulucms:securityquiz")
@Node(jcrType = "lulucms:securityquiz")
public class Securityquiz extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "lulucms:string")
    public String getString() {
        return getProperty("lulucms:string");
    }
}
