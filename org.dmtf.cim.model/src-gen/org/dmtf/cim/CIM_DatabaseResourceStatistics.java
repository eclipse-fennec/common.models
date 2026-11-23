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
 * A representation of the model object '<em><b>CIM Database Resource Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DatabaseServiceStatistics class contains the current statistics for a database resource. This class maps to the database and server-limited resource tables in the SNMP RDBMS MIB as defined in RFC 1697.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getHighwater <em>Highwater</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getFailures <em>Failures</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseResourceStatistics()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Database::Statistics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseResourceStatistics extends CIM_StatisticalData {
	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value of a limited database resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseResourceStatistics_Current()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbLimitedResourceCurrent\"]'"
	 * @generated
	 */
	Long getCurrent();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(Long value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum value that the database resource can attain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseResourceStatistics_Limit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbLimitedResourceLimit\"]'"
	 * @generated
	 */
	Long getLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(Long value);

	/**
	 * Returns the value of the '<em><b>Highwater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of database resources used, as measured from the time when the first service was started for the database. 
	 * Other external factors, such as an explicit reset of the statistics might cause this measurement to begin at a later point in time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Highwater</em>' attribute.
	 * @see #setHighwater(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseResourceStatistics_Highwater()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint64' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbLimitedResourceHighwater\"]'"
	 * @generated
	 */
	Long getHighwater();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getHighwater <em>Highwater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highwater</em>' attribute.
	 * @see #getHighwater()
	 * @generated
	 */
	void setHighwater(Long value);

	/**
	 * Returns the value of the '<em><b>Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of times that the system wanted to exceed the database resource limit that is measured from the time when the first service was started for the database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failures</em>' attribute.
	 * @see #setFailures(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseResourceStatistics_Failures()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' Counter='true' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbLimitedResourceFailures\"]'"
	 * @generated
	 */
	Long getFailures();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DatabaseResourceStatistics#getFailures <em>Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failures</em>' attribute.
	 * @see #getFailures()
	 * @generated
	 */
	void setFailures(Long value);

} // CIM_DatabaseResourceStatistics
