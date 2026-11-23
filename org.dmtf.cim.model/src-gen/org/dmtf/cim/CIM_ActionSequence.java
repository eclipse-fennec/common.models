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
package org.dmtf.cim;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Action Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ActionSequence association defines a series of operations that either transition a SoftwareElement, referenced by the CIM_SoftwareElementActions association, to the next state or removes the element from its current state. The Action classes participating in this association must have the same value for the Action.Direction property - since they are either part of a sequence to transition a SoftwareElement into its next state or to uninstall it. The next-state and uninstall Actions associated with a particular SoftwareElement must be a continuous sequence. 
 * ActionSequence is an association that loops on the Action classes with roles for the 'prior' and 'next' Actions in the sequence. The need for a continuous sequence imples: (1)Within the set of next-state or uninstall Actions, there is one and only one Action that does not have an instance of ActionSequence referencing it in the 'next' role. This is the first Action in the sequence. (2) Within the set of next-state or uninstall Actions, there is one and only one Action that does not have an instance of ActionSequence referencing it in the 'prior' role. This is the last Action in the sequence. (3) All other Actions within the set of next-state and uninstall Actions must participate in two instances of ActionSequence, one in a 'prior' role and the other in the 'next' role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ActionSequence#getNext <em>Next</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ActionSequence#getPrior <em>Prior</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ActionSequence()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::CheckAction' keys='Next,Prior'"
 * @generated
 */
@ProviderType
public interface CIM_ActionSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The next Action in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(CIM_Action)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActionSequence_Next()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Action REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_Action getNext();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActionSequence#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(CIM_Action value);

	/**
	 * Returns the value of the '<em><b>Prior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The previous Action in the sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prior</em>' reference.
	 * @see #setPrior(CIM_Action)
	 * @see org.dmtf.cim.CimPackage#getCIM_ActionSequence_Prior()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Action REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_Action getPrior();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ActionSequence#getPrior <em>Prior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior</em>' reference.
	 * @see #getPrior()
	 * @generated
	 */
	void setPrior(CIM_Action value);

} // CIM_ActionSequence
