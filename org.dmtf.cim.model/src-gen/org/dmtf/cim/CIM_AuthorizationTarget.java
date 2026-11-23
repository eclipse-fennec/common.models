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
 * A representation of the model object '<em><b>CIM Authorization Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthorizationTarget is an association used to apply authorization decisions to specific target resources. The target resources may be aggregated into a collection or may be represented as a set of associations to ManagedElements. This association is deprecated in lieu of a semantically equivalent one, AuthorizedTarget, since one of the referenced classes (AccessControlInformation) has been deprecated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizationTarget()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AuthorizedTarget\"]' Version='2.8.0' UMLPackagePath='CIM::User::AccessControl' override.Antecedent='CIM_AccessControlInformation REF' override.Antecedent.Deprecated='[\"CIM_AuthorizedTarget.Privilege\"]' override.Antecedent.Description='AccessControlInformation that applies to the target set.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Deprecated='[\"CIM_AuthorizedTarget.TargetElement\"]' override.Dependent.Description='The target set of resources may be specified as a collection or as a set of associations to ManagedElements that represent target resources.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AuthorizationTarget extends CIM_Dependency {
} // CIM_AuthorizationTarget
