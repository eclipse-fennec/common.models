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
 * A representation of the model object '<em><b>CIM Storage Hardware ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_StorageHardwareID is a hardware ID that serves as an authorization subject. Example are host controller IDs that serve as authorization subjects in disk array LUN Masking.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageHardwareID#getStorageID <em>Storage ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageHardwareID#getIDType <em>ID Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageHardwareID#getOtherIDType <em>Other ID Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageHardwareID()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.35.0' UMLPackagePath='CIM::User::StorageHardwareID' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_StorageHardwareID extends CIM_Identity {
	/**
	 * Returns the value of the '<em><b>Storage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The hardware worldwide unique ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage ID</em>' attribute.
	 * @see #setStorageID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageHardwareID_StorageID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Required='true' MaxLen='256' ModelCorrespondence='[\"CIM_StorageHardwareID.IDType\"]'"
	 * @generated
	 */
	String getStorageID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageHardwareID#getStorageID <em>Storage ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage ID</em>' attribute.
	 * @see #getStorageID()
	 * @generated
	 */
	void setStorageID(String value);

	/**
	 * Returns the value of the '<em><b>ID Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the ID property. iSCSI IDs may use one of three iSCSI formats - iqn, eui, or naa. This three letter format is the name prefix; so a single iSCSI type is provided here, the prefix can be used to further refine the format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Type</em>' attribute.
	 * @see #setIDType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageHardwareID_IDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Other\",\"PortWWN\",\"NodeWWN\",\"Hostname\",\"iSCSI Name\",\"SwitchWWN\",\"SAS Address\"]' ModelCorrespondence='[\"CIM_StorageHardwareID.StorageID\"]'"
	 * @generated
	 */
	Integer getIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageHardwareID#getIDType <em>ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Type</em>' attribute.
	 * @see #getIDType()
	 * @generated
	 */
	void setIDType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other ID Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID type when IDType is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other ID Type</em>' attribute.
	 * @see #setOtherIDType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageHardwareID_OtherIDType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOtherIDType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageHardwareID#getOtherIDType <em>Other ID Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other ID Type</em>' attribute.
	 * @see #getOtherIDType()
	 * @generated
	 */
	void setOtherIDType(String value);

} // CIM_StorageHardwareID
