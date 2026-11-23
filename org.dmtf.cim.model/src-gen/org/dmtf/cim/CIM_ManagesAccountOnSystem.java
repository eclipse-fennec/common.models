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
 * A representation of the model object '<em><b>CIM Manages Account On System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_ManagesAccountOnSystem provides the association between a System and the AccountManagementService that manages accounts for that system. This association does not add any constraints or semantics to ServiceAvailableToElement. As a result, it is deprecated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ManagesAccountOnSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAvailableToElement.UserOfService\"]' Version='2.37.0' UMLPackagePath='CIM::User::Account' override.Antecedent='CIM_AccountManagementService REF' override.Antecedent.Deprecated='[\"CIM_ServiceAvailableToElement.ServiceProvided\"]' override.Antecedent.Description='An AccountManagementService that manages accounts for the system.' override.Dependent='CIM_System REF' override.Dependent.Deprecated='[\"CIM_ServiceAvailableToElement.UserOfService\"]' override.Dependent.Description='The system that is dependent on the AccountManagementService.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ManagesAccountOnSystem extends CIM_SecurityServiceForSystem {
} // CIM_ManagesAccountOnSystem
