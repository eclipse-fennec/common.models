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
 * A representation of the model object '<em><b>CIM Associated Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * LogicalDevices may have one or more AlarmDevices associated with them, in order to indicate problem situations. This relationship is indicated by the AssociatedAlarm dependency.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_AssociatedAlarm()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::Sensors' override.Antecedent='CIM_AlarmDevice REF' override.Antecedent.Description='The AlarmDevice.' override.Dependent='CIM_LogicalDevice REF' override.Dependent.Description='The LogicalDevice that is alarmed.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_AssociatedAlarm extends CIM_Dependency {
} // CIM_AssociatedAlarm
