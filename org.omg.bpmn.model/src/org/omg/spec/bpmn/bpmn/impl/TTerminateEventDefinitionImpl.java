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
package org.omg.spec.bpmn.bpmn.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TTerminateEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TTerminate Event Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TTerminateEventDefinitionImpl extends TEventDefinitionImpl implements TTerminateEventDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TTerminateEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTTerminateEventDefinition();
	}

} //TTerminateEventDefinitionImpl
