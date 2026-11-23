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
 * A representation of the model object '<em><b>CIM Filter Of Security Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FilterOfSecurityAssociation associates a network traffic specification (i.e., a FilterList) with a SecurityAssociation Endpoint, to which the filter list applies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterOfSecurityAssociation()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' override.Antecedent='CIM_FilterList REF' override.Antecedent.Max='1' override.Antecedent.Description='FilterList describing the traffic to be selected/matched.' override.Dependent='CIM_SecurityAssociationEndpoint REF' override.Dependent.Description='SecurityAssociation using the FilterList as its traffic selector.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_FilterOfSecurityAssociation extends CIM_Dependency {
} // CIM_FilterOfSecurityAssociation
