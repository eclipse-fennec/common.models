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
 * A representation of the model object '<em><b>CIM Service Available To Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ServiceAvailableToDatabase association relates databases to the database services that are available for database use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAvailableToDatabase#getAvailableState <em>Available State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAvailableToDatabase#getOtherAvailableState <em>Other Available State</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_ServiceAvailableToDatabase#getActiveTime <em>Active Time</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAvailableToDatabase()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Database::System' override.ServiceProvided='CIM_DatabaseService REF' override.ServiceProvided.Description='The database service that is providing service.' override.UserOfService='CIM_CommonDatabase REF' override.UserOfService.Description='The database that is being served.' keys='ServiceProvided,UserOfService'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceAvailableToDatabase extends CIM_ServiceAvailableToElement {
	/**
	 * Returns the value of the '<em><b>Available State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The AvailableState property indicates the current state of a database service regarding its ability to access a specific database. A service can be actively using a database (ACTIVE), or it can be waiting for a task to perform (AVAILABLE), or the service can be less than completely available for use by the database (RESTRICTED), or the database is not accessible from this service (UNAVAILABLE). Any service states that do not match one of these values should specify (OTHER).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available State</em>' attribute.
	 * @see #setAvailableState(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAvailableToDatabase_AvailableState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Other\",\"Active\",\"Available\",\"Restricted\",\"Unavailable\"]' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsRelState\"]' ModelCorrespondence='[\"CIM_ServiceAvailableToDatabase.OtherAvailableState\"]'"
	 * @generated
	 */
	Integer getAvailableState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAvailableToDatabase#getAvailableState <em>Available State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available State</em>' attribute.
	 * @see #getAvailableState()
	 * @generated
	 */
	void setAvailableState(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Available State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes the available state of the service when the AvailableState property is set to 1 ("Other"). This property must be set to NULL when AvailableState is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Available State</em>' attribute.
	 * @see #setOtherAvailableState(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAvailableToDatabase_OtherAvailableState()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_ServiceAvailableToDatabase.AvailableState\"]'"
	 * @generated
	 */
	String getOtherAvailableState();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAvailableToDatabase#getOtherAvailableState <em>Other Available State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Available State</em>' attribute.
	 * @see #getOtherAvailableState()
	 * @generated
	 */
	void setOtherAvailableState(String value);

	/**
	 * Returns the value of the '<em><b>Active Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time that the database was made active by this service. 
	 * If the AvailableState property is not active, then the value of this property must be set to 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Time</em>' attribute.
	 * @see #setActiveTime(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_ServiceAvailableToDatabase_ActiveTime()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='datetime' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsRelActiveTime\"]'"
	 * @generated
	 */
	String getActiveTime();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_ServiceAvailableToDatabase#getActiveTime <em>Active Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Time</em>' attribute.
	 * @see #getActiveTime()
	 * @generated
	 */
	void setActiveTime(String value);

} // CIM_ServiceAvailableToDatabase
