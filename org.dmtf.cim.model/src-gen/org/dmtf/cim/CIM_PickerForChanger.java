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
 * A representation of the model object '<em><b>CIM Picker For Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PickerForChanger indicates the PickerElement(s) that access StorageMediaLocations and deliver PhysicalMedia to the Changer, for movement through the System. A Changer may have several Pickers for faster exchange of Media.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PickerForChanger()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' override.Antecedent='CIM_PickerElement REF' override.Antecedent.Description='The PickerElement that accesses StorageMediaLocations to deliver Media to the Changer.' override.Dependent='CIM_ChangerDevice REF' override.Dependent.Max='1' override.Dependent.Description='The ChangerDevice.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PickerForChanger extends CIM_Dependency {
} // CIM_PickerForChanger
