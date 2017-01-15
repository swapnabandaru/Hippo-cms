package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "dailytips")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:DailyTips")
@Node(jcrType = "lulucms:DailyTips")
public class DailyTips extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:dailyTip")
    public String getDailyTip() {
        return getProperty("lulucms:dailyTip");
    }
}
