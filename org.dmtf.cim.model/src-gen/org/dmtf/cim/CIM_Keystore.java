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
 * A representation of the model object '<em><b>CIM Keystore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_Keystore class represents a keystore, collection of key based credentials such as certificates. Keystore can be used to store the certificates that are used for the client role of the validation of the served up certificates, or for the server role, serving up the certificates to the client for the validation. Certificates in the keystore can be revoked/invalidated by the means of application of Certificate Revocation List (CRL).
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Keystore()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.29.0' UMLPackagePath='CIM::User::Credential' override.Usage='uint16' override.Usage.Description='Usage of the keystore.\n2 - Owned value means CIM_Keystore instance represents a collection of key based credentials that belong to parties local to the manager of the keystore. \n3 - Trusted value means CIM_Keystore instance represents a collection of public key based credentials that belong to parties trusted by the manager of the keystore.\n4 - Mixed value means CIM_Keystore instance represents a collection of both Trusted and Owned key based credentials.' override.Usage.ValueMap='[\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' override.Usage.Values='[\"Owned\",\"Trusted\",\"Mixed\",\"DMTF Reserved\",\"Vendor Specified\"]' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_Keystore extends CIM_CredentialStore {
} // CIM_Keystore
