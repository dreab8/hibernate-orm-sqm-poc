/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.sql.orm.internal.sqm.model;

import org.hibernate.sql.gen.NotYetImplementedException;
import org.hibernate.sqm.domain.AnyTypeDescriptor;
import org.hibernate.sqm.domain.AttributeDescriptor;

/**
 * @author Steve Ebersole
 */
public class AnyTypeDescriptorImpl implements AnyTypeDescriptor {
	@Override
	public String getTypeName() {
		return "any";
	}

	@Override
	public AttributeDescriptor getAttributeDescriptor(String attributeName) {
		throw new NotYetImplementedException();
	}
}
