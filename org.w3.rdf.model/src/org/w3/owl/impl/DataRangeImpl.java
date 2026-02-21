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
package org.w3.owl.impl;

import org.eclipse.emf.ecore.EClass;

import org.w3.owl.DataRange;
import org.w3.owl.OwlPackage;

import org.w3.rdfs.impl.RDFDatatypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DataRangeImpl extends RDFDatatypeImpl implements DataRange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OwlPackage.Literals.DATA_RANGE;
	}

} //DataRangeImpl
