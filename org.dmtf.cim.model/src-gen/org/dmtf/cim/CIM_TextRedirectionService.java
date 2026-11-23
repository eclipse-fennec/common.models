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
 * A representation of the model object '<em><b>CIM Text Redirection Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TextRedirectionService provides the capability to redirect a text console output to the remote console. For example, any text stream directed to a Serial COM Port (by the operating system) on a Computer System can be redirected out to a remote administrator's console. Similarly the text input keystrokes from the remote administrator's console can be redirected into the same COM Port. Each redirection stream is accessible via a TextRedirectionSAP. This service can support multiple redirection streams via multiple associated TextRedirectionSAPs.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_TextRedirectionService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.17.0' UMLPackagePath='CIM::Network::ConsoleProtocols' override.RedirectionServiceType='uint16[]' override.RedirectionServiceType.Description='Type of Redirection Supported by this Service. This value is set to the type of Redirection Service That this service represents. A value set to 2 = \"Text\" indicates a Text Console Redirection service.' override.RedirectionServiceType.ValueMap='[\"..\",\"2\",\"3..32767\",\"32768..65535\"]' override.RedirectionServiceType.Values='[\"DMTF Reserved\",\"Text\",\"DMTF Reserved\",\"Vendor Specified\"]' override.RedirectionServiceType.ModelCorrespondence='[\"CIM_RedirectionService.OtherRedirectionServiceType\"]' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_TextRedirectionService extends CIM_RedirectionService {
} // CIM_TextRedirectionService
