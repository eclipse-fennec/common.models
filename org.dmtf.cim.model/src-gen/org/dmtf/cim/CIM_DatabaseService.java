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
 * A representation of the model object '<em><b>CIM Database Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Database services perform tasks for a database. Examples of tasks that are performed by a database service include providing user access to the database, performing data and metadata manipulation, database administration, and maintenance operations. 
 * One or more database services can perform tasks for a database. The database services can be located on the same computer system as the database or on different computer systems. Database services can be implemented as one or more processes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseService#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseService#getLastStatusChangeTime <em>Last Status Change Time</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseService#getConnectionLimit <em>Connection Limit</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Database::System' override.OperationalStatus='uint16[]' override.OperationalStatus.Description='This property contains the operational status of the database service. \nOK means that the database service is operational and available for general use. \nStopped means that the service is unavailable and cannot be used. \nService implies an administrative state of unavailability. \nDegraded means that the database service is operating at a less than optimal level. \nStarting means that the database service is in the process of becoming operational. \nThese status values map to the RFC1697 OperStatus values as follows: OK - UP, Stopped - DOWN, In Service - HALTED, Stressed - CONGESTED, and Starting - RESTARTING. Any additional status variables that are defined are CIM-specific.' override.OperationalStatus.MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoOperStatus\"]' override.TimeOfLastStateChange='datetime' override.TimeOfLastStateChange.MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoLastChange\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseService extends CIM_Service {
	/**
	 * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and time when the database service was last started. If the database service has an OperationalStatus of Stopped or Starting, then this value is not meaningful and the contents must be set to zeros.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Startup Time</em>' attribute.
	 * @see #setStartupTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseService_StartupTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoStartupTime\"]'"
	 * @generated
	 */
	String getStartupTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseService#getStartupTime <em>Startup Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Time</em>' attribute.
	 * @see #getStartupTime()
	 * @generated
	 */
	void setStartupTime(String value);

	/**
	 * Returns the value of the '<em><b>Last Status Change Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note: The LastStatusChangeTime property is deprecated in lieu of the TimeOfLastStateChange property that is inherited from CIM_EnabledLogicalElement. 
	 * Deprecated description: The date and time when the status of the database service last changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Status Change Time</em>' attribute.
	 * @see #setLastStatusChangeTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseService_LastStatusChangeTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' Deprecated='[\"CIM_EnabledLogicalElement.TimeOfLastStateChange\"]' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoLastChange\"]'"
	 * @generated
	 */
	String getLastStatusChangeTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseService#getLastStatusChangeTime <em>Last Status Change Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Status Change Time</em>' attribute.
	 * @see #getLastStatusChangeTime()
	 * @generated
	 */
	void setLastStatusChangeTime(String value);

	/**
	 * Returns the value of the '<em><b>Connection Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of active inbound connections that can be concurrently opened on the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Limit</em>' attribute.
	 * @see #setConnectionLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseService_ConnectionLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsSrvInfoMaxInboundAssociations\"]'"
	 * @generated
	 */
	Long getConnectionLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseService#getConnectionLimit <em>Connection Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Limit</em>' attribute.
	 * @see #getConnectionLimit()
	 * @generated
	 */
	void setConnectionLimit(Long value);

} // CIM_DatabaseService
