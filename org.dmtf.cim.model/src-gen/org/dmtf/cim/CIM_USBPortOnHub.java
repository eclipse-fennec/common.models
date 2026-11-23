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
 * A representation of the model object '<em><b>CIM USB Port On Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * USBPortOnHub associates a USBPort or connection point with the USBHub that includes it.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBPortOnHub()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::USB' override.Antecedent='CIM_USBHub REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The Hub that includes the USBPort.' override.Dependent='CIM_USBPort REF' override.Dependent.Min='1' override.Dependent.Description='The Port on the USBHub.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_USBPortOnHub extends CIM_PortOnDevice {
} // CIM_USBPortOnHub
