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
 * A representation of the model object '<em><b>CIM Connected To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ConnectedTo association indicates that two or more PhysicalConnectors are connected together.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_ConnectedTo()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Physical::Connector' override.Antecedent='CIM_PhysicalConnector REF' override.Antecedent.Description='The Antecedent represents a PhysicalConnector that serves as one end of the connection.' override.Dependent='CIM_PhysicalConnector REF' override.Dependent.Description='The Dependent represents another PhysicalConnector that serves as the other end of the connection.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_ConnectedTo extends CIM_Dependency {
} // CIM_ConnectedTo
