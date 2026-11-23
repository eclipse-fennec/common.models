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
 * A representation of the model object '<em><b>CIM Tape Drive Resource Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_TapeDriveResourceUsage class contains data representing Tape Drive Read & Write speed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_TapeDriveResourceUsage#getReadSpeed <em>Read Speed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_TapeDriveResourceUsage#getWriteSpeed <em>Write Speed</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TapeDriveResourceUsage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::Device::StorageStatistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_TapeDriveResourceUsage extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Read Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed in Mbytes/sec
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Speed</em>' attribute.
	 * @see #setReadSpeed(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_TapeDriveResourceUsage_ReadSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getReadSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TapeDriveResourceUsage#getReadSpeed <em>Read Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Speed</em>' attribute.
	 * @see #getReadSpeed()
	 * @generated
	 */
	void setReadSpeed(Float value);

	/**
	 * Returns the value of the '<em><b>Write Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Speed in Mbytes/sec
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Write Speed</em>' attribute.
	 * @see #setWriteSpeed(Float)
	 * @see org.dmtf.cim.CimPackage#getCIM_TapeDriveResourceUsage_WriteSpeed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='real32'"
	 * @generated
	 */
	Float getWriteSpeed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_TapeDriveResourceUsage#getWriteSpeed <em>Write Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Speed</em>' attribute.
	 * @see #getWriteSpeed()
	 * @generated
	 */
	void setWriteSpeed(Float value);

} // CIM_TapeDriveResourceUsage
