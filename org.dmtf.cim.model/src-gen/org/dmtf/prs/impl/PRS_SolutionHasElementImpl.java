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
package org.dmtf.prs.impl;

import org.dmtf.cim.impl.CIM_DependencyImpl;

import org.dmtf.prs.PRS_SolutionHasElement;
import org.dmtf.prs.PrsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRS Solution Has Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PRS_SolutionHasElementImpl extends CIM_DependencyImpl implements PRS_SolutionHasElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRS_SolutionHasElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrsPackage.Literals.PRS_SOLUTION_HAS_ELEMENT;
	}

} //PRS_SolutionHasElementImpl
