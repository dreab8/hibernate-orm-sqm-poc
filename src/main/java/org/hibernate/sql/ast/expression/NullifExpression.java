/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.ast.expression;

import org.hibernate.type.Type;

/**
 * @author Steve Ebersole
 */
public class NullifExpression implements Expression {
	private final Expression first;
	private final Expression second;

	public NullifExpression(Expression first, Expression second) {
		this.first = first;
		this.second = second;
	}

	public Expression getFirstArgument() {
		return first;
	}

	public Expression getSecondArgument() {
		return second;
	}

	@Override
	public Type getType() {
		return first.getType();
	}
}
