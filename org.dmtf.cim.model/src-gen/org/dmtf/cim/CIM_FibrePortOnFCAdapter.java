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
 * A representation of the model object '<em><b>CIM Fibre Port On FC Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of this method has been deprecated. 
 * Deprecated description: The use of FibrePortOnFCAdapter is deprecated because both FibrePort and FibreChannelAdapter have been deprecated. No replacement is needed because the 2 classes are combined into a single class. FibrePortOnFCAdapter associates a FibrePort with a FibreChannelAdapter.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FibrePortOnFCAdapter()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"No value\"]' Version='2.10.0' UMLPackagePath='CIM::Device::NetworkAdapter' override.Antecedent='CIM_FibreChannelAdapter REF' override.Antecedent.Deprecated='[\"No value\"]' override.Antecedent.Max='1' override.Antecedent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The FibreChannelAdapter that includes the Port.' override.Dependent='CIM_FibrePort REF' override.Dependent.Deprecated='[\"No value\"]' override.Dependent.Max='1' override.Dependent.Description='Note: The use of this method has been deprecated. \nDeprecated description: The FibrePort on the Adapter.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_FibrePortOnFCAdapter extends CIM_PortOnDevice {
} // CIM_FibrePortOnFCAdapter
