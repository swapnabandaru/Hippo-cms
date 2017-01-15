package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import java.util.Calendar;
import org.example.beans.Servicetips;

@HippoEssentialsGenerated(internalName = "lulucms:Securitytips")
@Node(jcrType = "lulucms:Securitytips")
public class Securitytips extends HippoDocument {
    @HippoEssentialsGenerated(internalName = "lulucms:calendardate")
    public Calendar getCalendardate() {
        return getProperty("lulucms:calendardate");
    }

    @HippoEssentialsGenerated(internalName = "lulucms:lulucms_servicetips")
    public Servicetips getLulucms_servicetips() {
        return getBean("lulucms:lulucms_servicetips", Servicetips.class);
    }
}
