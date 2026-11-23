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
 * A representation of the model object '<em><b>CIM Database Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The DatabaseAdministrator association identifies a UserEntity as a database administrator of a CommonDatabase. 
 * The current version of CIM includes a UserContact class that is concrete and extends from UserEntity. UserContact contains the information that is needed to contact a database administrator. The DatabaseAdministrator association should be implemented through the UserContact class in favor of creating a vendor-specific concrete class to define database administrator contact information for the database administrator.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DatabaseAdministrator()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Database::System' override.Antecedent='CIM_CommonDatabase REF' override.Antecedent.Description='The database that is being administered.' override.Dependent='CIM_UserEntity REF' override.Dependent.Description='The user entity that is responsible for the administration of the database.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_DatabaseAdministrator extends CIM_Dependency {
} // CIM_DatabaseAdministrator
