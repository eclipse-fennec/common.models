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
 * A representation of the model object '<em><b>CIM IPsec Policy For System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPsecPolicyForSystem associates a PolicyGroup with a specific system (e.g., a host or a network device) - indicating that this is the 'default' IPsec policy for that system. The referenced PolicyGroup would be used for any IPProtocolEndpoint's IPsec negotiations, UNLESS the IPsecPolicyForEndpoint association is defined. IPsecPolicyForEndpoint indicates a more specific PolicyGroup for IPsec negotiations for the endpoint.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPsecPolicyForSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::IPsecPolicy' MappingStrings='[\"IPSP Policy Model.IETF|IPsecPolicyForSystem\"]' override.Antecedent='CIM_System REF' override.Antecedent.Description='A System to which the PolicyGroup applies.' override.Antecedent.MappingStrings='[\"IPSP Policy Model.IETF|IPsecPolicyForSystem.Antecedent\"]' override.Dependent='CIM_PolicyGroup REF' override.Dependent.Min='0' override.Dependent.Max='1' override.Dependent.Description='The PolicyGroup that defines the \'default\' IPsec negotiation policy for the System.' override.Dependent.MappingStrings='[\"IPSP Policy Model.IETF|IPsecPolicyForSystem.Dependent\"]' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_IPsecPolicyForSystem extends CIM_Dependency {
} // CIM_IPsecPolicyForSystem
