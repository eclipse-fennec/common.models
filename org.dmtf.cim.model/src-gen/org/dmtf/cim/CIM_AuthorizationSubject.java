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
 * A representation of the model object '<em><b>CIM Authorization Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_AuthorizationSubject is an association used to apply authorization decisions to specific subjects (i.e., users). This association is deprecated in lieu of a semantically equivalent one, AuthorizedSubject, since one of the referenced classes (AccessControlInformation) has been deprecated.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AuthorizationSubject()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_AuthorizedSubject\"]' Version='2.8.0' UMLPackagePath='CIM::User::AccessControl' override.Antecedent='CIM_AccessControlInformation REF' override.Antecedent.Deprecated='[\"CIM_AuthorizedSubject.Privilege\"]' override.Antecedent.Description='AccessControlInformation that applies to a subject set.' override.Dependent='CIM_ManagedElement REF' override.Dependent.Deprecated='[\"CIM_AuthorizedSubject.PrivilegedElement\"]' override.Dependent.Description='The subject set may be specified as a collection or as a set of associations to ManagedElements that represent users.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AuthorizationSubject extends CIM_Dependency {
} // CIM_AuthorizationSubject
