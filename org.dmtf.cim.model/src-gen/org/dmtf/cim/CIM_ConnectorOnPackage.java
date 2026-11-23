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
 * A representation of the model object '<em><b>CIM Connector On Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PhysicalPackages contain Connectors as well as other PhysicalElements. The ConnectorOnPackage association makes explicit the containment relationship between Connectors and Packages.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConnectorOnPackage()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Connector' override.GroupComponent='CIM_PhysicalPackage REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The PhysicalPackage that has a Connector.' override.PartComponent='CIM_PhysicalConnector REF' override.PartComponent.Description='The PhysicalConnector.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_ConnectorOnPackage extends CIM_Container {
} // CIM_ConnectorOnPackage
