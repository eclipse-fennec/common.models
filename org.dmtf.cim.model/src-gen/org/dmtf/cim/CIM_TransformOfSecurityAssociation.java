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
 * A representation of the model object '<em><b>CIM Transform Of Security Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TransformOfSecurityAssociation maps a SecurityAssociation Endpoint with the transform that it uses. For security, no keying material of the SA is exposed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TransformOfSecurityAssociation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' override.SettingData='CIM_SATransform REF' override.SettingData.Min='1' override.SettingData.Max='1' override.SettingData.Description='Transform of the IPsecSAEndpoint.' override.ManagedElement='CIM_IPsecSAEndpoint REF' override.ManagedElement.Description='The IPsecSAEndpoint that uses the transform.' keys='ManagedElement,SettingData'"
 * @generated
 */
@ProviderType
public interface CIM_TransformOfSecurityAssociation extends CIM_ElementSettingData {
} // CIM_TransformOfSecurityAssociation
