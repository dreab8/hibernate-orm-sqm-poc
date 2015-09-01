package org.hibernate.sql.gen.internal.predicate;


import org.hibernate.sqm.query.predicate.Predicate;

/**
 * Created by John O'Hara on 28/08/15.
 */
public interface PredicateSqlGenerator<T extends Predicate> {
	String interpret(T predicate);
}