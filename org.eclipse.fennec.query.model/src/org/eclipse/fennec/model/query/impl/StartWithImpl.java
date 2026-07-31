/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.query.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.fennec.model.query.QueryPackage;
import org.eclipse.fennec.model.query.StartWith;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start With</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StartWithImpl extends StringComparatorImpl implements StartWith {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartWithImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.START_WITH;
	}

} //StartWithImpl
