/**
 * Jakarta Bean Validation TCK
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.beanvalidation.tck.tests.integration.cdi.executable;

import javax.inject.Inject;
import javax.validation.constraints.Size;

/**
 * @author Gunnar Morling
 */
public class UserService {

	@Inject
	@CrossParameterConstraint
	public UserService(@LongName @Size(min = 5) String name) {
	}
}
