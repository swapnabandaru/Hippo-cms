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

@XmlRootElement(name = "newandupcomingproducts")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:NewAndUpcomingProducts")
@Node(jcrType = "lulucms:NewAndUpcomingProducts")
public class NewAndUpcomingProducts extends BaseDocument {
    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:company1Logo")
    public HippoGalleryImageSet getCompany1Logo() {
        return getLinkedBean("lulucms:company1Logo", HippoGalleryImageSet.class);
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:company2Logo")
    public HippoGalleryImageSet getCompany2Logo() {
        return getLinkedBean("lulucms:company2Logo", HippoGalleryImageSet.class);
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:company3Logo")
    public HippoGalleryImageSet getCompany3Logo() {
        return getLinkedBean("lulucms:company3Logo", HippoGalleryImageSet.class);
    }
}
