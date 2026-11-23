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
 * A representation of the model object '<em><b>CIM Owning Job Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * OwningJobElement represents an association between a Job and the ManagedElement responsible for the creation of the Job. This association may not be possible, given that the execution of jobs can move between systems and that the lifecycle of the creating entity may not persist for the total duration of the job. However, this can be very useful information when available. This association defines a more specific 'owner' than is provided by the CIM_Job.Owner string.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OwningJobElement#getOwningElement <em>Owning Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OwningJobElement#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OwningJobElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::System::Processing' ModelCorrespondence='[\"CIM_Job.Owner\"]' keys='OwningElement,OwnedElement'"
 * @generated
 */
@ProviderType
public interface CIM_OwningJobElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement responsible for the creation of the Job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Element</em>' reference.
	 * @see #setOwningElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_OwningJobElement_OwningElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_ManagedElement getOwningElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OwningJobElement#getOwningElement <em>Owning Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Element</em>' reference.
	 * @see #getOwningElement()
	 * @generated
	 */
	void setOwningElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Job created by the ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference.
	 * @see #setOwnedElement(CIM_Job)
	 * @see org.dmtf.cim.CimPackage#getCIM_OwningJobElement_OwnedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Key='true'"
	 * @generated
	 */
	CIM_Job getOwnedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OwningJobElement#getOwnedElement <em>Owned Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Element</em>' reference.
	 * @see #getOwnedElement()
	 * @generated
	 */
	void setOwnedElement(CIM_Job value);

} // CIM_OwningJobElement
