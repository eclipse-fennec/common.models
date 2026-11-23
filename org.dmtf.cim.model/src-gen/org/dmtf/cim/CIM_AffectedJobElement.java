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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Affected Job Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AffectedJobElement represents an association between a Job and the ManagedElement(s) that may be affected by its execution. It may not be feasible for the Job to describe all of the affected elements. The main purpose of this association is to provide information when a Job requires exclusive use of the 'affected' ManagedElment(s) or when describing that side effects may result.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AffectedJobElement#getAffectedElement <em>Affected Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AffectedJobElement#getAffectingElement <em>Affecting Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AffectedJobElement#getElementEffects <em>Element Effects</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_AffectedJobElement#getOtherElementEffectsDescriptions <em>Other Element Effects Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AffectedJobElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.15.0' UMLPackagePath='CIM::System::Processing' keys='AffectedElement,AffectingElement'"
 * @generated
 */
@ProviderType
public interface CIM_AffectedJobElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Affected Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement affected by the execution of the Job.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affected Element</em>' reference.
	 * @see #setAffectedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_AffectedJobElement_AffectedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getAffectedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AffectedJobElement#getAffectedElement <em>Affected Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Element</em>' reference.
	 * @see #getAffectedElement()
	 * @generated
	 */
	void setAffectedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Affecting Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Job that is affecting the ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affecting Element</em>' reference.
	 * @see #setAffectingElement(CIM_Job)
	 * @see org.dmtf.cim.CimPackage#getCIM_AffectedJobElement_AffectingElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Job REF' Key='true'"
	 * @generated
	 */
	CIM_Job getAffectingElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AffectedJobElement#getAffectingElement <em>Affecting Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affecting Element</em>' reference.
	 * @see #getAffectingElement()
	 * @generated
	 */
	void setAffectingElement(CIM_Job value);

	/**
	 * Returns the value of the '<em><b>Element Effects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration describing the 'effect' on the ManagedElement. This array corresponds to the OtherElementEffectsDescriptions array, where the latter provides details related to the high-level 'effects' enumerated by this property. Additional detail is required if the ElementEffects array contains the value 1, "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Effects</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AffectedJobElement_ElementEffects()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"Other\",\"Exclusive Use\",\"Performance Impact\",\"Element Integrity\",\"Create\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AffectedJobElement.OtherElementEffectsDescriptions\"]'"
	 * @generated
	 */
	EList<Integer> getElementEffects();

	/**
	 * Returns the value of the '<em><b>Other Element Effects Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides details for the 'effect' at the corresponding array position in ElementEffects. This information is required whenever ElementEffects contains the value 1 ("Other").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Element Effects Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_AffectedJobElement_OtherElementEffectsDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_AffectedJobElement.ElementEffects\"]'"
	 * @generated
	 */
	EList<String> getOtherElementEffectsDescriptions();

} // CIM_AffectedJobElement
