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
 * A representation of the model object '<em><b>CIM Video Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Note: The use of the CIM_VideoSetting class has been deprecated in lieu of CIM_ElementSetting. 
 * Deprecated description: 
 * VideoSetting associates the VideoControllerResolution Setting with the Controllers to which it applies.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_VideoSetting()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Deprecated='[\"CIM_ElementSetting\"]' Version='2.10.0' UMLPackagePath='CIM::Device::Controller' override.Element='CIM_VideoController REF' override.Element.Deprecated='[\"CIM_ElementSetting.Element\"]' override.Element.Description='The VideoController.' override.Setting='CIM_VideoControllerResolution REF' override.Setting.Deprecated='[\"CIM_ElementSetting.Setting\"]' override.Setting.Description='The resolutions, refresh rates, scan mode, and number of colors that can be set for the Controller.' keys='Element,Setting'"
 * @generated
 */
@ProviderType
public interface CIM_VideoSetting extends CIM_ElementSetting {
} // CIM_VideoSetting
