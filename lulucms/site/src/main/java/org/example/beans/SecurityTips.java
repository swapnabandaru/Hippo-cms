package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "securitytips")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:SecurityTips")
@Node(jcrType = "lulucms:SecurityTips")
public class SecurityTips extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:caption")
    public String getCaption() {
        return getProperty("lulucms:caption");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:securityTip1")
    public String getSecurityTip1() {
        return getProperty("lulucms:securityTip1");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:securityTip2")
    public String getSecurityTip2() {
        return getProperty("lulucms:securityTip2");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:securityTip3")
    public String getSecurityTip3() {
        return getProperty("lulucms:securityTip3");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:securityTip4")
    public String getSecurityTip4() {
        return getProperty("lulucms:securityTip4");
    }
}
