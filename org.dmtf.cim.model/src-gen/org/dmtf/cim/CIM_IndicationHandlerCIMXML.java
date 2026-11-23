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
 * A representation of the model object '<em><b>CIM Indication Handler CIMXML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_IndicationHandlerCIMXML describes the destination for Indications to be delivered via CIM-XML.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IndicationHandlerCIMXML()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_ListenerDestinationCIMXML\"]' Version='2.8.0' UMLPackagePath='CIM::Event' override.Destination='string' override.Destination.Deprecated='[\"CIM_ListenerDestinationCIMXML.Destination\"]' override.Destination.Required='true' override.Destination.Description='The destination URL to which CIM-XML Indication messages are to be delivered. The scheme prefix MUST be consistent with the DMTF CIM-XML Specifications. If a scheme prefix is not specified, the scheme \"http:\" MUST be assumed.' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IndicationHandlerCIMXML extends CIM_IndicationHandler {
} // CIM_IndicationHandlerCIMXML
