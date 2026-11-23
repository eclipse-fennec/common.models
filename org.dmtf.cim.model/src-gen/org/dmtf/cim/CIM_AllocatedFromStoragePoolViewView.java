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
 * A representation of the model object '<em><b>CIM Allocated From Storage Pool View View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_AllocatedFromStoragePoolView instance is a view that is derived from the CIM_AllocatedFromStoragePool association between a VolumeView or StoragePoolView and the parent StoragePool from which the VolumeView or StoragePoolView is allocated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedFromStoragePoolViewView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePoolViewView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::Views' override.Antecedent='CIM_StoragePoolView REF' override.Antecedent.Key='true' override.Antecedent.Description='The parent StoragePoolView from which the CIM_VolumeView or child StoragePoolView is allocated.' override.Dependent='CIM_View REF' override.Dependent.Key='true' override.Dependent.Description='The VolumeView or StoragePoolView instance that is allocated from the parent StoragePoolView.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AllocatedFromStoragePoolViewView extends CIM_AbstractElementAllocatedFromPool {
	/**
	 * Returns the value of the '<em><b>AFSP Space Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The space consumed from the parent StoragePool by the VolumeView or StoragePoolView. This value is the same as the AllocatedFromStoragePool.SpaceConsumed value for the base CIM_StorageVolume or CIM_StoragePool on the parent StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #setAFSPSpaceConsumed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePoolViewView_AFSPSpaceConsumed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceConsumed\"]'"
	 * @generated
	 */
	Long getAFSPSpaceConsumed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedFromStoragePoolViewView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 */
	void setAFSPSpaceConsumed(Long value);

} // CIM_AllocatedFromStoragePoolViewView
