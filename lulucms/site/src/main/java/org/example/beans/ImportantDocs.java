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

@XmlRootElement(name = "importantdocs")
@XmlAccessorType(XmlAccessType.NONE)
@HippoEssentialsGenerated(internalName = "lulucms:ImportantDocs")
@Node(jcrType = "lulucms:ImportantDocs")
public class ImportantDocs extends BaseDocument {
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:documentName2WithLink")
    public String getDocumentName2WithLink() {
        return getProperty("lulucms:documentName2WithLink");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:documentName1WithLink")
    public String getDocumentName1WithLink() {
        return getProperty("lulucms:documentName1WithLink");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:documentName3WithLink")
    public String getDocumentName3WithLink() {
        return getProperty("lulucms:documentName3WithLink");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:documentName4WithLink")
    public String getDocumentName4WithLink() {
        return getProperty("lulucms:documentName4WithLink");
    }

    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:documentName5WithLink")
    public String getDocumentName5WithLink() {
        return getProperty("lulucms:documentName5WithLink");
    }

    @XmlJavaTypeAdapter(HippoGalleryImageAdapter.class)
    @XmlElement
    @HippoEssentialsGenerated(internalName = "lulucms:captionAsImage")
    public HippoGalleryImageSet getCaptionAsImage() {
        return getLinkedBean("lulucms:captionAsImage",
                HippoGalleryImageSet.class);
    }
}
