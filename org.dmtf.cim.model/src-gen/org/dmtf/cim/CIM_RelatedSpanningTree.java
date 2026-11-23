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
 * A representation of the model object '<em><b>CIM Related Spanning Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This association identifies the spanning tree in which a forwarding database (TransparentBridgingService) is nested.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RelatedSpanningTree()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.7.0' UMLPackagePath='CIM::Network::SwitchingBridging' override.Antecedent='CIM_TransparentBridgingService REF' override.Antecedent.Description='The TransparentBridgingService that supports a SpanningTreeService.' override.Dependent='CIM_SpanningTreeService REF' override.Dependent.Max='1' override.Dependent.Description='The SpanningTree in which a TransparentBridgingService is nested.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_RelatedSpanningTree extends CIM_ServiceServiceDependency {
} // CIM_RelatedSpanningTree
