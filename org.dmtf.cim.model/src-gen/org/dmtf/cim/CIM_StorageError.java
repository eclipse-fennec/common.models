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
 * A representation of the model object '<em><b>CIM Storage Error</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StorageError defines blocks of media or memory space that are mapped 'out of use' due to errors. The Key of the class is the StartingAddress of the bytes in error.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_StorageError#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageError#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageError#getDeviceCreationClassName <em>Device Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageError#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageError#getStartingAddress <em>Starting Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_StorageError#getEndingAddress <em>Ending Address</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_StorageError()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::Device::StorageExtents' keys='SystemCreationClassName,SystemName,DeviceCreationClassName,DeviceID,StartingAddress'"
 * @generated
 */
@ProviderType
public interface CIM_StorageError extends CIM_ManagedElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageError_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_StorageExtent.SystemCreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageError#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping System's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageError_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_StorageExtent.SystemName'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageError#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Device Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping StorageExtent's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Creation Class Name</em>' attribute.
	 * @see #setDeviceCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageError_DeviceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_StorageExtent.CreationClassName'"
	 * @generated
	 */
	String getDeviceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageError#getDeviceCreationClassName <em>Device Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Creation Class Name</em>' attribute.
	 * @see #getDeviceCreationClassName()
	 * @generated
	 */
	void setDeviceCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping StorageExtent's DeviceID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageError_DeviceID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='64' Propagated='CIM_StorageExtent.DeviceID'"
	 * @generated
	 */
	String getDeviceID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageError#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(String value);

	/**
	 * Returns the value of the '<em><b>Starting Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The starting address of the bytes in error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starting Address</em>' attribute.
	 * @see #setStartingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageError_StartingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Key='true'"
	 * @generated
	 */
	Long getStartingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageError#getStartingAddress <em>Starting Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Address</em>' attribute.
	 * @see #getStartingAddress()
	 * @generated
	 */
	void setStartingAddress(Long value);

	/**
	 * Returns the value of the '<em><b>Ending Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ending address of the bytes in error.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ending Address</em>' attribute.
	 * @see #setEndingAddress(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_StorageError_EndingAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64'"
	 * @generated
	 */
	Long getEndingAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_StorageError#getEndingAddress <em>Ending Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Address</em>' attribute.
	 * @see #getEndingAddress()
	 * @generated
	 */
	void setEndingAddress(Long value);

} // CIM_StorageError
