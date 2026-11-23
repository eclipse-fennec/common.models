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
 * A representation of the model object '<em><b>CIM Relational Database Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * RelationalDatabaseCapabilities extends CommonDatabaseCapabilities to specify the capabilities for relational database service. A relational database service process queries by SQL. Supported SQL operations depend on the target SQL objects (database, table or column) and the implementation of the relational data base service. The properties of the RelationalDatabaseCapabilities specifies the supported SQL operations.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RelationalDatabaseCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.28.0' UMLPackagePath='CIM::Database::Storage' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RelationalDatabaseCapabilities extends CIM_CommonDatabaseCapabilities {
} // CIM_RelationalDatabaseCapabilities
