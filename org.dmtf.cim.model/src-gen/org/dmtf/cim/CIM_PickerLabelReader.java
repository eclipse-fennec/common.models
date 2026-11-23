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
 * A representation of the model object '<em><b>CIM Picker Label Reader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PickerLabelReader is used to indicate that one or more Label Readers works in conjunction with PickerElements, to identify PhysicalMedia as they are being picked/placed.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PickerLabelReader()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Device::StorageLib' override.Antecedent='CIM_LabelReader REF' override.Antecedent.Description='The LabelReader.' override.Dependent='CIM_PickerElement REF' override.Dependent.Description='The PickerElement that is dependent on the Reader Device.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_PickerLabelReader extends CIM_AssociatedLabelReader {
} // CIM_PickerLabelReader
