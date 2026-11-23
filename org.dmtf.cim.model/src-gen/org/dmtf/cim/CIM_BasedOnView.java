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
 * A representation of the model object '<em><b>CIM Based On View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_BasedOnView instance is a view that is derived from CIM_BasedOn between the CIM_StorageExtent (or StorageVolume or LogicalDisk) instance and another CIM_StorageExtent where one or both of the references are to a View Class (e.g.,, VolumeView Dependent or DiskDriveView Antecedent).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BasedOnView#getBOEndingAddress <em>BO Ending Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BasedOnView#getBOOrderIndex <em>BO Order Index</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BasedOnView#getBOStartingAddress <em>BO Starting Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BasedOnView()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::Device::StorageExtent' override.Antecedent='CIM_ManagedElement REF' override.Antecedent.Key='true' override.Antecedent.Description='The CIM_DiskDriveView on which a StorageExtent (or StorageVolume or LogicalDisk) is based or the CIM_StorageExtent on which the a CIM_VolumeView is based.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Key='true' override.Dependent.Description='The CIM_StorageExtent instance that is dependent on the CIM_DiskDriveView or the CIM_VolumeView that is dependent on the CIM_StorageExtent.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_BasedOnView extends CIM_AbstractBasedOn {
	/**
	 * Returns the value of the '<em><b>BO Ending Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is derived from the BasedOn.EndingAddress
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BO Ending Address</em>' attribute.
	 * @see #setBOEndingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BasedOnView_BOEndingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getBOEndingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BasedOnView#getBOEndingAddress <em>BO Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BO Ending Address</em>' attribute.
	 * @see #getBOEndingAddress()
	 * @generated
	 */
	void setBOEndingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>BO Order Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the association is used in a concatenation composition, indicates the order in which the extents(and thus their block ranges) are concatenated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BO Order Index</em>' attribute.
	 * @see #setBOOrderIndex(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BasedOnView_BOOrderIndex()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getBOOrderIndex();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BasedOnView#getBOOrderIndex <em>BO Order Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BO Order Index</em>' attribute.
	 * @see #getBOOrderIndex()
	 * @generated
	 */
	void setBOOrderIndex(Integer value);

	/**
	 * Returns the value of the '<em><b>BO Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is derived from the BasedOn.StartingAddress
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BO Starting Address</em>' attribute.
	 * @see #setBOStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BasedOnView_BOStartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getBOStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BasedOnView#getBOStartingAddress <em>BO Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BO Starting Address</em>' attribute.
	 * @see #getBOStartingAddress()
	 * @generated
	 */
	void setBOStartingAddress(Long value);

} // CIM_BasedOnView
