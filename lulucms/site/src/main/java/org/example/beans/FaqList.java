package org.example.beans;
/*
 * Copyright 2014-2015 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "lulucms:faqlist")
@Node(jcrType = "lulucms:faqlist")
public class FaqList extends BaseDocument {

	@HippoEssentialsGenerated(internalName = "lulucms:title")
	public String getTitle() {
		return getProperty("lulucms:title");
	}

	@HippoEssentialsGenerated(internalName = "lulucms:description")
	public HippoHtml getDescription() {
		return getHippoHtml("lulucms:description");
	}

	@HippoEssentialsGenerated(internalName = "lulucms:faqitem")
    public List<FaqItem> getFaqItems() {
        return getLinkedBeans("lulucms:faqitem", FaqItem.class);
    }

	/**
	 *  Additional marker for the template to validate it's working with an FAQ list bean.
	 */
	public boolean isFAQ() {
		return true;
	}
}
