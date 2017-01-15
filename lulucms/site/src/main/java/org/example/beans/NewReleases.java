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

@XmlRootElement(name = "newreleases")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:NewReleases")
@Node(jcrType = "lulucms:NewReleases")
public class NewReleases extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:summaryOfNewRelease")
    public String getSummaryOfNewRelease() {
        return getProperty("lulucms:summaryOfNewRelease");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:linkToNewRelease")
    public String getLinkToNewRelease() {
        return getProperty("lulucms:linkToNewRelease");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:captionasimage")
    public HippoGalleryImageSet getCaptionasimage() {
        return getLinkedBean("lulucms:captionasimage",
                HippoGalleryImageSet.class);
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:linkToTheOtherLatestRelease")
    public String[] getLinkToTheOtherLatestRelease() {
        return getProperty("lulucms:linkToTheOtherLatestRelease");
    }
}
