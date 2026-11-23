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
 * A representation of the model object '<em><b>CIM Associated Indicator LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ManagedSystemElements may have zero or more IndicatorLEDs associated with them, in order to indicate problem situations. This relationship is indicated by the AssociatedIndicatorLED dependency.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedIndicatorLED()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.22.0' UMLPackagePath='CIM::Device::LED' override.Antecedent='CIM_ManagedSystemElement REF' override.Antecedent.Min='1' override.Antecedent.Description='The ManagedSystemElement that has an associated LED.' override.Dependent='CIM_IndicatorLED REF' override.Dependent.Description='The LED.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedIndicatorLED extends CIM_Dependency {
} // CIM_AssociatedIndicatorLED
