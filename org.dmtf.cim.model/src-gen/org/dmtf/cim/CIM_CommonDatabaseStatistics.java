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
 * A representation of the model object '<em><b>CIM Common Database Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_CommonDatabaseStatistics class contains the current statistics for a database.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CommonDatabaseStatistics#getSizeUsed <em>Size Used</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Database::Statistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CommonDatabaseStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Size Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The estimated amount of disk space (in units) that is currently used by the database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Used</em>' attribute.
	 * @see #setSizeUsed(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_CommonDatabaseStatistics_SizeUsed()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbInfoSizeUsed\"]'"
	 * @generated
	 */
	Long getSizeUsed();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CommonDatabaseStatistics#getSizeUsed <em>Size Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Used</em>' attribute.
	 * @see #getSizeUsed()
	 * @generated
	 */
	void setSizeUsed(Long value);

} // CIM_CommonDatabaseStatistics
