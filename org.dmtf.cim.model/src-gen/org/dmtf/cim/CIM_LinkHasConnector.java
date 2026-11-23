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
 * A representation of the model object '<em><b>CIM Link Has Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Cables and Links utilize PhysicalConnectors to actually 'connect' PhysicalElements. This association explicitly defines this relationship of Connectors for PhysicalLinks.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LinkHasConnector()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Link' override.GroupComponent='CIM_PhysicalLink REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The PhysicalLink that has a Connector.' override.PartComponent='CIM_PhysicalConnector REF' override.PartComponent.Description='The PhysicalConnector.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_LinkHasConnector extends CIM_Component {
} // CIM_LinkHasConnector
