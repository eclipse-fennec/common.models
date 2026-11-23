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
 * A representation of the model object '<em><b>CIM CA Has Public Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CertificateAuthority may have certificates issued by other CAs or self-signed. This association is essentially an optimization of the CA having an external identity established by itself or another Authority. This maps closely to LDAP-based certificate authority implementations.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CAHasPublicCertificate()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::User::PublicKey' override.Antecedent='CIM_PublicKeyCertificate REF' override.Antecedent.Description='The Certificate used by the CA.' override.Dependent='CIM_CertificateAuthority REF' override.Dependent.Description='The CA that uses a Certificate.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CAHasPublicCertificate extends CIM_Dependency {
} // CIM_CAHasPublicCertificate
