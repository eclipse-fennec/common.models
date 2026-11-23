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
 * A representation of the model object '<em><b>CIM Database System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A database environment is composed of a database system (the application system represented by this class), one or more database services, and one or more databases. See the descriptions of CIM_DatabaseService and CIM_CommonDatabase for get more detailed information about database services and databases. 
 * Each separately manageable database system should have an instance in this class. This class can be used: 
 * - to determine the software that belongs to the database system. 
 * - to perform database system-wide management operations, such as stopping all the databases that were created by the database system for maintenance purposes. 
 * - to view runtime statistics in the context of a database system. 
 * Many of the management capabilities that are needed to represent a database system as an application system have already been modeled in the CIM_ApplicationSystem class from which CIM_DatabaseSystem extends. CIM_DatabaseSystem provides a logical entity to define the relationships that are specific to the database management domain.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Database::System' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseSystem extends CIM_ApplicationSystem {
} // CIM_DatabaseSystem
