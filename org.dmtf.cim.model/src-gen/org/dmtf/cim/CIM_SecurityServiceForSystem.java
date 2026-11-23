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
 * A representation of the model object '<em><b>CIM Security Service For System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CIM_SecurityServiceForSystem provides the association between a System and a SecurityService that provides services for that system. This association does not add any constraints or semantics to ServiceAvailableToElement. As a result, it is deprecated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SecurityServiceForSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceAvailableToElement\"]' Version='2.8.0' UMLPackagePath='CIM::User::SecurityServices' override.Antecedent='CIM_SecurityService REF' override.Antecedent.Deprecated='[\"CIM_ServiceAvailableToElement.ServiceProvided\"]' override.Antecedent.Description='The SecurityService that provides services for the system.' override.Dependent='CIM_System REF' override.Dependent.Deprecated='[\"CIM_ServiceAvailableToElement.UserOfService\"]' override.Dependent.Description='The system that is dependent on the security service.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_SecurityServiceForSystem extends CIM_ProvidesServiceToElement {
} // CIM_SecurityServiceForSystem
