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
 * A representation of the model object '<em><b>CIM Hosted IP Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * HostedIPInterface provides an association between a layer 3 interface, represented as a CIM_IPProtocolEndpoint and the System on which it is provided.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedIPInterface()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.51.0' UMLPackagePath='CIM::Core' override.Dependent='CIM_IPProtocolEndpoint REF' override.Dependent.Key='true' override.Dependent.Weak='true' override.Dependent.Description='The IP interfaces that are hosted on this System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedIPInterface extends CIM_HostedAccessPoint {
} // CIM_HostedIPInterface
