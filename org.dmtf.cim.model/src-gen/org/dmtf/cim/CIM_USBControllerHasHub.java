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
 * A representation of the model object '<em><b>CIM USB Controller Has Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * USBControllerHasHub defines the Hub(s) that are downstream of the USBController.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_USBControllerHasHub()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::USB' override.Antecedent='CIM_USBController REF' override.Antecedent.Min='1' override.Antecedent.Max='1' override.Antecedent.Description='The USBController.' override.Dependent='CIM_USBHub REF' override.Dependent.Min='1' override.Dependent.Description='The USBHub that is associated with the Controller.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_USBControllerHasHub extends CIM_ControlledBy {
} // CIM_USBControllerHasHub
