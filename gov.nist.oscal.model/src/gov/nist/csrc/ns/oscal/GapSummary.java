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
package gov.nist.csrc.ns.oscal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gap Summary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *               
 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Gap Summary</b>
 *   : A by-id collection of all controls that were not mapped at all in this  mapping-collection. If a control is partially mapped, the parts of the control are not mappable, the gap and discrepancies should be documented in the  relationship-gal. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.GapSummary#getUnmappedControls <em>Unmapped Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.GapSummary#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getGapSummary()
 * @model extendedMetaData="name='oscal-mapping-common-gap-summary-ASSEMBLY' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GapSummary extends EObject {
	/**
	 * Returns the value of the '<em><b>Unmapped Controls</b></em>' containment reference list.
	 * The list contents are of type {@link gov.nist.csrc.ns.oscal.ControlSelectControlById}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unmapped Controls</em>' containment reference list.
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getGapSummary_UnmappedControls()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='unmapped-controls' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ControlSelectControlById> getUnmappedControls();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                  
	 *   <b xmlns="http://csrc.nist.gov/ns/oscal/1.0">Gap Summary Universally Unique Identifier</b>
	 *   : A  machine-oriented, globally unique identifier with  cross-instance scope that can be used to reference this mapping gap summary elsewhere in this or other OSCAL instances. The locally defined UUID of the SSP can be used to reference the data item locally or globally (e.g., in an imported OSCAL instance).This UUID should be assigned  per-subject, which means it should be consistently used to identify the same subject across revisions of the document.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see gov.nist.csrc.ns.oscal.OSCALPackage#getGapSummary_Uuid()
	 * @model dataType="gov.nist.csrc.ns.oscal.UUIDDatatype" required="true"
	 *        extendedMetaData="kind='attribute' name='uuid'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link gov.nist.csrc.ns.oscal.GapSummary#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // GapSummary
