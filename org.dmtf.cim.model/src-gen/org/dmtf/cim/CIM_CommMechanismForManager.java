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
 * A representation of the model object '<em><b>CIM Comm Mechanism For Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CommMechanismForManager is deprecated. See CIM_WBEMServer, CIM_ProtocolService and CIM_WBEMProtocolServiceCapabilties for describing WBEM Protocols.
 * CommMechanismForManager is an association between an ObjectManager and an ObjectManagerCommunicationMechanism class. The latter describes a possible encoding/protocol/ set of operations for accessing the referenced ObjectManager.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CommMechanismForManager()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.39.0' UMLPackagePath='CIM::Interop' override.Antecedent='CIM_ObjectManager REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The specific ObjectManager whose communication mechanism is described.' override.Dependent='CIM_ObjectManagerCommunicationMechanism REF' override.Dependent.Min='1' override.Dependent.Description='The encoding/protocol/set of operations that may be used to communicate with the referenced ObjectManager.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_CommMechanismForManager extends CIM_ServiceAccessBySAP {
} // CIM_CommMechanismForManager
