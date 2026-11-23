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
 * A representation of the model object '<em><b>CIM Phase1 SA Used For Phase2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Phase1SAUsedForPhase2 associates a phase 1 endpoint (such as an IKESAEndpoint) with an IPsecSAEndpoint that was negotiated using that phase 1 Security Association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Phase1SAUsedForPhase2()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' override.Antecedent='CIM_SecurityAssociationEndpoint REF' override.Antecedent.Max='1' override.Antecedent.Description='Phase 1 SAEndpoint that protected the negotiation of the phase 2 Security Association. An example of a phase 1 endpoint is an IKESAEndpoint.' override.Dependent='CIM_IPsecSAEndpoint REF' override.Dependent.Description='The phase 2 SAEndpoint.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_Phase1SAUsedForPhase2 extends CIM_Dependency {
} // CIM_Phase1SAUsedForPhase2
