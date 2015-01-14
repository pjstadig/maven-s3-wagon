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

import java.io.File;

import org.apache.maven.wagon.repository.Repository;
import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;

public class MetaDataTest {

	@Test
	public void upload() {
		try {
			Repository repository = new Repository("releases", "s3://s3-bucket-for-repo/maven-test/releases");
			S3Wagon wagon = new S3Wagon();
			wagon.basedir = wagon.getBaseDir(repository);
			wagon.bucketName = "s3-bucket-for-repo";
			String filename = "pom.xml";
			File file = new File(filename);
			PutObjectRequest request = wagon.getPutObjectRequest(file, "ficitious/path/pom.xml", null);
			System.out.println(request.getKey());
            ObjectMetadata metadata = request.getMetadata();
			System.out.println(metadata.getContentType());
            org.junit.Assert.assertEquals(metadata.getContentType(), "text/xml");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
