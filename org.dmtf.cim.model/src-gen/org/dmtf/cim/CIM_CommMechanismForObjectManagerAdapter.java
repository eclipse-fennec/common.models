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
 * A representation of the model object '<em><b>CIM Comm Mechanism For Object Manager Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CommMechanismForObjectManagerAdapter is deprecated. See CIM_WBEMServer, CIM_ProtocolService and CIM_WBEMProtocolServiceCapabilties for describing WBEM Protocols
 * 
 * CommMechanismForObjectManagerAdapter is an association between an ObjectManager's communication mechanism and a ObjectManagerAdapter that supports that mechanism to translate requests and responses for the Object Manager.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CommMechanismForObjectManagerAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ProtocolService\",\"CIM_WBEMProtocolServiceCapabilities\"]' Version='2.39.0' UMLPackagePath='CIM::Interop' override.Antecedent='CIM_ObjectManagerAdapter REF' override.Antecedent.Description='The specific ObjectManagerAdapter whose communication mechanism with the CIM Object Manager is described.' override.Dependent='CIM_ObjectManagerCommunicationMechanism REF' override.Dependent.Min='1' override.Dependent.Description='The encoding/protocol/set of operations that may be used to communicate between the Object Manager and the referenced ProtocolAdapter.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CommMechanismForObjectManagerAdapter extends CIM_Dependency {
} // CIM_CommMechanismForObjectManagerAdapter
