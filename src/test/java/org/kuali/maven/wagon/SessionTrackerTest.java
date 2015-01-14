/**
 * Copyright 2010-2015 The Kuali Foundation
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
package org.kuali.maven.wagon;

import org.junit.Assert;
import org.junit.Test;

public class SessionTrackerTest {

	@Test
	public void simple() {
		SessionTracker tracker = new SessionTracker();
		long millis = 1;
		tracker.setOpened(millis);
		Assert.assertEquals(millis, tracker.getOpened());
	}

}
