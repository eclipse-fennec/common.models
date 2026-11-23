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
 * A representation of the model object '<em><b>CIM File System Setting Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class allows a client to specify the desired persistence of a FileSystem. This information is tied to the FileSystem using the ElementSettingData association. 
 * This class is being deprecated because the replacing classes FileSystemSetting and FileSystemCapabilities will provide support for persistence and recoverability.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSettingData#getPersistenceType <em>Persistence Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FileSystemSettingData#getOtherPersistenceType <em>Other Persistence Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSettingData()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_FileSystemSetting\",\"CIM_FileSystemCapabilities\"]' Version='2.8.0' UMLPackagePath='CIM::System::FileElements' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FileSystemSettingData extends CIM_ScopedSettingData {
	/**
	 * Returns the value of the '<em><b>Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumerated value representing the intended persistence characteristics of the FileSystem. A value of "Persistent" indicates that the FileSystem should be persistent, should be preserved through an orderly shutdown and should be protected. A value of "Temporary" indicates that the FileSystem should be non-persistent, should not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem should be controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Persistence Type</em>' attribute.
	 * @see #setPersistenceType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSettingData_PersistenceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_FileSystemSetting.PersistenceTypes\"]' Write='true' ValueMap='[\"1\",\"2\",\"3\",\"4\"]' Values='[\"Other\",\"Persistent\",\"Temporary\",\"External\"]' ModelCorrespondence='[\"CIM_FileSystemSettingData.OtherPersistenceType\",\"CIM_FileSystem.PersistenceType\"]'"
	 * @generated
	 */
	Integer getPersistenceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSettingData#getPersistenceType <em>Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence Type</em>' attribute.
	 * @see #getPersistenceType()
	 * @generated
	 */
	void setPersistenceType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Persistence Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the persistence characteristics when PersistenceType is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Persistence Type</em>' attribute.
	 * @see #setOtherPersistenceType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FileSystemSettingData_OtherPersistenceType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_FileSystemSetting.OtherPersistenceTypes\"]' Write='true' ModelCorrespondence='[\"CIM_FileSystemSettingData.PersistenceType\",\"CIM_FileSystem.OtherPersistenceType\"]'"
	 * @generated
	 */
	String getOtherPersistenceType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FileSystemSettingData#getOtherPersistenceType <em>Other Persistence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Persistence Type</em>' attribute.
	 * @see #getOtherPersistenceType()
	 * @generated
	 */
	void setOtherPersistenceType(String value);

} // CIM_FileSystemSettingData
