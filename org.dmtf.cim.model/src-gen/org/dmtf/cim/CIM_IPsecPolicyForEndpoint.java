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
 * A representation of the model object '<em><b>CIM IPsec Policy For Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPsecPolicyForEndpoint associates a PolicyGroup with a specific IP endpoint. This association's policies take priority over any PolicyGroup defined generically for the hosting system. The latter is defined using the IPsecPolicyForSystem association.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPsecPolicyForEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|IPsecPolicyForEndpoint\"]' override.Antecedent='CIM_IPProtocolEndpoint REF' override.Antecedent.Description='The IPProtocolEndpoint that identifies an interface to which the PolicyGroup applies.' override.Antecedent.MappingStrings='[\"IPSP Policy Model.IETF|IPsecPolicyForEndpoint.Antecedent\"]' override.Dependent='CIM_PolicyGroup REF' override.Dependent.Min='0' override.Dependent.Max='1' override.Dependent.Description='The PolicyGroup that defines the IPsec negotiation policy for the Endpoint.' override.Dependent.MappingStrings='[\"IPSP Policy Model.IETF|IPsecPolicyForEndpoint.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_IPsecPolicyForEndpoint extends CIM_Dependency {
} // CIM_IPsecPolicyForEndpoint
