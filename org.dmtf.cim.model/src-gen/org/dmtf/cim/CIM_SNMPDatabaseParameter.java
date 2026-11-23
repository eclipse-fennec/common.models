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
 * A representation of the model object '<em><b>CIM SNMP Database Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_SNMPDatabaseParameter class extends from CIM_DatabaseParameter. This class is included in the CIM database schema to provide explicit mapping to the way that the SNMP MIB defines database and service parameters. More information on the SNMP MIB parameters can be found in RFC 1697. 
 * The SNMP RDBMS MIB defines generic tables that contain rows of named database or service configuration entries. A parameter entry contains a parameter name, description, and value. See the description of the rdbmsDbParamTable or the rdbmsSrvParamTable for more detailed information on the SNMP definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SNMPDatabaseParameter#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SNMPDatabaseParameter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Database::System' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_SNMPDatabaseParameter extends CIM_DatabaseParameter {
	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of a database or service parameter that is represented as a string.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value</em>' attribute.
	 * @see #setParameterValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_SNMPDatabaseParameter_ParameterValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|RDBMS-MIB.rdbmsDbParamCurrValue\"]'"
	 * @generated
	 */
	String getParameterValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SNMPDatabaseParameter#getParameterValue <em>Parameter Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Value</em>' attribute.
	 * @see #getParameterValue()
	 * @generated
	 */
	void setParameterValue(String value);

} // CIM_SNMPDatabaseParameter
