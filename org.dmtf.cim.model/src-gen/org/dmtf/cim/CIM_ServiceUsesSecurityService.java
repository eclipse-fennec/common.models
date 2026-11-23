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
 * A representation of the model object '<em><b>CIM Service Uses Security Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates a Service with the Security Services that it uses. This association does not add any constraints or semantics to ServiceServiceDependency. As a result, it is deprecated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ServiceUsesSecurityService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ServiceServiceDependency\"]' Version='2.8.0' UMLPackagePath='CIM::User::SecurityServices' override.Antecedent='CIM_SecurityService REF' override.Antecedent.Deprecated='[\"CIM_ServiceServiceDependency.Antecedent\"]' override.Dependent='CIM_Service REF' override.Dependent.Deprecated='[\"CIM_ServiceServiceDependency.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ServiceUsesSecurityService extends CIM_ServiceServiceDependency {
} // CIM_ServiceUsesSecurityService
