/*
 * Integrated Rule Inference System (IRIS):
 * An extensible rule inference system for datalog with extensions.
 * 
 * Copyright (C) 2009 Semantic Technology Institute (STI) Innsbruck, 
 * University of Innsbruck, Technikerstrasse 21a, 6020 Innsbruck, Austria.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */
package org.deri.iris.builtins.date;

import static org.deri.iris.factory.Factory.BASIC;

import org.deri.iris.api.basics.IPredicate;
import org.deri.iris.api.terms.ITerm;
import org.deri.iris.api.terms.concrete.IYearMonthDuration;
import org.deri.iris.builtins.LessBuiltin;

/**
 * <p>
 * Represents the RIF built-in predicate pred:yearMonthDuration-less-than.
 * </p>
 */
public class YearMonthDurationLessBuiltin extends LessBuiltin {

	/** The predicate defining this built-in. */
	private static final IPredicate PREDICATE = BASIC.createPredicate(
			"YEARMONTHDURATION_LESS", 2);

	public YearMonthDurationLessBuiltin(ITerm... terms) {
		super(PREDICATE, terms);
	}

	@Override
	protected boolean computeResult(ITerm[] terms) {
		if (terms[0] instanceof IYearMonthDuration
				&& terms[1] instanceof IYearMonthDuration) {
			return super.computeResult(terms);
		}

		return false;
	}

}
