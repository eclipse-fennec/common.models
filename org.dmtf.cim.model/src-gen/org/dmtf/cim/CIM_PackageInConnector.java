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
 * A representation of the model object '<em><b>CIM Package In Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Adapter cards and other 'packaging' are plugged into System Connectors for power and/or to transfer data. This relationship is defined by PackageInConnector. For example, it would be used to describe the insertion of a daughtercard onto another Card. Various subclasses of PackageInConnector are also defined. PackageInSlot and its subclass, CardInSlot, are two examples of subclasses.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PackageInConnector()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.18.0' UMLPackagePath='CIM::Physical::Connector' override.Antecedent='CIM_PhysicalConnector REF' override.Antecedent.Description='The Connector into which the Package is inserted.' override.Dependent='CIM_PhysicalPackage REF' override.Dependent.Max='1' override.Dependent.Description='The Package in the Connector.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PackageInConnector extends CIM_ElementInConnector {
} // CIM_PackageInConnector
