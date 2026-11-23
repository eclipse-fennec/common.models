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
 * A representation of the model object '<em><b>CIM Notary Verifies Biometric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This relationship associates a Notary service with the Users Access whose biometric information is verified. It is deprecated since one of its references (UsersAccess) is deprecated, and because specific biometric credentials are defined in a new subclass of CIM_Credential (specifically, BiometricCredential). Given the latter, the relationship of a Credential to its management service (ManagedCredential) can be used directly.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NotaryVerifiesBiometric()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ManagedCredential\"]' Version='2.8.0' UMLPackagePath='CIM::User::UsersAccess' override.Antecedent='CIM_Notary REF' override.Antecedent.Deprecated='[\"CIM_ManagedCredential.Antecedent\"]' override.Antecedent.Description='The Notary service that verifies biometric information.' override.Dependent='CIM_UsersAccess REF' override.Dependent.Deprecated='[\"CIM_ManagedCredential.Dependent\"]' override.Dependent.Description='The UsersAccess that represents a person using biometric information for authentication.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_NotaryVerifiesBiometric extends CIM_Dependency {
} // CIM_NotaryVerifiesBiometric
