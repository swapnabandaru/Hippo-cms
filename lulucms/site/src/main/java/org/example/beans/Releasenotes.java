package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;

@HippoEssentialsGenerated(internalName = "lulucms:releasenotes")
@Node(jcrType = "lulucms:releasenotes")
public class Releasenotes extends HippoDocument {
    @HippoEssentialsGenerated(internalName = "lulucms:string")
    public String getString() {
        return getProperty("lulucms:string");
    }

    @HippoEssentialsGenerated(internalName = "lulucms:string_")
    public String getString_() {
        return getProperty("lulucms:string_");
    }
}
