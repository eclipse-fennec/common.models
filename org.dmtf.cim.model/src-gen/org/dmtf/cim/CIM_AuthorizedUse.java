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
 * A representation of the model object '<em><b>CIM Authorized Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthorizedUse is an association used to provide an AuthorizationService with the AccessControlInformation it needs to do its job. This association is deprecated with no proposed replacement, since authorization processing will be handled via policy or static checking of Privileges.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizedUse()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::User::AccessControl' override.Antecedent='CIM_AccessControlInformation REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='Access Control Information.' override.Dependent='CIM_AuthorizationService REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Description='AuthorizationService that uses an ACI.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AuthorizedUse extends CIM_Dependency {
} // CIM_AuthorizedUse
