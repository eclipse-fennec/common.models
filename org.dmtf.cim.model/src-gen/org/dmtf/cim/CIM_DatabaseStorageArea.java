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
 * A representation of the model object '<em><b>CIM Database Storage Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Databases as modeled by instances of the CommonDatabase class are comprised of a collection of logical storage areas that are represented by instances of the DatabaseStorageArea class. 
 * Database storage areas allow the administrator to logically organize the content of the database. This class extends from FileSystem and uses the inherited associations to represent the internal structure of the database.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseStorageArea#getIsSystemArea <em>Is System Area</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseStorageArea#getLastBackup <em>Last Backup</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseStorageArea()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Database::Storage' keys='CSCreationClassName,CSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseStorageArea extends CIM_FileSystem {
	/**
	 * Returns the value of the '<em><b>Is System Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Boolean value that indicates the ownership of this StorageArea. A value of true indicates that this StorageArea is owned by the DatabaseSystem and contains system information. A value of false indicates that this is a user StorageArea that contains data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is System Area</em>' attribute.
	 * @see #setIsSystemArea(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseStorageArea_IsSystemArea()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getIsSystemArea();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseStorageArea#getIsSystemArea <em>Is System Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is System Area</em>' attribute.
	 * @see #getIsSystemArea()
	 * @generated
	 */
	void setIsSystemArea(Boolean value);

	/**
	 * Returns the value of the '<em><b>Last Backup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A timestamp that represents the date and time of the last successful backup of the DatabaseStorageArea. This property should be set to a value of 0, in interval format (00000000000000.000000:000), if it is not known whether a backup has ever been completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Backup</em>' attribute.
	 * @see #setLastBackup(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseStorageArea_LastBackup()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime'"
	 * @generated
	 */
	String getLastBackup();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseStorageArea#getLastBackup <em>Last Backup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Backup</em>' attribute.
	 * @see #getLastBackup()
	 * @generated
	 */
	void setLastBackup(String value);

} // CIM_DatabaseStorageArea
