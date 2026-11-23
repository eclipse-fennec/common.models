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
 * A representation of the model object '<em><b>CIM Hosted Filter Entry Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All filter entries (FilterEntryBase and its subclasses) are defined in the context of a ComputerSystem/network device, where the filter entries are used and administered.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_HostedFilterEntryBase()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::Filtering' override.Antecedent='CIM_ComputerSystem REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The ComputerSystem/network device that scopes the FilterEntryBase.' override.Dependent='CIM_FilterEntryBase REF' override.Dependent.Weak='true' override.Dependent.Description='The FilterEntryBase on the System.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_HostedFilterEntryBase extends CIM_HostedDependency {
} // CIM_HostedFilterEntryBase
