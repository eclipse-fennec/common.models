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
 * A representation of the model object '<em><b>CIM Database Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_DatabaseParameter class extends from CIM_ScopedSettingData. This abstract class specifies the database and service configuration parameters that are common across database models and vendor implementations. 
 * The SNMP RDBMS MIB defines database and service parameters as name and value pair combinations rather than as specific named properties of the class. In order to maintain a consistent mapping between SNMP and CIM, a CIM_SNMPDatabaseParameter class extends from the abstract CIM_DatabaseParameter class, which defines parameters as a name value pair. 
 * In a future release of the database MOF, the working group can choose to create a new class that extends from CIM_DatabaseParameter, which specifies properties for common configuration parameters. 
 * The parameter context for a specific database or database service is established by collecting the SettingData using the CIM_ElementProfile association. 
 * The SNMP RDBMS MIB defines generic tables that contain rows of named database or service configuration entries. A parameter entry contains a parameter name, description, and value. See the description of the rdbmsDbParamTable or the rdbmsSrvParamTable for more information on the SNMP definitions.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseParameter()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.7.0' UMLPackagePath='CIM::Database::System' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseParameter extends CIM_ScopedSettingData {
} // CIM_DatabaseParameter
