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
 * A representation of the model object '<em><b>CIM Default Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DefaultSetting represents the association between a ManagedSystemElement and the single Setting class that is defined to be the default setting for this Element.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DefaultSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Settings' override.Setting='CIM_Setting REF' override.Setting.Max='1' override.Setting.Description='The Setting object that is the default.' keys='Element,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_DefaultSetting extends CIM_ElementSetting {
} // CIM_DefaultSetting
