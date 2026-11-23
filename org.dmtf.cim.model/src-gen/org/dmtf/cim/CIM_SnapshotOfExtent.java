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
 * A representation of the model object '<em><b>CIM Snapshot Of Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated. Snapshots are now modeled in a more abstract way using StorageExtent and CIM_StorageSynchronized. 
 * SnapshotOfExtent is an association between an Extent and its Snapshot. This relationship is made explicit in this association.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SnapshotOfExtent#getSnapshotType <em>Snapshot Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SnapshotOfExtent()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.7.0' UMLPackagePath='CIM::Device::SccExtents' override.Antecedent='CIM_StorageExtent REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Max='1' override.Antecedent.Description='The StorageExtent.' override.Dependent='CIM_Snapshot REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Description='The Snapshot.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SnapshotOfExtent extends CIM_Dependency {
	/**
	 * Returns the value of the '<em><b>Snapshot Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of snapshot.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Snapshot Type</em>' attribute.
	 * @see #setSnapshotType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_SnapshotOfExtent_SnapshotType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_StorageSynchronized.CopyType\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Unknown\",\"Copy\",\"Before Delta\",\"After Delta\"]'"
	 * @generated
	 */
	Integer getSnapshotType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SnapshotOfExtent#getSnapshotType <em>Snapshot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot Type</em>' attribute.
	 * @see #getSnapshotType()
	 * @generated
	 */
	void setSnapshotType(Integer value);

} // CIM_SnapshotOfExtent
