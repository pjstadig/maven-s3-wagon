/**
 * Copyright 2010-2012 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.opensource.org/licenses/ecl2.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.maven.wagon.util;

import java.util.Comparator;

public class BucketSizeComparator implements Comparator<BucketSummary> {

	public int compare(BucketSummary one, BucketSummary two) {
		if (one.getSize() < two.getSize()) {
			return -1;
		} else if (one.getSize() == two.getSize()) {
			return 0;
		} else {
			return 1;
		}
	}

}