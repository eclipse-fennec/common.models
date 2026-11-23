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
 * A representation of the model object '<em><b>CIM Associated Database System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_AssociatedDatabaseSystem association identifies the database system that is responsible for the database.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedDatabaseSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Database::System' override.Antecedent='CIM_DatabaseSystem REF' override.Antecedent.Min='1' override.Antecedent.Description='The database system that is responsible for the database.' override.Dependent='CIM_CommonDatabase REF' override.Dependent.Description='The database.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedDatabaseSystem extends CIM_Dependency {
} // CIM_AssociatedDatabaseSystem
