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
 * A representation of the model object '<em><b>CIM Allocated From Storage Pool View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_AllocatedFromStoragePoolView instance is a view that is derived from the CIM_AllocatedFromStoragePool association between the StorageVolume or LogicalDisk (of the CIM_VolumeView) and the StoragePool from which the StorageVolume (or LogicalDisk is allocated. Note that if the StorageVolume (or LogicalDisk) is allocated from multiple StoragePools there will be multiple AllocatedFromStoragePoolView instances for the StorageVolume (or LogicalDisk).
 * This association is between a view class and a normalized class. It can go in either direction (e.g., VolumeView dependent on a StoragePool or a StorageVolume dependent on a StoragePoolView).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_AllocatedFromStoragePoolView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePoolView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::DEVICE::Views' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='A StoragePool (or StoragePoolView) from which the VolumeView (or StorageVolume) or StoragePoolView (or StoragePool) is allocated.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Key='true' override.Dependent.Description='The CIM_VolumeView (or StorageVolume) or child StoragePoolView (or StoragePool) instance that is allocated from the StoragePool (or StoragePoolView)' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AllocatedFromStoragePoolView extends CIM_AbstractElementAllocatedFromPool {
	/**
	 * Returns the value of the '<em><b>AFSP Space Consumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The space consumed from the StoragePool by the StorageVolume (or LogicalDisk). This value is the same as the AllocatedFromStoragePool.SpaceConsumed value for the base CIM_StorageVolume on the antecedent StoragePool.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #setAFSPSpaceConsumed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_AllocatedFromStoragePoolView_AFSPSpaceConsumed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' ModelCorrespondence='[\"CIM_AllocatedFromStoragePool.SpaceConsumed\"]'"
	 * @generated
	 */
	Long getAFSPSpaceConsumed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_AllocatedFromStoragePoolView#getAFSPSpaceConsumed <em>AFSP Space Consumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFSP Space Consumed</em>' attribute.
	 * @see #getAFSPSpaceConsumed()
	 * @generated
	 */
	void setAFSPSpaceConsumed(Long value);

} // CIM_AllocatedFromStoragePoolView
