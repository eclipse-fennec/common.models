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
 * A representation of the model object '<em><b>CIM VLAN For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The VLAN for the VLAN Service.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VLANFor()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.8.0' UMLPackagePath='CIM::Network::VLAN' override.Antecedent='CIM_VLAN REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Description='The VLAN for the VLANService.' override.Dependent='CIM_VLANService REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Min='1' override.Dependent.Description='The VLANService which uses the VLAN for processing.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_VLANFor extends CIM_ServiceSAPDependency {
} // CIM_VLANFor
