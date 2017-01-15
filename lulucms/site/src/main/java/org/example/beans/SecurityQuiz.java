package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.onehippo.cms7.essentials.components.rest.adapters.HippoGalleryImageAdapter;

@XmlRootElement(name = "securityquiz")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:SecurityQuiz")
@Node(jcrType = "lulucms:SecurityQuiz")
public class SecurityQuiz extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:caption")
    public String getCaption() {
        return getProperty("lulucms:caption");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:clickHereButton")
    public HippoGalleryImageSet getClickHereButton() {
        return getLinkedBean("lulucms:clickHereButton",
                HippoGalleryImageSet.class);
    }
}
