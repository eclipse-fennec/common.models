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
 * A representation of the model object '<em><b>CIM Element In Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Adapter cards, DIMMs and other physical elements are plugged into System Connectors for power and/or to transfer data. This relationship is defined by ElementInConnector.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ElementInConnector()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.18.0' UMLPackagePath='CIM::Physical::Connector' override.Antecedent='CIM_PhysicalConnector REF' override.Antecedent.Description='The Connector into which the Element is inserted.' override.Dependent='CIM_PhysicalElement REF' override.Dependent.Max='1' override.Dependent.Description='The Element in the Connector.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ElementInConnector extends CIM_Dependency {
} // CIM_ElementInConnector
