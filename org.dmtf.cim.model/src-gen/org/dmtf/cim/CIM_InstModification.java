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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Inst Modification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_InstModification notifies when an instance is modified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstModification#getPreviousInstance <em>Previous Instance</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstModification#getChangedPropertyNames <em>Changed Property Names</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstModification()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Indication='true' Version='2.45.0' UMLPackagePath='CIM::Event'"
 * @generated
 */
@ProviderType
public interface CIM_InstModification extends CIM_InstIndication {
	/**
	 * Returns the value of the '<em><b>Previous Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property values of the object embedded in PreviousInstance shall reflect the consistent state of that object before the change that is reported in the indication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous Instance</em>' attribute.
	 * @see #setPreviousInstance(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstModification_PreviousInstance()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' EmbeddedObject='true'"
	 * @generated
	 */
	String getPreviousInstance();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstModification#getPreviousInstance <em>Previous Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Instance</em>' attribute.
	 * @see #getPreviousInstance()
	 * @generated
	 */
	void setPreviousInstance(String value);

	/**
	 * Returns the value of the '<em><b>Changed Property Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property lists the names of those properties of the object embedded in the SourceInstance whose change generated the indication.
	 * Each property name shall be included at most once.
	 * If the infrastructure cannot reliably determine which properties have changed, this property shall be NULL.
	 * Notes:
	 * \tKey properties do not change, so will not be listed.
	 * \tRead-only property values can change, so might be listed.
	 * \tBecause of the protocol dependent serialization EmbeddedObjects, properties that transition from or to NULL are not necessarily listed in the EmbeddedObject of the corresponding PreviousInstance or SourceInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changed Property Names</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_InstModification_ChangedPropertyNames()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ModelCorrespondence='[\"CIM_InstModification.SourceInstance\",\"CIM_InstModification.PreviousInstance\"]'"
	 * @generated
	 */
	EList<String> getChangedPropertyNames();

} // CIM_InstModification
