/**
 * Jakarta Bean Validation TCK
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package org.hibernate.beanvalidation.tck.tests.metadata;

import javax.validation.constraints.NotNull;
import javax.validation.executable.ExecutableType;
import javax.validation.executable.ValidateOnExecution;

/**
 * @author Gunnar Morling
 */
@ValidateOnExecution(type = ExecutableType.NONE)
public class OrderLine {

	public OrderLine(@NotNull String item) {
	}

	public void setItem(@NotNull String item) {
	}
}
