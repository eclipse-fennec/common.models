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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Media Present</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Where a StorageExtent must be accessed through a MediaAccess Device, this relationship is described by the MediaPresent association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_MediaPresent#getFixedMedia <em>Fixed Media</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_MediaPresent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' MappingStrings='[\"MIF.DMTF|Storage Devices|001.8\"]' override.Antecedent='CIM_MediaAccessDevice REF' override.Antecedent.Description='The MediaAccessDevice.' override.Dependent='CIM_StorageExtent REF' override.Dependent.Description='The StorageExtent accessed using the MediaAccessDevice.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_MediaPresent extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Fixed Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Boolean indicating that the accessed StorageExtent is fixed in the MediaAccessDevice and can not be ejected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Media</em>' attribute.
	 * @see #setFixedMedia(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_MediaPresent_FixedMedia()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getFixedMedia();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_MediaPresent#getFixedMedia <em>Fixed Media</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Media</em>' attribute.
	 * @see #getFixedMedia()
	 * @generated
	 */
	void setFixedMedia(Boolean value);

} // CIM_MediaPresent
