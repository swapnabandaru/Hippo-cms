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

@XmlRootElement(name = "starperformer")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:starPerformer")
@Node(jcrType = "lulucms:starPerformer")
public class StarPerformer extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:caption1")
    public String getCaption1() {
        return getProperty("lulucms:caption1");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:caption2")
    public String getCaption2() {
        return getProperty("lulucms:caption2");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee1name")
    public String getEmployee1name() {
        return getProperty("lulucms:employee1name");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee1branch")
    public String getEmployee1branch() {
        return getProperty("lulucms:employee1branch");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee2name")
    public String getEmployee2name() {
        return getProperty("lulucms:employee2name");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee2location")
    public String getEmployee2location() {
        return getProperty("lulucms:employee2location");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee2branch")
    public String getEmployee2branch() {
        return getProperty("lulucms:employee2branch");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee1location")
    public String getEmployee1location() {
        return getProperty("lulucms:employee1location");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee1photo")
    public HippoGalleryImageSet getEmployee1photo() {
        return getLinkedBean("lulucms:employee1photo",
                HippoGalleryImageSet.class);
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:employee2photo")
    public HippoGalleryImageSet getEmployee2photo() {
        return getLinkedBean("lulucms:employee2photo",
                HippoGalleryImageSet.class);
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:chooseCountry")
    public String getChooseCountry() {
        return getProperty("lulucms:chooseCountry");
    }
}
