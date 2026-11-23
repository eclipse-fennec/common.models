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
 * A representation of the model object '<em><b>CIM Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated. Snapshots are now modeled in a more abstrct way using StorageExtent and StorageSynchronized. 
 * The Snapshot class is an optional construct. It can be used to represent an Extent that contains a full copy of another Extent, or the changes to that Extent when performing a delta-based (delta before or delta after) copy. 
 * Snapshot's definition in CIM is not equivalent to the act of creating a volume or file-based snapshot, or a point in time copy. It is at a much lower level and represents the use of storage to hold a copied image of an Extent, or to hold changes to an Extent. Use of the Snapshot object when making a full copy is only recommended if the purpose is to describe the existence of a copy. (This use will be very infrequent.) The problem with describing an Extent solely as a 'snapshot' is that when the snapshot/copy is broken, the object must be destroyed. Typically, this object still holds valid data, and would have to be reinstantiated. If the 'full copy' object is to be treated as a StorageVolume or more general Extent, then it should be modeled as such from the beginning - i.e., not as an instance of Snapshot but as an instance of a generic StorageExtent or StorageVolume. In this case, the Synchronized association would be used to describe that one StorageExtent is synchronized with another. 
 * When describing a delta-based snapshot/point in time copy, the Snapshot object represents the store holding the before/after image changes to the original Extent. For example, when doing a 'delta before' Snapshot, the resultant target would be modeled as a StorageExtent that is BasedOn the original Extent and the instance of Snapshot (that holds the changes to the original Extent).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_Snapshot#getIsSynced <em>Is Synced</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_Snapshot#getSyncTime <em>Sync Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Snapshot()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"No value\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' keys='SystemCreationClassName,SystemName,CreationClassName,DeviceID'"
 * @generated
 */
@ProviderType
public interface CIM_Snapshot extends CIM_StorageExtent {
	/**
	 * Returns the value of the '<em><b>Is Synced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates that the snapshot is synced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Synced</em>' attribute.
	 * @see #setIsSynced(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_Snapshot_IsSynced()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Deprecated='[\"CIM_Synchronized.SyncMaintained\"]'"
	 * @generated
	 */
	Boolean getIsSynced();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Snapshot#getIsSynced <em>Is Synced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synced</em>' attribute.
	 * @see #getIsSynced()
	 * @generated
	 */
	void setIsSynced(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sync Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time stamp indicating when the sync occurred.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Time</em>' attribute.
	 * @see #setSyncTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_Snapshot_SyncTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"CIM_Synchronized.WhenSynced\"]'"
	 * @generated
	 */
	String getSyncTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_Snapshot#getSyncTime <em>Sync Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Time</em>' attribute.
	 * @see #getSyncTime()
	 * @generated
	 */
	void setSyncTime(String value);

} // CIM_Snapshot
