package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "sample")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:Sample")
@Node(jcrType = "lulucms:Sample")
public class Sample extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:string")
    public String[] getString() {
        return getProperty("lulucms:string");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:calendardate")
    public Calendar getCalendardate() {
        return getProperty("lulucms:calendardate");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:staticdropdown")
    public String getStaticdropdown() {
        return getProperty("lulucms:staticdropdown");
    }
}
